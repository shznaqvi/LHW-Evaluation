package edu.aku.hassannaqvi.lhwevaluation.ui.sections;


import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.sharedPref;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.lhwevaluation.MainActivity;
import edu.aku.hassannaqvi.lhwevaluation.R;
import edu.aku.hassannaqvi.lhwevaluation.contracts.TableContracts;
import edu.aku.hassannaqvi.lhwevaluation.core.MainApp;
import edu.aku.hassannaqvi.lhwevaluation.database.DatabaseHelper;
import edu.aku.hassannaqvi.lhwevaluation.databinding.ActivitySectionL1Binding;
import edu.aku.hassannaqvi.lhwevaluation.ui.TakePhoto;


public class SectionL1Activity extends AppCompatActivity {
    private static final String TAG = "SectionL1Activity";
    ActivitySectionL1Binding bi;
    private DatabaseHelper db;
    private int PhotoSerial = 0;
    private String photolist;
    ActivityResultLauncher<Intent> takePhotoLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        // There are no request codes
                        //Intent data = result.getData();
                        Intent data = result.getData();

                        Toast.makeText(SectionL1Activity.this, "Photo Taken", Toast.LENGTH_SHORT).show();

                        String fileName = data.getStringExtra("FileName");
                        //   photolist = photolist + fileName + ";";
                        // PhotoSerial++;

                        bi.lhwphoto.setText(bi.lhwphoto.getText().toString() + PhotoSerial + " - " + fileName + ";\r\n");
                    } else {
                        Toast.makeText(SectionL1Activity.this, "Photo Cancelled", Toast.LENGTH_SHORT).show();

                        //TODO: Implement functionality below when photo was not taken
                        // ...
                        //bi.lhwphoto.setText("Photo not taken.");
                    }

                    if (result.getResultCode() == Activity.RESULT_CANCELED) {
                        Toast.makeText(SectionL1Activity.this, "None added.", Toast.LENGTH_SHORT).show();
                    }

                }
            });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1
                : sharedPref.getString("lang", "1").equals("1") ? R.style.AppThemeUrdu
                : R.style.AppThemeSindhi);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_l1);
        bi.setCallback(this);
        bi.setLhwForm(MainApp.LHWForm);

        // Initialize Database
        db = MainApp.appInfo.getDbHelper();
        PhotoSerial++;
    }


    private boolean insertNewRecord() {
        if (!MainApp.LHWForm.getUid().equals("")) return true;
        long rowId = 0;
        try {
            rowId = db.addLhwForm(MainApp.LHWForm);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        MainApp.LHWForm.setId(String.valueOf(rowId));
        if (rowId > 0) {
            MainApp.LHWForm.setUid(MainApp.LHWForm.getDeviceId() + MainApp.LHWForm.getId());
            db.updatesLHWFormColumn(TableContracts.LHWFormsTable.COLUMN_UID, MainApp.LHWForm.getUid());
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private boolean updateDB() {
        int updcount = 0;
        try {
            updcount = db.updatesLHWFormColumn(TableContracts.LHWFormsTable.COLUMN_SL1, MainApp.LHWForm.sAtoString());
        } catch (JSONException e) {
            Toast.makeText(this, R.string.upd_db + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    public void btnContinue(View view) {
        if (!formValidation()) return;
        if (!insertNewRecord()) return;
        // saveDraft();
        if (updateDB()) {
            Intent i;
      //      if (bi.h111a.isChecked()) {
                i = new Intent(this, SectionL2Activity.class).putExtra("complete", true);
           /* } else {
                i = new Intent(this, EndingActivity.class).putExtra("complete", false);
            }*/

            startActivity(i);
            finish();
        } else {
            Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
        }
    }


    public void btnEnd(View view) {

        startActivity(new Intent(this, MainActivity.class).putExtra("complete", false));
        finish();
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    @Override
    public void onBackPressed() {
        // Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
        setResult(RESULT_CANCELED);
    }

    public void TakePhoto(View view) {

        Intent intent = new Intent(this, TakePhoto.class);

        // Adjust Identification Information to uniquely identify every photo and link to form
        //intent.putExtra("picID", MainApp.fc.getClusterCode() + "_" + MainApp.fc.getHhno() + "_" + MainApp.childData.getName()+ "_" + PhotoSerial);
        intent.putExtra("picID", MainApp.LHWForm.getA101() + "_" + MainApp.LHWForm.getA104c() + "_" + PhotoSerial);

        // Provide information for which photo is being taken like ChildName
        intent.putExtra("picView", "Khandan Register");
        intent.putExtra("forInfo", MainApp.LHWForm.getA104c());
//        intent.putExtra("forInfo", "This Household");

      /*  if (view.getId() == bi.btnPhoto.getId()) {
            intent.putExtra("picView", "Child".toUpperCase());
            startActivityForResult(intent, 1); // Activity is started with requestCode 1 = Front
        }*/
        takePhotoLauncher.launch(intent);

    }
}