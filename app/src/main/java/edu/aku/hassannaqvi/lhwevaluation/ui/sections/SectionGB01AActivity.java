package edu.aku.hassannaqvi.lhwevaluation.ui.sections;

import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.lhwgbForm;
import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.lhwgbHhForm;
import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.maleList;
import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.sharedPref;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.util.ArrayList;

import edu.aku.hassannaqvi.lhwevaluation.R;
import edu.aku.hassannaqvi.lhwevaluation.contracts.TableContracts;
import edu.aku.hassannaqvi.lhwevaluation.core.MainApp;
import edu.aku.hassannaqvi.lhwevaluation.database.DatabaseHelper;
import edu.aku.hassannaqvi.lhwevaluation.databinding.ActivitySectionGb01aBinding;
import edu.aku.hassannaqvi.lhwevaluation.models.LHWGB_HH;
import edu.aku.hassannaqvi.lhwevaluation.models.LHW_GB;
import edu.aku.hassannaqvi.lhwevaluation.ui.EndingActivity;

public class SectionGB01AActivity extends AppCompatActivity {

    private static final String TAG = "SectionGB01AActivity";
    ActivitySectionGb01aBinding bi;
    private DatabaseHelper db;
    private ArrayList<String> memberNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1
                : sharedPref.getString("lang", "1").equals("1") ? R.style.AppThemeUrdu
                : R.style.AppThemeSindhi);

        db = MainApp.appInfo.getDbHelper();
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_gb01a);
        bi.setCallback(this);


        try {
            lhwgbForm = db.getLHWGBByUUid();
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(LHW_GB_HH): " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }

        //if (lhwgbHhForm == null) lhwgbHhForm = new LHWGB_HH();
        bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(SectionGB01AActivity.this, R.color.colorAccent));
        bi.btnContinue.setEnabled(true);
        if (lhwgbForm == null) {
            MainApp.lhwgbForm = new LHW_GB();

            MainApp.lhwgbForm.setUuid(MainApp.LHWForm.getUid());
            MainApp.lhwgbForm.setDeviceId(MainApp.LHWForm.getDeviceId());
            MainApp.lhwgbForm.setCluster(MainApp.LHWForm.getCluster());
            MainApp.lhwgbForm.setLhwuid(MainApp.LHWForm.getUid());
            MainApp.lhwgbForm.setLhwCode(MainApp.LHWForm.getA104c());
            //MainApp.lhwgbForm.setHhid(MainApp.LHWForm.get());
            MainApp.lhwgbForm.setUserName(MainApp.LHWForm.getUserName());
            MainApp.lhwgbForm.setSysDate(MainApp.LHWForm.getSysDate());
            MainApp.lhwgbForm.setAppver(MainApp.LHWForm.getAppver());
        }


        bi.setForm(lhwgbForm);
    }

    private boolean updateDB() {
        long updcount = 0;
        try {
            updcount = db.updatesLHW_GBFormColumn(TableContracts.LHW_GBTable.COLUMN_GB01, lhwgbForm.sGB01toString());
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, R.string.upd_db_form + e.getMessage());
            Toast.makeText(this, R.string.upd_db_form + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount > 0) return true;
        else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private boolean insertNewRecord() {
        if (!lhwgbForm.getUid().equals("")) return true;
        long rowId = 0;
        try {
            rowId = db.addLHW_GBForm(lhwgbForm);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        lhwgbForm.setId(String.valueOf(rowId));
        if (rowId > 0) {
            lhwgbForm.setUid(lhwgbForm.getDeviceId() + lhwgbForm.getId());
            db.updatesLHW_GBFormColumn(TableContracts.LHW_GBTable.COLUMN_UID, lhwgbForm.getUid());
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    public void btnContinue(View view) {
        if (!formValidation()) return;
        if (!insertNewRecord()) return;
        if (updateDB()) {
            Intent i;
            i = new Intent(this, SectionGB01BActivity.class).putExtra("complete", true);
            startActivity(i);
            finish();
        } else {
            Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
        }
    }

    public void btnEnd(View view) {

        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
        finish();
    }

    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    @Override
    public void onBackPressed() {
        setResult(RESULT_CANCELED);
    }

}