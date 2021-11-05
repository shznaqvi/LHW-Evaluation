package edu.aku.hassannaqvi.lhwevaluation.ui.lists;


import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.hhList;
import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.selectedHH;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.json.JSONException;

import java.util.ArrayList;

import edu.aku.hassannaqvi.lhwevaluation.R;
import edu.aku.hassannaqvi.lhwevaluation.adapters.HHAdapter;
import edu.aku.hassannaqvi.lhwevaluation.core.MainApp;
import edu.aku.hassannaqvi.lhwevaluation.database.DatabaseHelper;
import edu.aku.hassannaqvi.lhwevaluation.databinding.ActivityHouseholdBinding;
import edu.aku.hassannaqvi.lhwevaluation.models.HHForm;
import edu.aku.hassannaqvi.lhwevaluation.ui.EndingActivity;
import edu.aku.hassannaqvi.lhwevaluation.ui.sections.SectionH2Activity;


public class HouseholdActivity extends AppCompatActivity {

    private static final String TAG = "LHWActivity";
    ActivityHouseholdBinding bi;
    DatabaseHelper db;
    private HHAdapter hhAdapter;
    ActivityResultLauncher<Intent> MemberInfoLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        // There are no request codes
                        //Intent data = result.getData();
                        Intent data = result.getData();
                      /*  int age = Integer.parseInt(femalemembers.getHh05y());
                        boolean isFemale = femalemembers.getHh03().equals("2");
                        boolean notMarried = femalemembers.getHh06().equals("2");
                        if (
                            // Adolescent: Male + Female - 10 to 19
                                (age >= 10 && age < 20 && notMarried)
                                        ||
                                        // MWRA: Married females between 14 to 49
                                        (age >= 14 && age < 50 && !notMarried && isFemale )

                        ) {*/
                        MainApp.hhList.add(MainApp.hhForm);

                        MainApp.HHCount++;

                        hhAdapter.notifyItemInserted(MainApp.hhList.size() - 1);
                        //  Collections.sort(MainApp.fm, new SortByStatus());
                        //hhAdapter.notifyDataSetChanged();

                        //        }

                        checkCompleteHH();
                    }
                    if (result.getResultCode() == Activity.RESULT_CANCELED) {
                        Toast.makeText(HouseholdActivity.this, "No family member added.", Toast.LENGTH_SHORT).show();
                    }

                }
            });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_mwra);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_lhw);
        bi.setCallback(this);

        db = MainApp.appInfo.dbHelper;
        MainApp.hhList = new ArrayList<>();
        Log.d(TAG, "onCreate: mwralist " + MainApp.hhList.size());
        try {
            MainApp.hhList = db.getAllFormsByLHW(MainApp.LHWForm.getUid());
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException: " + e.getMessage(), Toast.LENGTH_SHORT).show();
            Log.d(TAG, "onCreate (JSONException): " + e.getMessage());
        }

        hhAdapter = new HHAdapter(this, MainApp.hhList);
        bi.rvMembers.setAdapter(hhAdapter);
        bi.rvMembers.setLayoutManager(new LinearLayoutManager(this));


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addMoreHousehold();
        /*        if (!MainApp.households.getiStatus().equals("1")) {
                    //     Toast.makeText(LHWActivity.this, "Opening Mwra Households", Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(HouseholdActivity.this, "This households has been locked. You cannot add new members to locked forms", Toast.LENGTH_LONG).show();
                }*/

            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Activity Resumed!", Toast.LENGTH_SHORT).show();
        MainApp.HHCount = Math.round(MainApp.hhList.size());

        MainApp.hhForm = new HHForm();
        if (MainApp.hhList.size() > 0) {
            //MainApp.fm.get(Integer.parseInt(String.valueOf(MainApp.selectedLHW))).setStatus("1");
            hhAdapter.notifyItemChanged(Integer.parseInt(String.valueOf(selectedHH)));
        }


        checkCompleteHH();

        // bi.fab.setClickable(!MainApp.households.getiStatus().equals("1"));
      /* bi.completedmember.setText(mwraList.size()+ " MWRAs added");
        bi.totalmember.setText(MainApp.mwraTotal+ " M completed");*/
    }

    private void checkCompleteHH() {
        //     if (!MainApp.households.getIStatus().equals("1")) {
        int compCount = MainApp.hhList.size();

        MainApp.mwraCountComplete = compCount;
        bi.btnContinue.setVisibility(MainApp.HHCount > 0 ? View.VISIBLE : View.GONE);
        //   bi.btnContinue.setVisibility(compCount == mwraCount && !households.getiStatus().equals("1")? View.VISIBLE : View.GONE);
     /*   bi.btnContinue.setVisibility(compCount >= mwraCount ? View.VISIBLE : View.GONE);
        bi.btnContinue.setEnabled(bi.btnContinue.getVisibility()==View.VISIBLE);*/

        //  } else {
        //       Toast.makeText(this, "Households has been completed or locked", Toast.LENGTH_LONG).show();
        //   }
    }

/*    public void addFemale() {


        if (MainApp.mwraList.size() >= Integer.parseInt(MainApp.households.getRa18())) {
            displayAddMoreDialog();
        } else {
            addMoreFemale();

        }


    }*/

    private void addMoreHousehold() {
        MainApp.hhForm = new HHForm();
        Intent intent = new Intent(this, SectionH2Activity.class);
        //   finish();
        MemberInfoLauncher.launch(intent);
    }

    public void btnContinue(View view) {

        startActivity(new Intent(this, LHWActivity.class));
        finish();
      /*  if (MainApp.mwraList.size() < Integer.parseInt(MainApp.households.getRa18())) {
            displayProceedDialog();
        } else {
            proceedSelect();
        }*/


    }

    public void BtnEnd(View view) {

        Intent i = new Intent(this, EndingActivity.class);
        //i.setFlags(Intent.FLAG_ACTIVITY_FORWARD_RESULT);
        i.putExtra("complete", false);
        startActivity(i);
        finish();
        //startActivity(new Intent(this, MainActivity.class));
        /*   } else {
               Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show()
           }*/
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // check if the request code is same as what is passed  here it is 2
        if (requestCode == 2) {
            if (resultCode == Activity.RESULT_OK) {
                //   mwraList.get(selectedLHW).setExpanded(false);
                checkCompleteHH();
                hhAdapter.notifyItemChanged(MainApp.selectedHH);
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                // Write your code if there's no result
                Toast.makeText(this, "Information for " + hhList.get(MainApp.selectedHH).getH202() + " was not saved.", Toast.LENGTH_SHORT).show();
            }
        }
    }
/*
    private void displayAddMoreDialog() {
        new AlertDialog.Builder(this)
                .setTitle(R.string.title_wra_dialog_complete)
                .setMessage(String.format(getString(R.string.message_wra_dialog_addmore), MainApp.households.getRa18()))

                // Specifying a listener allows you to take an action before dismissing the dialog.
                // The dialog is automatically dismissed when a dialog button is clicked.
                .setPositiveButton(R.string.ra20_a, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Continue with delete operation
                        addMoreHousehold();
                    }
                })

                // A null listener allows the button to dismiss the dialog and take no further action.
                .setNegativeButton(R.string.ra20_b, null)
                .setIcon(R.drawable.ic_warning_24)
                .show();

    }

    private void displayProceedDialog() {
        new AlertDialog.Builder(this)
                .setTitle(R.string.title_wra_dialog_remain)
                .setMessage(String.format(getString(R.string.message_wra_dialog_proceeed), MainApp.mwraList.size() + "", MainApp.households.getRa18()))

                // Specifying a listener allows you to take an action before dismissing the dialog.
                // The dialog is automatically dismissed when a dialog button is clicked.
                .setPositiveButton(R.string.ra20_a, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Continue with delete operation
                        proceedSelect();
                    }
                })

                // A null listener allows the button to dismiss the dialog and take no further action.
                .setNegativeButton(R.string.ra20_b, null)
                .setIcon(R.drawable.ic_alert_24)
                .show();

    }*/

/*
    private void proceedSelect() {
        Intent i = new Intent(this, EndingActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_FORWARD_RESULT);
        i.putExtra("complete", true);
        startActivity(i);
        finish();
        //startActivity(new Intent(this, EndingActivity.class).putExtra("complete", true));
    }
*/

    @Override
    public void onBackPressed() {
        // Toast.makeText(getApplicationContext(), "Back Press Not Allowed", Toast.LENGTH_LONG).show();
        setResult(RESULT_OK);
        finish();
    }

}