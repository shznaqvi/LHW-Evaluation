package edu.aku.hassannaqvi.lhwevaluation.ui.sections;

import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.lhwgbForm;
import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.maleList;
import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.sharedPref;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.util.ArrayList;

import edu.aku.hassannaqvi.lhwevaluation.R;
import edu.aku.hassannaqvi.lhwevaluation.contracts.TableContracts;
import edu.aku.hassannaqvi.lhwevaluation.core.MainApp;
import edu.aku.hassannaqvi.lhwevaluation.database.DatabaseHelper;
import edu.aku.hassannaqvi.lhwevaluation.databinding.ActivitySectionGb01bBinding;
import edu.aku.hassannaqvi.lhwevaluation.databinding.ActivitySectionGb01cBinding;
import edu.aku.hassannaqvi.lhwevaluation.models.LHWHouseholds;
import edu.aku.hassannaqvi.lhwevaluation.ui.EndingActivity;

public class SectionGB01CActivity extends AppCompatActivity {
    private static final String TAG = "SectionGB01CActivity";
    ActivitySectionGb01cBinding bi;
    private DatabaseHelper db;
    private ArrayList<String> memberNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1
                : sharedPref.getString("lang", "1").equals("1") ? R.style.AppThemeUrdu
                : R.style.AppThemeSindhi);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_gb01c);
        bi.setCallback(this);
        db = MainApp.appInfo.getDbHelper();

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

    public void btnContinue(View view) {
        if (!formValidation()) return;
        if (updateDB()) {

            MainApp.LHWHouseholds = new LHWHouseholds();

            try {
                MainApp.lhwHHCount = db.getLHWHHbyLHWCode(MainApp.LHWForm.getA104c());
                startActivity(new Intent(this, SectionLhwHhActivity.class).putExtra("complete", true));
                finish();

            } catch (JSONException e) {
                Toast.makeText(this, "JSONException(LHWForm): " + e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
        finish();
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