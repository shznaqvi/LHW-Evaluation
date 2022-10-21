package edu.aku.hassannaqvi.lhwevaluation.ui.sections;

import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.LHWForm;
import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.adolList;
import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.hhForm;
import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.lhwgbHhForm;
import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.maleList;
import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.mwra;
import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.mwraCount;
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

import edu.aku.hassannaqvi.lhwevaluation.R;
import edu.aku.hassannaqvi.lhwevaluation.contracts.TableContracts;
import edu.aku.hassannaqvi.lhwevaluation.core.MainApp;
import edu.aku.hassannaqvi.lhwevaluation.database.DatabaseHelper;
import edu.aku.hassannaqvi.lhwevaluation.databinding.ActivitySectionW41Binding;
import edu.aku.hassannaqvi.lhwevaluation.models.HHForm;
import edu.aku.hassannaqvi.lhwevaluation.models.LHWGB_HH;
import edu.aku.hassannaqvi.lhwevaluation.ui.EndingActivity;


public class SectionW41Activity extends AppCompatActivity {
    private static final String TAG = "SectionW41Activity";
    ActivitySectionW41Binding bi;
    private DatabaseHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1
                : sharedPref.getString("lang", "1").equals("1") ? R.style.AppThemeUrdu
                : R.style.AppThemeSindhi);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_w41);
        bi.setCallback(this);
        bi.setMwra(mwra);

    }


    private boolean updateDB() {
        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        try {
            updcount = db.updatesMwraColumn(TableContracts.MWRAListTable.COLUMN_SW41, mwra.sW41toString());
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
            mwraCount--;

            if (mwra.getW401().equals("1") && mwra.getW402().equals("1")) {
                startActivity(new Intent(this, SectionW42Activity.class));
            } else if (mwra.getW401().equals("1") && mwra.getW402().equals("2"))
            {
                if (MainApp.adolList.size() > 0 && !MainApp.adolFlag) {
                    lhwgbHhForm = new LHWGB_HH();
                    startActivity(new Intent(this, SectionABActivity.class).putExtra("complete", true));

                } else if (MainApp.maleList.size() > 0 && !MainApp.maleFlag) {
                    lhwgbHhForm = new LHWGB_HH();
                    startActivity(new Intent(this, SectionMActivity.class).putExtra("complete", true));
                }
                    else {
                        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", true));
                    }
                }else if(mwra.getW401().equals("2") && (MainApp.hhForm.getDistrict().equals("218") || hhForm.getDistrict().equals("234"))){
                startActivity(new Intent(this, SectionGB02Activity.class));
            }else if (mwra.getW401().equals("2")){
                if (MainApp.adolList.size() > 0 && !MainApp.adolFlag) {
                    lhwgbHhForm = new LHWGB_HH();
                    startActivity(new Intent(this, SectionABActivity.class).putExtra("complete", true));

                } else if (MainApp.maleList.size() > 0 && !MainApp.maleFlag) {
                    lhwgbHhForm = new LHWGB_HH();
                    startActivity(new Intent(this, SectionMActivity.class).putExtra("complete", true));

                } else {
                    startActivity(new Intent(this, EndingActivity.class).putExtra("complete", true));
                }
            }

            finish();
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
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