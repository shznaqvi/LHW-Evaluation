package edu.aku.hassannaqvi.lhwevaluation.adapters;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONException;

import java.util.Collections;
import java.util.List;

import edu.aku.hassannaqvi.lhwevaluation.R;
import edu.aku.hassannaqvi.lhwevaluation.core.MainApp;
import edu.aku.hassannaqvi.lhwevaluation.database.DatabaseHelper;
import edu.aku.hassannaqvi.lhwevaluation.models.HHForm;

/**
 * Created by hassan.naqvi on 8/1/2016.
 */
public class FormsAdapter extends RecyclerView.Adapter<FormsAdapter.ViewHolder> {
    private static final String TAG = "FormsAdapter";
    Context c;
    DatabaseHelper db;
    private List<HHForm> fc = Collections.emptyList();

    // Provide a suitable constructor (depends on the kind of dataset)
    public FormsAdapter(List<HHForm> fc, Context c) {
        this.fc = fc;
        this.c = c;
        Log.d("TAG:count", String.valueOf(getItemCount()));
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,
                                         int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.pendingform_layout, parent, false);
        // set the view's size, margins, paddings and layout parameters
        db = new DatabaseHelper(c);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {


/*        String motherName = "";
        try {
            motherName = db.getWraName(fc.get(position).getUid());
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(c, "JSONException(HHForm): " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }*/

     /*   String childName = "";
        try {
            childName = db.getChildName(fc.get(position).getUid());
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(c, "JSONException(HHForm): " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }*/

        String iStatus = "Status  Unknown";
        int iColor = 0;
        switch (fc.get(position).getiStatus()) {
            case "1":
                iStatus = "Complete";
                iColor = Color.GREEN;
                break;
            case "2":
                iStatus = "No Respondent";
                iColor = Color.RED;
                break;
            case "3":
                iStatus = "Memebers Absent";
                iColor = Color.RED;
                break;
            case "4":
                iStatus = "Refused";
                iColor = Color.RED;
                break;
            case "5":
                iStatus = "Empty";
                iColor = Color.RED;
                break;
            case "6":
                iStatus = "Not Found";
                iColor = Color.RED;
                break;
            case "96":
                iStatus = "Other Reason";
                iColor = Color.RED;
                break;
            default:
                iStatus = "Open HHForm";
                iColor = Color.RED;
                break;

        }

        holder.hhno.setText(fc.get(position).getHhid());
        holder.cluster.setText(fc.get(position).getCluster());
        holder.cluster.setText(fc.get(position).getCluster());
        holder.cluster.setText(fc.get(position).getCluster());
        holder.istatus.setText(iStatus);
        /*holder.fatherName.setText(motherName + " / " + childName);*/

        holder.sysdate.setText(fc.get(position).getSysDate());
        holder.istatus.setTextColor(iColor);


      /*  holder.itemView.setOnClickListener(v -> {
            // Get the current state of the item

            MainApp.HHForm = fc.get(position);
            //MainApp.households.setVisitNo(String.valueOf(Integer.parseInt(MainApp.households.getVisitNo())+1));
            if (!MainApp.HHForm.getiStatus().equals("1")) {

                editHousehold(position);

            } else {
                Toast.makeText(c, "This households has been locked. You cannot edit household for locked households", Toast.LENGTH_LONG).show();
            }


        });
*/
    }


    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return fc.size();
    }

    private void editHousehold(int position) {
        MainApp.HHForm = new HHForm();
        try {
            MainApp.HHForm = db.getFormByClusterHHNo(fc.get(position).getCluster(), fc.get(position).getHhid());
        } catch (JSONException e) {
            Log.d(TAG, c.getString(R.string.hh_exists_form) + e.getMessage());
            Toast.makeText(c, c.getString(R.string.hh_exists_form) + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public RecyclerView rv;
        public TextView sysdate;
        public TextView cluster;
        public TextView hhno;
        public TextView istatus;
        public TextView secStatusAnthro;
        public TextView secStatusBlood;
        public TextView secStatusStool;
        public TextView fatherName;
        // each data item is just a string in this case

        public ViewHolder(View v) {
            super(v);
//            rv = v.findViewById(R.id.FormsList);
            sysdate = v.findViewById(R.id.sysdate);
            cluster = v.findViewById(R.id.cluster);
            hhno = v.findViewById(R.id.hhno);
            istatus = v.findViewById(R.id.istatus);
            fatherName = v.findViewById(R.id.fathername);
            secStatusAnthro = v.findViewById(R.id.secStatusAnthro);
            secStatusBlood = v.findViewById(R.id.secStatusBlood);
            secStatusStool = v.findViewById(R.id.secStatusStool);

        }


    }
}