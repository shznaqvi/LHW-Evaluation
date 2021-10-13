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
import edu.aku.hassannaqvi.lhwevaluation.contracts.TableContracts.LHWFormsTable;
import edu.aku.hassannaqvi.lhwevaluation.core.MainApp;

public class LHWForm extends BaseObservable implements Observable {

    private final String TAG = "HHForm";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    private final String wuid = StringUtils.EMPTY;
    private final String cuid = StringUtils.EMPTY;
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = StringUtils.EMPTY;
    private String uid = StringUtils.EMPTY;
    private String userName = StringUtils.EMPTY;
    private String sysDate = StringUtils.EMPTY;
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

    // SECTION VARIABLES
    private String sA = StringUtils.EMPTY;
    private String sB1 = StringUtils.EMPTY;
    private String sB2 = StringUtils.EMPTY;
    private String sC = StringUtils.EMPTY;

    // FIELD VARIABLES
    private String a101 = StringUtils.EMPTY;
    private String a102 = StringUtils.EMPTY;
    private String a103 = StringUtils.EMPTY;
    private String a104n = StringUtils.EMPTY;
    private String a104c = StringUtils.EMPTY;
    private String a105 = StringUtils.EMPTY;
    private String a106 = StringUtils.EMPTY;
    private String a107 = StringUtils.EMPTY;
    private String a10796x = StringUtils.EMPTY;
    private String a108 = StringUtils.EMPTY;
    private String a109 = StringUtils.EMPTY;
    private String b101 = StringUtils.EMPTY;
    private String b102 = StringUtils.EMPTY;
    private String b103 = StringUtils.EMPTY;
    private String b10396x = StringUtils.EMPTY;
    private String b104 = StringUtils.EMPTY;
    private String b107a = StringUtils.EMPTY;
    private String b107b = StringUtils.EMPTY;
    private String b107c = StringUtils.EMPTY;
    private String b107d = StringUtils.EMPTY;
    private String b107e = StringUtils.EMPTY;
    private String b107f = StringUtils.EMPTY;
    private String b107g = StringUtils.EMPTY;
    private String b107h = StringUtils.EMPTY;
    private String b107i = StringUtils.EMPTY;
    private String b107j = StringUtils.EMPTY;
    private String b108a = StringUtils.EMPTY;
    private String b108b = StringUtils.EMPTY;
    private String b108c = StringUtils.EMPTY;
    private String b108d = StringUtils.EMPTY;
    private String b108e = StringUtils.EMPTY;
    private String b108f = StringUtils.EMPTY;
    private String b108g = StringUtils.EMPTY;
    private String b108h = StringUtils.EMPTY;
    private String b108i = StringUtils.EMPTY;
    private String b108j = StringUtils.EMPTY;
    private String b108k = StringUtils.EMPTY;
    private String b108l = StringUtils.EMPTY;
    private String b108m = StringUtils.EMPTY;
    private String b108n = StringUtils.EMPTY;
    private String b108o = StringUtils.EMPTY;
    private String b108p = StringUtils.EMPTY;
    private String b108q = StringUtils.EMPTY;
    private String b108r = StringUtils.EMPTY;
    private String b108s = StringUtils.EMPTY;
    private String b108t = StringUtils.EMPTY;
    private String b108u = StringUtils.EMPTY;
    private String b108v = StringUtils.EMPTY;
    private String b108w = StringUtils.EMPTY;
    private String c101s = StringUtils.EMPTY;
    private String c101m = StringUtils.EMPTY;
    private String c102s = StringUtils.EMPTY;
    private String c102m = StringUtils.EMPTY;
    private String c103s = StringUtils.EMPTY;
    private String c103m = StringUtils.EMPTY;
    private String c104s = StringUtils.EMPTY;
    private String c104m = StringUtils.EMPTY;
    private String c105s = StringUtils.EMPTY;
    private String c105m = StringUtils.EMPTY;
    private String c106s = StringUtils.EMPTY;
    private String c106m = StringUtils.EMPTY;
    private String c107s = StringUtils.EMPTY;
    private String c107m = StringUtils.EMPTY;
    private String c108s = StringUtils.EMPTY;
    private String c108m = StringUtils.EMPTY;
    private String c109s = StringUtils.EMPTY;
    private String c109m = StringUtils.EMPTY;
    private String c110s = StringUtils.EMPTY;
    private String c110m = StringUtils.EMPTY;
    private String c111s = StringUtils.EMPTY;
    private String c111m = StringUtils.EMPTY;
    private String c112s = StringUtils.EMPTY;
    private String c112m = StringUtils.EMPTY;
    private String c113s = StringUtils.EMPTY;
    private String c113m = StringUtils.EMPTY;
    private String c114s = StringUtils.EMPTY;
    private String c114m = StringUtils.EMPTY;
    private String c115s = StringUtils.EMPTY;
    private String c115m = StringUtils.EMPTY;
    private String c116s = StringUtils.EMPTY;
    private String c116m = StringUtils.EMPTY;
    private String c117s = StringUtils.EMPTY;
    private String c117m = StringUtils.EMPTY;
    private String c118s = StringUtils.EMPTY;
    private String c118m = StringUtils.EMPTY;
    private String c119s = StringUtils.EMPTY;
    private String c119m = StringUtils.EMPTY;
    private String c120s = StringUtils.EMPTY;
    private String c120m = StringUtils.EMPTY;
    private String c121s = StringUtils.EMPTY;
    private String c121m = StringUtils.EMPTY;
    private String c122s = StringUtils.EMPTY;
    private String c122m = StringUtils.EMPTY;
    private String c123s = StringUtils.EMPTY;
    private String c123m = StringUtils.EMPTY;
    private String c124s = StringUtils.EMPTY;
    private String c124m = StringUtils.EMPTY;
    private String c125s = StringUtils.EMPTY;
    private String c125m = StringUtils.EMPTY;
    private String c126s = StringUtils.EMPTY;
    private String c126m = StringUtils.EMPTY;
    private String c127s = StringUtils.EMPTY;
    private String c127m = StringUtils.EMPTY;
    private String c128s = StringUtils.EMPTY;
    private String c128m = StringUtils.EMPTY;
    private String c129s = StringUtils.EMPTY;
    private String c129m = StringUtils.EMPTY;
    private String c130s = StringUtils.EMPTY;
    private String c130m = StringUtils.EMPTY;
    private String c131s = StringUtils.EMPTY;
    private String c131m = StringUtils.EMPTY;
    private String c132s = StringUtils.EMPTY;
    private String c132m = StringUtils.EMPTY;
    private String c133s = StringUtils.EMPTY;
    private String c133m = StringUtils.EMPTY;
    private String c134s = StringUtils.EMPTY;
    private String c134m = StringUtils.EMPTY;
    private String c135s = StringUtils.EMPTY;
    private String c135m = StringUtils.EMPTY;
    private String c136s = StringUtils.EMPTY;
    private String c136m = StringUtils.EMPTY;
    private String c137s = StringUtils.EMPTY;
    private String c137m = StringUtils.EMPTY;
    private String c138s = StringUtils.EMPTY;
    private String c138m = StringUtils.EMPTY;
    private String c139s = StringUtils.EMPTY;
    private String c139m = StringUtils.EMPTY;
    private String c140 = StringUtils.EMPTY;
    private String c141 = StringUtils.EMPTY;
    private String c14196x = StringUtils.EMPTY;


    public LHWForm() {
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


    /*JSON DATABASE VARIABLES*/
    public String getsA() {
        return sA;
    }

    public void setsA(String sA) {
        this.sA = sA;
    }

    public String getsB1() {
        return sB1;
    }

    public void setsB1(String sB1) {
        this.sB1 = sB1;
    }


    public String getsB2() {
        return sB2;
    }

    public void setsB2(String sB2) {
        this.sB2 = sB2;
    }


    public String getsC() {
        return sC;
    }

    public void setsC(String sC) {
        this.sC = sC;
    }



    @Bindable
    public String getA101() {
        return a101;
    }

    public void setA101(String a101) {
        this.a101 = a101;
        notifyPropertyChanged(BR.a101);
    }

    @Bindable
    public String getA102() {
        return a102;
    }

    public void setA102(String a102) {
        this.a102 = a102;
        notifyPropertyChanged(BR.a102);
    }

    @Bindable
    public String getA103() {
        return a103;
    }

    public void setA103(String a103) {
        this.a103 = a103;
        notifyPropertyChanged(BR.a103);
    }

    @Bindable
    public String getA104n() {
        return a104n;
    }

    public void setA104n(String a104n) {
        this.a104n = a104n;
        notifyPropertyChanged(BR.a104n);
    }

    @Bindable
    public String getA104c() {
        return a104c;
    }

    public void setA104c(String a104c) {
        this.a104c = a104c;
        notifyPropertyChanged(BR.a104c);
    }

    @Bindable
    public String getA105() {
        return a105;
    }

    public void setA105(String a105) {
        this.a105 = a105;
        notifyPropertyChanged(BR.a105);
    }

    @Bindable
    public String getA106() {
        return a106;
    }

    public void setA106(String a106) {
        this.a106 = a106;
        notifyPropertyChanged(BR.a106);
    }

    @Bindable
    public String getA107() {
        return a107;
    }

    public void setA107(String a107) {
        this.a107 = a107;
        setA10796x(a107.equals("96") ? this.a10796x : "");
        notifyPropertyChanged(BR.a107);
    }

    @Bindable
    public String getA10796x() {
        return a10796x;
    }

    public void setA10796x(String a10796x) {
        this.a10796x = a10796x;
        notifyPropertyChanged(BR.a10796x);
    }

    @Bindable
    public String getA108() {
        return a108;
    }

    public void setA108(String a108) {
        this.a108 = a108;
        notifyPropertyChanged(BR.a108);
    }

    @Bindable
    public String getA109() {
        return a109;
    }

    public void setA109(String a109) {
        this.a109 = a109;
        notifyPropertyChanged(BR.a109);
    }

    @Bindable
    public String getB101() {
        return b101;
    }

    public void setB101(String b101) {
        this.b101 = b101;
        setB103(b101.equals("1") && this.b102.equals("1") ? "" : this.b103);
        notifyPropertyChanged(BR.b101);
    }

    @Bindable
    public String getB102() {
        return b102;
    }

    public void setB102(String b102) {
        this.b102 = b102;
        setB103(b102.equals("1") && this.b101.equals("1") ? "" : this.b103);
        notifyPropertyChanged(BR.b102);
    }

    @Bindable
    public String getB103() {
        return b103;
    }

    public void setB103(String b103) {
        this.b103 = b103;
        setB10396x(b103.equals("96") ? b10396x : "");
        notifyPropertyChanged(BR.b103);
    }

    @Bindable
    public String getB10396x() {
        return b10396x;
    }

    public void setB10396x(String b10396x) {
        this.b10396x = b10396x;
        notifyPropertyChanged(BR.b10396x);
    }

    @Bindable
    public String getB104() {
        return b104;
    }

    public void setB104(String b104) {
        this.b104 = b104;
        notifyPropertyChanged(BR.b104);
    }

    @Bindable
    public String getB107a() {
        return b107a;
    }

    public void setB107a(String b107a) {
        this.b107a = b107a;
        notifyPropertyChanged(BR.b107a);
    }

    @Bindable
    public String getB107b() {
        return b107b;
    }

    public void setB107b(String b107b) {
        this.b107b = b107b;
        notifyPropertyChanged(BR.b107b);
    }

    @Bindable
    public String getB107c() {
        return b107c;
    }

    public void setB107c(String b107c) {
        this.b107c = b107c;
        notifyPropertyChanged(BR.b107c);
    }

    @Bindable
    public String getB107d() {
        return b107d;
    }

    public void setB107d(String b107d) {
        this.b107d = b107d;
        notifyPropertyChanged(BR.b107d);
    }

    @Bindable
    public String getB107e() {
        return b107e;
    }

    public void setB107e(String b107e) {
        this.b107e = b107e;
        notifyPropertyChanged(BR.b107e);
    }

    @Bindable
    public String getB107f() {
        return b107f;
    }

    public void setB107f(String b107f) {
        this.b107f = b107f;
        notifyPropertyChanged(BR.b107f);
    }

    @Bindable
    public String getB107g() {
        return b107g;
    }

    public void setB107g(String b107g) {
        this.b107g = b107g;
        notifyPropertyChanged(BR.b107g);
    }

    @Bindable
    public String getB107h() {
        return b107h;
    }

    public void setB107h(String b107h) {
        this.b107h = b107h;
        notifyPropertyChanged(BR.b107h);
    }

    @Bindable
    public String getB107i() {
        return b107i;
    }

    public void setB107i(String b107i) {
        this.b107i = b107i;
        notifyPropertyChanged(BR.b107i);
    }

    @Bindable
    public String getB107j() {
        return b107j;
    }

    public void setB107j(String b107j) {
        this.b107j = b107j;
        notifyPropertyChanged(BR.b107j);
    }

    @Bindable
    public String getB108a() {
        return b108a;
    }

    public void setB108a(String b108a) {
        this.b108a = b108a;
        notifyPropertyChanged(BR.b108a);
    }

    @Bindable
    public String getB108b() {
        return b108b;
    }

    public void setB108b(String b108b) {
        this.b108b = b108b;
        notifyPropertyChanged(BR.b108b);
    }

    @Bindable
    public String getB108c() {
        return b108c;
    }

    public void setB108c(String b108c) {
        this.b108c = b108c;
        notifyPropertyChanged(BR.b108c);
    }

    @Bindable
    public String getB108d() {
        return b108d;
    }

    public void setB108d(String b108d) {
        this.b108d = b108d;
        notifyPropertyChanged(BR.b108d);
    }

    @Bindable
    public String getB108e() {
        return b108e;
    }

    public void setB108e(String b108e) {
        this.b108e = b108e;
        notifyPropertyChanged(BR.b108e);
    }

    @Bindable
    public String getB108f() {
        return b108f;
    }

    public void setB108f(String b108f) {
        this.b108f = b108f;
        notifyPropertyChanged(BR.b108f);
    }

    @Bindable
    public String getB108g() {
        return b108g;
    }

    public void setB108g(String b108g) {
        this.b108g = b108g;
        notifyPropertyChanged(BR.b108g);
    }

    @Bindable
    public String getB108h() {
        return b108h;
    }

    public void setB108h(String b108h) {
        this.b108h = b108h;
        notifyPropertyChanged(BR.b108h);
    }

    @Bindable
    public String getB108i() {
        return b108i;
    }

    public void setB108i(String b108i) {
        this.b108i = b108i;
        notifyPropertyChanged(BR.b108i);
    }

    @Bindable
    public String getB108j() {
        return b108j;
    }

    public void setB108j(String b108j) {
        this.b108j = b108j;
        notifyPropertyChanged(BR.b108j);
    }

    @Bindable
    public String getB108k() {
        return b108k;
    }

    public void setB108k(String b108k) {
        this.b108k = b108k;
        notifyPropertyChanged(BR.b108k);
    }

    @Bindable
    public String getB108l() {
        return b108l;
    }

    public void setB108l(String b108l) {
        this.b108l = b108l;
        notifyPropertyChanged(BR.b108l);
    }

    @Bindable
    public String getB108m() {
        return b108m;
    }

    public void setB108m(String b108m) {
        this.b108m = b108m;
        notifyPropertyChanged(BR.b108m);
    }

    @Bindable
    public String getB108n() {
        return b108n;
    }

    public void setB108n(String b108n) {
        this.b108n = b108n;
        notifyPropertyChanged(BR.b108n);
    }

    @Bindable
    public String getB108o() {
        return b108o;
    }

    public void setB108o(String b108o) {
        this.b108o = b108o;
        notifyPropertyChanged(BR.b108o);
    }

    @Bindable
    public String getB108p() {
        return b108p;
    }

    public void setB108p(String b108p) {
        this.b108p = b108p;
        notifyPropertyChanged(BR.b108p);
    }

    @Bindable
    public String getB108q() {
        return b108q;
    }

    public void setB108q(String b108q) {
        this.b108q = b108q;
        notifyPropertyChanged(BR.b108q);
    }

    @Bindable
    public String getB108r() {
        return b108r;
    }

    public void setB108r(String b108r) {
        this.b108r = b108r;
        notifyPropertyChanged(BR.b108r);
    }

    @Bindable
    public String getB108s() {
        return b108s;
    }

    public void setB108s(String b108s) {
        this.b108s = b108s;
        notifyPropertyChanged(BR.b108s);
    }

    @Bindable
    public String getB108t() {
        return b108t;
    }

    public void setB108t(String b108t) {
        this.b108t = b108t;
        notifyPropertyChanged(BR.b108t);
    }

    @Bindable
    public String getB108u() {
        return b108u;
    }

    public void setB108u(String b108u) {
        this.b108u = b108u;
        notifyPropertyChanged(BR.b108u);
    }

    @Bindable
    public String getB108v() {
        return b108v;
    }

    public void setB108v(String b108v) {
        this.b108v = b108v;
        notifyPropertyChanged(BR.b108v);
    }

    @Bindable
    public String getB108w() {
        return b108w;
    }

    public void setB108w(String b108w) {
        this.b108w = b108w;
        notifyPropertyChanged(BR.b108w);
    }

    @Bindable
    public String getC101s() {
        return c101s;
    }

    public void setC101s(String c101s) {
        this.c101s = c101s;
        notifyPropertyChanged(BR.c101s);
    }

    @Bindable
    public String getC101m() {
        return c101m;
    }

    public void setC101m(String c101m) {
        this.c101m = c101m;
        notifyPropertyChanged(BR.c101m);
    }

    @Bindable
    public String getC102s() {
        return c102s;
    }

    public void setC102s(String c102s) {
        this.c102s = c102s;
        notifyPropertyChanged(BR.c102s);
    }

    @Bindable
    public String getC102m() {
        return c102m;
    }

    public void setC102m(String c102m) {
        this.c102m = c102m;
        notifyPropertyChanged(BR.c102m);
    }

    @Bindable
    public String getC103s() {
        return c103s;
    }

    public void setC103s(String c103s) {
        this.c103s = c103s;
        notifyPropertyChanged(BR.c103s);
    }

    @Bindable
    public String getC103m() {
        return c103m;
    }

    public void setC103m(String c103m) {
        this.c103m = c103m;
        notifyPropertyChanged(BR.c103m);
    }

    @Bindable
    public String getC104s() {
        return c104s;
    }

    public void setC104s(String c104s) {
        this.c104s = c104s;
        notifyPropertyChanged(BR.c104s);
    }

    @Bindable
    public String getC104m() {
        return c104m;
    }

    public void setC104m(String c104m) {
        this.c104m = c104m;
        notifyPropertyChanged(BR.c104m);
    }

    @Bindable
    public String getC105s() {
        return c105s;
    }

    public void setC105s(String c105s) {
        this.c105s = c105s;
        notifyPropertyChanged(BR.c105s);
    }

    @Bindable
    public String getC105m() {
        return c105m;
    }

    public void setC105m(String c105m) {
        this.c105m = c105m;
        notifyPropertyChanged(BR.c105m);
    }

    @Bindable
    public String getC106s() {
        return c106s;
    }

    public void setC106s(String c106s) {
        this.c106s = c106s;
        notifyPropertyChanged(BR.c106s);
    }

    @Bindable
    public String getC106m() {
        return c106m;
    }

    public void setC106m(String c106m) {
        this.c106m = c106m;
        notifyPropertyChanged(BR.c106m);
    }

    @Bindable
    public String getC107s() {
        return c107s;
    }

    public void setC107s(String c107s) {
        this.c107s = c107s;
        notifyPropertyChanged(BR.c107s);
    }

    @Bindable
    public String getC107m() {
        return c107m;
    }

    public void setC107m(String c107m) {
        this.c107m = c107m;
        notifyPropertyChanged(BR.c107m);
    }

    @Bindable
    public String getC108s() {
        return c108s;
    }

    public void setC108s(String c108s) {
        this.c108s = c108s;
        notifyPropertyChanged(BR.c108s);
    }

    @Bindable
    public String getC108m() {
        return c108m;
    }

    public void setC108m(String c108m) {
        this.c108m = c108m;
        notifyPropertyChanged(BR.c108m);
    }

    @Bindable
    public String getC109s() {
        return c109s;
    }

    public void setC109s(String c109s) {
        this.c109s = c109s;
        notifyPropertyChanged(BR.c109s);
    }

    @Bindable
    public String getC109m() {
        return c109m;
    }

    public void setC109m(String c109m) {
        this.c109m = c109m;
        notifyPropertyChanged(BR.c109m);
    }

    @Bindable
    public String getC110s() {
        return c110s;
    }

    public void setC110s(String c110s) {
        this.c110s = c110s;
        notifyPropertyChanged(BR.c110s);
    }

    @Bindable
    public String getC110m() {
        return c110m;
    }

    public void setC110m(String c110m) {
        this.c110m = c110m;
        notifyPropertyChanged(BR.c110m);
    }

    @Bindable
    public String getC111s() {
        return c111s;
    }

    public void setC111s(String c111s) {
        this.c111s = c111s;
        notifyPropertyChanged(BR.c111s);
    }

    @Bindable
    public String getC111m() {
        return c111m;
    }

    public void setC111m(String c111m) {
        this.c111m = c111m;
        notifyPropertyChanged(BR.c111m);
    }

    @Bindable
    public String getC112s() {
        return c112s;
    }

    public void setC112s(String c112s) {
        this.c112s = c112s;
        notifyPropertyChanged(BR.c112s);
    }

    @Bindable
    public String getC112m() {
        return c112m;
    }

    public void setC112m(String c112m) {
        this.c112m = c112m;
        notifyPropertyChanged(BR.c112m);
    }

    @Bindable
    public String getC113s() {
        return c113s;
    }

    public void setC113s(String c113s) {
        this.c113s = c113s;
        notifyPropertyChanged(BR.c113s);
    }

    @Bindable
    public String getC113m() {
        return c113m;
    }

    public void setC113m(String c113m) {
        this.c113m = c113m;
        notifyPropertyChanged(BR.c113m);
    }

    @Bindable
    public String getC114s() {
        return c114s;
    }

    public void setC114s(String c114s) {
        this.c114s = c114s;
        notifyPropertyChanged(BR.c114s);
    }

    @Bindable
    public String getC114m() {
        return c114m;
    }

    public void setC114m(String c114m) {
        this.c114m = c114m;
        notifyPropertyChanged(BR.c114m);
    }

    @Bindable
    public String getC115s() {
        return c115s;
    }

    public void setC115s(String c115s) {
        this.c115s = c115s;
        notifyPropertyChanged(BR.c115s);
    }

    @Bindable
    public String getC115m() {
        return c115m;
    }

    public void setC115m(String c115m) {
        this.c115m = c115m;
        notifyPropertyChanged(BR.c115m);
    }

    @Bindable
    public String getC116s() {
        return c116s;
    }

    public void setC116s(String c116s) {
        this.c116s = c116s;
        notifyPropertyChanged(BR.c116s);
    }

    @Bindable
    public String getC116m() {
        return c116m;
    }

    public void setC116m(String c116m) {
        this.c116m = c116m;
        notifyPropertyChanged(BR.c116m);
    }

    @Bindable
    public String getC117s() {
        return c117s;
    }

    public void setC117s(String c117s) {
        this.c117s = c117s;
        notifyPropertyChanged(BR.c117s);
    }

    @Bindable
    public String getC117m() {
        return c117m;
    }

    public void setC117m(String c117m) {
        this.c117m = c117m;
        notifyPropertyChanged(BR.c117m);
    }

    @Bindable
    public String getC118s() {
        return c118s;
    }

    public void setC118s(String c118s) {
        this.c118s = c118s;
        notifyPropertyChanged(BR.c118s);
    }

    @Bindable
    public String getC118m() {
        return c118m;
    }

    public void setC118m(String c118m) {
        this.c118m = c118m;
        notifyPropertyChanged(BR.c118m);
    }

    @Bindable
    public String getC119s() {
        return c119s;
    }

    public void setC119s(String c119s) {
        this.c119s = c119s;
        notifyPropertyChanged(BR.c119s);
    }

    @Bindable
    public String getC119m() {
        return c119m;
    }

    public void setC119m(String c119m) {
        this.c119m = c119m;
        notifyPropertyChanged(BR.c119m);
    }

    @Bindable
    public String getC120s() {
        return c120s;
    }

    public void setC120s(String c120s) {
        this.c120s = c120s;
        notifyPropertyChanged(BR.c120s);
    }

    @Bindable
    public String getC120m() {
        return c120m;
    }

    public void setC120m(String c120m) {
        this.c120m = c120m;
        notifyPropertyChanged(BR.c120m);
    }

    @Bindable
    public String getC121s() {
        return c121s;
    }

    public void setC121s(String c121s) {
        this.c121s = c121s;
        notifyPropertyChanged(BR.c121s);
    }

    @Bindable
    public String getC121m() {
        return c121m;
    }

    public void setC121m(String c121m) {
        this.c121m = c121m;
        notifyPropertyChanged(BR.c121m);
    }

    @Bindable
    public String getC122s() {
        return c122s;
    }

    public void setC122s(String c122s) {
        this.c122s = c122s;
        notifyPropertyChanged(BR.c122s);
    }

    @Bindable
    public String getC122m() {
        return c122m;
    }

    public void setC122m(String c122m) {
        this.c122m = c122m;
        notifyPropertyChanged(BR.c122m);
    }

    @Bindable
    public String getC123s() {
        return c123s;
    }

    public void setC123s(String c123s) {
        this.c123s = c123s;
        notifyPropertyChanged(BR.c123s);
    }

    @Bindable
    public String getC123m() {
        return c123m;
    }

    public void setC123m(String c123m) {
        this.c123m = c123m;
        notifyPropertyChanged(BR.c123m);
    }

    @Bindable
    public String getC124s() {
        return c124s;
    }

    public void setC124s(String c124s) {
        this.c124s = c124s;
        notifyPropertyChanged(BR.c124s);
    }

    @Bindable
    public String getC124m() {
        return c124m;
    }

    public void setC124m(String c124m) {
        this.c124m = c124m;
        notifyPropertyChanged(BR.c124m);
    }

    @Bindable
    public String getC125s() {
        return c125s;
    }

    public void setC125s(String c125s) {
        this.c125s = c125s;
        notifyPropertyChanged(BR.c125s);
    }

    @Bindable
    public String getC125m() {
        return c125m;
    }

    public void setC125m(String c125m) {
        this.c125m = c125m;
        notifyPropertyChanged(BR.c125m);
    }

    @Bindable
    public String getC126s() {
        return c126s;
    }

    public void setC126s(String c126s) {
        this.c126s = c126s;
        notifyPropertyChanged(BR.c126s);
    }

    @Bindable
    public String getC126m() {
        return c126m;
    }

    public void setC126m(String c126m) {
        this.c126m = c126m;
        notifyPropertyChanged(BR.c126m);
    }

    @Bindable
    public String getC127s() {
        return c127s;
    }

    public void setC127s(String c127s) {
        this.c127s = c127s;
        notifyPropertyChanged(BR.c127s);
    }

    @Bindable
    public String getC127m() {
        return c127m;
    }

    public void setC127m(String c127m) {
        this.c127m = c127m;
        notifyPropertyChanged(BR.c127m);
    }

    @Bindable
    public String getC128s() {
        return c128s;
    }

    public void setC128s(String c128s) {
        this.c128s = c128s;
        notifyPropertyChanged(BR.c128s);
    }

    @Bindable
    public String getC128m() {
        return c128m;
    }

    public void setC128m(String c128m) {
        this.c128m = c128m;
        notifyPropertyChanged(BR.c128m);
    }

    @Bindable
    public String getC129s() {
        return c129s;
    }

    public void setC129s(String c129s) {
        this.c129s = c129s;
        notifyPropertyChanged(BR.c129s);
    }

    @Bindable
    public String getC129m() {
        return c129m;
    }

    public void setC129m(String c129m) {
        this.c129m = c129m;
        notifyPropertyChanged(BR.c129m);
    }

    @Bindable
    public String getC130s() {
        return c130s;
    }

    public void setC130s(String c130s) {
        this.c130s = c130s;
        notifyPropertyChanged(BR.c130s);
    }

    @Bindable
    public String getC130m() {
        return c130m;
    }

    public void setC130m(String c130m) {
        this.c130m = c130m;
        notifyPropertyChanged(BR.c130m);
    }

    @Bindable
    public String getC131s() {
        return c131s;
    }

    public void setC131s(String c131s) {
        this.c131s = c131s;
        notifyPropertyChanged(BR.c131s);
    }

    @Bindable
    public String getC131m() {
        return c131m;
    }

    public void setC131m(String c131m) {
        this.c131m = c131m;
        notifyPropertyChanged(BR.c131m);
    }

    @Bindable
    public String getC132s() {
        return c132s;
    }

    public void setC132s(String c132s) {
        this.c132s = c132s;
        notifyPropertyChanged(BR.c132s);
    }

    @Bindable
    public String getC132m() {
        return c132m;
    }

    public void setC132m(String c132m) {
        this.c132m = c132m;
        notifyPropertyChanged(BR.c132m);
    }

    @Bindable
    public String getC133s() {
        return c133s;
    }

    public void setC133s(String c133s) {
        this.c133s = c133s;
        notifyPropertyChanged(BR.c133s);
    }

    @Bindable
    public String getC133m() {
        return c133m;
    }

    public void setC133m(String c133m) {
        this.c133m = c133m;
        notifyPropertyChanged(BR.c133m);
    }

    @Bindable
    public String getC134s() {
        return c134s;
    }

    public void setC134s(String c134s) {
        this.c134s = c134s;
        notifyPropertyChanged(BR.c134s);
    }

    @Bindable
    public String getC134m() {
        return c134m;
    }

    public void setC134m(String c134m) {
        this.c134m = c134m;
        notifyPropertyChanged(BR.c134m);
    }

    @Bindable
    public String getC135s() {
        return c135s;
    }

    public void setC135s(String c135s) {
        this.c135s = c135s;
        notifyPropertyChanged(BR.c135s);
    }

    @Bindable
    public String getC135m() {
        return c135m;
    }

    public void setC135m(String c135m) {
        this.c135m = c135m;
        notifyPropertyChanged(BR.c135m);
    }

    @Bindable
    public String getC136s() {
        return c136s;
    }

    public void setC136s(String c136s) {
        this.c136s = c136s;
        notifyPropertyChanged(BR.c136s);
    }

    @Bindable
    public String getC136m() {
        return c136m;
    }

    public void setC136m(String c136m) {
        this.c136m = c136m;
        notifyPropertyChanged(BR.c136m);
    }

    @Bindable
    public String getC137s() {
        return c137s;
    }

    public void setC137s(String c137s) {
        this.c137s = c137s;
        notifyPropertyChanged(BR.c137s);
    }

    @Bindable
    public String getC137m() {
        return c137m;
    }

    public void setC137m(String c137m) {
        this.c137m = c137m;
        notifyPropertyChanged(BR.c137m);
    }

    @Bindable
    public String getC138s() {
        return c138s;
    }

    public void setC138s(String c138s) {
        this.c138s = c138s;
        notifyPropertyChanged(BR.c138s);
    }

    @Bindable
    public String getC138m() {
        return c138m;
    }

    public void setC138m(String c138m) {
        this.c138m = c138m;
        notifyPropertyChanged(BR.c138m);
    }

    @Bindable
    public String getC139s() {
        return c139s;
    }

    public void setC139s(String c139s) {
        this.c139s = c139s;
        notifyPropertyChanged(BR.c139s);
    }

    @Bindable
    public String getC139m() {
        return c139m;
    }

    public void setC139m(String c139m) {
        this.c139m = c139m;
        notifyPropertyChanged(BR.c139m);
    }

    @Bindable
    public String getC140() {
        return c140;
    }

    public void setC140(String c140) {
        this.c140 = c140;
        setC141(c140.equals("2") ? "" : this.c141);
        notifyPropertyChanged(BR.c140);
    }

    @Bindable
    public String getC141() {
        return c141;
    }

    public void setC141(String c141) {
        this.c141 = c141;
        setC14196x(c141.equals("96") ? this.c14196x : "");
        notifyPropertyChanged(BR.c141);
    }

    @Bindable
    public String getC14196x() {
        return c14196x;
    }

    public void setC14196x(String c14196x) {
        this.c14196x = c14196x;
        notifyPropertyChanged(BR.c14196x);
    }


    public LHWForm Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(LHWFormsTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(LHWFormsTable.COLUMN_UID));
        this.cluster = cursor.getString(cursor.getColumnIndexOrThrow(LHWFormsTable.COLUMN_CLUSTER));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(LHWFormsTable.COLUMN_HHID));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(LHWFormsTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(LHWFormsTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(LHWFormsTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(LHWFormsTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(LHWFormsTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(LHWFormsTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(LHWFormsTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(LHWFormsTable.COLUMN_SYNCED_DATE));


        this.a101 = cursor.getString(cursor.getColumnIndexOrThrow(LHWFormsTable.COLUMN_A101));
        this.a102 = cursor.getString(cursor.getColumnIndexOrThrow(LHWFormsTable.COLUMN_A102));
        this.a103 = cursor.getString(cursor.getColumnIndexOrThrow(LHWFormsTable.COLUMN_A103));
        this.a104n = cursor.getString(cursor.getColumnIndexOrThrow(LHWFormsTable.COLUMN_A104n));
        this.a104c = cursor.getString(cursor.getColumnIndexOrThrow(LHWFormsTable.COLUMN_A104c));

        sAHydrate(cursor.getString(cursor.getColumnIndexOrThrow(LHWFormsTable.COLUMN_SA)));
        sB1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(LHWFormsTable.COLUMN_SB1)));
        sB2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(LHWFormsTable.COLUMN_SB2)));
        sCHydrate(cursor.getString(cursor.getColumnIndexOrThrow(LHWFormsTable.COLUMN_SC)));

        return this;
    }

    public void sAHydrate(String string) throws JSONException {
        Log.d(TAG, "sAHydrate: " + string);
        if (string != null) {

            JSONObject json = null;
            json = new JSONObject(string);
            this.a105 = json.getString("a105");
            this.a106 = json.getString("a106");
            this.a107 = json.getString("a107");
            this.a10796x = json.getString("a10796x");
            this.a108 = json.getString("a108");
            this.a109 = json.getString("a109");
        }
    }

    public void sB1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sB1Hydrate: " + string);
        if (string != null) {

            JSONObject json = null;
            json = new JSONObject(string);
            this.b101 = json.getString("b101");
            this.b102 = json.getString("b102");
            this.b103 = json.getString("b103");
            this.b10396x = json.getString("b10396x");
            this.b104 = json.getString("b104");
        }
    }

    public void sB2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sB2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.b107a = json.getString("b107a");
            this.b107b = json.getString("b107b");
            this.b107c = json.getString("b107c");
            this.b107d = json.getString("b107d");
            this.b107e = json.getString("b107e");
            this.b107f = json.getString("b107f");
            this.b107g = json.getString("b107g");
            this.b107h = json.getString("b107h");
            this.b107i = json.getString("b107i");
            this.b107j = json.getString("b107j");
            this.b108a = json.getString("b108a");
            this.b108b = json.getString("b108b");
            this.b108c = json.getString("b108c");
            this.b108d = json.getString("b108d");
            this.b108e = json.getString("b108e");
            this.b108f = json.getString("b108f");
            this.b108g = json.getString("b108g");
            this.b108h = json.getString("b108h");
            this.b108i = json.getString("b108i");
            this.b108j = json.getString("b108j");
            this.b108k = json.getString("b108k");
            this.b108l = json.getString("b108l");
            this.b108m = json.getString("b108m");
            this.b108n = json.getString("b108n");
            this.b108o = json.getString("b108o");
            this.b108p = json.getString("b108p");
            this.b108q = json.getString("b108q");
            this.b108r = json.getString("b108r");
            this.b108s = json.getString("b108s");
            this.b108t = json.getString("b108t");
            this.b108u = json.getString("b108u");
            this.b108v = json.getString("b108v");
            this.b108w = json.getString("b108w");
        }
    }

    public void sCHydrate(String string) throws JSONException {
        Log.d(TAG, "sCHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.c101s = json.getString("c101s");
            this.c101m = json.getString("c101m");
            this.c102s = json.getString("c102s");
            this.c102m = json.getString("c102m");
            this.c103s = json.getString("c103s");
            this.c103m = json.getString("c103m");
            this.c104s = json.getString("c104s");
            this.c104m = json.getString("c104m");
            this.c105s = json.getString("c105s");
            this.c105m = json.getString("c105m");
            this.c106s = json.getString("c106s");
            this.c106m = json.getString("c106m");
            this.c107s = json.getString("c107s");
            this.c107m = json.getString("c107m");
            this.c108s = json.getString("c108s");
            this.c108m = json.getString("c108m");
            this.c109s = json.getString("c109s");
            this.c109m = json.getString("c109m");
            this.c110s = json.getString("c110s");
            this.c110m = json.getString("c110m");
            this.c111s = json.getString("c111s");
            this.c111m = json.getString("c111m");
            this.c112s = json.getString("c112s");
            this.c112m = json.getString("c112m");
            this.c113s = json.getString("c113s");
            this.c113m = json.getString("c113m");
            this.c114s = json.getString("c114s");
            this.c114m = json.getString("c114m");
            this.c115s = json.getString("c115s");
            this.c115m = json.getString("c115m");
            this.c116s = json.getString("c116s");
            this.c116m = json.getString("c116m");
            this.c117s = json.getString("c117s");
            this.c117m = json.getString("c117m");
            this.c118s = json.getString("c118s");
            this.c118m = json.getString("c118m");
            this.c119s = json.getString("c119s");
            this.c119m = json.getString("c119m");
            this.c120s = json.getString("c10s");
            this.c120m = json.getString("c120m");
            this.c121s = json.getString("c121s");
            this.c121m = json.getString("c121m");
            this.c122s = json.getString("c122s");
            this.c122m = json.getString("c122m");
            this.c123s = json.getString("c123s");
            this.c123m = json.getString("c123m");
            this.c124s = json.getString("c124s");
            this.c124m = json.getString("c124m");
            this.c125s = json.getString("c125s");
            this.c125m = json.getString("c125m");
            this.c126s = json.getString("c126s");
            this.c126m = json.getString("c126m");
            this.c127s = json.getString("c127s");
            this.c127m = json.getString("c127m");
            this.c128s = json.getString("c128s");
            this.c128m = json.getString("c128m");
            this.c129s = json.getString("c129s");
            this.c129m = json.getString("c129m");
            this.c130s = json.getString("c130s");
            this.c130m = json.getString("c130m");
            this.c131s = json.getString("c131s");
            this.c131m = json.getString("c131m");
            this.c132s = json.getString("c132s");
            this.c132m = json.getString("c132m");
            this.c133s = json.getString("c133s");
            this.c133m = json.getString("c133m");
            this.c134s = json.getString("c134s");
            this.c134m = json.getString("c134m");
            this.c135s = json.getString("c135s");
            this.c135m = json.getString("c135m");
            this.c136s = json.getString("c136s");
            this.c136m = json.getString("c136m");
            this.c137s = json.getString("c137s");
            this.c137m = json.getString("c137m");
            this.c138s = json.getString("c138s");
            this.c138m = json.getString("c138m");
            this.c139s = json.getString("c139s");
            this.c139m = json.getString("c139m");
            this.c140 = json.getString("c140");
            this.c141 = json.getString("c141");
            this.c14196x = json.getString("c14196x");
        }
    }


    public String sAtoString() throws JSONException {
        Log.d(TAG, "sAtoString: ");
        JSONObject json = new JSONObject();
        json.put("a105", a105)
                .put("a106", a106)
                .put("a107", a107)
                .put("a10796x", a10796x)
                .put("a108", a108)
                .put("a109", a109);
        return json.toString();
    }

    public String sB1toString() throws JSONException {
        Log.d(TAG, "sBtoString: ");
        JSONObject json = new JSONObject();
        json.put("b101", b101)
                .put("b102", b102)
                .put("b103", b103)
                .put("b10396x", b10396x)
                .put("b104", b104);
        return json.toString();
    }

    public String sB2toString() throws JSONException {
        Log.d(TAG, "sH1toString: ");
        JSONObject json = new JSONObject();
        json.put("b107a", b107a)
                .put("b107b", b107b)
                .put("b107c", b107c)
                .put("b107d", b107d)
                .put("b107e", b107e)
                .put("b107f", b107f)
                .put("b107g", b107g)
                .put("b107h", b107h)
                .put("b107i", b107i)
                .put("b107j", b107j)
                .put("b108a", b108a)
                .put("b108b", b108b)
                .put("b108c", b108c)
                .put("b108d", b108d)
                .put("b108e", b108e)
                .put("b108f", b108f)
                .put("b108g", b108g)
                .put("b108h", b108h)
                .put("b108i", b108i)
                .put("b108j", b108j)
                .put("b108k", b108k)
                .put("b108l", b108l)
                .put("b108m", b108m)
                .put("b108n", b108n)
                .put("b108o", b108o)
                .put("b108p", b108p)
                .put("b108q", b108q)
                .put("b108r", b108r)
                .put("b108s", b108s)
                .put("b108t", b108t)
                .put("b108u", b108u)
                .put("b108v", b108v)
                .put("b108w", b108w);
        return json.toString();
    }

    public String sCtoString() throws JSONException {
        Log.d(TAG, "sCtoString: ");
        JSONObject json = new JSONObject();
        json.put("c101s", c101s)
                .put("c101m", c101m)
                .put("c102s", c102s)
                .put("c102m", c102m)
                .put("c103s", c103s)
                .put("c103m", c103m)
                .put("c104s", c104s)
                .put("c104m", c104m)
                .put("c105s", c105s)
                .put("c105m", c105m)
                .put("c106s", c106s)
                .put("c106m", c106m)
                .put("c107s", c107s)
                .put("c107m", c107m)
                .put("c108s", c108s)
                .put("c108m", c108m)
                .put("c109s", c109s)
                .put("c109m", c109m)
                .put("c110s", c110s)
                .put("c110m", c110m)
                .put("c111s", c111s)
                .put("c111m", c111m)
                .put("c112s", c112s)
                .put("c112m", c112m)
                .put("c113s", c113s)
                .put("c113m", c113m)
                .put("c114s", c114s)
                .put("c114m", c114m)
                .put("c115s", c115s)
                .put("c115m", c115m)
                .put("c116s", c116s)
                .put("c116m", c116m)
                .put("c117s", c117s)
                .put("c117m", c117m)
                .put("c118s", c118s)
                .put("c118m", c118m)
                .put("c119s", c119s)
                .put("c119m", c119m)
                .put("c10s", c120s)
                .put("c120m", c120m)
                .put("c121s", c121s)
                .put("c121m", c121m)
                .put("c122s", c122s)
                .put("c122m", c122m)
                .put("c123s", c123s)
                .put("c123m", c123m)
                .put("c124s", c124s)
                .put("c124m", c124m)
                .put("c125s", c125s)
                .put("c125m", c125m)
                .put("c126s", c126s)
                .put("c126m", c126m)
                .put("c127s", c127s)
                .put("c127m", c127m)
                .put("c128s", c128s)
                .put("c128m", c128m)
                .put("c129s", c129s)
                .put("c129m", c129m)
                .put("c130s", c130s)
                .put("c130m", c130m)
                .put("c131s", c131s)
                .put("c131m", c131m)
                .put("c132s", c132s)
                .put("c132m", c132m)
                .put("c133s", c133s)
                .put("c133m", c133m)
                .put("c134s", c134s)
                .put("c134m", c134m)
                .put("c135s", c135s)
                .put("c135m", c135m)
                .put("c136s", c136s)
                .put("c136m", c136m)
                .put("c137s", c137s)
                .put("c137m", c137m)
                .put("c138s", c138s)
                .put("c138m", c138m)
                .put("c139s", c139s)
                .put("c139m", c139m)
                .put("c140", c140)
                .put("c141", c141)
                .put("c14196x", c14196x);
        return json.toString();
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(LHWFormsTable.COLUMN_ID, this.id);
        json.put(LHWFormsTable.COLUMN_UID, this.uid);
        json.put(LHWFormsTable.COLUMN_CLUSTER, this.cluster);
        json.put(LHWFormsTable.COLUMN_HHID, this.hhid);
        json.put(LHWFormsTable.COLUMN_USERNAME, this.userName);
        json.put(LHWFormsTable.COLUMN_SYSDATE, this.sysDate);
        json.put(LHWFormsTable.COLUMN_DEVICEID, this.deviceId);
        json.put(LHWFormsTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(LHWFormsTable.COLUMN_ISTATUS, this.iStatus);
        //  json.put(LHWFormsTable.COLUMN_SYNCED, this.synced);
        //  json.put(LHWFormsTable.COLUMN_SYNCED_DATE, this.syncDate);

        // Household

        json.put(LHWFormsTable.COLUMN_A101, this.a101);
        json.put(LHWFormsTable.COLUMN_A102, this.a102);
        json.put(LHWFormsTable.COLUMN_A103, this.a103);
        json.put(LHWFormsTable.COLUMN_A104n, this.a104n);
        json.put(LHWFormsTable.COLUMN_A104c, this.a104c);
        json.put(LHWFormsTable.COLUMN_SA, new JSONObject(sAtoString()));
        json.put(LHWFormsTable.COLUMN_SB1, new JSONObject(sB1toString()));
        json.put(LHWFormsTable.COLUMN_SB2, new JSONObject(sB2toString()));
        json.put(LHWFormsTable.COLUMN_SC, new JSONObject(sCtoString()));
        return json;
    }


}
