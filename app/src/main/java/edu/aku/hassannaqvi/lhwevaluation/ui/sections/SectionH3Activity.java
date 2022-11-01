package edu.aku.hassannaqvi.lhwevaluation.ui.sections;

import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.sharedPref;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.util.Calendar;
import java.util.Objects;

import edu.aku.hassannaqvi.lhwevaluation.R;
import edu.aku.hassannaqvi.lhwevaluation.contracts.TableContracts;
import edu.aku.hassannaqvi.lhwevaluation.core.MainApp;
import edu.aku.hassannaqvi.lhwevaluation.database.DatabaseHelper;
import edu.aku.hassannaqvi.lhwevaluation.databinding.ActivitySectionH3Binding;


public class SectionH3Activity extends AppCompatActivity {
    private static final String TAG = "SectionH3Activity";
    ActivitySectionH3Binding bi;
    private DatabaseHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1
                : sharedPref.getString("lang", "1").equals("1") ? R.style.AppThemeUrdu
                : R.style.AppThemeSindhi);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_h3);
        bi.setCallback(this);
        bi.setFamilyMember(MainApp.familyMembers);
        MainApp.familyMembers.setH301(String.valueOf(MainApp.memberCount + 1));
        MainApp.familyMembers.setDistCode(MainApp.hhForm.getDistrict());

        // Initialize Database
        db = MainApp.appInfo.getDbHelper();

        bi.h304y.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (bi.h304y.getText().toString().isEmpty() || bi.h304m.getText().toString().isEmpty() || bi.h304d.getText().toString().isEmpty())
                    return;
                bi.h304m.setMaxvalue(Integer.parseInt(bi.h304y.getText().toString()) == Calendar.getInstance().get(Calendar.YEAR) ?
                        Calendar.getInstance().get(Calendar.MONTH) + 1 : 12f);
                bi.h304d.setMaxvalue(Integer.parseInt(bi.h304y.getText().toString()) == Calendar.getInstance().get(Calendar.YEAR)
                        && Integer.parseInt(bi.h304m.getText().toString()) == Calendar.getInstance().get(Calendar.MONTH) + 1 ?
                        Calendar.getInstance().get(Calendar.DAY_OF_MONTH) : 31f);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }

        });

        bi.h304m.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (bi.h304y.getText().toString().isEmpty() || bi.h304m.getText().toString().isEmpty() || bi.h304d.getText().toString().isEmpty())
                    return;
                bi.h304d.setMaxvalue(Integer.parseInt(bi.h304y.getText().toString()) == Calendar.getInstance().get(Calendar.YEAR)
                        && Integer.parseInt(bi.h304m.getText().toString()) == Calendar.getInstance().get(Calendar.MONTH) + 1 ?
                        Calendar.getInstance().get(Calendar.DAY_OF_MONTH) : 31f);

            }

            @Override
            public void afterTextChanged(Editable s) {

            }

        });




    }


    private boolean insertNewRecord() {
        if (!MainApp.familyMembers.getUid().equals("")) return true;
        long rowId = 0;
        try {
            rowId = db.addFamilyMember(MainApp.familyMembers);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        MainApp.familyMembers.setId(String.valueOf(rowId));
        if (rowId > 0) {
            MainApp.familyMembers.setUid(MainApp.familyMembers.getDeviceId() + MainApp.familyMembers.getId());
            db.updatesFamilyMembersColumn(TableContracts.FamilyMembersTable.COLUMN_UID, MainApp.familyMembers.getUid());
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private boolean updateDB() {
        int updcount = 0;
        try {
            updcount = db.updatesFamilyMembersColumn(TableContracts.FamilyMembersTable.COLUMN_SH3, MainApp.familyMembers.sH3toString());
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
        if (updateDB()) {
            setResult(RESULT_OK);
            finish();
        } else {
            Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
        }
    }




    public void btnEnd(View view) {
        setResult(RESULT_CANCELED);
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