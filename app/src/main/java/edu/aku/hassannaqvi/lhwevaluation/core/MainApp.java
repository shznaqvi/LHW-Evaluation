package edu.aku.hassannaqvi.lhwevaluation.core;

import static edu.aku.hassannaqvi.lhwevaluation.database.DatabaseHelper.DATABASE_NAME;
import static edu.aku.hassannaqvi.lhwevaluation.database.DatabaseHelper.DATABASE_PASSWORD;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;

import net.sqlcipher.database.SQLiteDatabase;

import org.json.JSONArray;

import java.io.File;
import java.util.List;

import edu.aku.hassannaqvi.lhwevaluation.BuildConfig;
import edu.aku.hassannaqvi.lhwevaluation.models.FamilyMembers;
import edu.aku.hassannaqvi.lhwevaluation.models.HHForm;
import edu.aku.hassannaqvi.lhwevaluation.models.LHWForm;
import edu.aku.hassannaqvi.lhwevaluation.models.LHWHouseholds;
import edu.aku.hassannaqvi.lhwevaluation.models.MWRA;
import edu.aku.hassannaqvi.lhwevaluation.models.Users;


public class MainApp extends Application {

    public static final String PROJECT_NAME = "lhwevaluation";
    public static final String DIST_ID = null;
    public static final String SYNC_LOGIN = "sync_login";
    public static final String _IP = "https://vcoe1.aku.edu";// .LIVE server
    //    public static final String _IP = "https://cls-pae-fp51764";// .TEST server
    // public static final String _IP = "http://f38158/prosystem";// .TEST server
    //public static final String _IP = "http://43.245.131.159:8080";// .TEST server
    public static final String _HOST_URL = MainApp._IP + "/uen_ph2/api/";// .TEST server;
    public static final String _SERVER_URL = "syncgcm.php";
    public static final String _USER_URL = "resetpasswordGCM.php";
    public static final String _SERVER_GET_URL = "getDatagcm.php";
    public static final String _PHOTO_UPLOAD_URL = _HOST_URL + "uploads.php";
    public static final String _UPDATE_URL = MainApp._IP + "/uen_ph2/app/lhweval";
    public static final String _APP_FOLDER = "../app/LHW_Evaluation";
    public static final String _EMPTY_ = "";
    private static final String TAG = "MainApp";
    public static int TRATS = 8;
    public static String IBAHC = "";

    //COUNTRIES
    public static int PAKISTAN = 1;
    public static int TAJIKISTAN = 3;

    public static File sdDir;
    public static String[] downloadData;
    public static List<HHForm> hhList;
    public static HHForm hhForm;
    public static List<LHWForm> lhwList;
    public static LHWForm LHWForm;
    public static MWRA mwra;
    public static LHWHouseholds LHWHouseholds;
    public static FamilyMembers familyMembers;
    public static List<FamilyMembers> familyList;
    //public static List<FamilyMembers> selectedMembersList;
    public static List<FamilyMembers> mwraList;
    public static List<FamilyMembers> adolList;
    public static List<FamilyMembers> maleList;

    public static String DeviceURL = "devices.php";
    public static AppInfo appInfo;
    public static Users user;
    public static Boolean admin = false;
    public static List<JSONArray> uploadData;
    public static SharedPreferences.Editor editor;
    public static SharedPreferences sharedPref;
    public static String deviceid;
    public static int versionCode = BuildConfig.VERSION_CODE;
    public static String versionName = BuildConfig.VERSION_NAME;
    public static int MY_PERMISSIONS_REQUEST_READ_PHONE_STATE = 2;
    public static long TWO_MINUTES = 1000 * 60 * 2;
    public static boolean permissionCheck = false;
    public static int idType = 0;

    public static int mwraCount = 0;
    public static int adolCount = 0;
    public static int maleCount = 0;
    public static int HHCount = 0;
    public static int lhwCount = 0;
    public static int lhwHHCount = 0;
    public static int memberCount = 0;


    public static int selectedLHW = 0;
    public static int selectedHH = 0;
    public static String selectedMember = "";

    public static int mwraCountComplete = 0;
    public static int lhwCountComplete = 0;
    public static int memberCountComplete = 0;

    public static boolean lhwComplete;
    public static boolean memberComplete;
    public static boolean superuser = false;


    public static void hideSystemUI(View decorView) {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        // Set the content to appear under the system bars so that the
                        // content doesn't resize when the system bars hide and show.
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

    public static String getDeviceId(Context context) {
        String deviceId;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            deviceId = Settings.Secure.getString(
                    context.getContentResolver(),
                    Settings.Secure.ANDROID_ID);
        } else {
           /* final TelephonyManager mTelephony = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
            if (mTelephony.getDeviceId() != null) {
                deviceId = mTelephony.getDeviceId();
            } else {
                deviceId = Settings.Secure.getString(
                        context.getContentResolver(),
                        Settings.Secure.ANDROID_ID);
            }*/
        }
        return "deviceId";
    }

    public static Boolean isNetworkAvailable(Context c) {
        ConnectivityManager connectivityManager = (ConnectivityManager) c.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            Network nw = connectivityManager.getActiveNetwork();
            if (nw == null) return false;
            NetworkCapabilities actNw = connectivityManager.getNetworkCapabilities(nw);
            return actNw != null && (actNw.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) || actNw.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) || actNw.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) || actNw.hasTransport(NetworkCapabilities.TRANSPORT_BLUETOOTH));
        } else {
            NetworkInfo nwInfo = connectivityManager.getActiveNetworkInfo();
            return nwInfo != null && nwInfo.isConnected();
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();

        /*
        RootBeer  rootBeer = new RootBeer(this);
        if (rootBeer.isRooted()) {
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }*/

        //Initiate DateTime
        //Initializ App info
        appInfo = new AppInfo(this);
        sharedPref = getSharedPreferences(PROJECT_NAME, MODE_PRIVATE);
        editor = sharedPref.edit();
        deviceid = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);

        initSecure();
    }

    private void initSecure() {
        // Initialize SQLCipher library
        SQLiteDatabase.loadLibs(this);
        File databaseFile = getDatabasePath(DATABASE_NAME);
       /* databaseFile.mkdirs();
        databaseFile.delete();*/
        SQLiteDatabase database = SQLiteDatabase.openOrCreateDatabase(databaseFile, DATABASE_PASSWORD, null);
        // Prepare encryption KEY
        ApplicationInfo ai = null;
        try {
            ai = getPackageManager().getApplicationInfo(getPackageName(), PackageManager.GET_META_DATA);
            Bundle bundle = ai.metaData;
            TRATS = bundle.getInt("YEK_TRATS");
            //IBAHC = bundle.getString("YEK_REVRES").substring(TRATS, TRATS + 16);
            IBAHC = bundle.getString("YEK_REVRES");
            Log.d(TAG, "onCreate: YEK_REVRES = " + IBAHC);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }
}
