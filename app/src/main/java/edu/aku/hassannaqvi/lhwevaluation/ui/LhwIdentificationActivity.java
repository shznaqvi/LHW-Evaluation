package edu.aku.hassannaqvi.lhwevaluation.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.lhwevaluation.MainActivity;
import edu.aku.hassannaqvi.lhwevaluation.R;
import edu.aku.hassannaqvi.lhwevaluation.core.MainApp;
import edu.aku.hassannaqvi.lhwevaluation.database.DatabaseHelper;
import edu.aku.hassannaqvi.lhwevaluation.databinding.ActivityLhwIdentificationBinding;
import edu.aku.hassannaqvi.lhwevaluation.models.LHWForm;
import edu.aku.hassannaqvi.lhwevaluation.ui.sections.SectionL1Activity;
import edu.aku.hassannaqvi.smk_ce.models.Districts;
import edu.aku.hassannaqvi.smk_ce.models.HealthFacilities;
import edu.aku.hassannaqvi.smk_ce.models.LHW;
import edu.aku.hassannaqvi.smk_ce.models.Tehsil;


public class LhwIdentificationActivity extends AppCompatActivity {
    private static final String TAG = "LhwIdentificationActivi";
    ActivityLhwIdentificationBinding bi;
    private DatabaseHelper db;
    private ArrayList<String> distNames;
    private ArrayList<String> distCodes;
    private ArrayList<String> tehsilNames;
    private ArrayList<String> tehsilCodes;
    private ArrayList<String> healthFacilityNames;
    private ArrayList<String> healthFacilityCodes;
    private ArrayList<String> lhwNames;
    private ArrayList<String> lhwCodes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_lhw_identification);
        bi.setCallback(this);
        bi.setLhwForm(MainApp.LHWForm);
        db = MainApp.appInfo.getDbHelper();

        populateSpinner();

    }

    private void populateSpinner() {

        Collection<Districts> districts = db.getAllDistricts();
        distNames = new ArrayList<>();
        distCodes = new ArrayList<>();

        distNames.add("...");
        distCodes.add("...");

        for (Districts d : districts) {
            distNames.add(d.getDistrictName());
            distCodes.add(d.getDistrictCode());
        }
        if (MainApp.user.getUserName().contains("test") || MainApp.user.getUserName().contains("dmu")) {
            distNames.add("Test Dist 9");
            distNames.add("Test Dist 8");
            distNames.add("Test Dist 7");
            distCodes.add("9");
            distCodes.add("8");
            distCodes.add("7");
        }
        // Apply the adapter to the spinner
        bi.a101.setAdapter(new ArrayAdapter<>(LhwIdentificationActivity.this, R.layout.custom_spinner, distNames));

        bi.a101.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                bi.a102.setAdapter(null);
                bi.a103.setAdapter(null);
                bi.a104.setAdapter(null);
                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(LhwIdentificationActivity.this, R.color.gray));
                bi.btnContinue.setEnabled(false);
                //  bi.checkHousehold.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.colorAccent));
                //  bi.checkHousehold.setEnabled(true);

                if (position == 0) return;
                Collection<Tehsil> tehsil = db.getTehsilByDist(distCodes.get(position));
                tehsilNames = new ArrayList<>();
                tehsilCodes = new ArrayList<>();
                tehsilNames.add("...");
                tehsilCodes.add("...");

                for (Tehsil v : tehsil) {
                    tehsilNames.add(v.getTehsilName());
                    tehsilCodes.add(v.getTehsilCode());
                }
                if (MainApp.user.getUserName().contains("test") || MainApp.user.getUserName().contains("dmu")) {

                    tehsilNames.add("Test Tehsil 1 " + distNames.get(position));
                    tehsilNames.add("Test Tehsil 2 " + distNames.get(position));
                    tehsilNames.add("Test Tehsil 3 " + distNames.get(position));
                    tehsilCodes.add(distCodes.get(position) + "001");
                    tehsilCodes.add(distCodes.get(position) + "002");
                    tehsilCodes.add(distCodes.get(position) + "003");
                }
                // Apply the adapter to the spinner
                bi.a102.setAdapter(new ArrayAdapter<>(LhwIdentificationActivity.this, R.layout.custom_spinner, tehsilNames));


                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(LhwIdentificationActivity.this, R.color.gray));
                bi.btnContinue.setEnabled(false);
                //  bi.checkHousehold.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.colorAccent));
                //  bi.checkHousehold.setEnabled(true);

                if (position == 0) return;
                Collection<HealthFacilities> healthFacility = db.getHealthFacilityByDist(distCodes.get(position));
                healthFacilityNames = new ArrayList<>();
                healthFacilityCodes = new ArrayList<>();
                healthFacilityNames.add("...");
                healthFacilityCodes.add("...");

                for (HealthFacilities hf : healthFacility) {
                    healthFacilityNames.add(hf.getHfName());
                    healthFacilityCodes.add(hf.getHfCode());
                }
                if (MainApp.user.getUserName().contains("test") || MainApp.user.getUserName().contains("dmu")) {

                    healthFacilityNames.add("Test HealthFacility 1 " + distNames.get(position));
                    healthFacilityNames.add("Test HealthFacility 2 " + distNames.get(position));
                    healthFacilityNames.add("Test HealthFacility 3 " + distNames.get(position));
                    healthFacilityCodes.add(distCodes.get(position) + "001");
                    healthFacilityCodes.add(distCodes.get(position) + "002");
                    healthFacilityCodes.add(distCodes.get(position) + "003");
                }
                // Apply the adapter to the spinner
                bi.a103.setAdapter(new ArrayAdapter<>(LhwIdentificationActivity.this, R.layout.custom_spinner, healthFacilityNames));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });

        bi.a102.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });

        bi.a103.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                bi.a104.setAdapter(null);
                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(LhwIdentificationActivity.this, R.color.gray));
                bi.btnContinue.setEnabled(false);
                //  bi.checkHousehold.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.colorAccent));
                //  bi.checkHousehold.setEnabled(true);

                if (position == 0) return;
                Collection<LHW> lHW = db.getLHWByHF(healthFacilityCodes.get(bi.a103.getSelectedItemPosition()));
                lhwNames = new ArrayList<>();
                lhwCodes = new ArrayList<>();
                lhwNames.add("...");
                lhwCodes.add("...");

                for (LHW lhw : lHW) {
                    lhwNames.add(lhw.getLhw_Name());
                    lhwCodes.add(lhw.getLhw_Code());
                }
                if (MainApp.user.getUserName().contains("test") || MainApp.user.getUserName().contains("dmu")) {

                    lhwNames.add("Test LHW 1 " + healthFacilityNames.get(position));
                    lhwNames.add("Test LHW 2 " + healthFacilityNames.get(position));
                    lhwNames.add("Test LHW 3 " + healthFacilityNames.get(position));
                    lhwCodes.add(healthFacilityCodes.get(position) + "001");
                    lhwCodes.add(healthFacilityCodes.get(position) + "002");
                    lhwCodes.add(healthFacilityCodes.get(position) + "003");
                }
                // Apply the adapter to the spinner
                bi.a104.setAdapter(new ArrayAdapter<>(LhwIdentificationActivity.this, R.layout.custom_spinner, lhwNames));


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });

        bi.a104.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position != 0) {

                    bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(LhwIdentificationActivity.this, R.color.colorAccent));
                    bi.btnContinue.setEnabled(true);

                } else {
                    bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(LhwIdentificationActivity.this, R.color.gray));
                    bi.btnContinue.setEnabled(false);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });
    }

    public void btnContinue(View view) {
        if (!formValidation()) return;
        if (!hhExists())
            saveDraftLHWForm();
        finish();
        startActivity(new Intent(this, SectionL1Activity.class));
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, MainActivity.class));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

/*    @Override
    public void onBackPressed() {
        // Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
        setResult(RESULT_CANCELED);
    }*/

    private boolean hhExists() {
        MainApp.LHWForm = new LHWForm();
        try {
            MainApp.LHWForm = db.getLHWFormByLHWCode(lhwCodes.get(bi.a103.getSelectedItemPosition()));
        } catch (JSONException e) {
            Log.d(TAG, getString(R.string.hh_exists_form) + e.getMessage());
            Toast.makeText(this, getString(R.string.hh_exists_form) + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        return MainApp.LHWForm != null;
    }

    private void saveDraftLHWForm() {
        MainApp.LHWForm = new LHWForm();
        MainApp.LHWForm.setUserName(MainApp.user.getUserName());
        MainApp.LHWForm.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        MainApp.LHWForm.setDeviceId(MainApp.deviceid);
        MainApp.LHWForm.setAppver(MainApp.versionName + "." + MainApp.versionCode);

        MainApp.LHWForm.setA101(distNames.get(bi.a101.getSelectedItemPosition()));
        MainApp.LHWForm.setA102(tehsilNames.get(bi.a102.getSelectedItemPosition()));
        MainApp.LHWForm.setA103(healthFacilityNames.get(bi.a103.getSelectedItemPosition()));
        MainApp.LHWForm.setA104n(lhwNames.get(bi.a103.getSelectedItemPosition()));
        MainApp.LHWForm.setA104c(lhwCodes.get(bi.a103.getSelectedItemPosition()));

    }

}