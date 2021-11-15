package edu.aku.hassannaqvi.lhwevaluation.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.lhwevaluation.MainActivity;
import edu.aku.hassannaqvi.lhwevaluation.R;
import edu.aku.hassannaqvi.lhwevaluation.contracts.TableContracts;
import edu.aku.hassannaqvi.lhwevaluation.core.MainApp;
import edu.aku.hassannaqvi.lhwevaluation.database.DatabaseHelper;
import edu.aku.hassannaqvi.lhwevaluation.databinding.ActivitySectionLhwhhBinding;
import edu.aku.hassannaqvi.lhwevaluation.models.LHWHouseholds;
import edu.aku.hassannaqvi.lhwevaluation.ui.EndingActivity;


public class SectionLhwHhActivity extends AppCompatActivity {
    private static final String TAG = "SectionLhwHhActivity";
    ActivitySectionLhwhhBinding bi;
    private DatabaseHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_lhwhh);
        bi.setCallback(this);
        db = MainApp.appInfo.getDbHelper();

        MainApp.lhwHHCount++;
        bi.btnSaveAddMore.setVisibility(MainApp.lhwHHCount == 10 ? View.GONE : View.VISIBLE);

        if (!hhExists()) {
            initializeLHWHHForm();
        }

        bi.setLHWHouseholds(MainApp.LHWHouseholds);
        // Initialize Database

    }


    private boolean insertNewRecord() {
        if (!MainApp.LHWHouseholds.getUid().equals("")) return true;
        long rowId = 0;
        try {
            rowId = db.addLhwHh(MainApp.LHWHouseholds);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        MainApp.LHWHouseholds.setId(String.valueOf(rowId));
        if (rowId > 0) {
            MainApp.LHWHouseholds.setUid(MainApp.LHWHouseholds.getDeviceId() + MainApp.LHWHouseholds.getId());
            db.updatesLhwHhColumn(TableContracts.LHWFormsTable.COLUMN_UID, MainApp.LHWHouseholds.getUid());
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
            if (bi.btnSaveAddMore.getId() == view.getId()) {
                i = new Intent(this, SectionLhwHhActivity.class).putExtra("complete", true);
            } else {
                i = new Intent(this, MainActivity.class).putExtra("complete", true);
            }
          /*  if (bi.btnSaveAddMore.getId() == view.getId()) {
                i = new Intent(this, SectionLhwHhActivity.class).putExtra("complete", true);
            } else {
                i = new Intent(this, MainActivity.class).putExtra("complete", true);
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

    private boolean hhExists() {


        try {
            MainApp.LHWHouseholds = db.getLHWHHBySNo(MainApp.LHWForm.getA104c(), String.valueOf(MainApp.lhwHHCount));
        } catch (JSONException e) {
            Log.d(TAG, getString(R.string.hh_exists_form) + e.getMessage());
            Toast.makeText(this, getString(R.string.hh_exists_form) + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        return MainApp.LHWHouseholds != null;
    }

    private void initializeLHWHHForm() {
        MainApp.LHWHouseholds = new LHWHouseholds();
        MainApp.LHWHouseholds.setUserName(MainApp.user.getUserName());
        MainApp.LHWHouseholds.setLuid(MainApp.LHWForm.getUid());
        MainApp.LHWHouseholds.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        MainApp.LHWHouseholds.setDeviceId(MainApp.deviceid);
        MainApp.LHWHouseholds.setAppver(MainApp.versionName + "." + MainApp.versionCode);
        MainApp.LHWHouseholds.setA101(MainApp.LHWForm.getA101());
        MainApp.LHWHouseholds.setA102(MainApp.LHWForm.getA102());
        MainApp.LHWHouseholds.setA103(MainApp.LHWForm.getA103());
        MainApp.LHWHouseholds.setA104n(MainApp.LHWForm.getA104n());
        MainApp.LHWHouseholds.setA104c(MainApp.LHWForm.getA104c());
        MainApp.LHWHouseholds.setH101(String.valueOf(MainApp.lhwHHCount));
        MainApp.LHWHouseholds.setLhwCode(MainApp.LHWForm.getA104c());


    }

}