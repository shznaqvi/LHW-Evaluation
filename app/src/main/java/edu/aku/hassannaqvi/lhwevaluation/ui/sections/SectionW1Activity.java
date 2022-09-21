package edu.aku.hassannaqvi.lhwevaluation.ui.sections;

import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.mwra;
import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.mwraList;
import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.sharedPref;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
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

import java.util.ArrayList;

import edu.aku.hassannaqvi.lhwevaluation.R;
import edu.aku.hassannaqvi.lhwevaluation.contracts.TableContracts;
import edu.aku.hassannaqvi.lhwevaluation.core.MainApp;
import edu.aku.hassannaqvi.lhwevaluation.database.DatabaseHelper;
import edu.aku.hassannaqvi.lhwevaluation.databinding.ActivitySectionW1Binding;
import edu.aku.hassannaqvi.lhwevaluation.models.FamilyMembers;
import edu.aku.hassannaqvi.lhwevaluation.models.MWRA;
import edu.aku.hassannaqvi.lhwevaluation.ui.EndingActivity;


public class SectionW1Activity extends AppCompatActivity {
    private static final String TAG = "SectionW1Activity";
    ActivitySectionW1Binding bi;
    private DatabaseHelper db;
    private ArrayList<String> memberNames;
    private ArrayList<String> memberUID;
    private ArrayList<String> memberSno;
    int postion = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1
                : sharedPref.getString("lang", "1").equals("1") ? R.style.AppThemeUrdu
                : R.style.AppThemeSindhi);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_w1);
        bi.setCallback(this);
        db = MainApp.appInfo.getDbHelper();
        try {
            MainApp.mwra = db.getMwraByUUid();
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(MWRA): " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }

        if (MainApp.mwra == null) MainApp.mwra = new MWRA();
        bi.setMwra(MainApp.mwra);


        populateSpinner();
    }

    private void populateSpinner() {

        memberNames = new ArrayList<>();
        memberUID = new ArrayList<>();
        memberSno = new ArrayList<>();
        memberUID.add("...");
        memberSno.add("...");
        memberNames.add("...");

        for (FamilyMembers sfm : MainApp.mwraList) {
            memberNames.add(sfm.getH302());
            memberUID.add(sfm.getUid());
            memberSno.add(sfm.getSno());

        }

        // Apply the adapter to the spinner
        bi.w101.setAdapter(new ArrayAdapter<>(SectionW1Activity.this, R.layout.custom_spinner, memberNames));
        if (!MainApp.mwra.getW101().equals("")) {
            int selectedPosition = memberNames.indexOf(MainApp.mwra.getW101());
            bi.w101.setSelection(selectedPosition);
            //MainApp.selectedFemale = mwraList.get(selectedPosition).getUid();

        }
        bi.w101.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.d(TAG, "onItemSelected: " + position);
                MainApp.name = bi.w101.getSelectedItem().toString();
                //MainApp.selectedFemale = mwraList.get(position).getUid();
                postion = position;

                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(SectionW1Activity.this, R.color.gray));
                bi.btnContinue.setEnabled(false);
                MainApp.mwra = new MWRA();
                //MainApp.lhwgbHhForm = new LHWGB_HH();


                if (position == 0) return;

                try {
                    MainApp.mwra = db.getMwraByUUid();
                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(SectionW1Activity.this, "JSONException(MWRA): " + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(SectionW1Activity.this, R.color.colorAccent));
                bi.btnContinue.setEnabled(true);
                if (MainApp.mwra == null) {
                    MainApp.mwra = new MWRA();

                    MainApp.mwra.setUuid(MainApp.hhForm.getUid());
                    MainApp.mwra.setDeviceId(MainApp.hhForm.getDeviceId());
                    MainApp.mwra.setCluster(MainApp.hhForm.getLhwCode());
                    MainApp.mwra.setHhid(MainApp.hhForm.getKhandandNo());
                    MainApp.mwra.setUserName(MainApp.hhForm.getUserName());
                    MainApp.mwra.setSysDate(MainApp.hhForm.getSysDate());
                    MainApp.mwra.setAppver(MainApp.hhForm.getAppver());
                    MainApp.mwra.setW101(memberNames.get(position));
                    mwra.setWraUID(memberUID.get(position));
                    mwra.setWraSno(memberSno.get(position));
                }

                bi.setMwra(MainApp.mwra);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });

        //mwra.setWraUID(mwraList.get(postion).getUid());


    }

    public void valueSet(CharSequence s, int start, int before, int count) {
        if (TextUtils.isEmpty(s)) return;

        // set maximum number of children at current age
        int mwraReproductiveAge = (Integer.parseInt(bi.w102.getText().toString()) - 15) * 12;

        bi.w105.setMaxvalue(mwraReproductiveAge / 9);

        // set age of last born child
        bi.w106y.setMaxvalue(Float.parseFloat(bi.w102.getText().toString()) > 30 ? 15f : Float.parseFloat(bi.w102.getText().toString()) - 15f);

    }


    private boolean insertNewRecord() {
        if (!MainApp.mwra.getUid().equals("")) return true;
        long rowId = 0;
        try {
            rowId = db.addMWRA(MainApp.mwra);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        MainApp.mwra.setId(String.valueOf(rowId));
        if (rowId > 0) {
            MainApp.mwra.setUid(MainApp.mwra.getDeviceId() + MainApp.mwra.getId());
            db.updatesMwraColumn(TableContracts.MWRAListTable.COLUMN_UID, MainApp.mwra.getUid());
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private boolean updateDB() {
        int updcount = 0;
        try {
            updcount = db.updatesMwraColumn(TableContracts.MWRAListTable.COLUMN_SW1, MainApp.mwra.sW1toString());
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
        if (!insertNewRecord()) return;
        // saveDraft();
        if (updateDB()) {
            MainApp.UIDFlag = 1;
            Intent i;
            //      if (bi.h111a.isChecked()) {
            i = new Intent(this, SectionW2Activity.class).putExtra("complete", true);
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


        if (!Validator.emptyCheckingContainer(this, bi.GrpName)) return false;

        if (bi.w103a.isChecked() && Integer.valueOf(mwra.getW105()) >0) {
            int ageInMonths = (Integer.valueOf(mwra.getW106y()) * 12) + Integer.valueOf(mwra.getW106m());
            if (ageInMonths <= Integer.valueOf(mwra.getW104())) {
                Validator.emptyCustomTextBox(this, bi.w106m, "Age of last-born child in months cannot be equal to or less than current gestational age.");
                return false;
            }
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        // Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
        setResult(RESULT_CANCELED);
    }


}