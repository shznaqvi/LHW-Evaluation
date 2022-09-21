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

import java.util.Currency;

import edu.aku.hassannaqvi.lhwevaluation.BR;
import edu.aku.hassannaqvi.lhwevaluation.contracts.TableContracts;
import edu.aku.hassannaqvi.lhwevaluation.core.MainApp;

public class LHW_GB extends BaseObservable implements Observable {


    private final String TAG = "lhw_gb";

    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = StringUtils.EMPTY;
    private String uid = StringUtils.EMPTY;
    private String uuid = StringUtils.EMPTY;
    private String lhwuid = StringUtils.EMPTY;
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

    private String sGb_Lhw = StringUtils.EMPTY;

    public String g101 = StringUtils.EMPTY;
    public String g102 = StringUtils.EMPTY;
    public String g103 = StringUtils.EMPTY;
    public String g103a = StringUtils.EMPTY;
    public String g103b = StringUtils.EMPTY;
    public String g103c = StringUtils.EMPTY;
    public String g103d = StringUtils.EMPTY;
    public String g103e = StringUtils.EMPTY;
    public String g103f = StringUtils.EMPTY;
    public String g103g = StringUtils.EMPTY;
    public String g103h = StringUtils.EMPTY;
    public String g103i = StringUtils.EMPTY;
    public String g103j = StringUtils.EMPTY;
    public String g10396 = StringUtils.EMPTY;
    public String g10396x = StringUtils.EMPTY;
    public String g104 = StringUtils.EMPTY;
    public String g104a = StringUtils.EMPTY;
    public String g104b = StringUtils.EMPTY;
    public String g104c = StringUtils.EMPTY;
    public String g104d = StringUtils.EMPTY;
    public String g104e = StringUtils.EMPTY;
    public String g104f = StringUtils.EMPTY;
    public String g104g = StringUtils.EMPTY;
    public String g104h = StringUtils.EMPTY;
    public String g104i = StringUtils.EMPTY;
    public String g104j = StringUtils.EMPTY;
    public String g104k = StringUtils.EMPTY;
    public String g104l = StringUtils.EMPTY;
    public String g104m = StringUtils.EMPTY;
    public String g104n = StringUtils.EMPTY;
    public String g104o = StringUtils.EMPTY;
    public String g104p = StringUtils.EMPTY;
    public String g105 = StringUtils.EMPTY;
    public String g105a = StringUtils.EMPTY;
    public String g105b = StringUtils.EMPTY;
    public String g105c = StringUtils.EMPTY;
    public String g105d = StringUtils.EMPTY;
    public String g105e = StringUtils.EMPTY;
    public String g105f = StringUtils.EMPTY;
    public String g105g = StringUtils.EMPTY;
    public String g105h = StringUtils.EMPTY;
    public String g105i = StringUtils.EMPTY;
    public String g105j = StringUtils.EMPTY;
    public String g105k = StringUtils.EMPTY;
    public String g105l = StringUtils.EMPTY;
    public String g105m = StringUtils.EMPTY;
    public String g105n = StringUtils.EMPTY;
    public String g105o = StringUtils.EMPTY;
    public String g105p = StringUtils.EMPTY;
    public String g106 = StringUtils.EMPTY;
    public String g107 = StringUtils.EMPTY;
    public String g107a = StringUtils.EMPTY;
    public String g107b = StringUtils.EMPTY;
    public String g107c = StringUtils.EMPTY;
    public String g107d = StringUtils.EMPTY;
    public String g107e = StringUtils.EMPTY;
    public String g10796 = StringUtils.EMPTY;
    public String g10796x = StringUtils.EMPTY;
    public String g108 = StringUtils.EMPTY;
    public String g1091 = StringUtils.EMPTY;
    public String g1092 = StringUtils.EMPTY;
    public String g1093 = StringUtils.EMPTY;
    public String g1094 = StringUtils.EMPTY;
    public String g1095 = StringUtils.EMPTY;
    public String g1101 = StringUtils.EMPTY;
    public String g1102 = StringUtils.EMPTY;
    public String g1103 = StringUtils.EMPTY;
    public String g1104 = StringUtils.EMPTY;
    public String g1105 = StringUtils.EMPTY;
    public String g111 = StringUtils.EMPTY;
    public String g111a = StringUtils.EMPTY;
    public String g111b = StringUtils.EMPTY;
    public String g111c = StringUtils.EMPTY;
    public String g111d = StringUtils.EMPTY;
    public String g111e = StringUtils.EMPTY;
    public String g11196 = StringUtils.EMPTY;
    public String g11196x = StringUtils.EMPTY;
    public String g112 = StringUtils.EMPTY;
    public String g112a = StringUtils.EMPTY;
    public String g112b = StringUtils.EMPTY;
    public String g112c = StringUtils.EMPTY;
    public String g112d = StringUtils.EMPTY;
    public String g112e = StringUtils.EMPTY;
    public String g112f = StringUtils.EMPTY;
    public String g11296 = StringUtils.EMPTY;
    public String g11296x = StringUtils.EMPTY;
    public String g1131 = StringUtils.EMPTY;
    public String g1132 = StringUtils.EMPTY;
    public String g1133 = StringUtils.EMPTY;
    public String g1134 = StringUtils.EMPTY;
    public String g1135 = StringUtils.EMPTY;
    public String g1136 = StringUtils.EMPTY;
    public String g1141 = StringUtils.EMPTY;
    public String g1142 = StringUtils.EMPTY;
    public String g1143 = StringUtils.EMPTY;
    public String g1144 = StringUtils.EMPTY;
    public String g1145 = StringUtils.EMPTY;
    public String g1146 = StringUtils.EMPTY;
    public String g115 = StringUtils.EMPTY;
    public String g1161 = StringUtils.EMPTY;
    public String g1162 = StringUtils.EMPTY;
    public String g1163 = StringUtils.EMPTY;
    public String g1164 = StringUtils.EMPTY;
    public String g1165 = StringUtils.EMPTY;
    public String g1166 = StringUtils.EMPTY;
    public String g1167 = StringUtils.EMPTY;
    public String g1168 = StringUtils.EMPTY;
    public String g117 = StringUtils.EMPTY;
    public String g11796x = StringUtils.EMPTY;
    public String g201 = StringUtils.EMPTY;
    public String g201a = StringUtils.EMPTY;
    public String g201b = StringUtils.EMPTY;
    public String g201c = StringUtils.EMPTY;
    public String g201d = StringUtils.EMPTY;
    public String g201e = StringUtils.EMPTY;
    public String g201f = StringUtils.EMPTY;
    public String g201g = StringUtils.EMPTY;
    public String g201h = StringUtils.EMPTY;
    public String g201i = StringUtils.EMPTY;
    public String g20197 = StringUtils.EMPTY;
    public String g202 = StringUtils.EMPTY;
    public String g2031 = StringUtils.EMPTY;
    public String g2031a = StringUtils.EMPTY;
    public String g2031b = StringUtils.EMPTY;
    public String g2032 = StringUtils.EMPTY;
    public String g2032a = StringUtils.EMPTY;
    public String g2032b = StringUtils.EMPTY;
    public String g2033 = StringUtils.EMPTY;
    public String g2033a = StringUtils.EMPTY;
    public String g2033b = StringUtils.EMPTY;
    public String g2034 = StringUtils.EMPTY;
    public String g2034a = StringUtils.EMPTY;
    public String g2034b = StringUtils.EMPTY;
    public String g2035 = StringUtils.EMPTY;
    public String g2035a = StringUtils.EMPTY;
    public String g2035b = StringUtils.EMPTY;
    public String g2036 = StringUtils.EMPTY;
    public String g2036a = StringUtils.EMPTY;
    public String g2036b = StringUtils.EMPTY;
    public String g204 = StringUtils.EMPTY;
    public String g205 = StringUtils.EMPTY;
    public String g20596x = StringUtils.EMPTY;
    public String g301 = StringUtils.EMPTY;
    public String g302 = StringUtils.EMPTY;
    public String g30296x = StringUtils.EMPTY;
    public String g30396 = StringUtils.EMPTY;
    public String g3031 = StringUtils.EMPTY;
    public String g3032 = StringUtils.EMPTY;
    public String g3033 = StringUtils.EMPTY;
    public String g3034 = StringUtils.EMPTY;
    public String g3035 = StringUtils.EMPTY;
    public String g3036 = StringUtils.EMPTY;
    public String g304 = StringUtils.EMPTY;
    public String g305 = StringUtils.EMPTY;
    public String g306 = StringUtils.EMPTY;
    public String g307 = StringUtils.EMPTY;
    public String g308 = StringUtils.EMPTY;
    public String g30896x = StringUtils.EMPTY;
    public String g401 = StringUtils.EMPTY;
    public String g401a = StringUtils.EMPTY;
    public String g401b = StringUtils.EMPTY;
    public String g401c = StringUtils.EMPTY;
    public String g401d = StringUtils.EMPTY;
    public String g401e = StringUtils.EMPTY;
    public String g401f = StringUtils.EMPTY;
    public String g401g = StringUtils.EMPTY;
    public String g401h = StringUtils.EMPTY;
    public String g401i = StringUtils.EMPTY;
    public String g401j = StringUtils.EMPTY;
    public String g402 = StringUtils.EMPTY;
    public String g403 = StringUtils.EMPTY;
    public String g404 = StringUtils.EMPTY;
    public String g40596 = StringUtils.EMPTY;
    public String g4051 = StringUtils.EMPTY;
    public String g4052 = StringUtils.EMPTY;
    public String g4053 = StringUtils.EMPTY;
    public String g4054 = StringUtils.EMPTY;
    public String g4055 = StringUtils.EMPTY;
    public String g4056 = StringUtils.EMPTY;
    public String g4057 = StringUtils.EMPTY;
    public String g406 = StringUtils.EMPTY;
    public String g4071 = StringUtils.EMPTY;
    public String g4072 = StringUtils.EMPTY;
    public String g4073 = StringUtils.EMPTY;
    public String g4074 = StringUtils.EMPTY;
    public String g4075 = StringUtils.EMPTY;
    public String g4076 = StringUtils.EMPTY;
    public String g4077 = StringUtils.EMPTY;
    public String g4078 = StringUtils.EMPTY;
    public String g501m = StringUtils.EMPTY;
    public String g501f = StringUtils.EMPTY;
    public String g502 = StringUtils.EMPTY;
    public String g503 = StringUtils.EMPTY;
    public String g504 = StringUtils.EMPTY;
    public String g505 = StringUtils.EMPTY;
    public String g506 = StringUtils.EMPTY;
    public String g507 = StringUtils.EMPTY;
    public String g507a = StringUtils.EMPTY;
    public String g507b = StringUtils.EMPTY;
    public String g507c = StringUtils.EMPTY;
    public String g507d = StringUtils.EMPTY;
    public String g507e = StringUtils.EMPTY;
    public String g50796 = StringUtils.EMPTY;
    public String g50796x = StringUtils.EMPTY;
    public String g508 = StringUtils.EMPTY;
    public String g509 = StringUtils.EMPTY;
    public String g509a = StringUtils.EMPTY;
    public String g509b = StringUtils.EMPTY;
    public String g509c = StringUtils.EMPTY;
    public String g509d = StringUtils.EMPTY;
    public String g509e = StringUtils.EMPTY;
    public String g50996 = StringUtils.EMPTY;
    public String g50996x = StringUtils.EMPTY;
    public String g601 = StringUtils.EMPTY;
    public String g602 = StringUtils.EMPTY;
    public String g602a = StringUtils.EMPTY;
    public String g602b = StringUtils.EMPTY;
    public String g602c = StringUtils.EMPTY;
    public String g602d = StringUtils.EMPTY;
    public String g602e = StringUtils.EMPTY;
    public String g602f = StringUtils.EMPTY;
    public String g602g = StringUtils.EMPTY;
    public String g60296 = StringUtils.EMPTY;
    public String g60296x = StringUtils.EMPTY;
    public String g603 = StringUtils.EMPTY;
    public String g60396x = StringUtils.EMPTY;
    public String g604 = StringUtils.EMPTY;
    public String g605 = StringUtils.EMPTY;
    public String g605a = StringUtils.EMPTY;
    public String g605b = StringUtils.EMPTY;
    public String g605c = StringUtils.EMPTY;
    public String g60596 = StringUtils.EMPTY;
    public String g60596x = StringUtils.EMPTY;
    public String g606 = StringUtils.EMPTY;
    public String g606a = StringUtils.EMPTY;
    public String g606b = StringUtils.EMPTY;
    public String g606c = StringUtils.EMPTY;
    public String g606d = StringUtils.EMPTY;
    public String g606e = StringUtils.EMPTY;
    public String g60696 = StringUtils.EMPTY;
    public String g60696x = StringUtils.EMPTY;




    public LHW_GB() {
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

    public String getLhwuid() {
        return lhwuid;
    }

    public void setLhwuid(String lhwuid) {
        this.lhwuid = lhwuid;
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

    public String getsGb_Lhw() {
        return sGb_Lhw;
    }

    public void setsGb_Lhw(String sGb_Lhw) {
        this.sGb_Lhw = sGb_Lhw;
    }

    @Bindable
    public String getG101() {
        return g101;
    }

    public void setG101(String g101) {
        this.g101 = g101;
        setG102(this.g101.equals("1") ? this.g102 : "");
        setG103a(this.g101.equals("1") ? this.g103a : "");
        setG103b(this.g101.equals("1") ? this.g103b : "");
        setG103c(this.g101.equals("1") ? this.g103c : "");
        setG103d(this.g101.equals("1") ? this.g103d : "");
        setG103e(this.g101.equals("1") ? this.g103e : "");
        setG103f(this.g101.equals("1") ? this.g103f : "");
        setG103g(this.g101.equals("1") ? this.g103g : "");
        setG103h(this.g101.equals("1") ? this.g103h : "");
        setG103i(this.g101.equals("1") ? this.g103i : "");
        setG103j(this.g101.equals("1") ? this.g103j : "");
        setG10396(this.g101.equals("1") ? this.g10396 : "");
        setG104a(this.g101.equals("1") ? this.g104a : "");
        setG104b(this.g101.equals("1") ? this.g104b : "");
        setG104c(this.g101.equals("1") ? this.g104c : "");
        setG104d(this.g101.equals("1") ? this.g104d : "");
        setG104e(this.g101.equals("1") ? this.g104e : "");
        setG104f(this.g101.equals("1") ? this.g104f : "");
        setG104g(this.g101.equals("1") ? this.g104g : "");
        setG104h(this.g101.equals("1") ? this.g104h : "");
        setG104i(this.g101.equals("1") ? this.g104i : "");
        setG104j(this.g101.equals("1") ? this.g104j : "");
        setG104k(this.g101.equals("1") ? this.g104k : "");
        setG104l(this.g101.equals("1") ? this.g104l : "");
        setG104m(this.g101.equals("1") ? this.g104m : "");
        setG104n(this.g101.equals("1") ? this.g104n : "");
        setG104o(this.g101.equals("1") ? this.g104o : "");
        setG104p(this.g101.equals("1") ? this.g104p : "");
        setG105a(this.g101.equals("1") ? this.g105a : "");
        setG105b(this.g101.equals("1") ? this.g105b : "");
        setG105c(this.g101.equals("1") ? this.g105c : "");
        setG105d(this.g101.equals("1") ? this.g105d : "");
        setG105e(this.g101.equals("1") ? this.g105e : "");
        setG105f(this.g101.equals("1") ? this.g105f : "");
        setG105g(this.g101.equals("1") ? this.g105g : "");
        setG105h(this.g101.equals("1") ? this.g105h : "");
        setG105i(this.g101.equals("1") ? this.g105i : "");
        setG105j(this.g101.equals("1") ? this.g105j : "");
        setG105k(this.g101.equals("1") ? this.g105k : "");
        setG105l(this.g101.equals("1") ? this.g105l : "");
        setG105m(this.g101.equals("1") ? this.g105m : "");
        setG105n(this.g101.equals("1") ? this.g105o : "");
        setG105p(this.g101.equals("1") ? this.g105p : "");
        setG106(this.g101.equals("1") ? this.g106 : "");
        setG107a(this.g101.equals("1") ? this.g107a : "");
        setG107b(this.g101.equals("1") ? this.g107b : "");
        setG107c(this.g101.equals("1") ? this.g107c : "");
        setG107d(this.g101.equals("1") ? this.g107d : "");
        setG107e(this.g101.equals("1") ? this.g107e : "");
        setG10796(this.g101.equals("1") ? this.g10796 : "");
        setG108(this.g101.equals("1") ? this.g108 : "");
        setG1091(this.g101.equals("1") ? this.g1091 : "");
        setG1092(this.g101.equals("1") ? this.g1092 : "");
        setG1093(this.g101.equals("1") ? this.g1093 : "");
        setG1094(this.g101.equals("1") ? this.g1094 : "");
        setG1095(this.g101.equals("1") ? this.g1095 : "");
        setG1101(this.g101.equals("1") ? this.g1101 : "");
        setG1102(this.g101.equals("1") ? this.g1102 : "");
        setG1103(this.g101.equals("1") ? this.g1103 : "");
        setG1104(this.g101.equals("1") ? this.g1104 : "");
        setG1105(this.g101.equals("1") ? this.g1105 : "");
        setG111a(this.g101.equals("1") ? this.g111a : "");
        setG111b(this.g101.equals("1") ? this.g111b : "");
        setG111c(this.g101.equals("1") ? this.g111c : "");
        setG111d(this.g101.equals("1") ? this.g111d : "");
        setG111e(this.g101.equals("1") ? this.g111e : "");
        setG11196(this.g101.equals("1") ? this.g11196 : "");
        setG112a(this.g101.equals("1") ? this.g112a : "");
        setG112b(this.g101.equals("1") ? this.g112b : "");
        setG112c(this.g101.equals("1") ? this.g112c : "");
        setG112d(this.g101.equals("1") ? this.g112d : "");
        setG112e(this.g101.equals("1") ? this.g112e : "");
        setG112f(this.g101.equals("1") ? this.g112f : "");
        setG11296(this.g101.equals("1") ? this.g11296 : "");
        setG1131(this.g101.equals("1") ? this.g1131 : "");
        setG1132(this.g101.equals("1") ? this.g1132 : "");
        setG1133(this.g101.equals("1") ? this.g1133 : "");
        setG1134(this.g101.equals("1") ? this.g1134 : "");
        setG1135(this.g101.equals("1") ? this.g1135 : "");
        setG1136(this.g101.equals("1") ? this.g1136 : "");
        setG1141(this.g101.equals("1") ? this.g1141 : "");
        setG1142(this.g101.equals("1") ? this.g1142 : "");
        setG1143(this.g101.equals("1") ? this.g1143 : "");
        setG1144(this.g101.equals("1") ? this.g1144 : "");
        setG1145(this.g101.equals("1") ? this.g1145 : "");
        setG1146(this.g101.equals("1") ? this.g1146 : "");
        setG115(this.g101.equals("1") ? this.g115 : "");
        setG1161(this.g101.equals("1") ? this.g1161 : "");
        setG1162(this.g101.equals("1") ? this.g1162 : "");
        setG1163(this.g101.equals("1") ? this.g1163 : "");
        setG1164(this.g101.equals("1") ? this.g1164 : "");
        setG1165(this.g101.equals("1") ? this.g1165 : "");
        setG1166(this.g101.equals("1") ? this.g1166 : "");
        setG1167(this.g101.equals("1") ? this.g1167 : "");
        setG1168(this.g101.equals("1") ? this.g1168 : "");
        setG117(this.g101.equals("1") ? this.g117 : "");
        notifyPropertyChanged(BR.g101);
    }

    @Bindable
    public String getG102() {
        return g102;
    }

    public void setG102(String g102) {
        this.g102 = g102;
        notifyPropertyChanged(BR.g102);
    }

    @Bindable
    public String getG103() {
        return g103;
    }

    public void setG103(String g103) {
        this.g103 = g103;
        notifyPropertyChanged(BR.g103);
    }

    @Bindable
    public String getG103a() {
        return g103a;
    }

    public void setG103a(String g103a) {
        if (this.g103a.equals(g103a)) return;
        this.g103a = g103a;
        notifyPropertyChanged(BR.g103a);
    }

    @Bindable
    public String getG103b() {
        return g103b;
    }

    public void setG103b(String g103b) {
        if (this.g103b.equals(g103b)) return;
        this.g103b = g103b;
        notifyPropertyChanged(BR.g103b);
    }

    @Bindable
    public String getG103c() {
        return g103c;
    }

    public void setG103c(String g103c) {
        if (this.g103c.equals(g103c)) return;
        this.g103c = g103c;
        notifyPropertyChanged(BR.g103c);
    }

    @Bindable
    public String getG103d() {
        return g103d;
    }

    public void setG103d(String g103d) {
        if (this.g103d.equals(g103d)) return;
        this.g103d = g103d;
        notifyPropertyChanged(BR.g103d);
    }

    @Bindable
    public String getG103e() {
        return g103e;
    }

    public void setG103e(String g103e) {
        if (this.g103e.equals(g103e)) return;
        this.g103e = g103e;
        notifyPropertyChanged(BR.g103e);
    }

    @Bindable
    public String getG103f() {
        return g103f;
    }

    public void setG103f(String g103f) {
        if (this.g103f.equals(g103f)) return;
        this.g103f = g103f;
        notifyPropertyChanged(BR.g103f);
    }

    @Bindable
    public String getG103g() {
        return g103g;
    }

    public void setG103g(String g103g) {
        if (this.g103g.equals(g103g)) return;
        this.g103g = g103g;
        notifyPropertyChanged(BR.g103g);
    }

    @Bindable
    public String getG103h() {
        return g103h;
    }

    public void setG103h(String g103h) {
        if (this.g103h.equals(g103h)) return;
        this.g103h = g103h;
        notifyPropertyChanged(BR.g103h);
    }

    @Bindable
    public String getG103i() {
        return g103i;
    }

    public void setG103i(String g103i) {
        if (this.g103i.equals(g103i)) return;
        this.g103i = g103i;
        notifyPropertyChanged(BR.g103i);
    }

    @Bindable
    public String getG103j() {
        return g103j;
    }

    public void setG103j(String g103j) {
        if (this.g103j.equals(g103j)) return;
        this.g103j = g103j;
        notifyPropertyChanged(BR.g103j);
    }

    @Bindable
    public String getG10396() {
        return g10396;
    }

    public void setG10396(String g10396) {
        if (this.g10396.equals(g10396)) return;
        this.g10396 = g10396;
        setG10396x(g10396.equals("96") ? this.g10396x : "");
        notifyPropertyChanged(BR.g10396);
    }

    @Bindable
    public String getG10396x() {
        return g10396x;
    }

    public void setG10396x(String g10396x) {
        this.g10396x = g10396x;
        notifyPropertyChanged(BR.g10396x);
    }

    @Bindable
    public String getG104() {
        return g104;
    }

    public void setG104(String g104) {
        this.g104 = g104;
        notifyPropertyChanged(BR.g104);
    }

    @Bindable
    public String getG104a() {
        return g104a;
    }

    public void setG104a(String g104a) {
        if (this.g104a.equals(g104a)) return;
        this.g104a = g104a;
        notifyPropertyChanged(BR.g104a);
    }

    @Bindable
    public String getG104b() {
        return g104b;
    }

    public void setG104b(String g104b) {
        if (this.g104b.equals(g104b)) return;
        this.g104b = g104b;
        notifyPropertyChanged(BR.g104b);
    }

    @Bindable
    public String getG104c() {
        return g104c;
    }

    public void setG104c(String g104c) {
        if (this.g104c.equals(g104c)) return;
        this.g104c = g104c;
        notifyPropertyChanged(BR.g104c);
    }

    @Bindable
    public String getG104d() {
        return g104d;
    }

    public void setG104d(String g104d) {
        if (this.g104d.equals(g104d)) return;
        this.g104d = g104d;
        notifyPropertyChanged(BR.g104d);
    }

    @Bindable
    public String getG104e() {
        return g104e;
    }

    public void setG104e(String g104e) {
        if (this.g104e.equals(g104e)) return;
        this.g104e = g104e;
        notifyPropertyChanged(BR.g104e);
    }

    @Bindable
    public String getG104f() {
        return g104f;
    }

    public void setG104f(String g104f) {
        if (this.g104f.equals(g104f)) return;
        this.g104f = g104f;
        notifyPropertyChanged(BR.g104f);
    }

    @Bindable
    public String getG104g() {
        return g104g;
    }

    public void setG104g(String g104g) {
        if (this.g104g.equals(g104g)) return;
        this.g104g = g104g;
        notifyPropertyChanged(BR.g104g);
    }

    @Bindable
    public String getG104h() {
        return g104h;
    }

    public void setG104h(String g104h) {
        if (this.g104h.equals(g104h)) return;
        this.g104h = g104h;
        notifyPropertyChanged(BR.g104h);
    }

    @Bindable
    public String getG104i() {
        return g104i;
    }

    public void setG104i(String g104i) {
        if (this.g104i.equals(g104i)) return;
        this.g104i = g104i;
        notifyPropertyChanged(BR.g104i);
    }

    @Bindable
    public String getG104j() {
        return g104j;
    }

    public void setG104j(String g104j) {
        if (this.g104j.equals(g104j)) return;
        this.g104j = g104j;
        notifyPropertyChanged(BR.g104j);
    }

    @Bindable
    public String getG104k() {
        return g104k;
    }

    public void setG104k(String g104k) {
        if (this.g104k.equals(g104k)) return;
        this.g104k = g104k;
        notifyPropertyChanged(BR.g104k);
    }

    @Bindable
    public String getG104l() {
        return g104l;
    }

    public void setG104l(String g104l) {
        if (this.g104l.equals(g104l)) return;
        this.g104l = g104l;
        notifyPropertyChanged(BR.g104l);
    }

    @Bindable
    public String getG104m() {
        return g104m;
    }

    public void setG104m(String g104m) {
        if (this.g104m.equals(g104m)) return;
        this.g104m = g104m;
        notifyPropertyChanged(BR.g104m);
    }

    @Bindable
    public String getG104n() {
        return g104n;
    }

    public void setG104n(String g104n) {
        if (this.g104n.equals(g104n)) return;
        this.g104n = g104n;
        notifyPropertyChanged(BR.g104n);
    }

    @Bindable
    public String getG104o() {
        return g104o;
    }

    public void setG104o(String g104o) {
        if (this.g104o.equals(g104o)) return;
        this.g104o = g104o;
        notifyPropertyChanged(BR.g104o);
    }

    @Bindable
    public String getG104p() {
        return g104p;
    }

    public void setG104p(String g104p) {
        if (this.g104p.equals(g104p)) return;
        this.g104p = g104p;
        notifyPropertyChanged(BR.g104p);
    }

    @Bindable
    public String getG105() {
        return g105;
    }

    public void setG105(String g105) {
        this.g105 = g105;
        notifyPropertyChanged(BR.g105);
    }

    @Bindable
    public String getG105a() {
        return g105a;
    }

    public void setG105a(String g105a) {
        if (this.g105a.equals(g105a)) return;
        this.g105a = g105a;
        notifyPropertyChanged(BR.g105a);
    }

    @Bindable
    public String getG105b() {
        return g105b;
    }

    public void setG105b(String g105b) {
        if (this.g105b.equals(g105b)) return;
        this.g105b = g105b;
        notifyPropertyChanged(BR.g105b);
    }

    @Bindable
    public String getG105c() {
        return g105c;
    }

    public void setG105c(String g105c) {
        if (this.g105c.equals(g105c)) return;
        this.g105c = g105c;
        notifyPropertyChanged(BR.g105c);
    }

    @Bindable
    public String getG105d() {
        return g105d;
    }

    public void setG105d(String g105d) {
        if (this.g105d.equals(g105d)) return;
        this.g105d = g105d;
        notifyPropertyChanged(BR.g105d);
    }

    @Bindable
    public String getG105e() {
        return g105e;
    }

    public void setG105e(String g105e) {
        if (this.g105e.equals(g105e)) return;
        this.g105e = g105e;
        notifyPropertyChanged(BR.g105e);
    }

    @Bindable
    public String getG105f() {
        return g105f;
    }

    public void setG105f(String g105f) {
        if (this.g105f.equals(g105f)) return;
        this.g105f = g105f;
        notifyPropertyChanged(BR.g105f);
    }

    @Bindable
    public String getG105g() {
        return g105g;
    }

    public void setG105g(String g105g) {
        if (this.g105g.equals(g105g)) return;
        this.g105g = g105g;
        notifyPropertyChanged(BR.g105g);
    }

    @Bindable
    public String getG105h() {
        return g105h;
    }

    public void setG105h(String g105h) {
        if (this.g105h.equals(g105h)) return;
        this.g105h = g105h;
        notifyPropertyChanged(BR.g105h);
    }

    @Bindable
    public String getG105i() {
        return g105i;
    }

    public void setG105i(String g105i) {
        if (this.g105i.equals(g105i)) return;
        this.g105i = g105i;
        notifyPropertyChanged(BR.g105i);
    }

    @Bindable
    public String getG105j() {
        return g105j;
    }

    public void setG105j(String g105j) {
        if (this.g105j.equals(g105j)) return;
        this.g105j = g105j;
        notifyPropertyChanged(BR.g105j);
    }

    @Bindable
    public String getG105k() {
        return g105k;
    }

    public void setG105k(String g105k) {
        if (this.g105k.equals(g105k)) return;
        this.g105k = g105k;
        notifyPropertyChanged(BR.g105k);
    }

    @Bindable
    public String getG105l() {
        return g105l;
    }

    public void setG105l(String g105l) {
        if (this.g105l.equals(g105l)) return;
        this.g105l = g105l;
        notifyPropertyChanged(BR.g105l);
    }

    @Bindable
    public String getG105m() {
        return g105m;
    }

    public void setG105m(String g105m) {
        if (this.g105m.equals(g105m)) return;
        this.g105m = g105m;
        notifyPropertyChanged(BR.g105m);
    }

    @Bindable
    public String getG105n() {
        return g105n;
    }

    public void setG105n(String g105n) {
        if (this.g105n.equals(g105n)) return;
        this.g105n = g105n;
        notifyPropertyChanged(BR.g105n);
    }

    @Bindable
    public String getG105o() {
        return g105o;
    }

    public void setG105o(String g105o) {
        if (this.g105o.equals(g105o)) return;
        this.g105o = g105o;
        notifyPropertyChanged(BR.g105o);
    }

    @Bindable
    public String getG105p() {
        return g105p;
    }

    public void setG105p(String g105p) {
        if (this.g105p.equals(g105p)) return;
        this.g105p = g105p;
        notifyPropertyChanged(BR.g105p);
    }

    @Bindable
    public String getG106() {
        return g106;
    }

    public void setG106(String g106) {
        this.g106 = g106;
        setG107a(g106.equals("1") ? this.g107a : "");
        setG107b(g106.equals("1") ? this.g107b : "");
        setG107c(g106.equals("1") ? this.g107c : "");
        setG107d(g106.equals("1") ? this.g107d : "");
        setG107e(g106.equals("1") ? this.g107e : "");
        setG10796(g106.equals("1") ? this.g10796 : "");
        notifyPropertyChanged(BR.g106);
    }

    @Bindable
    public String getG107() {
        return g107;
    }

    public void setG107(String g107) {
        this.g107 = g107;
        notifyPropertyChanged(BR.g107);
    }

    @Bindable
    public String getG107a() {
        return g107a;
    }

    public void setG107a(String g107a) {
        if (this.g107a.equals(g107a)) return;
        this.g107a = g107a;
        notifyPropertyChanged(BR.g107a);
    }

    @Bindable
    public String getG107b() {
        return g107b;
    }

    public void setG107b(String g107b) {
        if (this.g107b.equals(g107b)) return;
        this.g107b = g107b;
        notifyPropertyChanged(BR.g107b);
    }

    @Bindable
    public String getG107c() {
        return g107c;
    }

    public void setG107c(String g107c) {
        if (this.g107c.equals(g107c)) return;
        this.g107c = g107c;
        notifyPropertyChanged(BR.g107c);
    }

    @Bindable
    public String getG107d() {
        return g107d;
    }

    public void setG107d(String g107d) {
        if (this.g107d.equals(g107d)) return;
        this.g107d = g107d;
        notifyPropertyChanged(BR.g107d);
    }

    @Bindable
    public String getG107e() {
        return g107e;
    }

    public void setG107e(String g107e) {
        if (this.g107e.equals(g107e)) return;
        this.g107e = g107e;
        notifyPropertyChanged(BR.g107e);
    }

    @Bindable
    public String getG10796() {
        return g10796;
    }

    public void setG10796(String g10796) {
        if (this.g10796.equals(g10796)) return;
        this.g10796 = g10796;
        setG10796(this.g10796.equals("96") ? this.g10796x : "");
        notifyPropertyChanged(BR.g10796);
    }

    @Bindable
    public String getG10796x() {
        return g10796x;
    }

    public void setG10796x(String g10796x) {
        this.g10796x = g10796x;
        notifyPropertyChanged(BR.g10796x);
    }

    @Bindable
    public String getG108() {
        return g108;
    }

    public void setG108(String g108) {
        this.g108 = g108;
        notifyPropertyChanged(BR.g108);
    }

    @Bindable
    public String getG1091() {
        return g1091;
    }

    public void setG1091(String g1091) {
        this.g1091 = g1091;
        notifyPropertyChanged(BR.g1091);
    }

    @Bindable
    public String getG1092() {
        return g1092;
    }

    public void setG1092(String g1092) {
        this.g1092 = g1092;
        notifyPropertyChanged(BR.g1092);
    }

    @Bindable
    public String getG1093() {
        return g1093;
    }

    public void setG1093(String g1093) {
        this.g1093 = g1093;
        notifyPropertyChanged(BR.g1093);
    }

    @Bindable
    public String getG1094() {
        return g1094;
    }

    public void setG1094(String g1094) {
        this.g1094 = g1094;
        notifyPropertyChanged(BR.g1094);
    }

    @Bindable
    public String getG1095() {
        return g1095;
    }

    public void setG1095(String g1095) {
        this.g1095 = g1095;
        notifyPropertyChanged(BR.g1095);
    }

    @Bindable
    public String getG1101() {
        return g1101;
    }

    public void setG1101(String g1101) {
        this.g1101 = g1101;
        notifyPropertyChanged(BR.g1101);
    }

    @Bindable
    public String getG1102() {
        return g1102;
    }

    public void setG1102(String g1102) {
        this.g1102 = g1102;
        notifyPropertyChanged(BR.g1102);
    }

    @Bindable
    public String getG1103() {
        return g1103;
    }

    public void setG1103(String g1103) {
        this.g1103 = g1103;
        notifyPropertyChanged(BR.g1103);
    }

    @Bindable
    public String getG1104() {
        return g1104;
    }

    public void setG1104(String g1104) {
        this.g1104 = g1104;
        notifyPropertyChanged(BR.g1104);
    }

    @Bindable
    public String getG1105() {
        return g1105;
    }

    public void setG1105(String g1105) {
        this.g1105 = g1105;
        notifyPropertyChanged(BR.g1105);
    }

    @Bindable
    public String getG111() {
        return g111;
    }

    public void setG111(String g111) {
        this.g111 = g111;
        notifyPropertyChanged(BR.g111);
    }

    @Bindable
    public String getG111a() {
        return g111a;
    }

    public void setG111a(String g111a) {
        if (this.g111a.equals(g111a)) return;
        this.g111a = g111a;
        notifyPropertyChanged(BR.g111a);
    }

    @Bindable
    public String getG111b() {
        return g111b;
    }

    public void setG111b(String g111b) {
        if (this.g111b.equals(g111b)) return;
        this.g111b = g111b;
        notifyPropertyChanged(BR.g111b);
    }

    @Bindable
    public String getG111c() {
        return g111c;
    }

    public void setG111c(String g111c) {
        if (this.g111c.equals(g111c)) return;
        this.g111c = g111c;
        notifyPropertyChanged(BR.g111c);
    }

    @Bindable
    public String getG111d() {
        return g111d;
    }

    public void setG111d(String g111d) {
        if (this.g111d.equals(g111d)) return;
        this.g111d = g111d;
        notifyPropertyChanged(BR.g111d);
    }

    @Bindable
    public String getG111e() {
        return g111e;
    }

    public void setG111e(String g111e) {
        if (this.g111e.equals(g111e)) return;
        this.g111e = g111e;
        notifyPropertyChanged(BR.g111e);
    }

    @Bindable
    public String getG11196() {
        return g11196;
    }

    public void setG11196(String g11196) {
        if (this.g11196.equals(g11196)) return;
        this.g11196 = g11196;
        setG11196(this.g11196.equals("96") ? this.g11196x : "");
        notifyPropertyChanged(BR.g11196);
    }

    @Bindable
    public String getG11196x() {
        return g11196x;
    }

    public void setG11196x(String g11196x) {
        this.g11196x = g11196x;
        notifyPropertyChanged(BR.g11196x);
    }

    @Bindable
    public String getG112() {
        return g112;
    }

    public void setG112(String g112) {
        this.g112 = g112;
        notifyPropertyChanged(BR.g112);
    }

    @Bindable
    public String getG112a() {
        return g112a;
    }

    public void setG112a(String g112a) {
        if (this.g112a.equals(g112a)) return;
        this.g112a = g112a;
        notifyPropertyChanged(BR.g112a);
    }

    @Bindable
    public String getG112b() {
        return g112b;
    }

    public void setG112b(String g112b) {
        if (this.g112b.equals(g112b)) return;
        this.g112b = g112b;
        notifyPropertyChanged(BR.g112b);
    }

    @Bindable
    public String getG112c() {
        return g112c;
    }

    public void setG112c(String g112c) {
        if (this.g112c.equals(g112c)) return;
        this.g112c = g112c;
        notifyPropertyChanged(BR.g112c);
    }

    @Bindable
    public String getG112d() {
        return g112d;
    }

    public void setG112d(String g112d) {
        if (this.g112d.equals(g112d)) return;
        this.g112d = g112d;
        notifyPropertyChanged(BR.g112d);
    }

    @Bindable
    public String getG112e() {
        return g112e;
    }

    public void setG112e(String g112e) {
        if (this.g112e.equals(g112e)) return;
        this.g112e = g112e;
        notifyPropertyChanged(BR.g112e);
    }

    @Bindable
    public String getG112f() {
        return g112f;
    }

    public void setG112f(String g112f) {
        if (this.g112f.equals(g112f)) return;
        this.g112f = g112f;
        notifyPropertyChanged(BR.g112f);
    }

    @Bindable
    public String getG11296() {
        return g11296;
    }

    public void setG11296(String g11296) {
        if (this.g11296.equals(g11296)) return;
        this.g11296 = g11296;
        setG11296(g11296.equals("96") ? this.g11296x : "");
        notifyPropertyChanged(BR.g11296);
    }

    @Bindable
    public String getG11296x() {
        return g11296x;
    }

    public void setG11296x(String g11296x) {
        this.g11296x = g11296x;
        notifyPropertyChanged(BR.g11296x);
    }

    @Bindable
    public String getG1131() {
        return g1131;
    }

    public void setG1131(String g1131) {
        this.g1131 = g1131;
        notifyPropertyChanged(BR.g1131);
    }

    @Bindable
    public String getG1132() {
        return g1132;
    }

    public void setG1132(String g1132) {
        this.g1132 = g1132;
        notifyPropertyChanged(BR.g1132);
    }

    @Bindable
    public String getG1133() {
        return g1133;
    }

    public void setG1133(String g1133) {
        this.g1133 = g1133;
        notifyPropertyChanged(BR.g1133);
    }

    @Bindable
    public String getG1134() {
        return g1134;
    }

    public void setG1134(String g1134) {
        this.g1134 = g1134;
        notifyPropertyChanged(BR.g1134);
    }

    @Bindable
    public String getG1135() {
        return g1135;
    }

    public void setG1135(String g1135) {
        this.g1135 = g1135;
        notifyPropertyChanged(BR.g1135);
    }

    @Bindable
    public String getG1136() {
        return g1136;
    }

    public void setG1136(String g1136) {
        this.g1136 = g1136;
        notifyPropertyChanged(BR.g1136);
    }

    @Bindable
    public String getG1141() {
        return g1141;
    }

    public void setG1141(String g1141) {
        this.g1141 = g1141;
        notifyPropertyChanged(BR.g1141);
    }

    @Bindable
    public String getG1142() {
        return g1142;
    }

    public void setG1142(String g1142) {
        this.g1142 = g1142;
        notifyPropertyChanged(BR.g1142);
    }

    @Bindable
    public String getG1143() {
        return g1143;
    }

    public void setG1143(String g1143) {
        this.g1143 = g1143;
        notifyPropertyChanged(BR.g1143);
    }

    @Bindable
    public String getG1144() {
        return g1144;
    }

    public void setG1144(String g1144) {
        this.g1144 = g1144;
        notifyPropertyChanged(BR.g1144);
    }

    @Bindable
    public String getG1145() {
        return g1145;
    }

    public void setG1145(String g1145) {
        this.g1145 = g1145;
        notifyPropertyChanged(BR.g1145);
    }

    @Bindable
    public String getG1146() {
        return g1146;
    }

    public void setG1146(String g1146) {
        this.g1146 = g1146;
        notifyPropertyChanged(BR.g1146);
    }

    @Bindable
    public String getG115() {
        return g115;
    }

    public void setG115(String g115) {
        this.g115 = g115;
        notifyPropertyChanged(BR.g115);
    }

    @Bindable
    public String getG1161() {
        return g1161;
    }

    public void setG1161(String g1161) {
        this.g1161 = g1161;
        notifyPropertyChanged(BR.g1161);
    }

    @Bindable
    public String getG1162() {
        return g1162;
    }

    public void setG1162(String g1162) {
        this.g1162 = g1162;
        notifyPropertyChanged(BR.g1162);
    }

    @Bindable
    public String getG1163() {
        return g1163;
    }

    public void setG1163(String g1163) {
        this.g1163 = g1163;
        notifyPropertyChanged(BR.g1163);
    }

    @Bindable
    public String getG1164() {
        return g1164;
    }

    public void setG1164(String g1164) {
        this.g1164 = g1164;
        notifyPropertyChanged(BR.g1164);
    }

    @Bindable
    public String getG1165() {
        return g1165;
    }

    public void setG1165(String g1165) {
        this.g1165 = g1165;
        notifyPropertyChanged(BR.g1165);
    }

    @Bindable
    public String getG1166() {
        return g1166;
    }

    public void setG1166(String g1166) {
        this.g1166 = g1166;
        notifyPropertyChanged(BR.g1166);
    }

    @Bindable
    public String getG1167() {
        return g1167;
    }

    public void setG1167(String g1167) {
        this.g1167 = g1167;
        notifyPropertyChanged(BR.g1167);
    }

    @Bindable
    public String getG1168() {
        return g1168;
    }

    public void setG1168(String g1168) {
        this.g1168 = g1168;
        notifyPropertyChanged(BR.g1168);
    }

    @Bindable
    public String getG117() {
        return g117;
    }

    public void setG117(String g117) {
        this.g117 = g117;
        setG11796x(g117.equals("96") ? this.g11796x : "");
        notifyPropertyChanged(BR.g117);
    }

    @Bindable
    public String getG11796x() {
        return g11796x;
    }

    public void setG11796x(String g11796x) {
        this.g11796x = g11796x;
        notifyPropertyChanged(BR.g11796x);
    }

    @Bindable
    public String getG201() {
        return g201;
    }

    public void setG201(String g201) {
        this.g201 = g201;
        notifyPropertyChanged(BR.g201);
    }

    @Bindable
    public String getG201a() {
        return g201a;
    }

    public void setG201a(String g201a) {
        if (this.g201a.equals(g201a)) return;
        this.g201a = g201a;
        notifyPropertyChanged(BR.g201a);
    }

    @Bindable
    public String getG201b() {
        return g201b;
    }

    public void setG201b(String g201b) {
        if (this.g201b.equals(g201b)) return;
        this.g201b = g201b;
        notifyPropertyChanged(BR.g201b);
    }

    @Bindable
    public String getG201c() {
        return g201c;
    }

    public void setG201c(String g201c) {
        if (this.g201c.equals(g201c)) return;
        this.g201c = g201c;
        notifyPropertyChanged(BR.g201c);
    }

    @Bindable
    public String getG201d() {
        return g201d;
    }

    public void setG201d(String g201d) {
        if (this.g201d.equals(g201d)) return;
        this.g201d = g201d;
        notifyPropertyChanged(BR.g201d);
    }

    @Bindable
    public String getG201e() {
        return g201e;
    }

    public void setG201e(String g201e) {
        if (this.g201e.equals(g201e)) return;
        this.g201e = g201e;
        notifyPropertyChanged(BR.g201e);
    }

    @Bindable
    public String getG201f() {
        return g201f;
    }

    public void setG201f(String g201f) {
        if (this.g201f.equals(g201f)) return;
        this.g201f = g201f;
        setG202(g201f.equals("6") ? this.g202 : "");
        setG2031(g201f.equals("6") ? this.g2031 : "");
        setG2032(g201f.equals("6") ? this.g2032 : "");
        setG2033(g201f.equals("6") ? this.g2033 : "");
        setG2034(g201f.equals("6") ? this.g2034 : "");
        setG2035(g201f.equals("6") ? this.g2035 : "");
        setG2036(g201f.equals("6") ? this.g2036 : "");
        setG204(g201f.equals("6") ? this.g204 : "");
        setG205(g201f.equals("6") ? this.g205 : "");

        notifyPropertyChanged(BR.g201f);
    }

    @Bindable
    public String getG201g() {
        return g201g;
    }

    public void setG201g(String g201g) {
        if (this.g201g.equals(g201g)) return;
        this.g201g = g201g;
        notifyPropertyChanged(BR.g201g);
    }

    @Bindable
    public String getG201h() {
        return g201h;
    }

    public void setG201h(String g201h) {
        if (this.g201h.equals(g201h)) return;
        this.g201h = g201h;
        notifyPropertyChanged(BR.g201h);
    }

    @Bindable
    public String getG201i() {
        return g201i;
    }

    public void setG201i(String g201i) {
        if (this.g201i.equals(g201i)) return;
        this.g201i = g201i;
        notifyPropertyChanged(BR.g201i);
    }

    @Bindable
    public String getG20197() {
        return g20197;
    }

    public void setG20197(String g20197) {
        if (this.g20197.equals(g20197)) return;
        this.g20197 = g20197;
        notifyPropertyChanged(BR.g20197);
    }

    @Bindable
    public String getG202() {
        return g202;
    }

    public void setG202(String g202) {
        this.g202 = g202;
        notifyPropertyChanged(BR.g202);
    }

    @Bindable
    public String getG2031() {
        return g2031;
    }

    public void setG2031(String g2031) {
        this.g2031 = g2031;
        notifyPropertyChanged(BR.g2031);
    }

    @Bindable
    public String getG2031a() {
        return g2031a;
    }

    public void setG2031a(String g2031a) {
        this.g2031a = g2031a;
        notifyPropertyChanged(BR.g2031a);
    }

    @Bindable
    public String getG2031b() {
        return g2031b;
    }

    public void setG2031b(String g2031b) {
        this.g2031b = g2031b;
        notifyPropertyChanged(BR.g2031b);
    }

    @Bindable
    public String getG2032() {
        return g2032;
    }

    public void setG2032(String g2032) {
        this.g2032 = g2032;
        notifyPropertyChanged(BR.g2032);
    }

    @Bindable
    public String getG2032a() {
        return g2032a;
    }

    public void setG2032a(String g2032a) {
        this.g2032a = g2032a;
        notifyPropertyChanged(BR.g2032a);
    }

    @Bindable
    public String getG2032b() {
        return g2032b;
    }

    public void setG2032b(String g2032b) {
        this.g2032b = g2032b;
        notifyPropertyChanged(BR.g2032b);
    }

    @Bindable
    public String getG2033() {
        return g2033;
    }

    public void setG2033(String g2033) {
        this.g2033 = g2033;
        notifyPropertyChanged(BR.g2033);
    }

    @Bindable
    public String getG2033a() {
        return g2033a;
    }

    public void setG2033a(String g2033a) {
        this.g2033a = g2033a;
        notifyPropertyChanged(BR.g2033a);
    }

    @Bindable
    public String getG2033b() {
        return g2033b;
    }

    public void setG2033b(String g2033b) {
        this.g2033b = g2033b;
        notifyPropertyChanged(BR.g2033b);
    }

    @Bindable
    public String getG2034() {
        return g2034;
    }

    public void setG2034(String g2034) {
        this.g2034 = g2034;
        notifyPropertyChanged(BR.g2034);
    }

    @Bindable
    public String getG2034a() {
        return g2034a;
    }

    public void setG2034a(String g2034a) {
        this.g2034a = g2034a;
        notifyPropertyChanged(BR.g2034a);
    }

    @Bindable
    public String getG2034b() {
        return g2034b;
    }

    public void setG2034b(String g2034b) {
        this.g2034b = g2034b;
        notifyPropertyChanged(BR.g2034b);
    }

    @Bindable
    public String getG2035() {
        return g2035;
    }

    public void setG2035(String g2035) {
        this.g2035 = g2035;
        notifyPropertyChanged(BR.g2035);
    }

    @Bindable
    public String getG2035a() {
        return g2035a;
    }

    public void setG2035a(String g2035a) {
        this.g2035a = g2035a;
        notifyPropertyChanged(BR.g2035a);
    }

    @Bindable
    public String getG2035b() {
        return g2035b;
    }

    public void setG2035b(String g2035b) {
        this.g2035b = g2035b;
        notifyPropertyChanged(BR.g2035b);
    }

    @Bindable
    public String getG2036() {
        return g2036;
    }

    public void setG2036(String g2036) {
        this.g2036 = g2036;
        notifyPropertyChanged(BR.g2036);
    }

    @Bindable
    public String getG2036a() {
        return g2036a;
    }

    public void setG2036a(String g2036a) {
        this.g2036a = g2036a;
        notifyPropertyChanged(BR.g2036a);
    }

    @Bindable
    public String getG2036b() {
        return g2036b;
    }

    public void setG2036b(String g2036b) {
        this.g2036b = g2036b;
        notifyPropertyChanged(BR.g2036b);
    }

    @Bindable
    public String getG204() {
        return g204;
    }

    public void setG204(String g204) {
        this.g204 = g204;
        notifyPropertyChanged(BR.g204);
    }

    @Bindable
    public String getG205() {
        return g205;
    }

    public void setG205(String g205) {
        this.g205 = g205;
        setG20596x(g205.equals("96") ? this.g20596x : "");
        notifyPropertyChanged(BR.g205);
    }

    @Bindable
    public String getG20596x() {
        return g20596x;
    }

    public void setG20596x(String g20596x) {
        this.g20596x = g20596x;
        notifyPropertyChanged(BR.g20596x);
    }

    @Bindable
    public String getG301() {
        return g301;
    }

    public void setG301(String g301) {
        this.g301 = g301;
        setG302(g301.equals("1") ? this.g302 : "");
        setG3031(g301.equals("1") ? this.g3031 : "");
        setG3032(g301.equals("1") ? this.g3032 : "");
        setG3033(g301.equals("1") ? this.g3033 : "");
        setG3034(g301.equals("1") ? this.g3034 : "");
        setG3035(g301.equals("1") ? this.g3035 : "");
        setG3036(g301.equals("1") ? this.g3036 : "");
        setG304(g301.equals("1") ? this.g304 : "");
        setG305(g301.equals("1") ? this.g305 : "");
        setG306(g301.equals("1") ? this.g306 : "");
        setG307(g301.equals("1") ? this.g307 : "");
        setG308(g301.equals("1") ? this.g308 : "");

        notifyPropertyChanged(BR.g301);
    }

    @Bindable
    public String getG302() {
        return g302;
    }

    public void setG302(String g302) {
        this.g302 = g302;
        setG30296x(g302.equals("96") ? this.g30296x : "");
        notifyPropertyChanged(BR.g302);
    }

    @Bindable
    public String getG30296x() {
        return g30296x;
    }

    public void setG30296x(String g30296x) {
        this.g30296x = g30296x;
        notifyPropertyChanged(BR.g30296x);
    }

    @Bindable
    public String getG30396() {
        return g30396;
    }

    public void setG30396(String g30396) {
        this.g30396 = g30396;
        notifyPropertyChanged(BR.g30396);
    }

    @Bindable
    public String getG3031() {
        return g3031;
    }

    public void setG3031(String g3031) {
        this.g3031 = g3031;
        notifyPropertyChanged(BR.g3031);
    }

    @Bindable
    public String getG3032() {
        return g3032;
    }

    public void setG3032(String g3032) {
        this.g3032 = g3032;
        notifyPropertyChanged(BR.g3032);
    }

    @Bindable
    public String getG3033() {
        return g3033;
    }

    public void setG3033(String g3033) {
        this.g3033 = g3033;
        notifyPropertyChanged(BR.g3033);
    }

    @Bindable
    public String getG3034() {
        return g3034;
    }

    public void setG3034(String g3034) {
        this.g3034 = g3034;
        notifyPropertyChanged(BR.g3034);
    }

    @Bindable
    public String getG3035() {
        return g3035;
    }

    public void setG3035(String g3035) {
        this.g3035 = g3035;
        notifyPropertyChanged(BR.g3035);
    }

    @Bindable
    public String getG3036() {
        return g3036;
    }

    public void setG3036(String g3036) {
        this.g3036 = g3036;
        notifyPropertyChanged(BR.g3036);
    }

    @Bindable
    public String getG304() {
        return g304;
    }

    public void setG304(String g304) {
        this.g304 = g304;
        notifyPropertyChanged(BR.g304);
    }

    @Bindable
    public String getG305() {
        return g305;
    }

    public void setG305(String g305) {
        this.g305 = g305;
        notifyPropertyChanged(BR.g305);
    }

    @Bindable
    public String getG306() {
        return g306;
    }

    public void setG306(String g306) {
        this.g306 = g306;
        notifyPropertyChanged(BR.g306);
    }

    @Bindable
    public String getG307() {
        return g307;
    }

    public void setG307(String g307) {
        this.g307 = g307;
        notifyPropertyChanged(BR.g307);
    }

    @Bindable
    public String getG308() {
        return g308;
    }

    public void setG308(String g308) {
        this.g308 = g308;
        setG30896x(g308.equals("96") ? this.g30896x : "");
        notifyPropertyChanged(BR.g308);
    }

    @Bindable
    public String getG30896x() {
        return g30896x;
    }

    public void setG30896x(String g30896x) {
        this.g30896x = g30896x;
        notifyPropertyChanged(BR.g30896x);
    }

    @Bindable
    public String getG401() {
        return g401;
    }

    public void setG401(String g401) {
        this.g401 = g401;
        notifyPropertyChanged(BR.g401);
    }

    @Bindable
    public String getG401a() {
        return g401a;
    }

    public void setG401a(String g401a) {
        if (this.g401a.equals(g401a)) return;
        this.g401a = g401a;
        notifyPropertyChanged(BR.g401a);
    }

    @Bindable
    public String getG401b() {
        return g401b;
    }

    public void setG401b(String g401b) {
        if (this.g401b.equals(g401b)) return;
        this.g401b = g401b;
        notifyPropertyChanged(BR.g401b);
    }

    @Bindable
    public String getG401c() {
        return g401c;
    }

    public void setG401c(String g401c) {
        if (this.g401c.equals(g401c)) return;
        this.g401c = g401c;
        notifyPropertyChanged(BR.g401c);
    }

    @Bindable
    public String getG401d() {
        return g401d;
    }

    public void setG401d(String g401d) {
        if (this.g401d.equals(g401d)) return;
        this.g401d = g401d;
        notifyPropertyChanged(BR.g401d);
    }

    @Bindable
    public String getG401e() {
        return g401e;
    }

    public void setG401e(String g401e) {
        if (this.g401e.equals(g401e)) return;
        this.g401e = g401e;
        notifyPropertyChanged(BR.g401e);
    }

    @Bindable
    public String getG401f() {
        return g401f;
    }

    public void setG401f(String g401f) {
        if (this.g401f.equals(g401f)) return;
        this.g401f = g401f;
        notifyPropertyChanged(BR.g401f);
    }

    @Bindable
    public String getG401g() {
        return g401g;
    }

    public void setG401g(String g401g) {
        if (this.g401g.equals(g401g)) return;
        this.g401g = g401g;
        notifyPropertyChanged(BR.g401g);
    }

    @Bindable
    public String getG401h() {
        return g401h;
    }

    public void setG401h(String g401h) {
        if (this.g401h.equals(g401h)) return;
        this.g401h = g401h;
        notifyPropertyChanged(BR.g401h);
    }

    @Bindable
    public String getG401i() {
        return g401i;
    }

    public void setG401i(String g401i) {
        if (this.g401i.equals(g401i)) return;
        this.g401i = g401i;
        notifyPropertyChanged(BR.g401i);
    }

    @Bindable
    public String getG401j() {
        return g401j;
    }

    public void setG401j(String g401j) {
        if (this.g401j.equals(g401j)) return;
        this.g401j = g401j;
        notifyPropertyChanged(BR.g401j);
    }

    @Bindable
    public String getG402() {
        return g402;
    }

    public void setG402(String g402) {
        this.g402 = g402;
        notifyPropertyChanged(BR.g402);
    }

    @Bindable
    public String getG403() {
        return g403;
    }

    public void setG403(String g403) {
        this.g403 = g403;
        notifyPropertyChanged(BR.g403);
    }

    @Bindable
    public String getG404() {
        return g404;
    }

    public void setG404(String g404) {
        this.g404 = g404;
        notifyPropertyChanged(BR.g404);
    }

    @Bindable
    public String getG40596() {
        return g40596;
    }

    public void setG40596(String g40596) {
        this.g40596 = g40596;
        notifyPropertyChanged(BR.g40596);
    }

    @Bindable
    public String getG4051() {
        return g4051;
    }

    public void setG4051(String g4051) {
        this.g4051 = g4051;
        notifyPropertyChanged(BR.g4051);
    }

    @Bindable
    public String getG4052() {
        return g4052;
    }

    public void setG4052(String g4052) {
        this.g4052 = g4052;
        notifyPropertyChanged(BR.g4052);
    }

    @Bindable
    public String getG4053() {
        return g4053;
    }

    public void setG4053(String g4053) {
        this.g4053 = g4053;
        notifyPropertyChanged(BR.g4053);
    }

    @Bindable
    public String getG4054() {
        return g4054;
    }

    public void setG4054(String g4054) {
        this.g4054 = g4054;
        notifyPropertyChanged(BR.g4054);
    }

    @Bindable
    public String getG4055() {
        return g4055;
    }

    public void setG4055(String g4055) {
        this.g4055 = g4055;
        notifyPropertyChanged(BR.g4055);
    }

    @Bindable
    public String getG4056() {
        return g4056;
    }

    public void setG4056(String g4056) {
        this.g4056 = g4056;
        notifyPropertyChanged(BR.g4056);
    }

    @Bindable
    public String getG4057() {
        return g4057;
    }

    public void setG4057(String g4057) {
        this.g4057 = g4057;
        notifyPropertyChanged(BR.g4057);
    }

    @Bindable
    public String getG406() {
        return g406;
    }

    public void setG406(String g406) {
        this.g406 = g406;
        notifyPropertyChanged(BR.g406);
    }

    @Bindable
    public String getG4071() {
        return g4071;
    }

    public void setG4071(String g4071) {
        this.g4071 = g4071;
        notifyPropertyChanged(BR.g4071);
    }

    @Bindable
    public String getG4072() {
        return g4072;
    }

    public void setG4072(String g4072) {
        this.g4072 = g4072;
        notifyPropertyChanged(BR.g4072);
    }

    @Bindable
    public String getG4073() {
        return g4073;
    }

    public void setG4073(String g4073) {
        this.g4073 = g4073;
        notifyPropertyChanged(BR.g4073);
    }

    @Bindable
    public String getG4074() {
        return g4074;
    }

    public void setG4074(String g4074) {
        this.g4074 = g4074;
        notifyPropertyChanged(BR.g4074);
    }

    @Bindable
    public String getG4075() {
        return g4075;
    }

    public void setG4075(String g4075) {
        this.g4075 = g4075;
        notifyPropertyChanged(BR.g4075);
    }

    @Bindable
    public String getG4076() {
        return g4076;
    }

    public void setG4076(String g4076) {
        this.g4076 = g4076;
        notifyPropertyChanged(BR.g4076);
    }

    @Bindable
    public String getG4077() {
        return g4077;
    }

    public void setG4077(String g4077) {
        this.g4077 = g4077;
        notifyPropertyChanged(BR.g4077);
    }

    @Bindable
    public String getG4078() {
        return g4078;
    }

    public void setG4078(String g4078) {
        this.g4078 = g4078;
        notifyPropertyChanged(BR.g4078);
    }

    @Bindable
    public String getG501m() {
        return g501m;
    }

    public void setG501m(String g501m) {
        this.g501m = g501m;
        notifyPropertyChanged(BR.g501m);
    }

    @Bindable
    public String getG501f() {
        return g501f;
    }

    public void setG501f(String g501f) {
        this.g501f = g501f;
        notifyPropertyChanged(BR.g501f);
    }

    @Bindable
    public String getG502() {
        return g502;
    }

    public void setG502(String g502) {
        this.g502 = g502;
        notifyPropertyChanged(BR.g502);
    }

    @Bindable
    public String getG503() {
        return g503;
    }

    public void setG503(String g503) {
        this.g503 = g503;
        notifyPropertyChanged(BR.g503);
    }

    @Bindable
    public String getG504() {
        return g504;
    }

    public void setG504(String g504) {
        this.g504 = g504;
        notifyPropertyChanged(BR.g504);
    }

    @Bindable
    public String getG505() {
        return g505;
    }

    public void setG505(String g505) {
        this.g505 = g505;
        notifyPropertyChanged(BR.g505);
    }

    @Bindable
    public String getG506() {
        return g506;
    }

    public void setG506(String g506) {
        this.g506 = g506;
        setG507a(g506.equals("1") ? this.g507a : "");
        setG507b(g506.equals("1") ? this.g507b : "");
        setG507c(g506.equals("1") ? this.g507c : "");
        setG507d(g506.equals("1") ? this.g507d : "");
        setG507e(g506.equals("1") ? this.g507e : "");
        setG50796(g506.equals("1") ? this.g50796 : "");
        notifyPropertyChanged(BR.g506);
    }

    @Bindable
    public String getG507() {
        return g507;
    }

    public void setG507(String g507) {
        this.g507 = g507;
        notifyPropertyChanged(BR.g507);
    }

    @Bindable
    public String getG507a() {
        return g507a;
    }

    public void setG507a(String g507a) {
        if (this.g507a.equals(g507a)) return;
        this.g507a = g507a;
        notifyPropertyChanged(BR.g507a);
    }

    @Bindable
    public String getG507b() {
        return g507b;
    }

    public void setG507b(String g507b) {
        if (this.g507b.equals(g507b)) return;
        this.g507b = g507b;
        notifyPropertyChanged(BR.g507b);
    }

    @Bindable
    public String getG507c() {
        return g507c;
    }

    public void setG507c(String g507c) {
        if (this.g507c.equals(g507c)) return;
        this.g507c = g507c;
        notifyPropertyChanged(BR.g507c);
    }

    @Bindable
    public String getG507d() {
        return g507d;
    }

    public void setG507d(String g507d) {
        if (this.g507d.equals(g507d)) return;
        this.g507d = g507d;
        notifyPropertyChanged(BR.g507d);
    }

    @Bindable
    public String getG507e() {
        return g507e;
    }

    public void setG507e(String g507e) {
        if (this.g507e.equals(g507e)) return;
        this.g507e = g507e;
        notifyPropertyChanged(BR.g507e);
    }

    @Bindable
    public String getG50796() {
        return g50796;
    }

    public void setG50796(String g50796) {
        if (this.g50796.equals(g50796)) return;
        this.g50796 = g50796;
        setG50796x(g50796.equals("96") ? this.g50796x : "");
        notifyPropertyChanged(BR.g50796);
    }

    @Bindable
    public String getG50796x() {
        return g50796x;
    }

    public void setG50796x(String g50796x) {
        this.g50796x = g50796x;
        notifyPropertyChanged(BR.g50796x);
    }

    @Bindable
    public String getG508() {
        return g508;
    }

    public void setG508(String g508) {
        this.g508 = g508;
        setG509a(g508.equals("1") ? this.g509a : "");
        setG509b(g508.equals("1") ? this.g509b : "");
        setG509c(g508.equals("1") ? this.g509c : "");
        setG509d(g508.equals("1") ? this.g509d : "");
        setG509e(g508.equals("1") ? this.g509e : "");
        setG50996(g508.equals("1") ? this.g50996 : "");

        notifyPropertyChanged(BR.g508);
    }

    @Bindable
    public String getG509() {
        return g509;
    }

    public void setG509(String g509) {
        this.g509 = g509;
        notifyPropertyChanged(BR.g509);
    }

    @Bindable
    public String getG509a() {
        return g509a;
    }

    public void setG509a(String g509a) {
        if (this.g509a.equals(g509a)) return;
        this.g509a = g509a;
        notifyPropertyChanged(BR.g509a);
    }

    @Bindable
    public String getG509b() {
        return g509b;
    }

    public void setG509b(String g509b) {
        if (this.g509b.equals(g509b)) return;
        this.g509b = g509b;
        notifyPropertyChanged(BR.g509b);
    }

    @Bindable
    public String getG509c() {
        return g509c;
    }

    public void setG509c(String g509c) {
        if (this.g509c.equals(g509c)) return;
        this.g509c = g509c;
        notifyPropertyChanged(BR.g509c);
    }

    @Bindable
    public String getG509d() {
        return g509d;
    }

    public void setG509d(String g509d) {
        if (this.g509d.equals(g509d)) return;
        this.g509d = g509d;
        notifyPropertyChanged(BR.g509d);
    }

    @Bindable
    public String getG509e() {
        return g509e;
    }

    public void setG509e(String g509e) {
        if (this.g509e.equals(g509e)) return;
        this.g509e = g509e;
        notifyPropertyChanged(BR.g509e);
    }

    @Bindable
    public String getG50996() {
        return g50996;
    }

    public void setG50996(String g50996) {
        if (this.g50996.equals(g50996)) return;
        this.g50996 = g50996;
        setG50996x(g509.equals("96") ? this.g50996x : "");
        notifyPropertyChanged(BR.g50996);
    }

    @Bindable
    public String getG50996x() {
        return g50996x;
    }

    public void setG50996x(String g50996x) {
        this.g50996x = g50996x;
        notifyPropertyChanged(BR.g50996x);
    }

    @Bindable
    public String getG601() {
        return g601;
    }

    public void setG601(String g601) {
        this.g601 = g601;
        setG602a(g601.equals("1") ? this.g602a : "");
        setG602b(g601.equals("1") ? this.g602b : "");
        setG602c(g601.equals("1") ? this.g602c : "");
        setG602d(g601.equals("1") ? this.g602d : "");
        setG602e(g601.equals("1") ? this.g602e : "");
        setG602f(g601.equals("1") ? this.g602f : "");
        setG602g(g601.equals("1") ? this.g602g : "");
        setG60296(g601.equals("1") ? this.g60296 : "");

        notifyPropertyChanged(BR.g601);
    }

    @Bindable
    public String getG602() {
        return g602;
    }

    public void setG602(String g602) {
        this.g602 = g602;
        notifyPropertyChanged(BR.g602);
    }

    @Bindable
    public String getG602a() {
        return g602a;
    }

    public void setG602a(String g602a) {
        if (this.g602a.equals(g602a)) return;
        this.g602a = g602a;
        notifyPropertyChanged(BR.g602a);
    }

    @Bindable
    public String getG602b() {
        return g602b;
    }

    public void setG602b(String g602b) {
        if (this.g602b.equals(g602b)) return;
        this.g602b = g602b;
        notifyPropertyChanged(BR.g602b);
    }

    @Bindable
    public String getG602c() {
        return g602c;
    }

    public void setG602c(String g602c) {
        if (this.g602c.equals(g602c)) return;
        this.g602c = g602c;
        notifyPropertyChanged(BR.g602c);
    }

    @Bindable
    public String getG602d() {
        return g602d;
    }

    public void setG602d(String g602d) {
        if (this.g602d.equals(g602d)) return;
        this.g602d = g602d;
        notifyPropertyChanged(BR.g602d);
    }

    @Bindable
    public String getG602e() {
        return g602e;
    }

    public void setG602e(String g602e) {
        if (this.g602e.equals(g602e)) return;
        this.g602e = g602e;
        notifyPropertyChanged(BR.g602e);
    }

    @Bindable
    public String getG602f() {
        return g602f;
    }

    public void setG602f(String g602f) {
        if (this.g602f.equals(g602f)) return;
        this.g602f = g602f;
        notifyPropertyChanged(BR.g602f);
    }

    @Bindable
    public String getG602g() {
        return g602g;
    }

    public void setG602g(String g602g) {
        if (this.g602g.equals(g602g)) return;
        this.g602g = g602g;
        notifyPropertyChanged(BR.g602g);
    }

    @Bindable
    public String getG60296() {
        return g60296;
    }

    public void setG60296(String g60296) {
        if (this.g60296.equals(g60296)) return;
        this.g60296 = g60296;
        setG60296x(g60296.equals("96") ? this.g60296x : "");
        notifyPropertyChanged(BR.g60296);
    }

    @Bindable
    public String getG60296x() {
        return g60296x;
    }

    public void setG60296x(String g60296x) {
        this.g60296x = g60296x;
        notifyPropertyChanged(BR.g60296x);
    }

    @Bindable
    public String getG603() {
        return g603;
    }

    public void setG603(String g603) {
        this.g603 = g603;
        setG60396x(g603.equals("96") ? this.g60396x : "");
        notifyPropertyChanged(BR.g603);
    }

    @Bindable
    public String getG60396x() {
        return g60396x;
    }

    public void setG60396x(String g60396x) {
        this.g60396x = g60396x;
        notifyPropertyChanged(BR.g60396x);
    }

    @Bindable
    public String getG604() {
        return g604;
    }

    public void setG604(String g604) {
        this.g604 = g604;
        setG605a(g604.equals("1") ? this.g605a : "");
        setG605b(g604.equals("1") ? this.g605b : "");
        setG605c(g604.equals("1") ? this.g605c : "");
        setG60596(g604.equals("1") ? this.g60596 : "");
        setG606a(g604.equals("2") ? this.g606a : "");
        setG606b(g604.equals("2") ? this.g606b : "");
        setG606c(g604.equals("2") ? this.g606c : "");
        setG606d(g604.equals("2") ? this.g606d : "");
        setG606e(g604.equals("2") ? this.g606e : "");
        setG60696(g604.equals("2") ? this.g60696 : "");
        notifyPropertyChanged(BR.g604);
    }

    @Bindable
    public String getG605() {
        return g605;
    }

    public void setG605(String g605) {
        this.g605 = g605;
        notifyPropertyChanged(BR.g605);
    }

    @Bindable
    public String getG605a() {
        return g605a;
    }

    public void setG605a(String g605a) {
        if (this.g605a.equals(g605a)) return;
        this.g605a = g605a;
        notifyPropertyChanged(BR.g605a);
    }

    @Bindable
    public String getG605b() {
        return g605b;
    }

    public void setG605b(String g605b) {
        if (this.g605b.equals(g605b)) return;
        this.g605b = g605b;
        notifyPropertyChanged(BR.g605b);
    }

    @Bindable
    public String getG605c() {
        return g605c;
    }

    public void setG605c(String g605c) {
        if (this.g605c.equals(g605c)) return;
        this.g605c = g605c;
        notifyPropertyChanged(BR.g605c);
    }

    @Bindable
    public String getG60596() {
        return g60596;
    }

    public void setG60596(String g60596) {
        if (this.g60596.equals(g60596)) return;
        this.g60596 = g60596;
        setG60596x(g60596.equals("96") ? this.g60596x : "");
        notifyPropertyChanged(BR.g60596);
    }

    @Bindable
    public String getG60596x() {
        return g60596x;
    }

    public void setG60596x(String g60596x) {
        this.g60596x = g60596x;
        notifyPropertyChanged(BR.g60596x);
    }

    @Bindable
    public String getG606() {
        return g606;
    }

    public void setG606(String g606) {
        this.g606 = g606;
        notifyPropertyChanged(BR.g606);
    }

    @Bindable
    public String getG606a() {
        return g606a;
    }

    public void setG606a(String g606a) {
        if (this.g606a.equals(g606a)) return;
        this.g606a = g606a;
        notifyPropertyChanged(BR.g606a);
    }

    @Bindable
    public String getG606b() {
        return g606b;
    }

    public void setG606b(String g606b) {
        if (this.g606b.equals(g606b)) return;
        this.g606b = g606b;
        notifyPropertyChanged(BR.g606b);
    }

    @Bindable
    public String getG606c() {
        return g606c;
    }

    public void setG606c(String g606c) {
        if (this.g606c.equals(g606c)) return;
        this.g606c = g606c;
        notifyPropertyChanged(BR.g606c);
    }

    @Bindable
    public String getG606d() {
        return g606d;
    }

    public void setG606d(String g606d) {
        if (this.g606d.equals(g606d)) return;
        this.g606d = g606d;
        notifyPropertyChanged(BR.g606d);
    }

    @Bindable
    public String getG606e() {
        return g606e;
    }

    public void setG606e(String g606e) {
        if (this.g606e.equals(g606e)) return;
        this.g606e = g606e;
        notifyPropertyChanged(BR.g606e);
    }

    @Bindable
    public String getG60696() {
        return g60696;
    }

    public void setG60696(String g60696) {
        if (this.g60696.equals(g60696)) return;
        this.g60696 = g60696;
        setG60696x(g60696.equals("96") ? this.g60696x : "");
        notifyPropertyChanged(BR.g60696);
    }

    @Bindable
    public String getG60696x() {
        return g60696x;
    }

    public void setG60696x(String g60696x) {
        this.g60696x = g60696x;
        notifyPropertyChanged(BR.g60696x);
    }

    public LHW_GB Hydrate(Cursor cursor) throws JSONException{

        this.id = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LHW_GBTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LHW_GBTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LHW_GBTable.COLUMN_UUID));
        this.lhwuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LHW_GBTable.COLUMN_LHWUID));
        this.cluster = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LHW_GBTable.COLUMN_CLUSTER));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LHW_GBTable.COLUMN_HHID));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LHW_GBTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LHW_GBTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LHW_GBTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LHW_GBTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LHW_GBTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LHW_GBTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LHW_GBTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LHW_GBTable.COLUMN_SYNCED_DATE));
        this.lhwCode = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LHW_GBTable.COLUMN_LHW_CODE));


        sGB01Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.LHW_GBTable.COLUMN_GB01)));

        return this;
    }

    public void sGB01Hydrate(String string) throws JSONException{
        Log.d(TAG, "sGBV02Hydrate: " + string);
        if(string != null){
            JSONObject json = null;
            json = new JSONObject(string);

            this.g101 = json.getString("g101");
            this.g102 = json.getString("g102");
            this.g103a = json.getString("g103a");
            this.g103b = json.getString("g103b");
            this.g103c = json.getString("g103c");
            this.g103d = json.getString("g103d");
            this.g103e = json.getString("g103e");
            this.g103f = json.getString("g103f");
            this.g103g = json.getString("g103g");
            this.g103h = json.getString("g103h");
            this.g103i = json.getString("g103i");
            this.g103j = json.getString("g103j");
            this.g10396 = json.getString("g10396");
            this.g10396x = json.getString("g10396x");
            this.g104a = json.getString("g104a");
            this.g104b = json.getString("g104b");
            this.g104c = json.getString("g104c");
            this.g104d = json.getString("g104d");
            this.g104e = json.getString("g104e");
            this.g104f = json.getString("g104f");
            this.g104g = json.getString("g104g");
            this.g104h = json.getString("g104h");
            this.g104i = json.getString("g104i");
            this.g104j = json.getString("g104j");
            this.g104k = json.getString("g104k");
            this.g104l = json.getString("g104l");
            this.g104m = json.getString("g104m");
            this.g104n = json.getString("g104n");
            this.g104o = json.getString("g104o");
            this.g104p = json.getString("g104p");
            this.g105a = json.getString("g105a");
            this.g105b = json.getString("g105b");
            this.g105c = json.getString("g105c");
            this.g105d = json.getString("g105d");
            this.g105e = json.getString("g105e");
            this.g105f = json.getString("g105f");
            this.g105g = json.getString("g105g");
            this.g105h = json.getString("g105h");
            this.g105i = json.getString("g105i");
            this.g105j = json.getString("g105j");
            this.g105k = json.getString("g105k");
            this.g105l = json.getString("g105l");
            this.g105m = json.getString("g105m");
            this.g105n = json.getString("g105n");
            this.g105o = json.getString("g105o");
            this.g105p = json.getString("g105p");
            this.g106 = json.getString("g106");
            this.g107a = json.getString("g107a");
            this.g107b = json.getString("g107b");
            this.g107c = json.getString("g107c");
            this.g107d = json.getString("g107d");
            this.g107e = json.getString("g107e");
            this.g10796 = json.getString("g10796");
            this.g10796x = json.getString("g10796x");
            this.g108 = json.getString("g108");
            this.g1091 = json.getString("g1091");
            this.g1092 = json.getString("g1092");
            this.g1093 = json.getString("g1093");
            this.g1094 = json.getString("g1094");
            this.g1095 = json.getString("g1095");
            this.g1101 = json.getString("g1101");
            this.g1102 = json.getString("g1102");
            this.g1103 = json.getString("g1103");
            this.g1104 = json.getString("g1104");
            this.g1105 = json.getString("g1105");
            this.g111a = json.getString("g111a");
            this.g111b = json.getString("g111b");
            this.g111c = json.getString("g111c");
            this.g111d = json.getString("g111d");
            this.g111e = json.getString("g111e");
            this.g11196 = json.getString("g11196");
            this.g11196x = json.getString("g11196x");
            this.g112a = json.getString("g112a");
            this.g112b = json.getString("g112b");
            this.g112c = json.getString("g112c");
            this.g112d = json.getString("g112d");
            this.g112e = json.getString("g112e");
            this.g112f = json.getString("g112f");
            this.g11296 = json.getString("g11296");
            this.g11296x = json.getString("g11296x");
            this.g1131 = json.getString("g1131");
            this.g1132 = json.getString("g1132");
            this.g1133 = json.getString("g1133");
            this.g1134 = json.getString("g1134");
            this.g1135 = json.getString("g1135");
            this.g1136 = json.getString("g1136");
            this.g1141 = json.getString("g1141");
            this.g1142 = json.getString("g1142");
            this.g1143 = json.getString("g1143");
            this.g1144 = json.getString("g1144");
            this.g1145 = json.getString("g1145");
            this.g1146 = json.getString("g1146");
            this.g115 = json.getString("g115");
            this.g1161 = json.getString("g1161");
            this.g1162 = json.getString("g1162");
            this.g1163 = json.getString("g1163");
            this.g1164 = json.getString("g1164");
            this.g1165 = json.getString("g1165");
            this.g1166 = json.getString("g1166");
            this.g1167 = json.getString("g1167");
            this.g1168 = json.getString("g1168");
            this.g117 = json.getString("g117");
            this.g11796x = json.getString("g11796x");
            this.g201a = json.getString("g201a");
            this.g201b = json.getString("g201b");
            this.g201c = json.getString("g201c");
            this.g201d = json.getString("g201d");
            this.g201e = json.getString("g201e");
            this.g201f = json.getString("g201f");
            this.g201g = json.getString("g201g");
            this.g201h = json.getString("g201h");
            this.g201i = json.getString("g201i");
            this.g20197 = json.getString("g20197");
            this.g202 = json.getString("g202");
            this.g2031 = json.getString("g2031");
            this.g2032 = json.getString("g2032");
            this.g2033 = json.getString("g2033");
            this.g2034 = json.getString("g2034");
            this.g2035 = json.getString("g2035");
            this.g2036 = json.getString("g2036");
            /*this.g2031a = json.getString("g2031a");
            this.g2031b = json.getString("g2031b");
            this.g2032a = json.getString("g2032a");
            this.g2032b = json.getString("g2032b");
            this.g2033a = json.getString("g2033a");
            this.g2033b = json.getString("g2033b");
            this.g2034a = json.getString("g2034a");
            this.g2034b = json.getString("g2034b");
            this.g2035a = json.getString("g2035a");
            this.g2035b = json.getString("g2035b");
            this.g2036a = json.getString("g2036a");
            this.g2036b = json.getString("g2036b");*/
            this.g204 = json.getString("g204");
            this.g205 = json.getString("g205");
            this.g20596x = json.getString("g20596x");
            this.g301 = json.getString("g301");
            this.g302 = json.getString("g302");
            this.g30296x = json.getString("g30296x");
            this.g30396 = json.getString("g30396");
            this.g3031 = json.getString("g3031");
            this.g3032 = json.getString("g3032");
            this.g3033 = json.getString("g3033");
            this.g3034 = json.getString("g3034");
            this.g3035 = json.getString("g3035");
            this.g3036 = json.getString("g3036");
            this.g304 = json.getString("g304");
            this.g305 = json.getString("g305");
            this.g306 = json.getString("g306");
            this.g307 = json.getString("g307");
            this.g308 = json.getString("g308");
            this.g30896x = json.getString("g30896x");
            this.g401a = json.getString("g401a");
            this.g401b = json.getString("g401b");
            this.g401c = json.getString("g401c");
            this.g401d = json.getString("g401d");
            this.g401e = json.getString("g401e");
            this.g401f = json.getString("g401f");
            this.g401g = json.getString("g401g");
            this.g401h = json.getString("g401h");
            this.g401i = json.getString("g401i");
            this.g401j = json.getString("g401j");
            this.g402 = json.getString("g402");
            this.g403 = json.getString("g403");
            this.g404 = json.getString("g404");
            this.g40596 = json.getString("g40596");
            this.g4051 = json.getString("g4051");
            this.g4052 = json.getString("g4052");
            this.g4053 = json.getString("g4053");
            this.g4054 = json.getString("g4054");
            this.g4055 = json.getString("g4055");
            this.g4056 = json.getString("g4056");
            this.g4057 = json.getString("g4057");
            this.g406 = json.getString("g406");
            this.g4071 = json.getString("g4071");
            this.g4072 = json.getString("g4072");
            this.g4073 = json.getString("g4073");
            this.g4074 = json.getString("g4074");
            this.g4075 = json.getString("g4075");
            this.g4076 = json.getString("g4076");
            this.g4077 = json.getString("g4077");
            this.g4078 = json.getString("g4078");
            this.g501m = json.getString("g501m");
            this.g501f = json.getString("g501f");
            this.g502 = json.getString("g502");
            this.g503 = json.getString("g503");
            this.g504 = json.getString("g504");
            this.g505 = json.getString("g505");
            this.g506 = json.getString("g506");
            this.g507a = json.getString("g507a");
            this.g507b = json.getString("g507b");
            this.g507c = json.getString("g507c");
            this.g507d = json.getString("g507d");
            this.g507e = json.getString("g507e");
            this.g50796 = json.getString("g50796");
            this.g50796x = json.getString("g50796x");
            this.g508 = json.getString("g508");
            this.g509a = json.getString("g509a");
            this.g509b = json.getString("g509b");
            this.g509c = json.getString("g509c");
            this.g509d = json.getString("g509d");
            this.g509e = json.getString("g509e");
            this.g50996 = json.getString("g50996");
            this.g50996x = json.getString("g50996x");
            this.g601 = json.getString("g601");
            this.g602a = json.getString("g602a");
            this.g602b = json.getString("g602b");
            this.g602c = json.getString("g602c");
            this.g602d = json.getString("g602d");
            this.g602e = json.getString("g602e");
            this.g602f = json.getString("g602f");
            this.g602g = json.getString("g602g");
            this.g60296 = json.getString("g60296");
            this.g60296x = json.getString("g60296x");
            this.g603 = json.getString("g603");
            this.g60396x = json.getString("g60396x");
            this.g604 = json.getString("g604");
            this.g605a = json.getString("g605a");
            this.g605b = json.getString("g605b");
            this.g605c = json.getString("g605c");
            this.g60596 = json.getString("g60596");
            this.g60596x = json.getString("g60596x");
            this.g606a = json.getString("g606a");
            this.g606b = json.getString("g606b");
            this.g606c = json.getString("g606c");
            this.g606d = json.getString("g606d");
            this.g606e = json.getString("g606e");
            this.g60696 = json.getString("g60696");
            this.g60696x = json.getString("g60696x");


        }
    }


    public String sGB01toString() throws JSONException {
        Log.d(TAG, "sGB01toString: ");
        JSONObject json = new JSONObject();
        json.put("g101", g101)
                .put("g102", g102)
                .put("g103a", g103a)

                .put("g103b", g103b)

                .put("g103c", g103c)

                .put("g103d", g103d)

                .put("g103e", g103e)

                .put("g103f", g103f)

                .put("g103g", g103g)

                .put("g103h", g103h)

                .put("g103i", g103i)

                .put("g103j", g103j)

                .put("g10396", g10396)

                .put("g10396x", g10396x)
                .put("g104a", g104a)

                .put("g104b", g104b)

                .put("g104c", g104c)

                .put("g104d", g104d)

                .put("g104e", g104e)

                .put("g104f", g104f)

                .put("g104g", g104g)

                .put("g104h", g104h)

                .put("g104i", g104i)

                .put("g104j", g104j)

                .put("g104k", g104k)

                .put("g104l", g104l)

                .put("g104m", g104m)

                .put("g104n", g104n)

                .put("g104o", g104o)

                .put("g104p", g104p)

                .put("g105a", g105a)

                .put("g105b", g105b)

                .put("g105c", g105c)

                .put("g105d", g105d)

                .put("g105e", g105e)

                .put("g105f", g105f)

                .put("g105g", g105g)

                .put("g105h", g105h)

                .put("g105i", g105i)

                .put("g105j", g105j)

                .put("g105k", g105k)

                .put("g105l", g105l)

                .put("g105m", g105m)

                .put("g105n", g105n)

                .put("g105o", g105o)

                .put("g105p", g105p)

                .put("g106", g106)
                .put("g107a", g107a)

                .put("g107b", g107b)

                .put("g107c", g107c)

                .put("g107d", g107d)

                .put("g107e", g107e)

                .put("g10796", g10796)

                .put("g10796x", g10796x)
                .put("g108", g108)
                .put("g1091", g1091)
                .put("g1092", g1092)
                .put("g1093", g1093)
                .put("g1094", g1094)
                .put("g1095", g1095)
                .put("g1101", g1101)
                .put("g1102", g1102)
                .put("g1103", g1103)
                .put("g1104", g1104)
                .put("g1105", g1105)
                .put("g111a", g111a)

                .put("g111b", g111b)

                .put("g111c", g111c)

                .put("g111d", g111d)

                .put("g111e", g111e)

                .put("g11196", g11196)

                .put("g11196x", g11196x)
                .put("g112a", g112a)

                .put("g112b", g112b)

                .put("g112c", g112c)

                .put("g112d", g112d)

                .put("g112e", g112e)

                .put("g112f", g112f)

                .put("g11296", g11296)

                .put("g11296x", g11296x)
                .put("g1131", g1131)
                .put("g1132", g1132)
                .put("g1133", g1133)
                .put("g1134", g1134)
                .put("g1135", g1135)
                .put("g1136", g1136)
                .put("g1141", g1141)
                .put("g1142", g1142)
                .put("g1143", g1143)
                .put("g1144", g1144)
                .put("g1145", g1145)
                .put("g1146", g1146)
                .put("g115", g115)
                .put("g1161", g1161)
                .put("g1162", g1162)
                .put("g1163", g1163)
                .put("g1164", g1164)
                .put("g1165", g1165)
                .put("g1166", g1166)
                .put("g1167", g1167)
                .put("g1168", g1168)
                .put("g117", g117)
                .put("g11796x", g11796x)
                .put("g201a", g201a)

                .put("g201b", g201b)

                .put("g201c", g201c)

                .put("g201d", g201d)

                .put("g201e", g201e)

                .put("g201f", g201f)

                .put("g201g", g201g)

                .put("g201h", g201h)

                .put("g201i", g201i)

                .put("g20197", g20197)

                .put("g202", g202)
                .put("g2031", g2031)
                .put("g2032", g2032)
                .put("g2033", g2033)
                .put("g2034", g2034)
                .put("g2035", g2035)
                .put("g2036", g2036)
                /*.put("g2031a", g2031a)
                .put("g2031b", g2031b)
                .put("g2032a", g2032a)
                .put("g2032b", g2032b)
                .put("g2033a", g2033a)
                .put("g2033b", g2033b)
                .put("g2034a", g2034a)
                .put("g2034b", g2034b)
                .put("g2035a", g2035a)
                .put("g2035b", g2035b)
                .put("g2036a", g2036a)
                .put("g2036b", g2036b)
                */.put("g204", g204)
                .put("g205", g205)
                .put("g20596x", g20596x)
                .put("g301", g301)
                .put("g302", g302)
                .put("g30296x", g30296x)
                .put("g30396", g30396)
                .put("g3031", g3031)
                .put("g3032", g3032)
                .put("g3033", g3033)
                .put("g3034", g3034)
                .put("g3035", g3035)
                .put("g3036", g3036)
                .put("g304", g304)
                .put("g305", g305)
                .put("g306", g306)
                .put("g307", g307)
                .put("g308", g308)
                .put("g30896x", g30896x)
                .put("g401a", g401a)

                .put("g401b", g401b)

                .put("g401c", g401c)

                .put("g401d", g401d)

                .put("g401e", g401e)

                .put("g401f", g401f)

                .put("g401g", g401g)

                .put("g401h", g401h)

                .put("g401i", g401i)

                .put("g401j", g401j)

                .put("g402", g402)
                .put("g403", g403)
                .put("g404", g404)
                .put("g40596", g40596)
                .put("g4051", g4051)
                .put("g4052", g4052)
                .put("g4053", g4053)
                .put("g4054", g4054)
                .put("g4055", g4055)
                .put("g4056", g4056)
                .put("g4057", g4057)
                .put("g406", g406)
                .put("g4071", g4071)
                .put("g4072", g4072)
                .put("g4073", g4073)
                .put("g4074", g4074)
                .put("g4075", g4075)
                .put("g4076", g4076)
                .put("g4077", g4077)
                .put("g4078", g4078)
                .put("g501m", g501m)
                .put("g501f", g501f)
                .put("g502", g502)
                .put("g503", g503)
                .put("g504", g504)
                .put("g505", g505)
                .put("g506", g506)
                .put("g507a", g507a)

                .put("g507b", g507b)

                .put("g507c", g507c)

                .put("g507d", g507d)

                .put("g507e", g507e)

                .put("g50796", g50796)

                .put("g50796x", g50796x)
                .put("g508", g508)
                .put("g509a", g509a)

                .put("g509b", g509b)

                .put("g509c", g509c)

                .put("g509d", g509d)

                .put("g509e", g509e)

                .put("g50996", g50996)

                .put("g50996x", g50996x)
                .put("g601", g601)
                .put("g602a", g602a)

                .put("g602b", g602b)

                .put("g602c", g602c)

                .put("g602d", g602d)

                .put("g602e", g602e)

                .put("g602f", g602f)

                .put("g602g", g602g)

                .put("g60296", g60296)

                .put("g60296x", g60296x)
                .put("g603", g603)
                .put("g60396x", g60396x)
                .put("g604", g604)
                .put("g605a", g605a)

                .put("g605b", g605b)

                .put("g605c", g605c)

                .put("g60596", g60596)

                .put("g60596x", g60596x)
                .put("g606a", g606a)

                .put("g606b", g606b)

                .put("g606c", g606c)

                .put("g606d", g606d)

                .put("g606e", g606e)

                .put("g60696", g60696)

                .put("g60696x", g60696x);

        return json.toString();
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(TableContracts.LHW_GBTable.COLUMN_ID, this.id);
        json.put(TableContracts.LHW_GBTable.COLUMN_UID, this.uid);
        json.put(TableContracts.LHW_GBTable.COLUMN_UUID, this.uuid);
        json.put(TableContracts.LHW_GBTable.COLUMN_CLUSTER, this.cluster);
        json.put(TableContracts.LHW_GBTable.COLUMN_USERNAME, this.userName);
        json.put(TableContracts.LHW_GBTable.COLUMN_SYSDATE, this.sysDate);
        json.put(TableContracts.LHW_GBTable.COLUMN_HHID, this.hhid);
        json.put(TableContracts.LHW_GBTable.COLUMN_LHWUID, this.lhwuid);
        json.put(TableContracts.LHW_GBTable.COLUMN_LHW_CODE, this.lhwCode);
        json.put(TableContracts.LHW_GBTable.COLUMN_DEVICEID, this.deviceId);
        json.put(TableContracts.LHW_GBTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(TableContracts.LHW_GBTable.COLUMN_ISTATUS, this.iStatus);
        json.put(TableContracts.LHW_GBTable.COLUMN_APPVERSION, this.appver);
        json.put(TableContracts.LHW_GBTable.COLUMN_GB01, new JSONObject(sGB01toString()));


        return json;
    }



}

