package edu.aku.hassannaqvi.lhwevaluation.ui.sections;

import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.lhwgbHhForm;
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
import edu.aku.hassannaqvi.lhwevaluation.databinding.ActivitySectionGb02Binding;
import edu.aku.hassannaqvi.lhwevaluation.models.LHWGB_HH;
import edu.aku.hassannaqvi.lhwevaluation.models.MWRA;
import edu.aku.hassannaqvi.lhwevaluation.ui.EndingActivity;

public class SectionGB02Activity extends AppCompatActivity {

    private static final String TAG = "SectionGB02Activity";
    ActivitySectionGb02Binding bi;
    private DatabaseHelper db;
    private ArrayList<String> memberNames;
    private String selectedMemberUID = "";
    private String selectedMemberName= "";
    private String selectedMemberSno= "";
    private String selectedMemberAge = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1
                : sharedPref.getString("lang", "1").equals("1") ? R.style.AppThemeUrdu
                : R.style.AppThemeSindhi);
        //bi.setForm(lhwgbHhForm);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_gb02);
        bi.setCallback(this);
        db = MainApp.appInfo.getDbHelper();

        if(MainApp.UIDFlag == 1)
        {
            selectedMemberUID = MainApp.mwra.getWraUID();
            selectedMemberName = MainApp.mwra.getW101();
            selectedMemberSno = MainApp.mwra.getWraSno();
            selectedMemberAge = MainApp.mwra.getW102();
            MainApp.UIDFlag = 0;
        }else if(MainApp.UIDFlag == 2){
            selectedMemberUID = MainApp.hhForm.getMaleUID();
            selectedMemberName = MainApp.hhForm.getM101();
            selectedMemberSno = MainApp.hhForm.getMaleSno();
            selectedMemberAge = MainApp.hhForm.getMaleAge();
            MainApp.UIDFlag = 0;
        }else if(MainApp.UIDFlag == 3){
            selectedMemberUID = MainApp.hhForm.getAdolUID();
            selectedMemberName = MainApp.hhForm.getAb101();
            selectedMemberSno = MainApp.hhForm.getAdolSno();
            selectedMemberAge = MainApp.hhForm.getAb102();
            MainApp.UIDFlag = 0;
        }

        try {
            lhwgbHhForm = db.getLHWGB_HHByUUid(selectedMemberUID);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(LHW_GB_HH): " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }

        //if (lhwgbHhForm == null) lhwgbHhForm = new LHWGB_HH();
        bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(SectionGB02Activity.this, R.color.colorAccent));
        bi.btnContinue.setEnabled(true);
        if (MainApp.lhwgbHhForm == null) {
            MainApp.lhwgbHhForm = new LHWGB_HH();

            MainApp.lhwgbHhForm.setUuid(MainApp.hhForm.getUid());
            MainApp.lhwgbHhForm.setDeviceId(MainApp.hhForm.getDeviceId());
            MainApp.lhwgbHhForm.setCluster(MainApp.hhForm.getLhwCode());
            lhwgbHhForm.setLhwCode(MainApp.LHWForm.getA104c());
            MainApp.lhwgbHhForm.setHhid(MainApp.hhForm.getKhandandNo());
            MainApp.lhwgbHhForm.setUserName(MainApp.hhForm.getUserName());
            MainApp.lhwgbHhForm.setSysDate(MainApp.hhForm.getSysDate());
            MainApp.lhwgbHhForm.setAppver(MainApp.hhForm.getAppver());
            lhwgbHhForm.setMuid(selectedMemberUID);
            lhwgbHhForm.setG701(selectedMemberSno);
            lhwgbHhForm.setG703(selectedMemberAge);

            MainApp.lhwgbHhForm.setG702(selectedMemberName);

        }

        bi.setForm(lhwgbHhForm);
    }


    private boolean updateDB() {
        long updcount = 0;
        try {
            updcount = db.updatesLHWGB_HHFormColumn(TableContracts.LHWGB_HHTable.COLUMN_GBV02, lhwgbHhForm.sGBV02toString());
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
        if (!lhwgbHhForm.getUid().equals("")) return true;
        //lhwgbHhForm.populateMeta();
        long rowId = 0;
        try {
            rowId = db.addLHWGB_HHForm(lhwgbHhForm);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        lhwgbHhForm.setId(String.valueOf(rowId));
        if (rowId > 0) {
            lhwgbHhForm.setUid(lhwgbHhForm.getDeviceId() + lhwgbHhForm.getId());
            db.updatesLHWGB_HHFormColumn(TableContracts.LHWGB_HHTable.COLUMN_UID, lhwgbHhForm.getUid());
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
            i = new Intent(this, SectionGB02BActivity.class).putExtra("complete", true);
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

        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
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


}