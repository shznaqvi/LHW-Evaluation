package edu.aku.hassannaqvi.lhwevaluation.ui.sections;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.lhwevaluation.R;
import edu.aku.hassannaqvi.lhwevaluation.contracts.TableContracts;
import edu.aku.hassannaqvi.lhwevaluation.core.MainApp;
import edu.aku.hassannaqvi.lhwevaluation.database.DatabaseHelper;
import edu.aku.hassannaqvi.lhwevaluation.databinding.ActivitySectionL1Binding;
import edu.aku.hassannaqvi.lhwevaluation.ui.EndingActivity;


public class SectionL1Activity extends AppCompatActivity {
    private static final String TAG = "SectionL1Activity";
    ActivitySectionL1Binding bi;
    private DatabaseHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_l1);
        bi.setCallback(this);
        bi.setLhwForm(MainApp.LHWForm);

        // Initialize Database
        db = MainApp.appInfo.getDbHelper();

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
            finish();
            startActivity(i);
        } else {
            Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
        }
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    @Override
    public void onBackPressed() {
        // Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
        setResult(RESULT_CANCELED);
    }


}