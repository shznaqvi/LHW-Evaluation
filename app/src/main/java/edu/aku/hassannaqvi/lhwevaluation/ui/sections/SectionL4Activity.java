package edu.aku.hassannaqvi.lhwevaluation.ui.sections;


import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.LHWForm;
import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.sharedPref;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.lhwevaluation.MainActivity;
import edu.aku.hassannaqvi.lhwevaluation.R;
import edu.aku.hassannaqvi.lhwevaluation.contracts.TableContracts;
import edu.aku.hassannaqvi.lhwevaluation.core.MainApp;
import edu.aku.hassannaqvi.lhwevaluation.database.DatabaseHelper;
import edu.aku.hassannaqvi.lhwevaluation.databinding.ActivitySectionL4Binding;
import edu.aku.hassannaqvi.lhwevaluation.models.LHWHouseholds;


public class SectionL4Activity extends AppCompatActivity {
    private static final String TAG = "SectionL4Activity";
    ActivitySectionL4Binding bi;
    private DatabaseHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1
                : sharedPref.getString("lang", "1").equals("1") ? R.style.AppThemeUrdu
                : R.style.AppThemeSindhi);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_l4);
        bi.setCallback(this);
        bi.setLhwForm(MainApp.LHWForm);

        // Initialize Database
        db = MainApp.appInfo.getDbHelper();
    }

    private boolean updateDB() {
        int updcount = 0;
        try {
            updcount = db.updatesLHWFormColumn(TableContracts.LHWFormsTable.COLUMN_SL4, MainApp.LHWForm.sCtoString());
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
        // saveDraft();
        if (updateDB()) {
            if (LHWForm.getDisctrict().equals("218") || LHWForm.getDisctrict().equals("234")) {
                startActivity(new Intent(this, SectionGB01AActivity.class).putExtra("complete", true));
                finish();
            } else {
                MainApp.LHWHouseholds = new LHWHouseholds();

                try {
                    MainApp.lhwHHCount = db.getLHWHHbyLHWCode(MainApp.LHWForm.getA104c());
                    startActivity(new Intent(this, SectionLhwHhActivity.class).putExtra("complete", true));
                    finish();
                } catch (JSONException e) {
                    Toast.makeText(this, "JSONException(LHWForm): " + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        }else {
            Toast.makeText(this, getString(R.string.upd_db_error), Toast.LENGTH_SHORT).show();
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
        setResult(RESULT_CANCELED);
    }


}