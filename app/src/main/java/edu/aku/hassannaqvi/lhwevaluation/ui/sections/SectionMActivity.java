package edu.aku.hassannaqvi.lhwevaluation.ui.sections;

import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.hhForm;
import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.maleList;
import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.mwraList;
import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.sharedPref;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
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
import edu.aku.hassannaqvi.lhwevaluation.databinding.ActivitySectionMBinding;
import edu.aku.hassannaqvi.lhwevaluation.models.FamilyMembers;
import edu.aku.hassannaqvi.lhwevaluation.ui.EndingActivity;


public class SectionMActivity extends AppCompatActivity {
    private static final String TAG = "SectionMActivity";
    ActivitySectionMBinding bi;
    private DatabaseHelper db;
    private ArrayList<String> memberNames;
    private int listPosition = 0;
    int postion = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1
                : sharedPref.getString("lang", "1").equals("1") ? R.style.AppThemeUrdu
                : R.style.AppThemeSindhi);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_m);
        bi.setCallback(this);
        bi.setHHForm(hhForm);
/*        bi.m101a.isChecked();
        bi.m101.setEnabled(false);*/
        populateSpinner();

    }
   private void populateSpinner() {

        memberNames = new ArrayList<>();
        memberNames.add("...");
        for (FamilyMembers sfm : MainApp.maleList) {
            memberNames.add(sfm.getH302());
        }

        // Apply the adapter to the spinner
        bi.m101.setAdapter(new ArrayAdapter<>(SectionMActivity.this, R.layout.custom_spinner, memberNames));
        if (!MainApp.hhForm.getM101().equals("")) {
            int selectedPosition = memberNames.indexOf(MainApp.hhForm.getM101());
            bi.m101.setSelection(selectedPosition);
        }
        bi.m101.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.d(TAG, "onItemSelected: "+position);
                postion = position;

                if (position == 0) return;
                MainApp.hhForm.setM101(memberNames.get(position));
                listPosition = position;



            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });

       hhForm.setMaleUID(maleList.get(postion).getUid());


    }

    private boolean updateDB() {
        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        try {
            updcount = db.updatesHHFormColumn(TableContracts.HHFormsTable.COLUMN_SM, hhForm.sMtoString());
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
            MainApp.maleFlag = true;
            MainApp.UIDFlag = 2;
            startActivity(new Intent(this, SectionGB02Activity.class));
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