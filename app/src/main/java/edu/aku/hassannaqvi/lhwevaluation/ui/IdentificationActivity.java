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
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import edu.aku.hassannaqvi.lhwevaluation.MainActivity;
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
    List<LHWHouseholds> lhwhhs = new ArrayList<>();
    private DatabaseHelper db;
    private Intent openIntent;
    private ArrayList<String> lhwNames;
    private ArrayList<String> lhwCodes;
    private ArrayList<String> khandanNo;
    private ArrayList<String> hhheads;

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
                MainApp.hhForm = new HHForm();
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
                    lhwhhs = db.getKhandanNoByLHW(lhwCodes.get(position));
                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(IdentificationActivity.this, "JSONException(LHWHouseholds)" + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
                khandanNo = new ArrayList<>();
                hhheads = new ArrayList<>();

                khandanNo.add("...");
                hhheads.add("...");

                Iterator<LHWHouseholds> i = lhwhhs.iterator();
                while (i.hasNext()) {
                    LHWHouseholds lhwhh = i.next();
                    if (!hhDone(lhwhh.getH102())) {
                        khandanNo.add(lhwhh.getH102());
                    } else {
                        i.remove();
                    }
                }

    /*            for (LHWHouseholds lhwhh : lhwhhs) {
                    if (!hhDone(lhwhh.getH102())){
                        khandanNo.add(lhwhh.getH102());} else {

                    }
                    // hhheads.add(lhwhh.getH103());
                }*/

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
                bi.hhhead.setText(lhwhhs.get(position - 1).getH103());
                MainApp.LHWHouseholds = lhwhhs.get(position - 1);
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

        startActivity(new Intent(this, SectionH2Activity.class));
        finish();
    }


    private void saveDraftForm() {
        MainApp.hhForm = new HHForm();

        MainApp.hhForm.setUserName(MainApp.user.getUserName());
        MainApp.hhForm.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        MainApp.hhForm.setDeviceId(MainApp.deviceid);
        MainApp.hhForm.setAppver(MainApp.versionName + "." + MainApp.versionCode);

        MainApp.hhForm.setH201(lhwCodes.get(bi.a104.getSelectedItemPosition()));
        MainApp.hhForm.setH202(khandanNo.get(bi.h102.getSelectedItemPosition()));

    }

    public void btnEnd(View view) {

        startActivity(new Intent(this, MainActivity.class).putExtra("complete", false));
        finish();
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    private boolean hhExists() {
        MainApp.hhForm = new HHForm();
        try {
            MainApp.hhForm = db.getHHFormByLHWCode(lhwCodes.get(bi.a104.getSelectedItemPosition()), bi.h102.getSelectedItem().toString());
        } catch (JSONException e) {
            Log.d(TAG, getString(R.string.hh_exists_form) + e.getMessage());
            Toast.makeText(this, getString(R.string.hh_exists_form) + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        return MainApp.hhForm != null;
    }

    private boolean hhDone(String kNo) {
        HHForm hhForm = new HHForm(); // local variable
        try {
            hhForm = db.getHHFormByLHWCode(lhwCodes.get(bi.a104.getSelectedItemPosition()), kNo);
        } catch (JSONException e) {
            Log.d(TAG, getString(R.string.hh_exists_form) + e.getMessage());
            Toast.makeText(this, getString(R.string.hh_exists_form) + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (hhForm != null)
            return hhForm.getiStatus().equals("1");
        return false;
    }

    private void saveDraftHHForm() {
        MainApp.hhForm = new HHForm();
        MainApp.hhForm.setUserName(MainApp.user.getUserName());
        MainApp.hhForm.setLhwuid(MainApp.LHWHouseholds.getUid());
        MainApp.hhForm.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        MainApp.hhForm.setDeviceId(MainApp.deviceid);
        MainApp.hhForm.setAppver(MainApp.versionName + "." + MainApp.versionCode);

        MainApp.hhForm.setLhwCode(MainApp.LHWHouseholds.getA104c());
        MainApp.hhForm.setKhandandNo(MainApp.LHWHouseholds.getH102());
        MainApp.hhForm.setH201(MainApp.LHWHouseholds.getH101());
        MainApp.hhForm.setH201(MainApp.LHWHouseholds.getH101());
        MainApp.hhForm.setH202(MainApp.LHWHouseholds.getH102());
        MainApp.hhForm.setH203(MainApp.LHWHouseholds.getH103());
        MainApp.hhForm.setH204a(MainApp.LHWHouseholds.getH104a());
        MainApp.hhForm.setH204b(MainApp.LHWHouseholds.getH104b());
        MainApp.hhForm.setH204c(MainApp.LHWHouseholds.getH104c());
        MainApp.hhForm.setH204d(MainApp.LHWHouseholds.getH104d());
        MainApp.hhForm.setH204e(MainApp.LHWHouseholds.getH104e());
        MainApp.hhForm.setH204f(MainApp.LHWHouseholds.getH104f());


    }
}