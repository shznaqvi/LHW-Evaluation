package edu.aku.hassannaqvi.lhwevaluation.ui.lists;

import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.adolList;
import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.familyList;
import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.maleList;
import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.mwraList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.json.JSONException;

import java.util.ArrayList;

import edu.aku.hassannaqvi.lhwevaluation.MainActivity;
import edu.aku.hassannaqvi.lhwevaluation.R;
import edu.aku.hassannaqvi.lhwevaluation.adapters.FamilyMembersAdapter;
import edu.aku.hassannaqvi.lhwevaluation.core.MainApp;
import edu.aku.hassannaqvi.lhwevaluation.database.DatabaseHelper;
import edu.aku.hassannaqvi.lhwevaluation.databinding.ActivityFamilyListBinding;
import edu.aku.hassannaqvi.lhwevaluation.models.FamilyMembers;
import edu.aku.hassannaqvi.lhwevaluation.models.LHWGB_HH;
import edu.aku.hassannaqvi.lhwevaluation.models.MWRA;
import edu.aku.hassannaqvi.lhwevaluation.ui.EndingActivity;
import edu.aku.hassannaqvi.lhwevaluation.ui.sections.SectionABActivity;
import edu.aku.hassannaqvi.lhwevaluation.ui.sections.SectionH3Activity;
import edu.aku.hassannaqvi.lhwevaluation.ui.sections.SectionMActivity;
import edu.aku.hassannaqvi.lhwevaluation.ui.sections.SectionW1Activity;


public class FamilyMambersListActivity extends AppCompatActivity {


    private static final String TAG = "MwraActivity";
    ActivityFamilyListBinding bi;
    DatabaseHelper db;
    private FamilyMembersAdapter familyMembersAdapter;
    ActivityResultLauncher<Intent> MemberInfoLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {

                        familyList.add(MainApp.familyMembers);
                        if (!MainApp.familyMembers.getMemCate().equals("")) {
                            switch (MainApp.familyMembers.getMemCate()) {
                                case "1":
                                    MainApp.mwraList.add(MainApp.familyMembers);
                                    MainApp.mwraCount++;
                                    break;
                                case "2":
                                    MainApp.adolList.add(MainApp.familyMembers);
                                    MainApp.adolCount++;
                                    break;
                                case "3":
                                    MainApp.maleList.add(MainApp.familyMembers);
                                    MainApp.maleCount++;
                                    break;
                            }

                        }
                        MainApp.memberCount++;
                        familyMembersAdapter.notifyItemInserted(familyList.size() - 1);

                        checkCompleteFm();
                    }
                    if (result.getResultCode() == Activity.RESULT_CANCELED) {
                        Toast.makeText(FamilyMambersListActivity.this, "No family member added.", Toast.LENGTH_SHORT).show();
                    }

                }
            });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_family_list);
        bi.setCallback(this);

        db = MainApp.appInfo.dbHelper;
        MainApp.familyList = new ArrayList<>();
        MainApp.mwraList = new ArrayList<>();
        MainApp.adolList = new ArrayList<>();
        MainApp.maleList = new ArrayList<>();

        Log.d(TAG, "onCreate: familyList " + familyList.size());
        try {
            familyList = db.getMemberBYUID(MainApp.hhForm.getUid());
            int fmCount = 0;
            for (FamilyMembers fm : familyList) {
                fmCount++;

                if (!fm.getMemCate().equals("")) {
                    switch (fm.getMemCate()) {
                        case "1":
                            MainApp.mwraList.add(fm);
                            MainApp.mwraCount++;
                            break;
                        case "2":
                            MainApp.adolList.add(fm);
                            MainApp.adolCount++;
                            break;
                        case "3":
                            MainApp.maleList.add(fm);
                            MainApp.maleCount++;
                            break;
                    }

                }
            }


        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(FamilyMembers): " + e.getMessage(), Toast.LENGTH_LONG).show();
        }


        bi.btnContinue.setVisibility(familyList.size() > 0 ? View.VISIBLE : View.INVISIBLE);
        MainApp.memberCount = Math.round(familyList.size());

        familyMembersAdapter = new FamilyMembersAdapter(this, familyList);
        bi.rvMwra.setAdapter(familyMembersAdapter);
        bi.rvMwra.setLayoutManager(new LinearLayoutManager(this));


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!MainApp.hhForm.getiStatus().equals("1")) {
                    MainApp.familyMembers = new FamilyMembers();
                    addFemale();
                } else {
                    Toast.makeText(FamilyMambersListActivity.this, "This form has been locked. You cannot add new MWRA to locked forms", Toast.LENGTH_LONG).show();
                }
            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Activity Resumed!", Toast.LENGTH_SHORT).show();

        checkCompleteFm();
        bi.btnContinue.setVisibility(familyList.size() > 0 ? View.VISIBLE : View.INVISIBLE);
        bi.btnContinue.setEnabled(familyList.size() > 0);

        bi.totalMember.setText("Total: " + familyList.size());
        bi.totalMwra.setText("MWRA: " + mwraList.size());
        bi.totalAdol.setText("Adol: " + MainApp.adolList.size());
        bi.totalMale.setText("AdultMale: " + MainApp.maleList.size());
    }

    private void checkCompleteFm() {

        int compCount = familyList.size();
        MainApp.memberCountComplete = compCount;
    }

    public void addFemale() {
        addMoreMember();

    }

    public void btnContinue(View view) {

        if (mwraList.size() > 0) {
            MainApp.mwra = new MWRA();
            MainApp.lhwgbHhForm = new LHWGB_HH();
            //       finish();
            startActivity(new Intent(this, SectionW1Activity.class).putExtra("complete", true));
        } else if (adolList.size() > 0) {
            MainApp.lhwgbHhForm = new LHWGB_HH();
            //      finish();
            startActivity(new Intent(this, SectionABActivity.class).putExtra("complete", true));
        } else if (maleList.size() > 0) {
            MainApp.lhwgbHhForm = new LHWGB_HH();
            //    finish();
            startActivity(new Intent(this, SectionMActivity.class).putExtra("complete", true));
        } else {

            startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
        }
        finish();


    }


    private void addMoreMember() {
        MainApp.familyMembers = new FamilyMembers();
        MainApp.familyMembers.setLhwCode(MainApp.hhForm.getLhwCode());
        MainApp.familyMembers.setkNo(MainApp.hhForm.getKhandandNo());
        MainApp.familyMembers.setUuid(MainApp.hhForm.getUid());
        MainApp.familyMembers.setSysDate(MainApp.hhForm.getSysDate());

        Intent intent = new Intent(this, SectionH3Activity.class);
        //   finish();
        MemberInfoLauncher.launch(intent);
    }

    public void btnEnd(View view) {

        finish();

    }
}