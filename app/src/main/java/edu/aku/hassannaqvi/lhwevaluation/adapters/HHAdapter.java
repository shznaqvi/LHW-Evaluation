package edu.aku.hassannaqvi.lhwevaluation.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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
import edu.aku.hassannaqvi.lhwevaluation.models.HHForm;
import edu.aku.hassannaqvi.lhwevaluation.ui.sections.SectionH2Activity;


public class HHAdapter extends RecyclerView.Adapter<HHAdapter.ViewHolder> {
    private static final String TAG = "CustomAdapter";
    private final Context mContext;
    private final List<HHForm> hhForms;
    private final int mExpandedPosition = -1;
    private final int completeCount;

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param hhForms List<FemaleMembersModel> containing the data to populate views to be used by RecyclerView.
     */
    public HHAdapter(Context mContext, List<HHForm> hhForms) {
        this.hhForms = hhForms;
        this.mContext = mContext;
        completeCount = 0;
        MainApp.lhwComplete = false;


    }


    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position1) {
        int position = viewHolder.getAdapterPosition();
        Log.d(TAG, "Element " + position + " set.");
        HHForm hhForm = this.hhForms.get(position);        // Get element from your dataset at this position and replace the contents of the view
        // with that element

        TextView lhwName = viewHolder.lhwName;
        TextView lhsName = viewHolder.lhsName;
        TextView area = viewHolder.area;
        ImageView indicator = viewHolder.indicator;
        TextView area2 = viewHolder.area2;

        // String pregStatus = lhw.getRb07().equals("1") ? "Pregnant" : "Not Pregnant";

        MainApp.lhwComplete = completeCount == MainApp.lhwCount;

        lhwName.setText(hhForm.getH202());
        //lhsName.setText(hhForm.getA105());
        area.setText(hhForm.getH203());
        //area2.setText(hhForm.getA103());
        String marStatus = "";
        String wifeOrDaughter = "";
/*


        switch (lhw.getRb06()) {
            case "1":
                marStatus = "Married";
                indicator.setBackgroundColor(ContextCompat.getColor(mContext, R.color.redDark));
                wifeOrDaughter = "w/o ";
                break;
            case "2":
                marStatus = "Divorced";
                indicator.setBackgroundColor(ContextCompat.getColor(mContext, R.color.teal_700));
                wifeOrDaughter = "w/o ";

                break;
            case "3":
                marStatus = "Widow";
                indicator.setBackgroundColor(ContextCompat.getColor(mContext, R.color.teal_200));
                wifeOrDaughter = "w/o ";

                break;
            case "4":
                marStatus = "Unmarried";
                indicator.setBackgroundColor(ContextCompat.getColor(mContext, R.color.lightPink));
                wifeOrDaughter = "d/o ";

                break;
            default:
                marStatus = "Value Unknown";
                break;
        }

        fAge.setText(wifeOrDaughter + lhw.getRb03() + " | " + lhw.getRb05() + "y  ");

        if (lhw.getRb07().equals("1")) {
            secStatus.setBackgroundColor(ContextCompat.getColor(mContext, R.color.redLight));
            indicator.setImageDrawable(ContextCompat.getDrawable(mContext, R.drawable.ic_baseline_pregnant_woman_24));

        }
        fMaritalStatus.setText(marStatus);
        secStatus.setText(pregStatus);
*/


        viewHolder.itemView.setOnClickListener(v -> {
            // Get the current state of the item

            MainApp.LHWForm = MainApp.lhwList.get(position);
            MainApp.HHForm = new HHForm();
            Intent intent = new Intent(mContext, SectionH2Activity.class);

            intent.putExtra("position", position);

            MainApp.selectedLHW = position;

            intent.putExtra("position", position);

            ((Activity) mContext).startActivityForResult(intent, 2);


        });

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.lhw_row, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public int getItemCount() {
        return hhForms.size();
    }

    /**
     * Provide a reference to the type of views that you are using (custom ViewHolder)
     */
    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView lhwName;
        private final TextView lhsName;
        private final TextView area;
        private final TextView area2;
        private final ImageView fmRow;
        private final ImageView indicator;


        public ViewHolder(View v) {
            super(v);
            lhwName = v.findViewById(R.id.personName);
            lhsName = v.findViewById(R.id.personName2);
            area = v.findViewById(R.id.area);
            area2 = v.findViewById(R.id.area2);
            fmRow = v.findViewById(R.id.fmRow);
            indicator = v.findViewById(R.id.indicator);

        }

        public TextView getTextView() {
            return lhwName;
        }
    }


}
