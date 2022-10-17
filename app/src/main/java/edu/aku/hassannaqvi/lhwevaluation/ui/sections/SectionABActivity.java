package edu.aku.hassannaqvi.lhwevaluation.ui.sections;

import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.adolList;
import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.hhForm;
import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.lhwgbHhForm;
import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.maleList;
import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.mwra;
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
import edu.aku.hassannaqvi.lhwevaluation.databinding.ActivitySectionAbBinding;
import edu.aku.hassannaqvi.lhwevaluation.models.FamilyMembers;
import edu.aku.hassannaqvi.lhwevaluation.models.HHForm;
import edu.aku.hassannaqvi.lhwevaluation.models.LHWGB_HH;
import edu.aku.hassannaqvi.lhwevaluation.ui.EndingActivity;


public class SectionABActivity extends AppCompatActivity {
    private static final String TAG = "SectionABActivity";
    ActivitySectionAbBinding bi;
    private DatabaseHelper db;
    private ArrayList<String> memberNames;
    private ArrayList<String> age;
    private ArrayList<String> maritalStatus;
    private ArrayList<String> sno;
    int postion = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1
                : sharedPref.getString("lang", "1").equals("1") ? R.style.AppThemeUrdu
                : R.style.AppThemeSindhi);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_ab);
        bi.setCallback(this);
        //bi.setHHForm(hhForm);

        db = MainApp.appInfo.getDbHelper();
        populateSpinner();

    }

    private void populateSpinner() {

        memberNames = new ArrayList<>();
        age = new ArrayList<>();
        maritalStatus = new ArrayList<>();
        sno = new ArrayList<>();

        memberNames.add("...");
        age.add("...");
        maritalStatus.add("...");
        sno.add("...");

        for (FamilyMembers sfm : MainApp.adolList) {
            memberNames.add(sfm.getH302());
            age.add(sfm.getH305());
            maritalStatus.add(sfm.getH306());
            sno.add(sfm.getSno());
        }

        // Apply the adapter to the spinner

        bi.ab101.setAdapter(new ArrayAdapter<String>(SectionABActivity.this, R.layout.custom_spinner, memberNames));
        if (!MainApp.hhForm.getAb101().equals("")) {
            int selectedPosition = memberNames.indexOf(MainApp.hhForm.getAb101());
            bi.ab101.setSelection(selectedPosition);
        }
        bi.ab101.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.d(TAG, "onItemSelected: " + position);
                postion = position;

                if (position == 0) return;
                MainApp.hhForm.setAb101(memberNames.get(position));
                hhForm.setAb102(age.get(position));
                hhForm.setAdolSno(sno.get(position));
                hhForm.setMaritalStatus(maritalStatus.get(position));

                switch (hhForm.getMaritalStatus()) {
                    case "1":
                        bi.maritalStatus.setText("Married");
                        break;
                    case "2":
                        bi.maritalStatus.setText("Unmarried");
                        break;
                    case "3":
                        bi.maritalStatus.setText("Widow");
                        break;
                    case "4":
                        bi.maritalStatus.setText("Divorced");
                        break;
                }

                bi.setHHForm(hhForm);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });

        hhForm.setAdolUID(adolList.get(postion).getUid());
        //hhForm.setAdolAge(adolList.get(postion).getH305());


        //bi.sno.setText(adolList.get(postion).getSno());






    }

    private boolean updateDB() {
        long updcount = 0;
        try {
            updcount = db.updatesHHFormColumn(TableContracts.HHFormsTable.COLUMN_SAB, hhForm.sABtoString());
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
            MainApp.adolFlag = true;
            MainApp.UIDFlag = 3;
            if(hhForm.getDistrict().equals("218") || hhForm.getDistrict().equals("234")){
                startActivity(new Intent(this, SectionGB02Activity.class).putExtra("complete", true));
            }else{
                if (MainApp.maleList.size() > 0 && !MainApp.maleFlag) {
                    lhwgbHhForm = new LHWGB_HH();
                    startActivity(new Intent(this, SectionMActivity.class).putExtra("complete", true));
                }else{
                    startActivity(new Intent(this, EndingActivity.class).putExtra("complete", true));
                }
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