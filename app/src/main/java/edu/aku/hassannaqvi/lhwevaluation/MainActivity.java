package edu.aku.hassannaqvi.lhwevaluation;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import edu.aku.hassannaqvi.lhwevaluation.core.MainApp;
import edu.aku.hassannaqvi.lhwevaluation.database.AndroidDatabaseManager;
import edu.aku.hassannaqvi.lhwevaluation.databinding.ActivityMainBinding;
import edu.aku.hassannaqvi.lhwevaluation.models.Form;
import edu.aku.hassannaqvi.lhwevaluation.ui.IdentificationActivity;
import edu.aku.hassannaqvi.lhwevaluation.ui.SyncActivity;
import edu.aku.hassannaqvi.lhwevaluation.ui.lists.FormsReportCluster;
import edu.aku.hassannaqvi.lhwevaluation.ui.lists.FormsReportDate;
import edu.aku.hassannaqvi.lhwevaluation.ui.lists.FormsReportPending;
import edu.aku.hassannaqvi.lhwevaluation.ui.sections.SectionAActivity;
import edu.aku.hassannaqvi.lhwevaluation.ui.sections.SectionB2Activity;
import edu.aku.hassannaqvi.lhwevaluation.ui.sections.SectionBActivity;
import edu.aku.hassannaqvi.lhwevaluation.ui.sections.SectionCActivity;
import edu.aku.hassannaqvi.lhwevaluation.ui.sections.SectionH1Activity;
import edu.aku.hassannaqvi.lhwevaluation.ui.sections.SectionH2Activity;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding bi;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_main);
        bi.setCallback(this);
        setSupportActionBar(bi.toolbar);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        //getSupportActionBar().setIcon(R.drawable.app_icon);
        bi.adminView.setVisibility(MainApp.admin ? View.VISIBLE : View.GONE);
        bi.toolbar.setSubtitle("Welcome, " + MainApp.user.getFullname() + (MainApp.admin ? " (Admin)" : "") + "!");
    }

    public void sectionPress(View view) {

        switch (view.getId()) {
            case R.id.openForm:
                MainApp.idType = 1;
                break;
            case R.id.openAnthro:
                MainApp.idType = 2;
                break;

            case R.id.updateBlood:
                MainApp.idType = 3;
                break;

            case R.id.updateStool:
                MainApp.idType = 4;
                break;
            default:
                MainApp.idType = 0;

        }


        switch (view.getId()) {

            case R.id.openForm:
            case R.id.openAnthro:
            case R.id.updateBlood:
            case R.id.updateStool:
                MainApp.form = new Form();
                startActivity(new Intent(this, IdentificationActivity.class));
                break;
            case R.id.seca:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionAActivity.class));
                break;

            case R.id.secb:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionBActivity.class));
                break;

            case R.id.secb2:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionB2Activity.class));
                break;

            case R.id.sech1:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionCActivity.class));
                break;

            case R.id.sech2:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionH1Activity.class));
                break;

            case R.id.sech3:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionH2Activity.class));
                break;

            case R.id.dbManager:
                startActivity(new Intent(this, AndroidDatabaseManager.class));
                break;


        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = null;
        switch (item.getItemId()) {
            case R.id.action_database:
                intent = new Intent(MainActivity.this, AndroidDatabaseManager.class);
                startActivity(intent);
                break;
            case R.id.onSync:
                intent = new Intent(MainActivity.this, SyncActivity.class);
                startActivity(intent);
                break;
            case R.id.checkPendingForms:
                intent = new Intent(MainActivity.this, FormsReportPending.class);
                startActivity(intent);
                break;
            case R.id.formsReportDate:
                intent = new Intent(MainActivity.this, FormsReportDate.class);
                startActivity(intent);
                break;
            case R.id.formsReportCluster:
                intent = new Intent(MainActivity.this, FormsReportCluster.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.item_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

}