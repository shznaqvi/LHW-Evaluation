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
import edu.aku.hassannaqvi.lhwevaluation.core.MainApp;

public class LHWGB_HH extends BaseObservable implements Observable {


    private final String TAG = "lhw_gb_hh";

    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = StringUtils.EMPTY;
    private String uid = StringUtils.EMPTY;
    private String uuid = StringUtils.EMPTY;
    private String muid = StringUtils.EMPTY;
    private String userName = StringUtils.EMPTY;
    private String sysDate = StringUtils.EMPTY;
    private String lhwCode = StringUtils.EMPTY;
    private String cluster = StringUtils.EMPTY;
    private String hhid = StringUtils.EMPTY;
    private String deviceId = StringUtils.EMPTY;
    private String deviceTag = StringUtils.EMPTY;
    private String appver = StringUtils.EMPTY;
    private String endTime = StringUtils.EMPTY;
    private String iStatus = StringUtils.EMPTY;
    private String iStatus96x = StringUtils.EMPTY;
    private String synced = StringUtils.EMPTY;
    private String syncDate = StringUtils.EMPTY;

    private String sGbv02 = StringUtils.EMPTY;


    public String g701 = StringUtils.EMPTY;
    public String g702 = StringUtils.EMPTY;
    public String g703 = StringUtils.EMPTY;
    public String g7041 = StringUtils.EMPTY;
    public String g7042 = StringUtils.EMPTY;
    public String g7043 = StringUtils.EMPTY;
    public String g706 = StringUtils.EMPTY;
    public String g706a = StringUtils.EMPTY;
    public String g706b = StringUtils.EMPTY;
    public String g706c = StringUtils.EMPTY;
    public String g706d = StringUtils.EMPTY;
    public String g706e = StringUtils.EMPTY;
    public String g706f = StringUtils.EMPTY;
    public String g706g = StringUtils.EMPTY;
    public String g706h = StringUtils.EMPTY;
    public String g706i = StringUtils.EMPTY;
    public String g70696 = StringUtils.EMPTY;
    public String g70696x = StringUtils.EMPTY;
    public String g801m = StringUtils.EMPTY;
    public String g801f = StringUtils.EMPTY;
    public String g802 = StringUtils.EMPTY;
    public String g803 = StringUtils.EMPTY;
    public String g804 = StringUtils.EMPTY;
    public String g805 = StringUtils.EMPTY;
    public String g806 = StringUtils.EMPTY;
    public String g807 = StringUtils.EMPTY;
    public String g807a = StringUtils.EMPTY;
    public String g807b = StringUtils.EMPTY;
    public String g807c = StringUtils.EMPTY;
    public String g807d = StringUtils.EMPTY;
    public String g807e = StringUtils.EMPTY;
    public String g80796 = StringUtils.EMPTY;
    public String g80796x = StringUtils.EMPTY;
    public String g808 = StringUtils.EMPTY;
    public String g809 = StringUtils.EMPTY;
    public String g809a = StringUtils.EMPTY;
    public String g809b = StringUtils.EMPTY;
    public String g809c = StringUtils.EMPTY;
    public String g809d = StringUtils.EMPTY;
    public String g809e = StringUtils.EMPTY;
    public String g80996 = StringUtils.EMPTY;
    public String g80996x = StringUtils.EMPTY;
    public String g9011 = StringUtils.EMPTY;
    public String g9012 = StringUtils.EMPTY;
    public String g9013 = StringUtils.EMPTY;
    public String g9014 = StringUtils.EMPTY;
    public String g9015 = StringUtils.EMPTY;
    public String g9021 = StringUtils.EMPTY;
    public String g9022 = StringUtils.EMPTY;
    public String g9023 = StringUtils.EMPTY;
    public String g9024 = StringUtils.EMPTY;
    public String g9025 = StringUtils.EMPTY;
    public String g903 = StringUtils.EMPTY;
    public String g903a = StringUtils.EMPTY;
    public String g903b = StringUtils.EMPTY;
    public String g903c = StringUtils.EMPTY;
    public String g903d = StringUtils.EMPTY;
    public String g903e = StringUtils.EMPTY;
    public String g90396 = StringUtils.EMPTY;
    public String g90396x = StringUtils.EMPTY;
    public String g904 = StringUtils.EMPTY;
    public String g904a = StringUtils.EMPTY;
    public String g904b = StringUtils.EMPTY;
    public String g904c = StringUtils.EMPTY;
    public String g904d = StringUtils.EMPTY;
    public String g904e = StringUtils.EMPTY;
    public String g904f = StringUtils.EMPTY;
    public String g90496 = StringUtils.EMPTY;
    public String g90496x = StringUtils.EMPTY;
    public String g9051 = StringUtils.EMPTY;
    public String g9052 = StringUtils.EMPTY;
    public String g9053 = StringUtils.EMPTY;
    public String g9054 = StringUtils.EMPTY;
    public String g9055 = StringUtils.EMPTY;
    public String g9056 = StringUtils.EMPTY;
    public String g9061 = StringUtils.EMPTY;
    public String g9062 = StringUtils.EMPTY;
    public String g9063 = StringUtils.EMPTY;
    public String g9064 = StringUtils.EMPTY;
    public String g9065 = StringUtils.EMPTY;
    public String g9066 = StringUtils.EMPTY;
    public String g907 = StringUtils.EMPTY;
    public String g90796x = StringUtils.EMPTY;
    public String g9081 = StringUtils.EMPTY;
    public String g9082 = StringUtils.EMPTY;
    public String g9083 = StringUtils.EMPTY;
    public String g9084 = StringUtils.EMPTY;
    public String g9085 = StringUtils.EMPTY;
    public String g9086 = StringUtils.EMPTY;
    public String g9087 = StringUtils.EMPTY;
    public String g9088 = StringUtils.EMPTY;
    public String g909 = StringUtils.EMPTY;
    public String g90996x = StringUtils.EMPTY;
    public String g1001 = StringUtils.EMPTY;
    public String g1002 = StringUtils.EMPTY;
    public String g1002a = StringUtils.EMPTY;
    public String g1002b = StringUtils.EMPTY;
    public String g1002c = StringUtils.EMPTY;
    public String g1002d = StringUtils.EMPTY;
    public String g1002e = StringUtils.EMPTY;
    public String g1002f = StringUtils.EMPTY;
    public String g1002g = StringUtils.EMPTY;
    public String g100296 = StringUtils.EMPTY;
    public String g100296x = StringUtils.EMPTY;
    public String g1003 = StringUtils.EMPTY;
    public String g100396x = StringUtils.EMPTY;
    public String g1004 = StringUtils.EMPTY;
    public String g1005 = StringUtils.EMPTY;
    public String g1005a = StringUtils.EMPTY;
    public String g1005b = StringUtils.EMPTY;
    public String g1005c = StringUtils.EMPTY;
    public String g100596 = StringUtils.EMPTY;
    public String g100596x = StringUtils.EMPTY;
    public String g1006 = StringUtils.EMPTY;
    public String g1006a = StringUtils.EMPTY;
    public String g1006b = StringUtils.EMPTY;
    public String g1006c = StringUtils.EMPTY;
    public String g1006d = StringUtils.EMPTY;
    public String g1006e = StringUtils.EMPTY;
    public String g100696 = StringUtils.EMPTY;
    public String g100696x = StringUtils.EMPTY;
    public String g1007 = StringUtils.EMPTY;
    public String g1008 = StringUtils.EMPTY;
    public String g1008a = StringUtils.EMPTY;
    public String g1008b = StringUtils.EMPTY;
    public String g1008c = StringUtils.EMPTY;
    public String g100896 = StringUtils.EMPTY;
    public String g100896x = StringUtils.EMPTY;
    public String g100898 = StringUtils.EMPTY;
    public String g1009 = StringUtils.EMPTY;
    public String g1009a = StringUtils.EMPTY;
    public String g1009b = StringUtils.EMPTY;
    public String g1009c = StringUtils.EMPTY;
    public String g1010 = StringUtils.EMPTY;
    public String g1011 = StringUtils.EMPTY;
    public String g1011a = StringUtils.EMPTY;
    public String g1011b = StringUtils.EMPTY;
    public String g1011c = StringUtils.EMPTY;
    public String g1011d = StringUtils.EMPTY;
    public String g1011e = StringUtils.EMPTY;
    public String g1011f = StringUtils.EMPTY;
    public String g101196 = StringUtils.EMPTY;
    public String g101196x = StringUtils.EMPTY;


    public LHWGB_HH() {
    }

    public void populateMeta() {

        setSysDate(MainApp.hhForm.getSysDate());
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setUuid(MainApp.hhForm.getUid());  // not applicable in Form table
        setAppver(MainApp.appInfo.getAppVersion());
        setCluster(MainApp.hhForm.getLhwCode());
        setHhid(MainApp.hhForm.getKhandandNo());
        setMuid(MainApp.mwra.getUid());


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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getMuid() {
        return muid;
    }

    public void setMuid(String muid) {
        this.muid = muid;
    }

    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
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

    public String getLhwCode() {
        return lhwCode;
    }

    public void setLhwCode(String lhwCode) {
        this.lhwCode = lhwCode;
    }

    public String getHhid() {
        return hhid;
    }

    public void setHhid(String hhid) {
        this.hhid = hhid;
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

    public String getsGbv02() {
        return sGbv02;
    }

    public void setsGbv02(String sGbv02) {
        this.sGbv02 = sGbv02;
    }

    @Bindable
    public String getG701() {
        return g701;
    }

    public void setG701(String g701) {
        this.g701 = g701;
        notifyPropertyChanged(BR.g701);
    }

    @Bindable
    public String getG702() {
        return g702;
    }

    public void setG702(String g702) {
        this.g702 = g702;
        notifyPropertyChanged(BR.g702);
    }

    @Bindable
    public String getG703() {
        return g703;
    }

    public void setG703(String g703) {
        this.g703 = g703;
        notifyPropertyChanged(BR.g703);
    }

    @Bindable
    public String getG7041() {
        return g7041;
    }

    public void setG7041(String g7041) {
        this.g7041 = g7041;
        setG706a(g7041.equals("1") || g7042.equals("1") || g7043.equals("1") ? this.g706a : "");
        setG706b(g7041.equals("1") || g7042.equals("1") || g7043.equals("1") ? this.g706b : "");
        setG706c(g7041.equals("1") || g7042.equals("1") || g7043.equals("1") ? this.g706c : "");
        setG706d(g7041.equals("1") || g7042.equals("1") || g7043.equals("1") ? this.g706d : "");
        setG706e(g7041.equals("1") || g7042.equals("1") || g7043.equals("1") ? this.g706e : "");
        setG706f(g7041.equals("1") || g7042.equals("1") || g7043.equals("1") ? this.g706f : "");
        setG706g(g7041.equals("1") || g7042.equals("1") || g7043.equals("1") ? this.g706g : "");
        setG706h(g7041.equals("1") || g7042.equals("1") || g7043.equals("1") ? this.g706h : "");
        setG706i(g7041.equals("1") || g7042.equals("1") || g7043.equals("1") ? this.g706i : "");
        setG70696(g7041.equals("1") || g7042.equals("1") || g7043.equals("1") ? this.g70696 : "");

        notifyPropertyChanged(BR.g7041);
    }

    @Bindable
    public String getG7042() {
        return g7042;
    }

    public void setG7042(String g7042) {
        this.g7042 = g7042;
        setG706a(g7041.equals("1") || g7042.equals("1") || g7043.equals("1") ? this.g706a : "");
        setG706b(g7041.equals("1") || g7042.equals("1") || g7043.equals("1") ? this.g706b : "");
        setG706c(g7041.equals("1") || g7042.equals("1") || g7043.equals("1") ? this.g706c : "");
        setG706d(g7041.equals("1") || g7042.equals("1") || g7043.equals("1") ? this.g706d : "");
        setG706e(g7041.equals("1") || g7042.equals("1") || g7043.equals("1") ? this.g706e : "");
        setG706f(g7041.equals("1") || g7042.equals("1") || g7043.equals("1") ? this.g706f : "");
        setG706g(g7041.equals("1") || g7042.equals("1") || g7043.equals("1") ? this.g706g : "");
        setG706h(g7041.equals("1") || g7042.equals("1") || g7043.equals("1") ? this.g706h : "");
        setG706i(g7041.equals("1") || g7042.equals("1") || g7043.equals("1") ? this.g706i : "");
        setG70696(g7041.equals("1") || g7042.equals("1") || g7043.equals("1") ? this.g70696 : "");
        notifyPropertyChanged(BR.g7042);
    }

    @Bindable
    public String getG7043() {
        return g7043;
    }

    public void setG7043(String g7043) {
        this.g7043 = g7043;
        setG706a(g7041.equals("1") || g7042.equals("1") || g7043.equals("1") ? this.g706a : "");
        setG706b(g7041.equals("1") || g7042.equals("1") || g7043.equals("1") ? this.g706b : "");
        setG706c(g7041.equals("1") || g7042.equals("1") || g7043.equals("1") ? this.g706c : "");
        setG706d(g7041.equals("1") || g7042.equals("1") || g7043.equals("1") ? this.g706d : "");
        setG706e(g7041.equals("1") || g7042.equals("1") || g7043.equals("1") ? this.g706e : "");
        setG706f(g7041.equals("1") || g7042.equals("1") || g7043.equals("1") ? this.g706f : "");
        setG706g(g7041.equals("1") || g7042.equals("1") || g7043.equals("1") ? this.g706g : "");
        setG706h(g7041.equals("1") || g7042.equals("1") || g7043.equals("1") ? this.g706h : "");
        setG706i(g7041.equals("1") || g7042.equals("1") || g7043.equals("1") ? this.g706i : "");
        setG70696(g7041.equals("1") || g7042.equals("1") || g7043.equals("1") ? this.g70696 : "");
        notifyPropertyChanged(BR.g7043);
    }

    @Bindable
    public String getG706() {
        return g706;
    }

    public void setG706(String g706) {
        this.g706 = g706;
        notifyPropertyChanged(BR.g706);
    }

    @Bindable
    public String getG706a() {
        return g706a;
    }

    public void setG706a(String g706a) {
        if (this.g706a.equals(g706a)) return;
        this.g706a = g706a;
        notifyPropertyChanged(BR.g706a);
    }

    @Bindable
    public String getG706b() {
        return g706b;
    }

    public void setG706b(String g706b) {
        if (this.g706b.equals(g706b)) return;
        this.g706b = g706b;
        notifyPropertyChanged(BR.g706b);
    }

    @Bindable
    public String getG706c() {
        return g706c;
    }

    public void setG706c(String g706c) {
        if (this.g706c.equals(g706c)) return;
        this.g706c = g706c;
        notifyPropertyChanged(BR.g706c);
    }

    @Bindable
    public String getG706d() {
        return g706d;
    }

    public void setG706d(String g706d) {
        if (this.g706d.equals(g706d)) return;
        this.g706d = g706d;
        notifyPropertyChanged(BR.g706d);
    }

    @Bindable
    public String getG706e() {
        return g706e;
    }

    public void setG706e(String g706e) {
        if (this.g706e.equals(g706e)) return;
        this.g706e = g706e;
        notifyPropertyChanged(BR.g706e);
    }

    @Bindable
    public String getG706f() {
        return g706f;
    }

    public void setG706f(String g706f) {
        if (this.g706f.equals(g706f)) return;
        this.g706f = g706f;
        notifyPropertyChanged(BR.g706f);
    }

    @Bindable
    public String getG706g() {
        return g706g;
    }

    public void setG706g(String g706g) {
        if (this.g706g.equals(g706g)) return;
        this.g706g = g706g;
        notifyPropertyChanged(BR.g706g);
    }

    @Bindable
    public String getG706h() {
        return g706h;
    }

    public void setG706h(String g706h) {
        if (this.g706h.equals(g706h)) return;
        this.g706h = g706h;
        notifyPropertyChanged(BR.g706h);
    }

    @Bindable
    public String getG706i() {
        return g706i;
    }

    public void setG706i(String g706i) {
        if (this.g706i.equals(g706i)) return;
        this.g706i = g706i;
        notifyPropertyChanged(BR.g706i);
    }

    @Bindable
    public String getG70696() {
        return g70696;
    }

    public void setG70696(String g70696) {
        if (this.g70696.equals(g70696)) return;
        this.g70696 = g70696;
        setG70696x(g70696.equals("96") ? this.g70696x : "");
        notifyPropertyChanged(BR.g70696);
    }

    @Bindable
    public String getG70696x() {
        return g70696x;
    }

    public void setG70696x(String g70696x) {
        this.g70696x = g70696x;
        notifyPropertyChanged(BR.g70696x);
    }

    @Bindable
    public String getG801m() {
        return g801m;
    }

    public void setG801m(String g801m) {
        this.g801m = g801m;
        notifyPropertyChanged(BR.g801m);
    }

    @Bindable
    public String getG801f() {
        return g801f;
    }

    public void setG801f(String g801f) {
        this.g801f = g801f;
        notifyPropertyChanged(BR.g801f);
    }

    @Bindable
    public String getG802() {
        return g802;
    }

    public void setG802(String g802) {
        this.g802 = g802;
        notifyPropertyChanged(BR.g802);
    }

    @Bindable
    public String getG803() {
        return g803;
    }

    public void setG803(String g803) {
        this.g803 = g803;
        notifyPropertyChanged(BR.g803);
    }

    @Bindable
    public String getG804() {
        return g804;
    }

    public void setG804(String g804) {
        this.g804 = g804;
        notifyPropertyChanged(BR.g804);
    }

    @Bindable
    public String getG805() {
        return g805;
    }

    public void setG805(String g805) {
        this.g805 = g805;
        notifyPropertyChanged(BR.g805);
    }

    @Bindable
    public String getG806() {
        return g806;
    }

    public void setG806(String g806) {
        this.g806 = g806;
        setG807a(g806.equals("1") ? this.g807a : "");
        setG807b(g806.equals("1") ? this.g807b : "");
        setG807c(g806.equals("1") ? this.g807c : "");
        setG807d(g806.equals("1") ? this.g807d : "");
        setG807e(g806.equals("1") ? this.g807e : "");
        setG80796(g806.equals("1") ? this.g80796 : "");
        notifyPropertyChanged(BR.g806);
    }

    @Bindable
    public String getG807() {
        return g807;
    }

    public void setG807(String g807) {
        this.g807 = g807;
        notifyPropertyChanged(BR.g807);
    }

    @Bindable
    public String getG807a() {
        return g807a;
    }

    public void setG807a(String g807a) {
        if (this.g807a.equals(g807a)) return;
        this.g807a = g807a;
        notifyPropertyChanged(BR.g807a);
    }

    @Bindable
    public String getG807b() {
        return g807b;
    }

    public void setG807b(String g807b) {
        if (this.g807b.equals(g807b)) return;
        this.g807b = g807b;
        notifyPropertyChanged(BR.g807b);
    }

    @Bindable
    public String getG807c() {
        return g807c;
    }

    public void setG807c(String g807c) {
        if (this.g807c.equals(g807c)) return;
        this.g807c = g807c;
        notifyPropertyChanged(BR.g807c);
    }

    @Bindable
    public String getG807d() {
        return g807d;
    }

    public void setG807d(String g807d) {
        if (this.g807d.equals(g807d)) return;
        this.g807d = g807d;
        notifyPropertyChanged(BR.g807d);
    }

    @Bindable
    public String getG807e() {
        return g807e;
    }

    public void setG807e(String g807e) {
        if (this.g807e.equals(g807e)) return;
        this.g807e = g807e;
        notifyPropertyChanged(BR.g807e);
    }

    @Bindable
    public String getG80796() {
        return g80796;
    }

    public void setG80796(String g80796) {
        if (this.g80796.equals(g80796)) return;
        this.g80796 = g80796;
        setG80796x(g80796.equals("96") ? this.g80796x : "");
        notifyPropertyChanged(BR.g80796);
    }

    @Bindable
    public String getG80796x() {
        return g80796x;
    }

    public void setG80796x(String g80796x) {
        this.g80796x = g80796x;
        notifyPropertyChanged(BR.g80796x);
    }

    @Bindable
    public String getG808() {
        return g808;
    }

    public void setG808(String g808) {
        this.g808 = g808;
        setG809a(g808.equals("1") ? this.g809a : "");
        setG809b(g808.equals("1") ? this.g809b : "");
        setG809c(g808.equals("1") ? this.g809c : "");
        setG809d(g808.equals("1") ? this.g809d : "");
        setG809e(g808.equals("1") ? this.g809e : "");
        setG80996(g808.equals("1") ? this.g80996 : "");

        notifyPropertyChanged(BR.g808);
    }

    @Bindable
    public String getG809() {
        return g809;
    }

    public void setG809(String g809) {
        this.g809 = g809;
        notifyPropertyChanged(BR.g809);
    }

    @Bindable
    public String getG809a() {
        return g809a;
    }

    public void setG809a(String g809a) {
        if (this.g809a.equals(g809a)) return;
        this.g809a = g809a;
        notifyPropertyChanged(BR.g809a);
    }

    @Bindable
    public String getG809b() {
        return g809b;
    }

    public void setG809b(String g809b) {
        if (this.g809b.equals(g809b)) return;
        this.g809b = g809b;
        notifyPropertyChanged(BR.g809b);
    }

    @Bindable
    public String getG809c() {
        return g809c;
    }

    public void setG809c(String g809c) {
        if (this.g809c.equals(g809c)) return;
        this.g809c = g809c;
        notifyPropertyChanged(BR.g809c);
    }

    @Bindable
    public String getG809d() {
        return g809d;
    }

    public void setG809d(String g809d) {
        if (this.g809d.equals(g809d)) return;
        this.g809d = g809d;
        notifyPropertyChanged(BR.g809d);
    }

    @Bindable
    public String getG809e() {
        return g809e;
    }

    public void setG809e(String g809e) {
        if (this.g809e.equals(g809e)) return;
        this.g809e = g809e;
        notifyPropertyChanged(BR.g809e);
    }

    @Bindable
    public String getG80996() {
        return g80996;
    }

    public void setG80996(String g80996) {
        if (this.g80996.equals(g80996)) return;
        this.g80996 = g80996;
        setG80996x(g80996.equals("96") ? this.g80996x : "");
        notifyPropertyChanged(BR.g80996);
    }

    @Bindable
    public String getG80996x() {
        return g80996x;
    }

    public void setG80996x(String g80996x) {
        this.g80996x = g80996x;
        notifyPropertyChanged(BR.g80996x);
    }

    @Bindable
    public String getG9011() {
        return g9011;
    }

    public void setG9011(String g9011) {
        this.g9011 = g9011;
        notifyPropertyChanged(BR.g9011);
    }

    @Bindable
    public String getG9012() {
        return g9012;
    }

    public void setG9012(String g9012) {
        this.g9012 = g9012;
        notifyPropertyChanged(BR.g9012);
    }

    @Bindable
    public String getG9013() {
        return g9013;
    }

    public void setG9013(String g9013) {
        this.g9013 = g9013;
        notifyPropertyChanged(BR.g9013);
    }

    @Bindable
    public String getG9014() {
        return g9014;
    }

    public void setG9014(String g9014) {
        this.g9014 = g9014;
        notifyPropertyChanged(BR.g9014);
    }

    @Bindable
    public String getG9015() {
        return g9015;
    }

    public void setG9015(String g9015) {
        this.g9015 = g9015;
        notifyPropertyChanged(BR.g9015);
    }

    @Bindable
    public String getG9021() {
        return g9021;
    }

    public void setG9021(String g9021) {
        this.g9021 = g9021;
        notifyPropertyChanged(BR.g9021);
    }

    @Bindable
    public String getG9022() {
        return g9022;
    }

    public void setG9022(String g9022) {
        this.g9022 = g9022;
        notifyPropertyChanged(BR.g9022);
    }

    @Bindable
    public String getG9023() {
        return g9023;
    }

    public void setG9023(String g9023) {
        this.g9023 = g9023;
        notifyPropertyChanged(BR.g9023);
    }

    @Bindable
    public String getG9024() {
        return g9024;
    }

    public void setG9024(String g9024) {
        this.g9024 = g9024;
        notifyPropertyChanged(BR.g9024);
    }

    @Bindable
    public String getG9025() {
        return g9025;
    }

    public void setG9025(String g9025) {
        this.g9025 = g9025;
        notifyPropertyChanged(BR.g9025);
    }

    @Bindable
    public String getG903() {
        return g903;
    }

    public void setG903(String g903) {
        this.g903 = g903;
        notifyPropertyChanged(BR.g903);
    }

    @Bindable
    public String getG903a() {
        return g903a;
    }

    public void setG903a(String g903a) {
        if (this.g903a.equals(g903a)) return;
        this.g903a = g903a;
        notifyPropertyChanged(BR.g903a);
    }

    @Bindable
    public String getG903b() {
        return g903b;
    }

    public void setG903b(String g903b) {
        if (this.g903b.equals(g903b)) return;
        this.g903b = g903b;
        notifyPropertyChanged(BR.g903b);
    }

    @Bindable
    public String getG903c() {
        return g903c;
    }

    public void setG903c(String g903c) {
        if (this.g903c.equals(g903c)) return;
        this.g903c = g903c;
        notifyPropertyChanged(BR.g903c);
    }

    @Bindable
    public String getG903d() {
        return g903d;
    }

    public void setG903d(String g903d) {
        if (this.g903d.equals(g903d)) return;
        this.g903d = g903d;
        notifyPropertyChanged(BR.g903d);
    }

    @Bindable
    public String getG903e() {
        return g903e;
    }

    public void setG903e(String g903e) {
        if (this.g903e.equals(g903e)) return;
        this.g903e = g903e;
        notifyPropertyChanged(BR.g903e);
    }

    @Bindable
    public String getG90396() {
        return g90396;
    }

    public void setG90396(String g90396) {
        if (this.g90396.equals(g90396)) return;
        this.g90396 = g90396;
        setG90396x(g90396.equals("96") ? this.g90396x : "");
        notifyPropertyChanged(BR.g90396);
    }

    @Bindable
    public String getG90396x() {
        return g90396x;
    }

    public void setG90396x(String g90396x) {
        this.g90396x = g90396x;
        notifyPropertyChanged(BR.g90396x);
    }

    @Bindable
    public String getG904() {
        return g904;
    }

    public void setG904(String g904) {
        this.g904 = g904;
        notifyPropertyChanged(BR.g904);
    }

    @Bindable
    public String getG904a() {
        return g904a;
    }

    public void setG904a(String g904a) {
        if (this.g904a.equals(g904a)) return;
        this.g904a = g904a;
        notifyPropertyChanged(BR.g904a);
    }

    @Bindable
    public String getG904b() {
        return g904b;
    }

    public void setG904b(String g904b) {
        if (this.g904b.equals(g904b)) return;
        this.g904b = g904b;
        notifyPropertyChanged(BR.g904b);
    }

    @Bindable
    public String getG904c() {
        return g904c;
    }

    public void setG904c(String g904c) {
        if (this.g904c.equals(g904c)) return;
        this.g904c = g904c;
        notifyPropertyChanged(BR.g904c);
    }

    @Bindable
    public String getG904d() {
        return g904d;
    }

    public void setG904d(String g904d) {
        if (this.g904d.equals(g904d)) return;
        this.g904d = g904d;
        notifyPropertyChanged(BR.g904d);
    }

    @Bindable
    public String getG904e() {
        return g904e;
    }

    public void setG904e(String g904e) {
        if (this.g904e.equals(g904e)) return;
        this.g904e = g904e;
        notifyPropertyChanged(BR.g904e);
    }

    @Bindable
    public String getG904f() {
        return g904f;
    }

    public void setG904f(String g904f) {
        if (this.g904f.equals(g904f)) return;
        this.g904f = g904f;
        notifyPropertyChanged(BR.g904f);
    }

    @Bindable
    public String getG90496() {
        return g90496;
    }

    public void setG90496(String g90496) {
        if (this.g90496.equals(g90496)) return;
        this.g90496 = g90496;
        setG90496x(g90496.equals("96") ? this.g90496x : "");
        notifyPropertyChanged(BR.g90496);
    }

    @Bindable
    public String getG90496x() {
        return g90496x;
    }

    public void setG90496x(String g90496x) {
        this.g90496x = g90496x;
        notifyPropertyChanged(BR.g90496x);
    }

    @Bindable
    public String getG9051() {
        return g9051;
    }

    public void setG9051(String g9051) {
        this.g9051 = g9051;
        notifyPropertyChanged(BR.g9051);
    }

    @Bindable
    public String getG9052() {
        return g9052;
    }

    public void setG9052(String g9052) {
        this.g9052 = g9052;
        notifyPropertyChanged(BR.g9052);
    }

    @Bindable
    public String getG9053() {
        return g9053;
    }

    public void setG9053(String g9053) {
        this.g9053 = g9053;
        notifyPropertyChanged(BR.g9053);
    }

    @Bindable
    public String getG9054() {
        return g9054;
    }

    public void setG9054(String g9054) {
        this.g9054 = g9054;
        notifyPropertyChanged(BR.g9054);
    }

    @Bindable
    public String getG9055() {
        return g9055;
    }

    public void setG9055(String g9055) {
        this.g9055 = g9055;
        notifyPropertyChanged(BR.g9055);
    }

    @Bindable
    public String getG9056() {
        return g9056;
    }

    public void setG9056(String g9056) {
        this.g9056 = g9056;
        notifyPropertyChanged(BR.g9056);
    }

    @Bindable
    public String getG9061() {
        return g9061;
    }

    public void setG9061(String g9061) {
        this.g9061 = g9061;
        notifyPropertyChanged(BR.g9061);
    }

    @Bindable
    public String getG9062() {
        return g9062;
    }

    public void setG9062(String g9062) {
        this.g9062 = g9062;
        notifyPropertyChanged(BR.g9062);
    }

    @Bindable
    public String getG9063() {
        return g9063;
    }

    public void setG9063(String g9063) {
        this.g9063 = g9063;
        notifyPropertyChanged(BR.g9063);
    }

    @Bindable
    public String getG9064() {
        return g9064;
    }

    public void setG9064(String g9064) {
        this.g9064 = g9064;
        notifyPropertyChanged(BR.g9064);
    }

    @Bindable
    public String getG9065() {
        return g9065;
    }

    public void setG9065(String g9065) {
        this.g9065 = g9065;
        notifyPropertyChanged(BR.g9065);
    }

    @Bindable
    public String getG9066() {
        return g9066;
    }

    public void setG9066(String g9066) {
        this.g9066 = g9066;
        notifyPropertyChanged(BR.g9066);
    }

    @Bindable
    public String getG907() {
        return g907;
    }

    public void setG907(String g907) {
        this.g907 = g907;
        setG90796x(g907.equals("96") ? this.g90796x : "");
        notifyPropertyChanged(BR.g907);
    }

    @Bindable
    public String getG90796x() {
        return g90796x;
    }

    public void setG90796x(String g90796x) {
        this.g90796x = g90796x;
        notifyPropertyChanged(BR.g90796x);
    }

    @Bindable
    public String getG9081() {
        return g9081;
    }

    public void setG9081(String g9081) {
        this.g9081 = g9081;
        notifyPropertyChanged(BR.g9081);
    }

    @Bindable
    public String getG9082() {
        return g9082;
    }

    public void setG9082(String g9082) {
        this.g9082 = g9082;
        notifyPropertyChanged(BR.g9082);
    }

    @Bindable
    public String getG9083() {
        return g9083;
    }

    public void setG9083(String g9083) {
        this.g9083 = g9083;
        notifyPropertyChanged(BR.g9083);
    }

    @Bindable
    public String getG9084() {
        return g9084;
    }

    public void setG9084(String g9084) {
        this.g9084 = g9084;
        notifyPropertyChanged(BR.g9084);
    }

    @Bindable
    public String getG9085() {
        return g9085;
    }

    public void setG9085(String g9085) {
        this.g9085 = g9085;
        notifyPropertyChanged(BR.g9085);
    }

    @Bindable
    public String getG9086() {
        return g9086;
    }

    public void setG9086(String g9086) {
        this.g9086 = g9086;
        notifyPropertyChanged(BR.g9086);
    }

    @Bindable
    public String getG9087() {
        return g9087;
    }

    public void setG9087(String g9087) {
        this.g9087 = g9087;
        notifyPropertyChanged(BR.g9087);
    }

    @Bindable
    public String getG9088() {
        return g9088;
    }

    public void setG9088(String g9088) {
        this.g9088 = g9088;
        notifyPropertyChanged(BR.g9088);
    }

    @Bindable
    public String getG909() {
        return g909;
    }

    public void setG909(String g909) {
        this.g909 = g909;
        setG90996x(g909.equals("96") ? this.g90996x : "");
        notifyPropertyChanged(BR.g909);
    }

    @Bindable
    public String getG90996x() {
        return g90996x;
    }

    public void setG90996x(String g90996x) {
        this.g90996x = g90996x;
        notifyPropertyChanged(BR.g90996x);
    }

    @Bindable
    public String getG1001() {
        return g1001;
    }

    public void setG1001(String g1001) {
        this.g1001 = g1001;
        notifyPropertyChanged(BR.g1001);
    }

    @Bindable
    public String getG1002() {
        return g1002;
    }

    public void setG1002(String g1002) {
        this.g1002 = g1002;
        notifyPropertyChanged(BR.g1002);
    }

    @Bindable
    public String getG1002a() {
        return g1002a;
    }

    public void setG1002a(String g1002a) {
        if (this.g1002a.equals(g1002a)) return;
        this.g1002a = g1002a;
        notifyPropertyChanged(BR.g1002a);
    }

    @Bindable
    public String getG1002b() {
        return g1002b;
    }

    public void setG1002b(String g1002b) {
        if (this.g1002b.equals(g1002b)) return;
        this.g1002b = g1002b;
        notifyPropertyChanged(BR.g1002b);
    }

    @Bindable
    public String getG1002c() {
        return g1002c;
    }

    public void setG1002c(String g1002c) {
        if (this.g1002c.equals(g1002c)) return;
        this.g1002c = g1002c;
        notifyPropertyChanged(BR.g1002c);
    }

    @Bindable
    public String getG1002d() {
        return g1002d;
    }

    public void setG1002d(String g1002d) {
        if (this.g1002d.equals(g1002d)) return;
        this.g1002d = g1002d;
        notifyPropertyChanged(BR.g1002d);
    }

    @Bindable
    public String getG1002e() {
        return g1002e;
    }

    public void setG1002e(String g1002e) {
        if (this.g1002e.equals(g1002e)) return;
        this.g1002e = g1002e;
        notifyPropertyChanged(BR.g1002e);
    }

    @Bindable
    public String getG1002f() {
        return g1002f;
    }

    public void setG1002f(String g1002f) {
        if (this.g1002f.equals(g1002f)) return;
        this.g1002f = g1002f;
        notifyPropertyChanged(BR.g1002f);
    }

    @Bindable
    public String getG1002g() {
        return g1002g;
    }

    public void setG1002g(String g1002g) {
        if (this.g1002g.equals(g1002g)) return;
        this.g1002g = g1002g;
        notifyPropertyChanged(BR.g1002g);
    }

    @Bindable
    public String getG100296() {
        return g100296;
    }

    public void setG100296(String g100296) {
        if (this.g100296.equals(g100296)) return;
        this.g100296 = g100296;
        setG100296x(g100296.equals("96") ? this.g100296x : "");
        notifyPropertyChanged(BR.g100296);
    }

    @Bindable
    public String getG100296x() {
        return g100296x;
    }

    public void setG100296x(String g100296x) {
        this.g100296x = g100296x;
        notifyPropertyChanged(BR.g100296x);
    }

    @Bindable
    public String getG1003() {
        return g1003;
    }

    public void setG1003(String g1003) {
        this.g1003 = g1003;
        setG100396x(g1003.equals("96") ? this.g100396x : "");
        notifyPropertyChanged(BR.g1003);
    }

    @Bindable
    public String getG100396x() {
        return g100396x;
    }

    public void setG100396x(String g100396x) {
        this.g100396x = g100396x;
        notifyPropertyChanged(BR.g100396x);
    }

    @Bindable
    public String getG1004() {
        return g1004;
    }

    public void setG1004(String g1004) {
        this.g1004 = g1004;
        notifyPropertyChanged(BR.g1004);
    }

    @Bindable
    public String getG1005() {
        return g1005;
    }

    public void setG1005(String g1005) {
        this.g1005 = g1005;
        notifyPropertyChanged(BR.g1005);
    }

    @Bindable
    public String getG1005a() {
        return g1005a;
    }

    public void setG1005a(String g1005a) {
        if (this.g1005a.equals(g1005a)) return;
        this.g1005a = g1005a;
        notifyPropertyChanged(BR.g1005a);
    }

    @Bindable
    public String getG1005b() {
        return g1005b;
    }

    public void setG1005b(String g1005b) {
        if (this.g1005b.equals(g1005b)) return;
        this.g1005b = g1005b;
        notifyPropertyChanged(BR.g1005b);
    }

    @Bindable
    public String getG1005c() {
        return g1005c;
    }

    public void setG1005c(String g1005c) {
        if (this.g1005c.equals(g1005c)) return;
        this.g1005c = g1005c;
        notifyPropertyChanged(BR.g1005c);
    }

    @Bindable
    public String getG100596() {
        return g100596;
    }

    public void setG100596(String g100596) {
        if (this.g100596.equals(g100596)) return;
        this.g100596 = g100596;
        setG100596x(g100596.equals("96") ? this.g100596x : "");
        notifyPropertyChanged(BR.g100596);
    }

    @Bindable
    public String getG100596x() {
        return g100596x;
    }

    public void setG100596x(String g100596x) {
        this.g100596x = g100596x;
        notifyPropertyChanged(BR.g100596x);
    }

    @Bindable
    public String getG1006() {
        return g1006;
    }

    public void setG1006(String g1006) {
        this.g1006 = g1006;
        notifyPropertyChanged(BR.g1006);
    }

    @Bindable
    public String getG1006a() {
        return g1006a;
    }

    public void setG1006a(String g1006a) {
        if (this.g1006a.equals(g1006a)) return;
        this.g1006a = g1006a;
        notifyPropertyChanged(BR.g1006a);
    }

    @Bindable
    public String getG1006b() {
        return g1006b;
    }

    public void setG1006b(String g1006b) {
        if (this.g1006b.equals(g1006b)) return;
        this.g1006b = g1006b;
        notifyPropertyChanged(BR.g1006b);
    }

    @Bindable
    public String getG1006c() {
        return g1006c;
    }

    public void setG1006c(String g1006c) {
        if (this.g1006c.equals(g1006c)) return;
        this.g1006c = g1006c;
        notifyPropertyChanged(BR.g1006c);
    }

    @Bindable
    public String getG1006d() {
        return g1006d;
    }

    public void setG1006d(String g1006d) {
        if (this.g1006d.equals(g1006d)) return;
        this.g1006d = g1006d;
        notifyPropertyChanged(BR.g1006d);
    }

    @Bindable
    public String getG1006e() {
        return g1006e;
    }

    public void setG1006e(String g1006e) {
        if (this.g1006e.equals(g1006e)) return;
        this.g1006e = g1006e;
        notifyPropertyChanged(BR.g1006e);
    }

    @Bindable
    public String getG100696() {
        return g100696;
    }

    public void setG100696(String g100696) {
        if (this.g100696.equals(g100696)) return;
        this.g100696 = g100696;
        setG100696x(g100696.equals("96") ? this.g100696x : "");
        notifyPropertyChanged(BR.g100696);
    }

    @Bindable
    public String getG100696x() {
        return g100696x;
    }

    public void setG100696x(String g100696x) {
        this.g100696x = g100696x;
        notifyPropertyChanged(BR.g100696x);
    }

    @Bindable
    public String getG1007() {
        return g1007;
    }

    public void setG1007(String g1007) {
        this.g1007 = g1007;
        notifyPropertyChanged(BR.g1007);
    }

    @Bindable
    public String getG1008() {
        return g1008;
    }

    public void setG1008(String g1008) {
        this.g1008 = g1008;
        notifyPropertyChanged(BR.g1008);
    }

    @Bindable
    public String getG1008a() {
        return g1008a;
    }

    public void setG1008a(String g1008a) {
        if (this.g1008a.equals(g1008a)) return;
        this.g1008a = g1008a;
        notifyPropertyChanged(BR.g1008a);
    }

    @Bindable
    public String getG1008b() {
        return g1008b;
    }

    public void setG1008b(String g1008b) {
        if (this.g1008b.equals(g1008b)) return;
        this.g1008b = g1008b;
        notifyPropertyChanged(BR.g1008b);
    }

    @Bindable
    public String getG1008c() {
        return g1008c;
    }

    public void setG1008c(String g1008c) {
        if (this.g1008c.equals(g1008c)) return;
        this.g1008c = g1008c;
        notifyPropertyChanged(BR.g1008c);
    }

    @Bindable
    public String getG100896() {
        return g100896;
    }

    public void setG100896(String g100896) {
        if (this.g100896.equals(g100896)) return;
        this.g100896 = g100896;
        setG100896x(g100896.equals("96") ? this.g100896x : "");
        notifyPropertyChanged(BR.g100896);
    }

    @Bindable
    public String getG100896x() {
        return g100896x;
    }

    public void setG100896x(String g100896x) {
        this.g100896x = g100896x;
        notifyPropertyChanged(BR.g100896x);
    }

    @Bindable
    public String getG100898() {
        return g100898;
    }

    public void setG100898(String g100898) {
        this.g100898 = g100898;
        setG1008a(g100898.equals("98") ? "" : this.g1008a);
        setG1008b(g100898.equals("98") ? "" : this.g1008b);
        setG1008c(g100898.equals("98") ? "" : this.g1008c);
        setG100896(g100898.equals("98") ? "" : this.g100896);
        notifyPropertyChanged(BR.g100898);
    }

    @Bindable
    public String getG1009() {
        return g1009;
    }

    public void setG1009(String g1009) {
        this.g1009 = g1009;
        notifyPropertyChanged(BR.g1009);
    }

    @Bindable
    public String getG1009a() {
        return g1009a;
    }

    public void setG1009a(String g1009a) {
        if (this.g1009a.equals(g1009a)) return;
        this.g1009a = g1009a;
        notifyPropertyChanged(BR.g1009a);
    }

    @Bindable
    public String getG1009b() {
        return g1009b;
    }

    public void setG1009b(String g1009b) {
        if (this.g1009b.equals(g1009b)) return;
        this.g1009b = g1009b;
        notifyPropertyChanged(BR.g1009b);
    }

    @Bindable
    public String getG1009c() {
        return g1009c;
    }

    public void setG1009c(String g1009c) {
        if (this.g1009c.equals(g1009c)) return;
        this.g1009c = g1009c;
        notifyPropertyChanged(BR.g1009c);
    }

    @Bindable
    public String getG1010() {
        return g1010;
    }

    public void setG1010(String g1010) {
        this.g1010 = g1010;
        notifyPropertyChanged(BR.g1010);
    }

    @Bindable
    public String getG1011() {
        return g1011;
    }

    public void setG1011(String g1011) {
        this.g1011 = g1011;
        notifyPropertyChanged(BR.g1011);
    }

    @Bindable
    public String getG1011a() {
        return g1011a;
    }

    public void setG1011a(String g1011a) {
        if (this.g1011a.equals(g1011a)) return;
        this.g1011a = g1011a;
        notifyPropertyChanged(BR.g1011a);
    }

    @Bindable
    public String getG1011b() {
        return g1011b;
    }

    public void setG1011b(String g1011b) {
        if (this.g1011b.equals(g1011b)) return;
        this.g1011b = g1011b;
        notifyPropertyChanged(BR.g1011b);
    }

    @Bindable
    public String getG1011c() {
        return g1011c;
    }

    public void setG1011c(String g1011c) {
        if (this.g1011c.equals(g1011c)) return;
        this.g1011c = g1011c;
        notifyPropertyChanged(BR.g1011c);
    }

    @Bindable
    public String getG1011d() {
        return g1011d;
    }

    public void setG1011d(String g1011d) {
        if (this.g1011d.equals(g1011d)) return;
        this.g1011d = g1011d;
        notifyPropertyChanged(BR.g1011d);
    }

    @Bindable
    public String getG1011e() {
        return g1011e;
    }

    public void setG1011e(String g1011e) {
        if (this.g1011e.equals(g1011e)) return;
        this.g1011e = g1011e;
        notifyPropertyChanged(BR.g1011e);
    }

    @Bindable
    public String getG1011f() {
        return g1011f;
    }

    public void setG1011f(String g1011f) {
        if (this.g1011f.equals(g1011f)) return;
        this.g1011f = g1011f;
        notifyPropertyChanged(BR.g1011f);
    }

    @Bindable
    public String getG101196() {
        return g101196;
    }

    public void setG101196(String g101196) {
        if (this.g101196.equals(g101196)) return;
        this.g101196 = g101196;
        setG101196x(g101196.equals("96") ? this.g101196x : "");
        notifyPropertyChanged(BR.g101196);
    }

    @Bindable
    public String getG101196x() {
        return g101196x;
    }

    public void setG101196x(String g101196x) {
        this.g101196x = g101196x;
        notifyPropertyChanged(BR.g101196x);
    }

    public LHWGB_HH Hydrate(Cursor cursor) throws JSONException{

        this.id = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LHWGB_HHTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LHWGB_HHTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LHWGB_HHTable.COLUMN_UUID));
        this.muid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LHWGB_HHTable.COLUMN_LHWUID));
        this.cluster = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LHWGB_HHTable.COLUMN_CLUSTER));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LHWGB_HHTable.COLUMN_HHID));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LHWGB_HHTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LHWGB_HHTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LHWGB_HHTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LHWGB_HHTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LHWGB_HHTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LHWGB_HHTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LHWGB_HHTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LHWGB_HHTable.COLUMN_SYNCED_DATE));
        this.lhwCode = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LHWGB_HHTable.COLUMN_LHW_CODE));


        sGBV02Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LHWGB_HHTable.COLUMN_GBV02)));

        return this;
    }

    public void sGBV02Hydrate(String string) throws JSONException{
        Log.d(TAG, "sGBV02Hydrate: " + string);
        if(string != null){
            JSONObject json = null;
            json = new JSONObject(string);

            this.g701 = json.getString("g701");
            this.g702 = json.getString("g702");
            this.g703 = json.getString("g703");
            this.g7041 = json.getString("g7041");
            this.g7042 = json.getString("g7042");
            this.g7043 = json.getString("g7043");
            this.g706a = json.getString("g706a");
            this.g706b = json.getString("g706b");
            this.g706c = json.getString("g706c");
            this.g706d = json.getString("g706d");
            this.g706e = json.getString("g706e");
            this.g706f = json.getString("g706f");
            this.g706g = json.getString("g706g");
            this.g706h = json.getString("g706h");
            this.g706i = json.getString("g706i");
            this.g70696 = json.getString("g70696");
            this.g70696x = json.getString("g70696x");
            this.g801m = json.getString("g801m");
            this.g801f = json.getString("g801f");
            this.g802 = json.getString("g802");
            this.g803 = json.getString("g803");
            this.g804 = json.getString("g804");
            this.g805 = json.getString("g805");
            this.g806 = json.getString("g806");
            this.g807a = json.getString("g807a");
            this.g807b = json.getString("g807b");
            this.g807c = json.getString("g807c");
            this.g807d = json.getString("g807d");
            this.g807e = json.getString("g807e");
            this.g80796 = json.getString("g80796");
            this.g80796x = json.getString("g80796x");
            this.g808 = json.getString("g808");
            this.g809a = json.getString("g809a");
            this.g809b = json.getString("g809b");
            this.g809c = json.getString("g809c");
            this.g809d = json.getString("g809d");
            this.g809e = json.getString("g809e");
            this.g80996 = json.getString("g80996");
            this.g80996x = json.getString("g80996x");
            this.g9011 = json.getString("g9011");
            this.g9012 = json.getString("g9012");
            this.g9013 = json.getString("g9013");
            this.g9014 = json.getString("g9014");
            this.g9015 = json.getString("g9015");
            this.g9021 = json.getString("g9021");
            this.g9022 = json.getString("g9022");
            this.g9023 = json.getString("g9023");
            this.g9024 = json.getString("g9024");
            this.g9025 = json.getString("g9025");
            this.g903a = json.getString("g903a");
            this.g903b = json.getString("g903b");
            this.g903c = json.getString("g903c");
            this.g903d = json.getString("g903d");
            this.g903e = json.getString("g903e");
            this.g90396 = json.getString("g90396");
            this.g90396x = json.getString("g90396x");
            this.g904a = json.getString("g904a");
            this.g904b = json.getString("g904b");
            this.g904c = json.getString("g904c");
            this.g904d = json.getString("g904d");
            this.g904e = json.getString("g904e");
            this.g904f = json.getString("g904f");
            this.g90496 = json.getString("g90496");
            this.g90496x = json.getString("g90496x");
            this.g9051 = json.getString("g9051");
            this.g9052 = json.getString("g9052");
            this.g9053 = json.getString("g9053");
            this.g9054 = json.getString("g9054");
            this.g9055 = json.getString("g9055");
            this.g9056 = json.getString("g9056");
            this.g9061 = json.getString("g9061");
            this.g9062 = json.getString("g9062");
            this.g9063 = json.getString("g9063");
            this.g9064 = json.getString("g9064");
            this.g9065 = json.getString("g9065");
            this.g9066 = json.getString("g9066");
            this.g907 = json.getString("g907");
            this.g90796x = json.getString("g90796x");
            this.g9081 = json.getString("g9081");
            this.g9082 = json.getString("g9082");
            this.g9083 = json.getString("g9083");
            this.g9084 = json.getString("g9084");
            this.g9085 = json.getString("g9085");
            this.g9086 = json.getString("g9086");
            this.g9087 = json.getString("g9087");
            this.g9088 = json.getString("g9088");
            this.g909 = json.getString("g909");
            this.g90996x = json.getString("g90996x");
            this.g1001 = json.getString("g1001");
            this.g1002a = json.getString("g1002a");
            this.g1002b = json.getString("g1002b");
            this.g1002c = json.getString("g1002c");
            this.g1002d = json.getString("g1002d");
            this.g1002e = json.getString("g1002e");
            this.g1002f = json.getString("g1002f");
            this.g1002g = json.getString("g1002g");
            this.g100296 = json.getString("g100296");
            this.g100296x = json.getString("g100296x");
            this.g1003 = json.getString("g1003");
            this.g100396x = json.getString("g100396x");
            this.g1004 = json.getString("g1004");
            this.g1005a = json.getString("g1005a");
            this.g1005b = json.getString("g1005b");
            this.g1005c = json.getString("g1005c");
            this.g100596 = json.getString("g100596");
            this.g100596x = json.getString("g100596x");
            this.g1006a = json.getString("g1006a");
            this.g1006b = json.getString("g1006b");
            this.g1006c = json.getString("g1006c");
            this.g1006d = json.getString("g1006d");
            this.g1006e = json.getString("g1006e");
            this.g100696 = json.getString("g100696");
            this.g100696x = json.getString("g100696x");
            this.g1007 = json.getString("g1007");
            this.g1008a = json.getString("g1008a");
            this.g1008b = json.getString("g1008b");
            this.g1008c = json.getString("g1008c");
            this.g100896 = json.getString("g100896");
            this.g100896x = json.getString("g100896x");
            this.g100898 = json.getString("g100898");
            this.g1009a = json.getString("g1009a");
            this.g1009b = json.getString("g1009b");
            this.g1009c = json.getString("g1009c");
            this.g1010 = json.getString("g1010");
            this.g1011a = json.getString("g1011a");
            this.g1011b = json.getString("g1011b");
            this.g1011c = json.getString("g1011c");
            this.g1011d = json.getString("g1011d");
            this.g1011e = json.getString("g1011e");
            this.g1011f = json.getString("g1011f");
            this.g101196 = json.getString("g101196");
            this.g101196x = json.getString("g101196x");

        }
    }


    public String sGBV02toString() throws JSONException {
        Log.d(TAG, "sAtoString: ");
        JSONObject json = new JSONObject();
        json.put("g701", g701)
                .put("g702", g702)
                .put("g703", g703)
                .put("g7041", g7041)
                .put("g7042", g7042)
                .put("g7043", g7043)
                .put("g706a", g706a)
                .put("g706b", g706b)
                .put("g706c", g706c)
                .put("g706d", g706d)
                .put("g706e", g706e)
                .put("g706f", g706f)
                .put("g706g", g706g)
                .put("g706h", g706h)
                .put("g706i", g706i)
                .put("g70696", g70696)
                .put("g70696x", g70696x)
                .put("g801m", g801m)
                .put("g801f", g801f)
                .put("g802", g802)
                .put("g803", g803)
                .put("g804", g804)
                .put("g805", g805)
                .put("g806", g806)
                .put("g807a", g807a)
                .put("g807b", g807b)
                .put("g807c", g807c)
                .put("g807d", g807d)
                .put("g807e", g807e)
                .put("g80796", g80796)
                .put("g80796x", g80796x)
                .put("g808", g808)
                .put("g809a", g809a)
                .put("g809b", g809b)
                .put("g809c", g809c)
                .put("g809d", g809d)
                .put("g809e", g809e)
                .put("g80996", g80996)
                .put("g80996x", g80996x)
                .put("g9011", g9011)
                .put("g9012", g9012)
                .put("g9013", g9013)
                .put("g9014", g9014)
                .put("g9015", g9015)
                .put("g9021", g9021)
                .put("g9022", g9022)
                .put("g9023", g9023)
                .put("g9024", g9024)
                .put("g9025", g9025)
                .put("g903a", g903a)
                .put("g903b", g903b)
                .put("g903c", g903c)
                .put("g903d", g903d)
                .put("g903e", g903e)
                .put("g90396", g90396)
                .put("g90396x", g90396x)
                .put("g904a", g904a)
                .put("g904b", g904b)
                .put("g904c", g904c)
                .put("g904d", g904d)
                .put("g904e", g904e)
                .put("g904f", g904f)
                .put("g90496", g90496)
                .put("g90496x", g90496x)
                .put("g9051", g9051)
                .put("g9052", g9052)
                .put("g9053", g9053)
                .put("g9054", g9054)
                .put("g9055", g9055)
                .put("g9056", g9056)
                .put("g9061", g9061)
                .put("g9062", g9062)
                .put("g9063", g9063)
                .put("g9064", g9064)
                .put("g9065", g9065)
                .put("g9066", g9066)
                .put("g907", g907)
                .put("g90796x", g90796x)
                .put("g9081", g9081)
                .put("g9082", g9082)
                .put("g9083", g9083)
                .put("g9084", g9084)
                .put("g9085", g9085)
                .put("g9086", g9086)
                .put("g9087", g9087)
                .put("g9088", g9088)
                .put("g909", g909)
                .put("g90996x", g90996x)
                .put("g1001", g1001)
                .put("g1002a", g1002a)
                .put("g1002b", g1002b)
                .put("g1002c", g1002c)
                .put("g1002d", g1002d)
                .put("g1002e", g1002e)
                .put("g1002f", g1002f)
                .put("g1002g", g1002g)
                .put("g100296", g100296)
                .put("g100296x", g100296x)
                .put("g1003", g1003)
                .put("g100396x", g100396x)
                .put("g1004", g1004)
                .put("g1005a", g1005a)
                .put("g1005b", g1005b)
                .put("g1005c", g1005c)
                .put("g100596", g100596)
                .put("g100596x", g100596x)
                .put("g1006a", g1006a)
                .put("g1006b", g1006b)
                .put("g1006c", g1006c)
                .put("g1006d", g1006d)
                .put("g1006e", g1006e)
                .put("g100696", g100696)
                .put("g100696x", g100696x)
                .put("g1007", g1007)
                .put("g1008a", g1008a)
                .put("g1008b", g1008b)
                .put("g1008c", g1008c)
                .put("g100896", g100896)
                .put("g100896x", g100896x)
                .put("g100898", g100898)
                .put("g1009a", g1009a)
                .put("g1009b", g1009b)
                .put("g1009c", g1009c)
                .put("g1010", g1010)
                .put("g1011a", g1011a)
                .put("g1011b", g1011b)
                .put("g1011c", g1011c)
                .put("g1011d", g1011d)
                .put("g1011e", g1011e)
                .put("g1011f", g1011f)
                .put("g101196", g101196)
                .put("g101196x", g101196x);

        return json.toString();
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(TableContracts.LHWGB_HHTable.COLUMN_ID, this.id);
        json.put(TableContracts.LHWGB_HHTable.COLUMN_UID, this.uid);
        json.put(TableContracts.LHWGB_HHTable.COLUMN_UUID, this.uuid);
        json.put(TableContracts.LHWGB_HHTable.COLUMN_CLUSTER, this.cluster);
        json.put(TableContracts.LHWGB_HHTable.COLUMN_USERNAME, this.userName);
        json.put(TableContracts.LHWGB_HHTable.COLUMN_SYSDATE, this.sysDate);
        json.put(TableContracts.LHWGB_HHTable.COLUMN_HHID, this.hhid);
        json.put(TableContracts.LHWGB_HHTable.COLUMN_LHWUID, this.muid);
        json.put(TableContracts.LHWGB_HHTable.COLUMN_LHW_CODE, this.lhwCode);
        json.put(TableContracts.LHWGB_HHTable.COLUMN_DEVICEID, this.deviceId);
        json.put(TableContracts.LHWGB_HHTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(TableContracts.LHWGB_HHTable.COLUMN_ISTATUS, this.iStatus);
        json.put(TableContracts.LHWGB_HHTable.COLUMN_APPVERSION, this.appver);


        //  json.put(LHWFormsTable.COLUMN_SYNCED, this.synced);
        //  json.put(LHWFormsTable.COLUMN_SYNCED_DATE, this.syncDate);

        // Household


        json.put(TableContracts.LHWGB_HHTable.COLUMN_GBV02, new JSONObject(sGBV02toString()));

        return json;
    }



}
