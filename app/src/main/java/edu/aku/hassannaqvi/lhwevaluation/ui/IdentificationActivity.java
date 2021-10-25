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
import java.util.List;
import java.util.Locale;

import edu.aku.hassannaqvi.lhwevaluation.R;
import edu.aku.hassannaqvi.lhwevaluation.core.MainApp;
import edu.aku.hassannaqvi.lhwevaluation.database.DatabaseHelper;
import edu.aku.hassannaqvi.lhwevaluation.databinding.ActivityIdentificationBinding;
import edu.aku.hassannaqvi.lhwevaluation.models.HHForm;
import edu.aku.hassannaqvi.lhwevaluation.models.LHWForm;
import edu.aku.hassannaqvi.lhwevaluation.models.LHWHouseholds;
import edu.aku.hassannaqvi.lhwevaluation.ui.sections.SectionH2Activity;


public class IdentificationActivity extends AppCompatActivity {

    private static final String TAG = "IdentificationActivity";
    ActivityIdentificationBinding bi;
    private DatabaseHelper db;

    private Intent openIntent;
    private ArrayList<String> lhwNames;
    private ArrayList<String> lhwCodes;
    private ArrayList<String> khandanNo;
    private ArrayList<String> hhheads;
    List<LHWHouseholds> lhwhhs = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_identification);
        bi.setCallback(this);
        db = MainApp.appInfo.dbHelper;

        populateSpinner();

        openIntent = new Intent();
        switch (MainApp.idType) {
            case 1:
                bi.btnContinue.setText(R.string.open_hh_form);
                MainApp.HHForm = new HHForm();
                openIntent = new Intent(this, SectionH2Activity.class);
                break;
         /*   case 2:
                bi.btnContinue.setText(R.string.open_anhtro_form);
                MainApp.anthro = new Anthro();
                openIntent = new Intent(this, SectionAnthroActivity.class);
                break;
            case 3:
                bi.btnContinue.setText(R.string.open_blood_form);
                //     MainApp.sample = new Sample();
                openIntent = new Intent(this, SectionSamplesActivity.class);
                break;
            case 4:
                bi.btnContinue.setText(R.string.open_stool_form);
                //    MainApp.sample = new Sample();
                openIntent = new Intent(this, SectionSamplesActivity.class);
                break;*/

        }

    }

    private void populateSpinner() {

        Collection<LHWForm> lhw = db.getRegisteredLhws();
        lhwNames = new ArrayList<>();
        lhwCodes = new ArrayList<>();

        lhwNames.add("...");
        lhwCodes.add("...");
        for (LHWForm lf : lhw) {
            lhwNames.add(lf.getA104n());
            lhwCodes.add(lf.getA104c());
        }

        // Apply the adapter to the spinner
        bi.a104.setAdapter(new ArrayAdapter<>(IdentificationActivity.this, R.layout.custom_spinner, lhwNames));

        bi.a104.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                bi.h102.setAdapter(null);
                bi.hhhead.setText(null);

                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
                bi.btnContinue.setEnabled(false);

                if (position == 0) return;
                try {
                    lhwhhs= db.getKhandanNoByLHW(lhwCodes.get(position));
                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(IdentificationActivity.this, "JSONException(LHWHouseholds)"+e.getMessage(), Toast.LENGTH_SHORT).show();
                }
                khandanNo = new ArrayList<>();
                hhheads = new ArrayList<>();

                khandanNo.add("...");
                hhheads.add("...");
                for (LHWHouseholds lhwhh : lhwhhs) {
                    khandanNo.add(lhwhh.getH102());
                   // hhheads.add(lhwhh.getH103());
                }

                // Apply the adapter to the spinner
                bi.h102.setAdapter(new ArrayAdapter<String>(IdentificationActivity.this, R.layout.custom_spinner, khandanNo));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });

        bi.h102.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                bi.hhhead.setText(null);

                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
                bi.btnContinue.setEnabled(false);

                if (position == 0) return;
                // position -1, because lhwhhs does not have ... on 0 index`
                bi.hhhead.setText(lhwhhs.get(position-1).getH103());
                MainApp.LHWHouseholds = lhwhhs.get(position-1);
                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.colorAccent));
                bi.btnContinue.setEnabled(true);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });

    }


    public void btnContinue(View view) {
  //      if (!formValidation()) return;
        if (!hhExists())
            saveDraftHHForm();
        finish();
        startActivity(new Intent(this, SectionH2Activity.class));
    }



    private void saveDraftForm() {
        MainApp.HHForm = new HHForm();

        MainApp.HHForm.setUserName(MainApp.user.getUserName());
        MainApp.HHForm.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        MainApp.HHForm.setDeviceId(MainApp.deviceid);
        MainApp.HHForm.setAppver(MainApp.versionName + "." + MainApp.versionCode);

        MainApp.HHForm.setH201(lhwCodes.get(bi.a104.getSelectedItemPosition()));
        MainApp.HHForm.setH202(khandanNo.get(bi.h102.getSelectedItemPosition()));


    }




    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }



    private boolean hhExists() {
        MainApp.HHForm = new HHForm();
        try {
            MainApp.HHForm = db.getHHFormByLHWCode(MainApp.LHWHouseholds.getA104c(), MainApp.LHWHouseholds.getH102());
        } catch (JSONException e) {
            Log.d(TAG, getString(R.string.hh_exists_form) + e.getMessage());
            Toast.makeText(this, getString(R.string.hh_exists_form) + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        return MainApp.HHForm != null;
    }

    private void saveDraftHHForm() {
        MainApp.HHForm = new HHForm();
        MainApp.HHForm.setUserName(MainApp.user.getUserName());
        MainApp.HHForm.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        MainApp.HHForm.setDeviceId(MainApp.deviceid);
        MainApp.HHForm.setAppver(MainApp.versionName + "." + MainApp.versionCode);

        MainApp.HHForm.setLhwCode(MainApp.LHWHouseholds.getA104c());
        MainApp.HHForm.setKhandandNo(MainApp.LHWHouseholds.getH102());
        MainApp.HHForm.setH201(MainApp.LHWHouseholds.getH101());
        MainApp.HHForm.setH201(MainApp.LHWHouseholds.getH101());
        MainApp.HHForm.setH202(MainApp.LHWHouseholds.getH102());
        MainApp.HHForm.setH203(MainApp.LHWHouseholds.getH103());
        MainApp.HHForm.setH204a(MainApp.LHWHouseholds.getH104a());
        MainApp.HHForm.setH204b(MainApp.LHWHouseholds.getH104b());
        MainApp.HHForm.setH204c(MainApp.LHWHouseholds.getH104c());
        MainApp.HHForm.setH204d(MainApp.LHWHouseholds.getH104d());
        MainApp.HHForm.setH204e(MainApp.LHWHouseholds.getH104e());
        MainApp.HHForm.setH204f(MainApp.LHWHouseholds.getH104f());


    }
}