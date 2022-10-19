package edu.aku.hassannaqvi.lhwevaluation.models;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.lhwevaluation.BR;
import edu.aku.hassannaqvi.lhwevaluation.contracts.TableContracts;
import edu.aku.hassannaqvi.lhwevaluation.contracts.TableContracts.LHWHHTable;
import edu.aku.hassannaqvi.lhwevaluation.core.MainApp;

public class LHWHouseholds extends BaseObservable implements Observable {

    private final String TAG = "LHWHouseholds";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    private final String wuid = StringUtils.EMPTY;
    private final String cuid = StringUtils.EMPTY;
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = StringUtils.EMPTY;
    private String uid = StringUtils.EMPTY;
    private String luid = StringUtils.EMPTY;
    private String userName = StringUtils.EMPTY;
    private String sysDate = StringUtils.EMPTY;
    private String cluster = StringUtils.EMPTY;
    private String disctrict = StringUtils.EMPTY;
    private String hhid = StringUtils.EMPTY;
    private String deviceId = StringUtils.EMPTY;
    private String deviceTag = StringUtils.EMPTY;
    private String appver = StringUtils.EMPTY;
    private String endTime = StringUtils.EMPTY;
    private String iStatus = StringUtils.EMPTY;
    private String lhwCode = StringUtils.EMPTY;
    private String iStatus96x = StringUtils.EMPTY;
    private String synced = StringUtils.EMPTY;
    private String syncDate = StringUtils.EMPTY;

    // FIELD VARIABLES
    private String a101 = StringUtils.EMPTY;
    private String a102 = StringUtils.EMPTY;
    private String a103 = StringUtils.EMPTY;
    private String a104n = StringUtils.EMPTY;
    private String a104c = StringUtils.EMPTY;
    private final String sIdent = StringUtils.EMPTY;


   private String h101 = StringUtils.EMPTY;
    private String h102 = StringUtils.EMPTY;
    private String h103 = StringUtils.EMPTY;
    private String h104a = StringUtils.EMPTY;
    private String h104b = StringUtils.EMPTY;
    private String h104c = StringUtils.EMPTY;
    private String h104d = StringUtils.EMPTY;
    private String h104e = StringUtils.EMPTY;
    private String h104f = StringUtils.EMPTY;
    private String lhwphoto = StringUtils.EMPTY;


    public LHWHouseholds() {
    }


    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getLuid() {
        return luid;
    }

    public void setLuid(String luid) {
        this.luid = luid;
    }

    @Bindable
    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
        notifyPropertyChanged(BR.cluster);
    }

    @Bindable
    public String getHhid() {
        return hhid;
    }

    public void setHhid(String hhid) {
        this.hhid = hhid;
        notifyPropertyChanged(BR.hhid);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSysDate() {
        return sysDate;
    }

    public void setSysDate(String sysDate) {
        this.sysDate = sysDate;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceTag() {
        return deviceTag;
    }

    public void setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
    }

    public String getAppver() {
        return appver;
    }

    public void setAppver(String appver) {
        this.appver = appver;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getiStatus() {
        return iStatus;
    }

    public void setiStatus(String iStatus) {
        this.iStatus = iStatus;
    }

    public String getiStatus96x() {
        return iStatus96x;
    }

    public void setiStatus96x(String iStatus96x) {
        this.iStatus96x = iStatus96x;
    }

    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public String getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(String syncDate) {
        this.syncDate = syncDate;
    }

    public String getA101() {
        return a101;
    }

    public void setA101(String a101) {
        this.a101 = a101;
    }

    public String getA102() {
        return a102;
    }

    public void setA102(String a102) {
        this.a102 = a102;
    }

    public String getA103() {
        return a103;
    }

    public void setA103(String a103) {
        this.a103 = a103;
    }

    public String getA104n() {
        return a104n;
    }

    public void setA104n(String a104n) {
        this.a104n = a104n;
    }

    public String getA104c() {
        return a104c;
    }

    public void setA104c(String a104c) {
        this.a104c = a104c;
    }

    public String getLhwCode() {
        return lhwCode;
    }

    public void setLhwCode(String lhwCode) {
        this.lhwCode = lhwCode;
    }

    public String getDisctrict() {
        return disctrict;
    }

    public void setDisctrict(String disctrict) {
        this.disctrict = disctrict;
    }

    @Bindable
    public String getH101() {
        return h101;
    }

    public void setH101(String h101) {
        this.h101 = h101;
        notifyPropertyChanged(BR.h101);
    }

    @Bindable
    public String getH102() {
        return h102;
    }

    public void setH102(String h102) {
        this.h102 = h102;
        notifyPropertyChanged(BR.h102);
    }

    @Bindable
    public String getH103() {
        return h103;
    }

    public void setH103(String h103) {
        this.h103 = h103;
        notifyPropertyChanged(BR.h103);
    }

    @Bindable
    public String getH104a() {
        return h104a;
    }

    public void setH104a(String h104a) {
        this.h104a = h104a;
        notifyPropertyChanged(BR.h104a);
    }

    @Bindable
    public String getH104b() {
        return h104b;
    }

    public void setH104b(String h104b) {
        this.h104b = h104b;
        notifyPropertyChanged(BR.h104b);
    }

    @Bindable
    public String getH104c() {
        return h104c;
    }

    public void setH104c(String h104c) {
        this.h104c = h104c;
        notifyPropertyChanged(BR.h104c);
    }

    @Bindable
    public String getH104d() {
        return h104d;
    }

    public void setH104d(String h104d) {
        this.h104d = h104d;
        notifyPropertyChanged(BR.h104d);
    }

    @Bindable
    public String getH104e() {
        return h104e;
    }

    public void setH104e(String h104e) {
        this.h104e = h104e;
        notifyPropertyChanged(BR.h104e);
    }

    @Bindable
    public String getH104f() {
        return h104f;
    }

    public void setH104f(String h104f) {
        this.h104f = h104f;
        notifyPropertyChanged(BR.h104f);
    }

    @Bindable
    public String getLhwphoto() {
        return lhwphoto;
    }

    public void setLhwphoto(String lhwphoto) {
        this.lhwphoto = lhwphoto;
        notifyPropertyChanged(BR.lhwphoto);
    }


    public LHWHouseholds Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(LHWHHTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(LHWHHTable.COLUMN_UID));
        this.luid = cursor.getString(cursor.getColumnIndexOrThrow(LHWHHTable.COLUMN_UUID));
        this.cluster = cursor.getString(cursor.getColumnIndexOrThrow(LHWHHTable.COLUMN_CLUSTER));
        this.disctrict = cursor.getString(cursor.getColumnIndexOrThrow(LHWHHTable.COLUMN_DISTRICT));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(LHWHHTable.COLUMN_HHID));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(LHWHHTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(LHWHHTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(LHWHHTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(LHWHHTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(LHWHHTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(LHWHHTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(LHWHHTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(LHWHHTable.COLUMN_SYNCED_DATE));
        this.lhwCode = cursor.getString(cursor.getColumnIndexOrThrow(LHWHHTable.COLUMN_LHW_CODE));


        this.h101 = cursor.getString(cursor.getColumnIndexOrThrow(LHWHHTable.COLUMN_H101));
        this.h102 = cursor.getString(cursor.getColumnIndexOrThrow(LHWHHTable.COLUMN_H102));
        this.h103 = cursor.getString(cursor.getColumnIndexOrThrow(LHWHHTable.COLUMN_H103));
        this.h104a = cursor.getString(cursor.getColumnIndexOrThrow(LHWHHTable.COLUMN_H104A));
        this.h104b = cursor.getString(cursor.getColumnIndexOrThrow(LHWHHTable.COLUMN_H104B));
        this.h104c = cursor.getString(cursor.getColumnIndexOrThrow(LHWHHTable.COLUMN_H104C));
        this.h104d = cursor.getString(cursor.getColumnIndexOrThrow(LHWHHTable.COLUMN_H104D));
        this.h104e = cursor.getString(cursor.getColumnIndexOrThrow(LHWHHTable.COLUMN_H104E));
        this.h104f = cursor.getString(cursor.getColumnIndexOrThrow(LHWHHTable.COLUMN_H104F));
        this.lhwphoto = cursor.getString(cursor.getColumnIndexOrThrow(LHWHHTable.COLUMN_LHWPHOTO));

        sIdentHydrate(cursor.getString(cursor.getColumnIndexOrThrow(LHWHHTable.COLUMN_SIDENT)));

        return this;
    }

    public void sIdentHydrate(String string) throws JSONException {
        Log.d(TAG, "sA1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.a101 = json.getString("a101");
            this.a102 = json.getString("a102");
            this.a103 = json.getString("a103");
            this.a104n = json.getString("a104n");
            this.a104c = json.getString("a104c");

        }
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(LHWHHTable.COLUMN_ID, this.id);
        json.put(LHWHHTable.COLUMN_UID, this.uid);
        json.put(LHWHHTable.COLUMN_UUID, this.luid);
        json.put(LHWHHTable.COLUMN_CLUSTER, this.cluster);
        json.put(LHWHHTable.COLUMN_DISTRICT, this.disctrict);
        json.put(LHWHHTable.COLUMN_HHID, this.hhid);
        json.put(LHWHHTable.COLUMN_USERNAME, this.userName);
        json.put(LHWHHTable.COLUMN_SYSDATE, this.sysDate);
        json.put(LHWHHTable.COLUMN_DEVICEID, this.deviceId);
        json.put(LHWHHTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(LHWHHTable.COLUMN_ISTATUS, this.iStatus);
        json.put(LHWHHTable.COLUMN_LHW_CODE, this.lhwCode);

        json.put(LHWHHTable.COLUMN_H101, this.h101);
        json.put(LHWHHTable.COLUMN_H102, this.h102);
        json.put(LHWHHTable.COLUMN_H103, this.h103);
        json.put(LHWHHTable.COLUMN_H104A, this.h104a);
        json.put(LHWHHTable.COLUMN_H104B, this.h104b);
        json.put(LHWHHTable.COLUMN_H104C, this.h104c);
        json.put(LHWHHTable.COLUMN_H104D, this.h104d);
        json.put(LHWHHTable.COLUMN_H104E, this.h104e);
        json.put(LHWHHTable.COLUMN_H104F, this.h104f);
        json.put(LHWHHTable.COLUMN_LHWPHOTO, this.lhwphoto);

        json.put(TableContracts.LHWHHTable.COLUMN_SIDENT, new JSONObject(sIdenttoString()));

        return json;
    }

    public String sIdenttoString() throws JSONException {
            Log.d(TAG, "sA1toString: ");
            JSONObject json = new JSONObject();
            json.put("a101", a101)
                    .put("a102", a102)
                    .put("a103", a103)
                    .put("a104n", a104n)
                    .put("a104c", a104c);
            return json.toString();
        }



}
