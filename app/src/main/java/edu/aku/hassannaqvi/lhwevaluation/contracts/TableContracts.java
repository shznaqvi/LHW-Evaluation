package edu.aku.hassannaqvi.lhwevaluation.contracts;

import android.provider.BaseColumns;

public class TableContracts {

    public static abstract class HHFormsTable implements BaseColumns {
        public static final String TABLE_NAME = "HouseholdForm";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_LHW_UID = "_lhwuid";
        public static final String COLUMN_LHW_CODE = "lhwcode";
        public static final String COLUMN_KHANDAN_NO = "kno";
        public static final String COLUMN_DISTRICT = "kno";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";

        public static final String COLUMN_SH2 = "sH2";
      //  public static final String COLUMN_SH3 = "sH3";
        public static final String COLUMN_SAB = "sAB";
        public static final String COLUMN_SM = "sM";

        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";
    }

    public static abstract class LHWFormsTable implements BaseColumns {
        public static final String TABLE_NAME = "LHWForm";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_CLUSTER = "cluster";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_A101 = "a101";
        public static final String COLUMN_A102 = "a102";
        public static final String COLUMN_A103 = "a103";
        public static final String COLUMN_A104n = "a104n";
        public static final String COLUMN_A104c = "a104c";
        public static final String COLUMN_SL1 = "sL1";
        public static final String COLUMN_SL2 = "sL2";
        public static final String COLUMN_SL3 = "sL3";
        public static final String COLUMN_SL4 = "sL4";

        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";
    }

    public static abstract class LHWHHTable implements BaseColumns {
        public static final String TABLE_NAME = "LHWHousehold";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uuid";
        public static final String COLUMN_CLUSTER = "cluster";
        public static final String COLUMN_HHID = "hhid";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_H101 = "h101";
        public static final String COLUMN_H102 = "h102";
        public static final String COLUMN_H103 = "h103";
        public static final String COLUMN_H104A = "h104a";
        public static final String COLUMN_H104B = "h104b";
        public static final String COLUMN_H104C = "h104c";
        public static final String COLUMN_H104D = "h104d";
        public static final String COLUMN_H104E = "h104e";
        public static final String COLUMN_H104F = "h104f";
        public static final String COLUMN_LHWPHOTO = "lhwphoto";

        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";
        public static final String COLUMN_SIDENT = "sIdent";
        public static final String COLUMN_LHW_CODE = "lhwCode";
    }


    public static abstract class LHWGB_HHTable implements BaseColumns {
        public static final String TABLE_NAME = "LHWGB_HH";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uuid";
        public static final String COLUMN_MUID = "_muid";
        public static final String COLUMN_LHW_CODE = "_lhwcode";
        public static final String COLUMN_CLUSTER = "cluster";
        public static final String COLUMN_HHID = "hhid";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";

        public static final String COLUMN_GBV02 = "gb_hh";

    }


    public static abstract class LHW_GBTable implements BaseColumns {
        public static final String TABLE_NAME = "LHW_GB";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uuid";
        public static final String COLUMN_LHWUID = "_luid";
        public static final String COLUMN_LHW_CODE = "_lhwcode";
        public static final String COLUMN_CLUSTER = "cluster";
        public static final String COLUMN_HHID = "hhid";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";

        public static final String COLUMN_GB01 = "gb_lhw";

    }

    public static abstract class MWRAListTable implements BaseColumns {
        public static final String TABLE_NAME = "MwraForm";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uuid";
        public static final String COLUMN_CLUSTER = "cluster";
        public static final String COLUMN_HHID = "hhid";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_INDEXED = "indexed";
        public static final String COLUMN_WRAUID = "wraUID";
        public static final String COLUMN_WRA_SNO = "wraSno";
        public static final String COLUMN_SW1 = "sW1";
        public static final String COLUMN_SW2 = "sW2";
        public static final String COLUMN_SW3 = "sW3";
        public static final String COLUMN_SW41 = "sW41";
        public static final String COLUMN_SW42 = "sW42";
        public static final String COLUMN_SW43 = "sW43";

        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";
    }


    public static abstract class UsersTable implements BaseColumns {
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String TABLE_NAME = "AppUser";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_PASSWORD = "passwordEnc";
        public static final String COLUMN_FULLNAME = "full_name";
        public static final String COLUMN_DESIGNATION = "designation";
        public static final String COLUMN_ENABLED = "enabled";
        public static final String COLUMN_ISNEW_USER = "isNewUser";
        public static final String COLUMN_PWD_EXPIRY = "pwdExpiry";
        public static final String COLUMN_DIST_ID = "dist_id";
    }


    public static abstract class TableDistricts implements BaseColumns {
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String TABLE_NAME = "district";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_DISTRICT_NAME = "district_name";
        public static final String COLUMN_DISTRICT_CODE = "district_code";

    }

    public static abstract class TableTehsil implements BaseColumns {

        public static final String TABLE_NAME = "tehsil";
        public static final String COLUMN_NAME_NULLABLE = "nullColumnHack";
        public static final String COLUMN_ID = "_ID";
        public static final String COLUMN_TEHSIL_CODE = "tehsil_id";
        public static final String COLUMN_TEHSIL_NAME = "tehsil";
        public static final String COLUMN_DIST_ID = "dist_id";


    }

    public static abstract class TableLhw implements BaseColumns {

        public static final String TABLE_NAME = "lhw";
        public static final String COLUMN_NAME_NULLABLE = "nullColumnHack";
        public static final String COLUMN_ID = "_ID";
        public static final String COLUMN_HF_CODE = "hfcode";
        public static final String COLUMN_LHW_NAME = "lhw_name";
        public static final String COLUMN_LHW_CODE = "lhw_code";

    }

    public static abstract class TableHealthFacilities implements BaseColumns {
        public static final String TABLE_NAME = "HealthFacility";
        public static final String COLUMN_NAME_NULLABLE = "nullColumnHack";
        public static final String COLUMN_ID = "_ID";
        public static final String COLUMN_DIST_ID = "dist_id";
        public static final String COLUMN_HF_CODE = "hfcode";
        public static final String COLUMN_HF_NAME = "hf_name";
    }


    public static abstract class RandomTable implements BaseColumns {
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String TABLE_NAME = "rand_hh";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_SNO = "sno";
        public static final String COLUMN_CLUSTER_NO = "cluster_no";
        public static final String COLUMN_HEAD_HH = "head_hh";
        public static final String COLUMN_HH_NO = "hh_no";

    }

    public static abstract class VersionTable implements BaseColumns {
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String TABLE_NAME = "versionApp";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_VERSION_PATH = "elements";
        public static final String COLUMN_VERSION_CODE = "versionCode";
        public static final String COLUMN_VERSION_NAME = "versionName";
        public static final String COLUMN_PATH_NAME = "outputFile";
        public static final String SERVER_URI = "output-metadata.json";

    }

    public static abstract class TableProvince implements BaseColumns {
        public static final String TABLE_NAME = "province";
        public static final String COLUMN_NAME_NULLABLE = "nullColumnHack";
        public static final String COLUMN_ID = "_ID";
        public static final String COLUMN_PROVINCE = "province";
        public static final String COLUMN_PRO_ID = "pro_id";
    }
    public static abstract class FamilyMembersTable implements BaseColumns {
        public static final String TABLE_NAME = "FamilyMember";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uuid";
        public static final String COLUMN_LHW_CODE = "lhwCode";
        public static final String COLUMN_KHANDAN_NO = "kno";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_INDEXED = "indexed";
        public static final String COLUMN_SNO = "sno";
        public static final String COLUMN_SH3 = "sH3";

        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";
    }

    public static abstract class EntryLogTable implements BaseColumns {
        public static final String TABLE_NAME = "EntryLog";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uuid";
        public static final String COLUMN_PSU_CODE = "psuCode";
        public static final String COLUMN_HHID = "hhid";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_ENTRY_DATE = "entryDate";

        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNC_DATE = "sync_date";
        public static final String COLUMN_ENTRY_TYPE = "entry_type";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";
        public static final String COLUMN_ISTATUS96x = "istatus96x";
    }
}
