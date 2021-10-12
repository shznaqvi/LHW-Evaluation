package edu.aku.hassannaqvi.lhwevaluation.database;

import static edu.aku.hassannaqvi.lhwevaluation.core.MainApp.mwra;
import static edu.aku.hassannaqvi.lhwevaluation.database.CreateTable.DATABASE_NAME;
import static edu.aku.hassannaqvi.lhwevaluation.database.CreateTable.DATABASE_VERSION;
import static edu.aku.hassannaqvi.lhwevaluation.database.CreateTable.SQL_CREATE_ANTHRO;
import static edu.aku.hassannaqvi.lhwevaluation.database.CreateTable.SQL_CREATE_CHILDLIST;
import static edu.aku.hassannaqvi.lhwevaluation.database.CreateTable.SQL_CREATE_CLUSTERS;
import static edu.aku.hassannaqvi.lhwevaluation.database.CreateTable.SQL_CREATE_HH_FORMS;
import static edu.aku.hassannaqvi.lhwevaluation.database.CreateTable.SQL_CREATE_MWRALIST;
import static edu.aku.hassannaqvi.lhwevaluation.database.CreateTable.SQL_CREATE_PREGNANCY;
import static edu.aku.hassannaqvi.lhwevaluation.database.CreateTable.SQL_CREATE_RANDOM;
import static edu.aku.hassannaqvi.lhwevaluation.database.CreateTable.SQL_CREATE_SAMPLES;
import static edu.aku.hassannaqvi.lhwevaluation.database.CreateTable.SQL_CREATE_USERS;
import static edu.aku.hassannaqvi.lhwevaluation.database.CreateTable.SQL_CREATE_VERSIONAPP;
import static edu.aku.hassannaqvi.lhwevaluation.database.CreateTable.SQL_CREATE_ZSTANDARD;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import edu.aku.hassannaqvi.lhwevaluation.contracts.TableContracts;
import edu.aku.hassannaqvi.lhwevaluation.core.MainApp;
import edu.aku.hassannaqvi.lhwevaluation.models.Clusters;
import edu.aku.hassannaqvi.lhwevaluation.models.HHForm;
import edu.aku.hassannaqvi.lhwevaluation.models.MWRA;
import edu.aku.hassannaqvi.lhwevaluation.models.RandomHH;
import edu.aku.hassannaqvi.lhwevaluation.models.Users;
import edu.aku.hassannaqvi.lhwevaluation.models.VersionApp;




/*import edu.aku.hassannaqvi.naunehal.models.Immunization;*/

/**
 * @author hassan.naqvi on 11/30/2016.
 * @update ali azaz on 01/07/21
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    private final String TAG = "DatabaseHelper";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_USERS);
        db.execSQL(SQL_CREATE_CLUSTERS);
        db.execSQL(SQL_CREATE_RANDOM);
        db.execSQL(SQL_CREATE_HH_FORMS);
        db.execSQL(SQL_CREATE_MWRALIST);
        db.execSQL(SQL_CREATE_CHILDLIST);
        db.execSQL(SQL_CREATE_ANTHRO);
       /* db.execSQL(SQL_CREATE_BLOOD);
        db.execSQL(SQL_CREATE_STOOL);*/
        db.execSQL(SQL_CREATE_PREGNANCY);
        db.execSQL(SQL_CREATE_SAMPLES);
        db.execSQL(SQL_CREATE_VERSIONAPP);
        db.execSQL(SQL_CREATE_ZSTANDARD);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        switch (oldVersion) {
            case 1:
            case 2:
        }
    }


    //ADDITION in DB
    public Long addForm(HHForm HHForm) throws JSONException {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(TableContracts.HHFormsTable.COLUMN_PROJECT_NAME, HHForm.getProjectName());
        values.put(TableContracts.HHFormsTable.COLUMN_UID, HHForm.getUid());
        values.put(TableContracts.HHFormsTable.COLUMN_CLUSTER, HHForm.getCluster());
        values.put(TableContracts.HHFormsTable.COLUMN_HHID, HHForm.getHhid());
        values.put(TableContracts.HHFormsTable.COLUMN_LHW_UID, HHForm.getHhid());
        values.put(TableContracts.HHFormsTable.COLUMN_USERNAME, HHForm.getUserName());
        values.put(TableContracts.HHFormsTable.COLUMN_SYSDATE, HHForm.getSysDate());


        values.put(TableContracts.HHFormsTable.COLUMN_SH1, HHForm.sH1toString());
        values.put(TableContracts.HHFormsTable.COLUMN_SH2, HHForm.sH2toString());
        values.put(TableContracts.HHFormsTable.COLUMN_SH3, HHForm.sH3toString());
        values.put(TableContracts.HHFormsTable.COLUMN_SAB, HHForm.sABtoString());
        values.put(TableContracts.HHFormsTable.COLUMN_SM, HHForm.sMtoString());

        values.put(TableContracts.HHFormsTable.COLUMN_ISTATUS, HHForm.getiStatus());
        values.put(TableContracts.HHFormsTable.COLUMN_DEVICETAGID, HHForm.getDeviceTag());
        values.put(TableContracts.HHFormsTable.COLUMN_DEVICEID, HHForm.getDeviceId());
        values.put(TableContracts.HHFormsTable.COLUMN_APPVERSION, HHForm.getAppver());


        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                TableContracts.HHFormsTable.TABLE_NAME,
                TableContracts.HHFormsTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }


    public Long addMWRAList(MWRA mwra) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(TableContracts.MWRAListTable.COLUMN_PROJECT_NAME, mwra.getProjectName());
        values.put(TableContracts.MWRAListTable.COLUMN_UID, mwra.getUid());
        values.put(TableContracts.MWRAListTable.COLUMN_UUID, mwra.getUuid());
        values.put(TableContracts.MWRAListTable.COLUMN_CLUSTER, mwra.getCluster());
        values.put(TableContracts.MWRAListTable.COLUMN_HHID, mwra.getHhid());
        values.put(TableContracts.MWRAListTable.COLUMN_USERNAME, mwra.getUserName());
        values.put(TableContracts.MWRAListTable.COLUMN_SYSDATE, mwra.getSysDate());
        values.put(TableContracts.MWRAListTable.COLUMN_INDEXED, mwra.getIndexed());

        values.put(TableContracts.MWRAListTable.COLUMN_SW1, mwra.sW1toString());
        values.put(TableContracts.MWRAListTable.COLUMN_SW2, mwra.sW2toString());
        values.put(TableContracts.MWRAListTable.COLUMN_SW3, mwra.sW3toString());
        values.put(TableContracts.MWRAListTable.COLUMN_SW41, mwra.sW41toString());
        values.put(TableContracts.MWRAListTable.COLUMN_SW42, mwra.sW42toString());
        values.put(TableContracts.MWRAListTable.COLUMN_SW43, mwra.sW43toString());

        values.put(TableContracts.MWRAListTable.COLUMN_DEVICEID, mwra.getDeviceId());
        values.put(TableContracts.MWRAListTable.COLUMN_DEVICETAGID, mwra.getDeviceTag());
        values.put(TableContracts.MWRAListTable.COLUMN_APPVERSION, mwra.getAppver());
        values.put(TableContracts.MWRAListTable.COLUMN_ISTATUS, mwra.getiStatus());


        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                TableContracts.MWRAListTable.TABLE_NAME,
                TableContracts.MWRAListTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }


    //UPDATE in DB
    public int updatesFormColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase();

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = TableContracts.HHFormsTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.HHForm.getId())};

        return db.update(TableContracts.HHFormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesMwraColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase();

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = TableContracts.MWRAListTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(mwra.getId())};

        return db.update(TableContracts.MWRAListTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updateEnding() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(TableContracts.HHFormsTable.COLUMN_ISTATUS, MainApp.HHForm.getiStatus());

        // Which row to update, based on the ID
        String selection = TableContracts.HHFormsTable.COLUMN_ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.HHForm.getId())};

        return db.update(TableContracts.HHFormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }


    /*
     * Functions that dealing with table data
     * */
    public boolean doLogin(String username, String password) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;
        String whereClause = TableContracts.UsersTable.COLUMN_USERNAME + "=? AND " + TableContracts.UsersTable.COLUMN_PASSWORD + "=?";
        String[] whereArgs = {username, password};
        String groupBy = null;
        String having = null;
        String orderBy = TableContracts.UsersTable.COLUMN_ID + " ASC";

        Users loggedInUser = null;
        try {
            c = db.query(
                    TableContracts.UsersTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                loggedInUser = new Users().hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        MainApp.user = loggedInUser;
        return c.getCount() > 0;
    }


    public ArrayList<HHForm> getFormsByDate(String sysdate) {

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                TableContracts.HHFormsTable._ID,
                TableContracts.HHFormsTable.COLUMN_UID,
                TableContracts.HHFormsTable.COLUMN_SYSDATE,
                TableContracts.HHFormsTable.COLUMN_USERNAME,
                TableContracts.HHFormsTable.COLUMN_ISTATUS,
                TableContracts.HHFormsTable.COLUMN_SYNCED,

        };
        String whereClause = TableContracts.HHFormsTable.COLUMN_SYSDATE + " Like ? ";
        String[] whereArgs = new String[]{"%" + sysdate + " %"};
        String groupBy = null;
        String having = null;
        String orderBy = TableContracts.HHFormsTable.COLUMN_ID + " ASC";
        ArrayList<HHForm> allHHForms = new ArrayList<>();
        try {
            c = db.query(
                    TableContracts.HHFormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                HHForm forms = new HHForm();
                forms.setId(c.getString(c.getColumnIndexOrThrow(TableContracts.HHFormsTable.COLUMN_ID)));
                forms.setUid(c.getString(c.getColumnIndexOrThrow(TableContracts.HHFormsTable.COLUMN_UID)));
                forms.setSysDate(c.getString(c.getColumnIndexOrThrow(TableContracts.HHFormsTable.COLUMN_SYSDATE)));
                forms.setUserName(c.getString(c.getColumnIndexOrThrow(TableContracts.HHFormsTable.COLUMN_USERNAME)));
                allHHForms.add(forms);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allHHForms;
    }


    // istatus examples: (1) or (1,9) or (1,3,5)
    public HHForm getFormByAssessNo(String uid, String istatus) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = TableContracts.HHFormsTable.COLUMN_UID + "=? AND " +
                TableContracts.HHFormsTable.COLUMN_ISTATUS + " in " + istatus;

        String[] whereArgs = {uid};

        String groupBy = null;
        String having = null;

        String orderBy = TableContracts.HHFormsTable.COLUMN_ID + " ASC";

        HHForm allFC = null;
        try {
            c = db.query(
                    TableContracts.HHFormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                allFC = new HHForm().Hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }

    public ArrayList<Cursor> getDatabaseManagerData(String Query) {
        //get writable database
        SQLiteDatabase sqlDB = this.getWritableDatabase();
        String[] columns = new String[]{"message"};
        //an array list of cursor to save two cursors one has results from the query
        //other cursor stores error message if any errors are triggered
        ArrayList<Cursor> alc = new ArrayList<Cursor>(2);
        MatrixCursor Cursor2 = new MatrixCursor(columns);
        alc.add(null);
        alc.add(null);

        try {
            //execute the query results will be save in Cursor c
            Cursor c = sqlDB.rawQuery(Query, null);

            //add value to cursor2
            Cursor2.addRow(new Object[]{"Success"});

            alc.set(1, Cursor2);
            if (null != c && c.getCount() > 0) {

                alc.set(0, c);
                c.moveToFirst();

                return alc;
            }
            return alc;
        } catch (Exception sqlEx) {
            Log.d("printing exception", sqlEx.getMessage());
            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + sqlEx.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        }
    }

    /*public int updateTemp(String assessNo, String temp) {
        SQLiteDatabase db = this.getReadableDatabase();

        ContentValues values = new ContentValues();
        values.put(HHFormsTable.COLUMN_TSF305, temp);
        values.put(HHFormsTable.COLUMN_SYSDATE, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()) + "-Updated");
        values.put(HHFormsTable.COLUMN_ISTATUS, "1");
        values.put(HHFormsTable.COLUMN_SYNCED, (byte[]) null);

        String selection = HHFormsTable.COLUMN_ASSESMENT_NO + " =? AND " + HHFormsTable.COLUMN_ISTATUS + " =? ";
        // String selection = HHFormsTable.COLUMN_ASSESMENT_NO + " =? ";
        String[] selectionArgs = {assessNo, "9"};
        // String[] selectionArgs = {assessNo};

        return db.update(HHFormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }*/


    public int syncVersionApp(JSONObject VersionList) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TableContracts.VersionTable.TABLE_NAME, null, null);
        long count = 0;
        try {
            JSONObject jsonObjectCC = ((JSONArray) VersionList.get(TableContracts.VersionTable.COLUMN_VERSION_PATH)).getJSONObject(0);
            VersionApp Vc = new VersionApp();
            Vc.sync(jsonObjectCC);

            ContentValues values = new ContentValues();

            values.put(TableContracts.VersionTable.COLUMN_PATH_NAME, Vc.getPathname());
            values.put(TableContracts.VersionTable.COLUMN_VERSION_CODE, Vc.getVersioncode());
            values.put(TableContracts.VersionTable.COLUMN_VERSION_NAME, Vc.getVersionname());

            count = db.insert(TableContracts.VersionTable.TABLE_NAME, null, values);
            if (count > 0) count = 1;

        } catch (Exception ignored) {
        } finally {
            db.close();
        }

        return (int) count;
    }

    public int syncUser(JSONArray userList) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TableContracts.UsersTable.TABLE_NAME, null, null);
        int insertCount = 0;
        try {
            for (int i = 0; i < userList.length(); i++) {

                JSONObject jsonObjectUser = userList.getJSONObject(i);

                Users user = new Users();
                user.sync(jsonObjectUser);
                ContentValues values = new ContentValues();

                values.put(TableContracts.UsersTable.COLUMN_USERNAME, user.getUserName());
                values.put(TableContracts.UsersTable.COLUMN_PASSWORD, user.getPassword());
                values.put(TableContracts.UsersTable.COLUMN_FULLNAME, user.getFullname());
                long rowID = db.insert(TableContracts.UsersTable.TABLE_NAME, null, values);
                if (rowID != -1) insertCount++;
            }

        } catch (Exception e) {
            Log.d(TAG, "syncUser(e): " + e);
            db.close();
        } finally {
            db.close();
        }
        return insertCount;
    }

    public int syncClusters(JSONArray clusterList) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TableContracts.ClustersTable.TABLE_NAME, null, null);
        int insertCount = 0;
        try {
            for (int i = 0; i < clusterList.length(); i++) {

                JSONObject json = clusterList.getJSONObject(i);

                Clusters cluster = new Clusters();
                cluster.sync(json);
                ContentValues values = new ContentValues();

                values.put(TableContracts.ClustersTable.COLUMN_DISTRICT_NAME, cluster.getDistrictName());
                values.put(TableContracts.ClustersTable.COLUMN_DISTRICT_CODE, cluster.getDistrictCode());
                values.put(TableContracts.ClustersTable.COLUMN_CITY_NAME, cluster.getCityName());
                values.put(TableContracts.ClustersTable.COLUMN_CITY_CODE, cluster.getCityCode());
                values.put(TableContracts.ClustersTable.COLUMN_CLUSTER_NO, cluster.getClusterNo());
                long rowID = db.insert(TableContracts.ClustersTable.TABLE_NAME, null, values);
                if (rowID != -1) insertCount++;
            }

        } catch (Exception e) {
            Log.d(TAG, "syncClusters(e): " + e);
            db.close();
        } finally {
            db.close();
        }
        return insertCount;
    }

    public int syncRandom(JSONArray list) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TableContracts.RandomTable.TABLE_NAME, null, null);
        int insertCount = 0;
        try {
            for (int i = 0; i < list.length(); i++) {

                JSONObject json = list.getJSONObject(i);

                RandomHH ran = new RandomHH();
                ran.sync(json);
                ContentValues values = new ContentValues();
                values.put(TableContracts.RandomTable.COLUMN_ID, ran.getID());
                values.put(TableContracts.RandomTable.COLUMN_SNO, ran.getSno());
                values.put(TableContracts.RandomTable.COLUMN_CLUSTER_NO, ran.getClusterNo());
                values.put(TableContracts.RandomTable.COLUMN_HH_NO, ran.getHhno());
                values.put(TableContracts.RandomTable.COLUMN_HEAD_HH, ran.getHeadhh());
                long rowID = db.insert(TableContracts.RandomTable.TABLE_NAME, null, values);
                if (rowID != -1) insertCount++;
            }

        } catch (Exception e) {
            Log.d(TAG, "syncRandom(e): " + e);
            db.close();
        } finally {
            db.close();
        }
        return insertCount;
    }


    //get UnSyncedTables
    public JSONArray getUnsyncedForms() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        //whereClause = null;
        whereClause = TableContracts.HHFormsTable.COLUMN_SYNCED + " is null AND " +
                TableContracts.HHFormsTable.COLUMN_ISTATUS + "!= ''";

        String[] whereArgs = null;

        String groupBy = null;
        String having = null;

        String orderBy = TableContracts.HHFormsTable.COLUMN_ID + " ASC";

        JSONArray allForms = new JSONArray();
        try {
            c = db.query(
                    TableContracts.HHFormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                /** WorkManager Upload
                 /*HHForm fc = new HHForm();
                 allFC.add(fc.Hydrate(c));*/
                Log.d(TAG, "getUnsyncedForms: " + c.getCount());
                HHForm HHForm = new HHForm();
                allForms.put(HHForm.Hydrate(c).toJSONObject());


            }
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, "getUnsyncedForms: getUnsyncedForms " + e.getMessage()
            );
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        Log.d(TAG, "getUnsyncedForms: " + allForms.toString().length());
        Log.d(TAG, "getUnsyncedForms: " + allForms);
        return allForms;
    }


    //update SyncedTables
    public void updateSyncedforms(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(TableContracts.HHFormsTable.COLUMN_SYNCED, true);
        values.put(TableContracts.HHFormsTable.COLUMN_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = TableContracts.HHFormsTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};

        int count = db.update(
                TableContracts.HHFormsTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedMWRAList(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(TableContracts.MWRAListTable.COLUMN_SYNCED, true);
        values.put(TableContracts.MWRAListTable.COLUMN_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = TableContracts.MWRAListTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};

        int count = db.update(
                TableContracts.MWRAListTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }




    public ArrayList<Cursor> getData(String Query) {
        //get writable database
        SQLiteDatabase sqlDB = this.getWritableDatabase();
        String[] columns = new String[]{"message"};
        //an array list of cursor to save two cursors one has results from the query
        //other cursor stores error message if any errors are triggered
        ArrayList<Cursor> alc = new ArrayList<Cursor>(2);
        MatrixCursor Cursor2 = new MatrixCursor(columns);
        alc.add(null);
        alc.add(null);

        try {
            String maxQuery = Query;
            //execute the query results will be save in Cursor c
            Cursor c = sqlDB.rawQuery(maxQuery, null);

            //add value to cursor2
            Cursor2.addRow(new Object[]{"Success"});

            alc.set(1, Cursor2);
            if (null != c && c.getCount() > 0) {

                alc.set(0, c);
                c.moveToFirst();

                return alc;
            }
            return alc;
        } catch (SQLException sqlEx) {
            Log.d("printing exception", sqlEx.getMessage());
            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + sqlEx.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        } catch (Exception ex) {
            Log.d("printing exception", ex.getMessage());

            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + ex.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        }
    }



    //get Distinct Districts
    public Collection<Clusters> getAllDistricts() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {TableContracts.ClustersTable.COLUMN_DISTRICT_CODE, TableContracts.ClustersTable.COLUMN_DISTRICT_NAME};

        String orderBy = TableContracts.ClustersTable.COLUMN_DISTRICT_NAME + " ASC";

        Collection<Clusters> allDistricts = new ArrayList<>();
        try {
            c = db.query(
                    true,
                    TableContracts.ClustersTable.TABLE_NAME,  // The table to query
                    columns,
                    null,
                    null,
                    null,
                    null,
                    orderBy,
                    "5000"

                    // The sort order
            );
            while (c.moveToNext()) {


                Log.d(TAG, "getUnsyncedPreg: " + c.getCount());
                Clusters cluster = new Clusters();
                cluster.setDistrictCode(c.getString(c.getColumnIndexOrThrow(TableContracts.ClustersTable.COLUMN_DISTRICT_CODE)));
                cluster.setDistrictName(c.getString(c.getColumnIndexOrThrow(TableContracts.ClustersTable.COLUMN_DISTRICT_NAME)));
                allDistricts.add(cluster);

            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }

        return allDistricts;
    }

    //get Distinct cities
    public Collection<Clusters> getCitiesByDistrict(String dist_code) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {TableContracts.ClustersTable.COLUMN_CITY_CODE, TableContracts.ClustersTable.COLUMN_CITY_NAME};
        String selection = TableContracts.ClustersTable.COLUMN_DISTRICT_CODE + "= ?";
        String[] selectionArgs = {dist_code};
        String orderBy = TableContracts.ClustersTable.COLUMN_CITY_NAME + " ASC";

        Collection<Clusters> allCities = new ArrayList<>();
        try {
            c = db.query(
                    true,
                    TableContracts.ClustersTable.TABLE_NAME,  // The table to query
                    columns,
                    selection,
                    selectionArgs,
                    null,
                    null,
                    orderBy,
                    "5000"

                    // The sort order
            );
            while (c.moveToNext()) {

                Log.d(TAG, "getUnsyncedPreg: " + c.getCount());
                Clusters cluster = new Clusters();
                cluster.setCityCode(c.getString(c.getColumnIndexOrThrow(TableContracts.ClustersTable.COLUMN_CITY_CODE)));
                cluster.setCityName(c.getString(c.getColumnIndexOrThrow(TableContracts.ClustersTable.COLUMN_CITY_NAME)));
                allCities.add(cluster);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }

        return allCities;
    }

    public RandomHH checkHousehold(String cluster_no, String hh_no) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;
        String selection = TableContracts.RandomTable.COLUMN_CLUSTER_NO + "= ? AND "
                + TableContracts.RandomTable.COLUMN_HH_NO + "= ? ";
        String[] selectionArgs = {cluster_no, hh_no};

        int cCount;
        RandomHH hh = null;
        try {
            c = db.query(
                    TableContracts.RandomTable.TABLE_NAME,
                    columns,
                    selection,
                    selectionArgs,
                    null,
                    null,
                    null
            );
            while (c.moveToNext()) {

                hh = new RandomHH().hydrate(c);

            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }

        return hh;

    }

    public HHForm getFormByClusterHHNo(String cluster_no, String hh_no) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = TableContracts.HHFormsTable.COLUMN_CLUSTER + "=? AND " +
                TableContracts.HHFormsTable.COLUMN_HHID + " =? ";

        String[] whereArgs = {cluster_no, hh_no};

        String groupBy = null;
        String having = null;

        String orderBy = TableContracts.HHFormsTable.COLUMN_ID + " ASC";

        HHForm HHForm = null;
        try {
            c = db.query(
                    TableContracts.HHFormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                HHForm = new HHForm().Hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return HHForm;
    }


    public Collection<HHForm> getFormsByCluster(String cluster) {

        // String sysdate =  spDateT.substring(0, 8).trim()
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;
        String whereClause = TableContracts.HHFormsTable.COLUMN_CLUSTER + " = ? ";
        String[] whereArgs = new String[]{cluster};
//        String[] whereArgs = new String[]{"%" + spDateT.substring(0, 8).trim() + "%"};
        String groupBy = null;
        String having = null;

        String orderBy =
                TableContracts.HHFormsTable.COLUMN_ID + " ASC";

        Collection<HHForm> allFC = new ArrayList<>();
        try {
            c = db.query(
                    TableContracts.HHFormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                HHForm fc = new HHForm();
                fc.setId(c.getString(c.getColumnIndexOrThrow(TableContracts.HHFormsTable.COLUMN_ID)));
                fc.setUid(c.getString(c.getColumnIndexOrThrow(TableContracts.HHFormsTable.COLUMN_UID)));
                fc.setSysDate(c.getString(c.getColumnIndexOrThrow(TableContracts.HHFormsTable.COLUMN_SYSDATE)));
                fc.setCluster(c.getString(c.getColumnIndexOrThrow(TableContracts.HHFormsTable.COLUMN_CLUSTER)));
                fc.setHhid(c.getString(c.getColumnIndexOrThrow(TableContracts.HHFormsTable.COLUMN_HHID)));
                fc.setiStatus(c.getString(c.getColumnIndexOrThrow(TableContracts.HHFormsTable.COLUMN_ISTATUS)));
                fc.setSynced(c.getString(c.getColumnIndexOrThrow(TableContracts.HHFormsTable.COLUMN_SYNCED)));
                allFC.add(fc);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }

    public Collection<HHForm> getTodayForms(String sysdate) {

        // String sysdate =  spDateT.substring(0, 8).trim()
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;
        String whereClause = TableContracts.HHFormsTable.COLUMN_SYSDATE + " Like ? ";
        String[] whereArgs = new String[]{"%" + sysdate + " %"};
//        String[] whereArgs = new String[]{"%" + spDateT.substring(0, 8).trim() + "%"};
        String groupBy = null;
        String having = null;

        String orderBy = TableContracts.HHFormsTable.COLUMN_ID + " DESC";

        Collection<HHForm> allFC = new ArrayList<>();
        try {
            c = db.query(
                    TableContracts.HHFormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                HHForm fc = new HHForm();
                fc.setId(c.getString(c.getColumnIndexOrThrow(TableContracts.HHFormsTable.COLUMN_ID)));
                fc.setUid(c.getString(c.getColumnIndexOrThrow(TableContracts.HHFormsTable.COLUMN_UID)));
                fc.setLhwuid(c.getString(c.getColumnIndexOrThrow(TableContracts.HHFormsTable.COLUMN_LHW_UID)));
                fc.setSysDate(c.getString(c.getColumnIndexOrThrow(TableContracts.HHFormsTable.COLUMN_SYSDATE)));
                fc.setCluster(c.getString(c.getColumnIndexOrThrow(TableContracts.HHFormsTable.COLUMN_CLUSTER)));
                fc.setHhid(c.getString(c.getColumnIndexOrThrow(TableContracts.HHFormsTable.COLUMN_HHID)));
                fc.setiStatus(c.getString(c.getColumnIndexOrThrow(TableContracts.HHFormsTable.COLUMN_ISTATUS)));
                fc.setSynced(c.getString(c.getColumnIndexOrThrow(TableContracts.HHFormsTable.COLUMN_SYNCED)));
                allFC.add(fc);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }


    public Collection<HHForm> getPendingForms() {

        // String sysdate =  spDateT.substring(0, 8).trim()
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;
        String whereClause = TableContracts.HHFormsTable.COLUMN_ISTATUS + " = ?";
        String[] whereArgs = new String[]{""};
//        String[] whereArgs = new String[]{"%" + spDateT.substring(0, 8).trim() + "%"};
        String groupBy = null;
        String having = null;

        String orderBy = TableContracts.HHFormsTable.COLUMN_ID + " DESC";

        Collection<HHForm> allFC = new ArrayList<>();
        try {
            c = db.query(
                    TableContracts.HHFormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                HHForm fc = new HHForm();
                fc.setId(c.getString(c.getColumnIndexOrThrow(TableContracts.HHFormsTable.COLUMN_ID)));
                fc.setUid(c.getString(c.getColumnIndexOrThrow(TableContracts.HHFormsTable.COLUMN_UID)));
                fc.setLhwuid(c.getString(c.getColumnIndexOrThrow(TableContracts.HHFormsTable.COLUMN_LHW_UID)));
                fc.setSysDate(c.getString(c.getColumnIndexOrThrow(TableContracts.HHFormsTable.COLUMN_SYSDATE)));
                fc.setCluster(c.getString(c.getColumnIndexOrThrow(TableContracts.HHFormsTable.COLUMN_CLUSTER)));
                fc.setHhid(c.getString(c.getColumnIndexOrThrow(TableContracts.HHFormsTable.COLUMN_HHID)));
                fc.setiStatus(c.getString(c.getColumnIndexOrThrow(TableContracts.HHFormsTable.COLUMN_ISTATUS)));
                fc.setSynced(c.getString(c.getColumnIndexOrThrow(TableContracts.HHFormsTable.COLUMN_SYNCED)));
                allFC.add(fc);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }




    public String getWraName(String uid) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {TableContracts.MWRAListTable.COLUMN_SW1};

        String whereClause;
        whereClause = TableContracts.MWRAListTable.COLUMN_UID + "=?  ";

        String[] whereArgs = {uid};

        String groupBy = null;
        String having = null;

        String orderBy = TableContracts.MWRAListTable.COLUMN_ID + " ASC";

        MWRA mwra = null;
        try {
            c = db.query(
                    TableContracts.MWRAListTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                mwra = new MWRA();
                mwra.sW1Hydrate(c.getString(c.getColumnIndexOrThrow(TableContracts.MWRAListTable.COLUMN_SW1)));


            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return mwra.getW101();
    }


}