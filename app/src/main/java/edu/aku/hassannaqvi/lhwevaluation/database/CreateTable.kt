package edu.aku.hassannaqvi.lhwevaluation.database

import edu.aku.hassannaqvi.lhwevaluation.contracts.TableContracts.*
import edu.aku.hassannaqvi.lhwevaluation.core.MainApp.PROJECT_NAME

object CreateTable {

    const val DATABASE_NAME = "$PROJECT_NAME.db"
    const val DATABASE_COPY = "${PROJECT_NAME}_copy.db"
    const val DATABASE_VERSION = 2

    const val SQL_CREATE_HH_FORMS = ("CREATE TABLE "
            + HHFormsTable.TABLE_NAME + "("
            + HHFormsTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + HHFormsTable.COLUMN_PROJECT_NAME + " TEXT,"
            + HHFormsTable.COLUMN_UID + " TEXT,"
            + HHFormsTable.COLUMN_LHW_UID + " TEXT,"
            + HHFormsTable.COLUMN_LHW_CODE + " TEXT,"
            + HHFormsTable.COLUMN_KHANDAN_NO + " TEXT,"
            + HHFormsTable.COLUMN_USERNAME + " TEXT,"
            + HHFormsTable.COLUMN_SYSDATE + " TEXT,"
            + HHFormsTable.COLUMN_ISTATUS + " TEXT,"
            + HHFormsTable.COLUMN_DEVICEID + " TEXT,"
            + HHFormsTable.COLUMN_DEVICETAGID + " TEXT,"
            + HHFormsTable.COLUMN_SYNCED + " TEXT,"
            + HHFormsTable.COLUMN_SYNCED_DATE + " TEXT,"
            + HHFormsTable.COLUMN_APPVERSION + " TEXT,"
            + HHFormsTable.COLUMN_SH2 + " TEXT,"
            //     + HHFormsTable.COLUMN_SH3 + " TEXT,"
            + HHFormsTable.COLUMN_SAB + " TEXT,"
            + HHFormsTable.COLUMN_SM + " TEXT"
            + " );"
            )

    const val SQL_CREATE_LHW_FORMS = ("CREATE TABLE "
            + LHWFormsTable.TABLE_NAME + "("
            + LHWFormsTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + LHWFormsTable.COLUMN_PROJECT_NAME + " TEXT,"
            + LHWFormsTable.COLUMN_UID + " TEXT,"
            + LHWFormsTable.COLUMN_CLUSTER + " TEXT,"
            + LHWFormsTable.COLUMN_USERNAME + " TEXT,"
            + LHWFormsTable.COLUMN_SYSDATE + " TEXT,"
            + LHWFormsTable.COLUMN_ISTATUS + " TEXT,"
            + LHWFormsTable.COLUMN_DEVICEID + " TEXT,"
            + LHWFormsTable.COLUMN_DEVICETAGID + " TEXT,"
            + LHWFormsTable.COLUMN_SYNCED + " TEXT,"
            + LHWFormsTable.COLUMN_SYNCED_DATE + " TEXT,"
            + LHWFormsTable.COLUMN_APPVERSION + " TEXT,"
            + LHWFormsTable.COLUMN_A101 + " TEXT,"
            + LHWFormsTable.COLUMN_A102 + " TEXT,"
            + LHWFormsTable.COLUMN_A103 + " TEXT,"
            + LHWFormsTable.COLUMN_A104n + " TEXT,"
            + LHWFormsTable.COLUMN_A104c + " TEXT,"
            + LHWFormsTable.COLUMN_SL1 + " TEXT,"
            + LHWFormsTable.COLUMN_SL2 + " TEXT,"
            + LHWFormsTable.COLUMN_SL3 + " TEXT,"
            + LHWFormsTable.COLUMN_SL4 + " TEXT"
            + " );"
            )

    const val SQL_CREATE_LHWHH = ("CREATE TABLE "
            + LHWHHTable.TABLE_NAME + "("
            + LHWHHTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + LHWHHTable.COLUMN_PROJECT_NAME + " TEXT,"
            + LHWHHTable.COLUMN_UID + " TEXT,"
            + LHWHHTable.COLUMN_UUID + " TEXT,"
            + LHWHHTable.COLUMN_CLUSTER + " TEXT,"
            + LHWHHTable.COLUMN_HHID + " TEXT,"
            + LHWHHTable.COLUMN_USERNAME + " TEXT,"
            + LHWHHTable.COLUMN_SYSDATE + " TEXT,"
            + LHWHHTable.COLUMN_ISTATUS + " TEXT,"
            + LHWHHTable.COLUMN_DEVICEID + " TEXT,"
            + LHWHHTable.COLUMN_DEVICETAGID + " TEXT,"
            + LHWHHTable.COLUMN_SYNCED + " TEXT,"
            + LHWHHTable.COLUMN_SYNCED_DATE + " TEXT,"
            + LHWHHTable.COLUMN_APPVERSION + " TEXT,"
            + LHWHHTable.COLUMN_H101 + " TEXT,"
            + LHWHHTable.COLUMN_H102 + " TEXT,"
            + LHWHHTable.COLUMN_H103 + " TEXT,"
            + LHWHHTable.COLUMN_H104A + " TEXT,"
            + LHWHHTable.COLUMN_H104B + " TEXT,"
            + LHWHHTable.COLUMN_H104C + " TEXT,"
            + LHWHHTable.COLUMN_H104D + " TEXT,"
            + LHWHHTable.COLUMN_H104E + " TEXT,"
            + LHWHHTable.COLUMN_H104F + " TEXT,"
            + LHWHHTable.COLUMN_SIDENT + " TEXT,"
            + LHWHHTable.COLUMN_LHW_CODE + " TEXT,"
            + LHWHHTable.COLUMN_LHWPHOTO + " TEXT"
            + " );"
            )

    const val SQL_CREATE_MWRALIST = ("CREATE TABLE "
            + MWRAListTable.TABLE_NAME + "("
            + MWRAListTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + MWRAListTable.COLUMN_PROJECT_NAME + " TEXT,"
            + MWRAListTable.COLUMN_UID + " TEXT,"
            + MWRAListTable.COLUMN_UUID + " TEXT,"
            + MWRAListTable.COLUMN_CLUSTER + " TEXT,"
            + MWRAListTable.COLUMN_HHID + " TEXT,"
            + MWRAListTable.COLUMN_USERNAME + " TEXT,"
            + MWRAListTable.COLUMN_SYSDATE + " TEXT,"
            + MWRAListTable.COLUMN_INDEXED + " TEXT,"
            + MWRAListTable.COLUMN_ISTATUS + " TEXT,"
            + MWRAListTable.COLUMN_DEVICEID + " TEXT,"
            + MWRAListTable.COLUMN_DEVICETAGID + " TEXT,"
            + MWRAListTable.COLUMN_SYNCED + " TEXT,"
            + MWRAListTable.COLUMN_SYNCED_DATE + " TEXT,"
            + MWRAListTable.COLUMN_APPVERSION + " TEXT,"
            + MWRAListTable.COLUMN_SW1 + " TEXT,"
            + MWRAListTable.COLUMN_SW2 + " TEXT,"
            + MWRAListTable.COLUMN_SW3 + " TEXT,"
            + MWRAListTable.COLUMN_SW41 + " TEXT,"
            + MWRAListTable.COLUMN_SW42 + " TEXT,"
            + MWRAListTable.COLUMN_SW43 + " TEXT"
            + " );"
            )

    const val SQL_CREATE_LHWGBHH = ("CREATE TABLE "
            + LHWGB_HHTable.TABLE_NAME + "("
            + LHWGB_HHTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + LHWGB_HHTable.COLUMN_PROJECT_NAME + " TEXT,"
            + LHWGB_HHTable.COLUMN_UID + " TEXT,"
            + LHWGB_HHTable.COLUMN_UUID + " TEXT,"
            + LHWGB_HHTable.COLUMN_CLUSTER + " TEXT,"
            + LHWGB_HHTable.COLUMN_LHWUID + " TEXT,"
            + LHWGB_HHTable.COLUMN_LHW_CODE + " TEXT,"
            + LHWGB_HHTable.COLUMN_HHID + " TEXT,"
            + LHWGB_HHTable.COLUMN_USERNAME + " TEXT,"
            + LHWGB_HHTable.COLUMN_SYSDATE + " TEXT,"
            + LHWGB_HHTable.COLUMN_ISTATUS + " TEXT,"
            + LHWGB_HHTable.COLUMN_DEVICEID + " TEXT,"
            + LHWGB_HHTable.COLUMN_DEVICETAGID + " TEXT,"
            + LHWGB_HHTable.COLUMN_SYNCED + " TEXT,"
            + LHWGB_HHTable.COLUMN_SYNCED_DATE + " TEXT,"
            + LHWGB_HHTable.COLUMN_APPVERSION + " TEXT,"
            + LHWGB_HHTable.COLUMN_GBV02 + " TEXT"
            + " );"
            )

    const val SQL_CREATE_LHWGB = ("CREATE TABLE "
            + LHW_GBTable.TABLE_NAME + "("
            + LHW_GBTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + LHW_GBTable.COLUMN_PROJECT_NAME + " TEXT,"
            + LHW_GBTable.COLUMN_UID + " TEXT,"
            + LHW_GBTable.COLUMN_UUID + " TEXT,"
            + LHW_GBTable.COLUMN_CLUSTER + " TEXT,"
            + LHW_GBTable.COLUMN_HHID + " TEXT,"
            + LHW_GBTable.COLUMN_USERNAME + " TEXT,"
            + LHW_GBTable.COLUMN_SYSDATE + " TEXT,"
            + LHW_GBTable.COLUMN_ISTATUS + " TEXT,"
            + LHW_GBTable.COLUMN_DEVICEID + " TEXT,"
            + LHW_GBTable.COLUMN_DEVICETAGID + " TEXT,"
            + LHW_GBTable.COLUMN_SYNCED + " TEXT,"
            + LHW_GBTable.COLUMN_SYNCED_DATE + " TEXT,"
            + LHW_GBTable.COLUMN_APPVERSION + " TEXT,"
            + LHW_GBTable.COLUMN_GB01 + " TEXT"
            + " );"
            )



    const val SQL_CREATE_ENTRYLOGS = ("CREATE TABLE "
            + EntryLogTable.TABLE_NAME + "("
            + EntryLogTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + EntryLogTable.COLUMN_PROJECT_NAME + " TEXT,"
            + EntryLogTable.COLUMN_UID + " TEXT,"
            + EntryLogTable.COLUMN_UUID + " TEXT,"
            + EntryLogTable.COLUMN_PSU_CODE + " TEXT,"
            + EntryLogTable.COLUMN_HHID + " TEXT,"
            + EntryLogTable.COLUMN_USERNAME + " TEXT,"
            + EntryLogTable.COLUMN_SYSDATE + " TEXT,"
            + EntryLogTable.COLUMN_DEVICEID + " TEXT,"
            + EntryLogTable.COLUMN_ENTRY_DATE + " TEXT,"
            + EntryLogTable.COLUMN_ISTATUS + " TEXT,"
            + EntryLogTable.COLUMN_ISTATUS96x + " TEXT,"
            + EntryLogTable.COLUMN_ENTRY_TYPE + " TEXT,"
            + EntryLogTable.COLUMN_SYNCED + " TEXT,"
            + EntryLogTable.COLUMN_SYNC_DATE + " TEXT,"
            + EntryLogTable.COLUMN_APPVERSION + " TEXT"
            + " );"
            )


    const val SQL_CREATE_DISTRICT = ("CREATE TABLE " + TableDistricts.TABLE_NAME + "("
            + TableDistricts.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + TableDistricts.COLUMN_DISTRICT_NAME + " TEXT,"
            + TableDistricts.COLUMN_DISTRICT_CODE + " TEXT"
            + " );")


    const val SQL_CREATE_LHW = ("CREATE TABLE " + TableLhw.TABLE_NAME + "("
            + TableLhw.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + TableLhw.COLUMN_HF_CODE + " TEXT,"
            + TableLhw.COLUMN_LHW_CODE + " TEXT,"
            + TableLhw.COLUMN_LHW_NAME + " TEXT"
            + " );")

    const val SQL_CREATE_TEHSIL = ("CREATE TABLE " + TableTehsil.TABLE_NAME + "("
            + TableTehsil.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + TableTehsil.COLUMN_DIST_ID + " TEXT,"
            + TableTehsil.COLUMN_TEHSIL_NAME + " TEXT,"
            + TableTehsil.COLUMN_TEHSIL_CODE + " TEXT"
            + " );")

    const val SQL_CREATE_LHW_HF = ("CREATE TABLE " + TableHealthFacilities.TABLE_NAME + "("
            + TableHealthFacilities.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + TableHealthFacilities.COLUMN_HF_CODE + " TEXT,"
            + TableHealthFacilities.COLUMN_HF_NAME + " TEXT,"
            + TableHealthFacilities.COLUMN_DIST_ID + " TEXT"
            + " );")

    const val SQL_CREATE_PROVINCE = ("CREATE TABLE " + TableProvince.TABLE_NAME + "("
            + TableProvince.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + TableProvince.COLUMN_PROVINCE + " TEXT,"
            + TableProvince.COLUMN_PRO_ID + " TEXT"
            + " );")

    const val SQL_CREATE_RANDOM = ("CREATE TABLE "
            + RandomTable.TABLE_NAME + "("
            + RandomTable.COLUMN_ID + " INTEGER PRIMARY KEY,"
            + RandomTable.COLUMN_SNO + " TEXT,"
            + RandomTable.COLUMN_CLUSTER_NO + " TEXT,"
            + RandomTable.COLUMN_HH_NO + " TEXT,"
            + RandomTable.COLUMN_HEAD_HH + " TEXT"
            + " );"
            )

    const val SQL_CREATE_VERSIONAPP = ("CREATE TABLE "
            + VersionTable.TABLE_NAME + " ("
            + VersionTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + VersionTable.COLUMN_VERSION_CODE + " TEXT, "
            + VersionTable.COLUMN_VERSION_NAME + " TEXT, "
            + VersionTable.COLUMN_PATH_NAME + " TEXT "
            + ");"
            )

    const val SQL_CREATE_FAMILY_MEMBERS = ("CREATE TABLE "
            + FamilyMembersTable.TABLE_NAME + "("
            + FamilyMembersTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + FamilyMembersTable.COLUMN_PROJECT_NAME + " TEXT,"
            + FamilyMembersTable.COLUMN_UID + " TEXT,"
            + FamilyMembersTable.COLUMN_UUID + " TEXT,"
            + FamilyMembersTable.COLUMN_LHW_CODE + " TEXT,"
            + FamilyMembersTable.COLUMN_KHANDAN_NO + " TEXT,"
            + FamilyMembersTable.COLUMN_USERNAME + " TEXT,"
            + FamilyMembersTable.COLUMN_SYSDATE + " TEXT,"
            + FamilyMembersTable.COLUMN_INDEXED + " TEXT,"
            + FamilyMembersTable.COLUMN_ISTATUS + " TEXT,"
            + FamilyMembersTable.COLUMN_DEVICEID + " TEXT,"
            + FamilyMembersTable.COLUMN_DEVICETAGID + " TEXT,"
            + FamilyMembersTable.COLUMN_SYNCED + " TEXT,"
            + FamilyMembersTable.COLUMN_SYNCED_DATE + " TEXT,"
            + FamilyMembersTable.COLUMN_APPVERSION + " TEXT,"
            + FamilyMembersTable.COLUMN_SH3 + " TEXT"
            + " );"
            )

    const val SQL_CREATE_USERS = ("CREATE TABLE "
            + UsersTable.TABLE_NAME + "("
            + UsersTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + UsersTable.COLUMN_USERNAME + " TEXT,"
            + UsersTable.COLUMN_PASSWORD + " TEXT,"
            + UsersTable.COLUMN_FULLNAME + " TEXT,"
            + UsersTable.COLUMN_DIST_ID + " TEXT,"
            + UsersTable.COLUMN_ENABLED + " TEXT,"
            + UsersTable.COLUMN_ISNEW_USER + " TEXT,"
            + UsersTable.COLUMN_PWD_EXPIRY + " TEXT,"
            + UsersTable.COLUMN_DESIGNATION + " TEXT"
            + " );"
            )



    /*const val SQL_ALTER_USERS = (
            "ALTER TABLE " + UsersTable.TABLE_NAME + " ADD " + UsersTable.COLUMN_DIST_ID + " TEXT; "
            + "ALTER TABLE " + UsersTable.TABLE_NAME + " ADD " + UsersTable.COLUMN_ENABLED + " TEXT; "
            + "ALTER TABLE " + UsersTable.TABLE_NAME + " ADD " + UsersTable.COLUMN_ISNEW_USER + " TEXT; "
            + "ALTER TABLE " + UsersTable.TABLE_NAME + " ADD " + UsersTable.COLUMN_PWD_EXPIRY + " TEXT; "
            + "ALTER TABLE " + UsersTable.TABLE_NAME + " ADD " + UsersTable.COLUMN_DESIGNATION + " TEXT; "
            )*/

    const val SQL_ALTER_USERS_DIST_ID =
        ("ALTER TABLE " + UsersTable.TABLE_NAME + " ADD " + UsersTable.COLUMN_DIST_ID + " TEXT; ")
    const val SQL_ALTER_USERS_ENABLED =
        ("ALTER TABLE " + UsersTable.TABLE_NAME + " ADD " + UsersTable.COLUMN_ENABLED + " TEXT; ")
    const val SQL_ALTER_USERS_ISNEW_USER =
        ("ALTER TABLE " + UsersTable.TABLE_NAME + " ADD " + UsersTable.COLUMN_ISNEW_USER + " TEXT; ")
    const val SQL_ALTER_USERS_PWD_EXPIRY =
        ("ALTER TABLE " + UsersTable.TABLE_NAME + " ADD " + UsersTable.COLUMN_PWD_EXPIRY + " TEXT; ")
    const val SQL_ALTER_USERS_DESIGNATION =
        ("ALTER TABLE " + UsersTable.TABLE_NAME + " ADD " + UsersTable.COLUMN_DESIGNATION + " TEXT; ")

    const val SQL_ALTER_USERS_PWD_ENC =
        ("ALTER TABLE " + UsersTable.TABLE_NAME + " RENAME COLUMN " + "password" + " TO " + "passwordEnc")
}