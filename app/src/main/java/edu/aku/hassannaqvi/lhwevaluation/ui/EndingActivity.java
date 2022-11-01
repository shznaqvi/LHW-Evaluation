package edu.aku.hassannaqvi.lhwevaluation.ui;

import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.hhForm;
import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.sharedPref;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.lhwevaluation.R;
import edu.aku.hassannaqvi.lhwevaluation.contracts.TableContracts;
import edu.aku.hassannaqvi.lhwevaluation.core.MainApp;
import edu.aku.hassannaqvi.lhwevaluation.database.DatabaseHelper;
import edu.aku.hassannaqvi.lhwevaluation.databinding.ActivityEndingBinding;

public class EndingActivity extends AppCompatActivity {

    ActivityEndingBinding bi;
    int sectionMainCheck;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1
                : sharedPref.getString("lang", "1").equals("1") ? R.style.AppThemeUrdu
                : R.style.AppThemeSindhi);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_ending);

        setSupportActionBar(bi.toolbar);
        //setTitle(R.string.section1_mainheading);

        db = MainApp.appInfo.dbHelper;
        boolean check = getIntent().getBooleanExtra("complete", false);
        //sectionMainCheck = getIntent().getIntExtra("status", 0);

        bi.istatusa.setEnabled(check);
        bi.istatusb.setEnabled(!check);
        bi.istatusc.setEnabled(!check);
        bi.istatusd.setEnabled(!check);
        bi.istatuse.setEnabled(!check);
        bi.istatusf.setEnabled(!check);
        bi.istatusg.setEnabled(!check);
        bi.istatush.setEnabled(!check);
        bi.istatusi.setEnabled(!check);

    }

    private void saveDraft() {
        hhForm.setiStatus(bi.istatusa.isChecked() ? "1"
                : bi.istatusb.isChecked() ? "2"
                : bi.istatusc.isChecked() ? "3"
                : bi.istatusd.isChecked() ? "4"
                : bi.istatuse.isChecked() ? "5"
                : bi.istatusf.isChecked() ? "6"
                : bi.istatusg.isChecked() ? "7"
                : bi.istatush.isChecked() ? "8"
                : bi.istatusi.isChecked() ? "9"
                : bi.istatus96.isChecked() ? "96"
                : "-1");
        // hhForm.setEndTime(new SimpleDateFormat("dd-MM-yy HH:mm", Locale.ENGLISH).format(new Date().getTime()));
    }

    public void BtnEnd(View view) {
        if (!formValidation()) return;
        saveDraft();
        if (UpdateDB()) {

          ///  cleanupProcess();
            finish();
            //    setResult(RESULT_OK);
           /* Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
           */
            Toast.makeText(this, "Data has been updated.", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "Error in updating Database.", Toast.LENGTH_SHORT).show();
        }
    }

    private void cleanupProcess() {
        hhForm = null;
    }

    private boolean UpdateDB() {
        int updcount = db.updatesHHFormColumn(TableContracts.HHFormsTable.COLUMN_ISTATUS, hhForm.getiStatus());
        return updcount > 0;
    }

    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.fldGrpEnd);
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "Back Press Not Allowed", Toast.LENGTH_LONG).show();
    }

}
