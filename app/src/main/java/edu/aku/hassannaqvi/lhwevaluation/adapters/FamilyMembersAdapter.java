package edu.aku.hassannaqvi.lhwevaluation.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import edu.aku.hassannaqvi.lhwevaluation.R;
import edu.aku.hassannaqvi.lhwevaluation.core.MainApp;
import edu.aku.hassannaqvi.lhwevaluation.models.FamilyMembers;


public class FamilyMembersAdapter extends RecyclerView.Adapter<FamilyMembersAdapter.ViewHolder> {
    private static final String TAG = "MWRAAdapter";
    private final Context mContext;
    private final List<FamilyMembers> member;
    private final int mExpandedPosition = -1;
    private final int completeCount;

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param members List<FemaleMembersModel> containing the data to populate views to be used by RecyclerView.
     */
    public FamilyMembersAdapter(Context mContext, List<FamilyMembers> members) {
        this.member = members;
        this.mContext = mContext;
        completeCount = 0;
        MainApp.memberComplete = false;


    }


    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        Log.d(TAG, "Element " + position + " set.");
        FamilyMembers members = this.member.get(position);        // Get element from your dataset at this position and replace the contents of the view
        // with that element

        TextView fName = viewHolder.fName;
        TextView fAge = viewHolder.fAge;
        ImageView fmRow = viewHolder.fmRow;
        ImageView mainIcon = viewHolder.mainIcon;
        TextView fMaritalStatus = viewHolder.fMatitalStatus;
        TextView secStatus = viewHolder.secStatus;
      View cloaked = viewHolder.cloak;

        MainApp.memberComplete = completeCount == MainApp.memberCount;

        fName.setText(members.getH302());
        fAge.setText(members.getH305() + "y ");

        String marStatus = "";
        switch (members.getH306()) {
            case "1":
                marStatus = "Married";
                break;
            case "2":
                marStatus = "Unmarried";
                break;
            case "3":
                marStatus = "Widowed";
                break;
            case "4":
                marStatus = "Divorced/Separated";
                break;
            default:
                marStatus = "Value Unknown";
                break;
        }

        fMaritalStatus.setText(marStatus);

        String secStatusString = "";
        switch (members.getH309())
        {
            case "1":
                secStatusString = "Avaliable";
                break;
            case "2":
                secStatusString = "Not Available";

        }

        secStatus.setText(secStatusString);


       cloaked.setVisibility(members.getMemCate().equals("")? View.VISIBLE : View.GONE);
        mainIcon.setImageResource((members.getH303().equals("1") ? R.drawable.ic_boy : R.drawable.ic_girl));
      mainIcon.setBackgroundColor(Integer.parseInt(members.getH306()) > 19 && members.getH303().equals("1") ? mContext.getResources().getColor(android.R.color.holo_blue_dark) :

              Integer.parseInt(members.getH306()) > 19 && members.getH303().equals("2") ? mContext.getResources().getColor(android.R.color.holo_red_dark)
                      : (members.getH303().equals("1") ? mContext.getResources().getColor(R.color.boy_blue) : mContext.getResources().getColor(R.color.girl_pink)));

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.famlily_member_row, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public int getItemCount() {
        return member.size();
    }

    /**
     * Provide a reference to the type of views that you are using (custom ViewHolder)
     */
    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView fName;
        private final TextView fAge;
        private final TextView fMatitalStatus;
        private final TextView secStatus;
        //private final TextView addSec;
        //private final LinearLayout subItem;
        private final ImageView fmRow;
        private final ImageView mainIcon;
       private final View cloak;


        public ViewHolder(View v) {
            super(v);
            fName = v.findViewById(R.id.chh02);
            fAge = v.findViewById(R.id.chh05);
            fMatitalStatus = v.findViewById(R.id.chh06);
            secStatus = v.findViewById(R.id.csecStatus);
            //  addSec = v.findViewById(R.id.cadd_section);
            //  subItem = v.findViewById(R.id.csubitem);
            fmRow = v.findViewById(R.id.cfmRow);
            mainIcon = v.findViewById(R.id.mainIcon);
           cloak = v.findViewById(R.id.cloaked);

        }

        public TextView getTextView() {
            return fName;
        }
    }


}
