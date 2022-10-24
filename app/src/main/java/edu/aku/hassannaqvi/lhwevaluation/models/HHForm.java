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
import edu.aku.hassannaqvi.lhwevaluation.contracts.TableContracts.HHFormsTable;
import edu.aku.hassannaqvi.lhwevaluation.core.MainApp;

public class HHForm extends BaseObservable implements Observable {

    private final String TAG = "hhForm";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = StringUtils.EMPTY;
    private String uid = StringUtils.EMPTY;
    private String lhwuid = StringUtils.EMPTY;
    private String userName = StringUtils.EMPTY;
    private String sysDate = StringUtils.EMPTY;
    private String lhwCode = StringUtils.EMPTY;
    private String khandandNo = StringUtils.EMPTY;
    private String district = StringUtils.EMPTY;
    private String deviceId = StringUtils.EMPTY;
    private String deviceTag = StringUtils.EMPTY;
    private String appver = StringUtils.EMPTY;
    private String endTime = StringUtils.EMPTY;
    private String iStatus = StringUtils.EMPTY;
    private String iStatus96x = StringUtils.EMPTY;
    private String synced = StringUtils.EMPTY;
    private String syncDate = StringUtils.EMPTY;
    // SECTION VARIABLES
    private String sH2 = StringUtils.EMPTY;
/*
    private String sH3 = StringUtils.EMPTY;
*/

    private String sAB = StringUtils.EMPTY;
    private String sM = StringUtils.EMPTY;

    // FIELD VARIABLES
    private String h201 = StringUtils.EMPTY;
    private String h202 = StringUtils.EMPTY;
    private String h203 = StringUtils.EMPTY;
    private String h204a = StringUtils.EMPTY;
    private String h204b = StringUtils.EMPTY;
    private String h204c = StringUtils.EMPTY;
    private String h204d = StringUtils.EMPTY;
    private String h204e = StringUtils.EMPTY;
    private String h204f = StringUtils.EMPTY;
    private String h205 = StringUtils.EMPTY;
  /*  private String h301 = StringUtils.EMPTY;
    private String h302 = StringUtils.EMPTY;
    private String h303 = StringUtils.EMPTY;
    private String h304d = StringUtils.EMPTY;
    private String h304m = StringUtils.EMPTY;
    private String h304y = StringUtils.EMPTY;
    private String h305 = StringUtils.EMPTY;
    private String h306 = StringUtils.EMPTY;
    private String h307 = StringUtils.EMPTY;
    private String h308 = StringUtils.EMPTY;
    private String h309 = StringUtils.EMPTY;*/
    private String ab101 = StringUtils.EMPTY;
    private String ab102 = StringUtils.EMPTY;
    private String ab103 = StringUtils.EMPTY;
    private String ab104 = StringUtils.EMPTY;
    private String ab104a = StringUtils.EMPTY;
    private String ab104b = StringUtils.EMPTY;
    private String ab104c = StringUtils.EMPTY;
    private String ab104d = StringUtils.EMPTY;
    private String ab10496 = StringUtils.EMPTY;
    private String ab10496x = StringUtils.EMPTY;
    private String ab105 = StringUtils.EMPTY;
    private String ab106 = StringUtils.EMPTY;
    private String ab107 = StringUtils.EMPTY;
    private String ab108 = StringUtils.EMPTY;
    private String ab108a = StringUtils.EMPTY;
    private String ab108b = StringUtils.EMPTY;
    private String ab108c = StringUtils.EMPTY;
    private String ab108d = StringUtils.EMPTY;
    private String ab108e = StringUtils.EMPTY;
    private String ab108f = StringUtils.EMPTY;
    private String ab108g = StringUtils.EMPTY;
    private String ab108h = StringUtils.EMPTY;
    private String ab108i = StringUtils.EMPTY;
    private String ab108j = StringUtils.EMPTY;
    private String ab108k = StringUtils.EMPTY;
    private String ab10896 = StringUtils.EMPTY;
    private String ab10896x = StringUtils.EMPTY;
    private String ab109 = StringUtils.EMPTY;
    private String ab10996x = StringUtils.EMPTY;
    private String ab110 = StringUtils.EMPTY;
    private String ab110a = StringUtils.EMPTY;
    private String ab110b = StringUtils.EMPTY;
    private String ab110c = StringUtils.EMPTY;
    private String ab110d = StringUtils.EMPTY;
    private String ab110e = StringUtils.EMPTY;
    private String ab11096 = StringUtils.EMPTY;
    private String ab11096x = StringUtils.EMPTY;
    private String ab111 = StringUtils.EMPTY;
    private String ab112 = StringUtils.EMPTY;
    private String ab113 = StringUtils.EMPTY;
    private String ab113a = StringUtils.EMPTY;
    private String ab113b = StringUtils.EMPTY;
    private String ab113c = StringUtils.EMPTY;
    private String ab11398 = StringUtils.EMPTY;
    private String ab11396 = StringUtils.EMPTY;
    private String ab11396x = StringUtils.EMPTY;
    private String ab114 = StringUtils.EMPTY;
    private String ab115 = StringUtils.EMPTY;
    private String ab117 = StringUtils.EMPTY;
    private String ab118a = StringUtils.EMPTY;
    private String ab118b = StringUtils.EMPTY;
    private String ab118c = StringUtils.EMPTY;
    private String ab118d = StringUtils.EMPTY;
    private String ab118e = StringUtils.EMPTY;
    private String ab118f = StringUtils.EMPTY;
    private String ab118g = StringUtils.EMPTY;
    private String ab118h = StringUtils.EMPTY;
    private String ab118i = StringUtils.EMPTY;
    private String ab118j = StringUtils.EMPTY;
    private String ab118k = StringUtils.EMPTY;
    private String ab118l = StringUtils.EMPTY;
    private String ab118m = StringUtils.EMPTY;
    private String ab118n = StringUtils.EMPTY;
    private String ab118o = StringUtils.EMPTY;
    private String ab118p = StringUtils.EMPTY;
    private String ab118q = StringUtils.EMPTY;
    private String ab118r = StringUtils.EMPTY;
    private String ab118s = StringUtils.EMPTY;
    private String ab118t = StringUtils.EMPTY;
    private String ab118u = StringUtils.EMPTY;
    private String ab119 = StringUtils.EMPTY;
    private String m101 = StringUtils.EMPTY;
    private String m102 = StringUtils.EMPTY;
    private String m103 = StringUtils.EMPTY;
    private String m104 = StringUtils.EMPTY;
    private String m105 = StringUtils.EMPTY;
    private String m105a = StringUtils.EMPTY;
    private String m105b = StringUtils.EMPTY;
    private String m105c = StringUtils.EMPTY;
    private String m105d = StringUtils.EMPTY;
    private String m105e = StringUtils.EMPTY;
    private String m105f = StringUtils.EMPTY;
    private String m105g = StringUtils.EMPTY;
    private String m105h = StringUtils.EMPTY;
    private String m10596 = StringUtils.EMPTY;
    private String m10596x = StringUtils.EMPTY;
    private String m106 = StringUtils.EMPTY;
    private String m106a = StringUtils.EMPTY;
    private String m106b = StringUtils.EMPTY;
    private String m106c = StringUtils.EMPTY;
    private String m106d = StringUtils.EMPTY;
    private String maleUID = StringUtils.EMPTY;
    private String adolUID = StringUtils.EMPTY;
    private String maleSno = StringUtils.EMPTY;
    private String adolSno = StringUtils.EMPTY;
    private String maleAge = StringUtils.EMPTY;
    private String adolAge = StringUtils.EMPTY;
    private String maritalStatus = StringUtils.EMPTY;


    public HHForm() {
    }


    @Bindable
    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
        notifyPropertyChanged(BR.maritalStatus);
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

    public String getLhwuid() {
        return lhwuid;
    }

    public void setLhwuid(String lhwuid) {
        this.lhwuid = lhwuid;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Bindable
    public String getLhwCode() {
        return lhwCode;
    }

    public void setLhwCode(String lhwCode) {
        this.lhwCode = lhwCode;
        notifyPropertyChanged(BR.cluster);
    }

    @Bindable
    public String getKhandandNo() {
        return khandandNo;
    }

    public void setKhandandNo(String khandandNo) {
        this.khandandNo = khandandNo;
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

    public String getMaleUID() {
        return maleUID;
    }

    public String getAdolUID() {
        return adolUID;
    }

    public void setMaleUID(String maleUID) {
        this.maleUID = maleUID;
    }

    public void setAdolUID(String adolUID) {
        this.adolUID = adolUID;
    }

    public String getMaleAge() {
        return maleAge;
    }

    public void setMaleAge(String maleAge) {
        this.maleAge = maleAge;
    }

    public String getAdolAge() {
        return adolAge;
    }

    public void setAdolAge(String adolAge) {
        this.adolAge = adolAge;
    }

    /*JSON DATABASE VARIABLES*/


    public String getsH2() {
        return sH2;
    }

    public void setsH2(String sH2) {
        this.sH2 = sH2;
    }


/*
    public String getsH3() {
        return sH3;
    }

    public void setsH3(String sH3) {
        this.sH3 = sH3;
    }
*/


    public String getsAB() {
        return sAB;
    }

    public void setsAB(String sAB) {
        this.sAB = sAB;
    }


    public String getsM() {
        return sM;
    }

    public void setsM(String sM) {
        this.sM = sM;
    }

    public String getMaleSno() {
        return maleSno;
    }

    public void setMaleSno(String maleSno) {
        this.maleSno = maleSno;
    }

    @Bindable
    public String getAdolSno() {

        return adolSno;
    }

    public void setAdolSno(String adolSno) {
        this.adolSno = adolSno;
        notifyPropertyChanged(BR.adolSno);
    }

    @Bindable
    public String getH201() {
        return h201;
    }

    public void setH201(String h201) {
        this.h201 = h201;
        notifyPropertyChanged(BR.h201);
    }

    @Bindable
    public String getH202() {
        return h202;
    }

    public void setH202(String h202) {
        this.h202 = h202;
        notifyPropertyChanged(BR.h202);
    }

    @Bindable
    public String getH203() {
        return h203;
    }

    public void setH203(String h203) {
        this.h203 = h203;
        notifyPropertyChanged(BR.h203);
    }

    @Bindable
    public String getH204a() {
        return h204a;
    }

    public void setH204a(String h204a) {
        this.h204a = h204a;
        notifyPropertyChanged(BR.h204a);
    }

    @Bindable
    public String getH204b() {
        return h204b;
    }

    public void setH204b(String h204b) {
        this.h204b = h204b;
        notifyPropertyChanged(BR.h204b);
    }

    @Bindable
    public String getH204c() {
        return h204c;
    }

    public void setH204c(String h204c) {
        this.h204c = h204c;
        notifyPropertyChanged(BR.h204c);
    }

    @Bindable
    public String getH204d() {
        return h204d;
    }

    public void setH204d(String h204d) {
        this.h204d = h204d;
        notifyPropertyChanged(BR.h204d);
    }

    @Bindable
    public String getH204e() {
        return h204e;
    }

    public void setH204e(String h204e) {
        this.h204e = h204e;
        notifyPropertyChanged(BR.h204e);
    }

    @Bindable
    public String getH204f() {
        return h204f;
    }

    public void setH204f(String h204f) {
        this.h204f = h204f;
        notifyPropertyChanged(BR.h204f);
    }

    @Bindable
    public String getH205() {
        return h205;
    }

    public void setH205(String h205) {
        this.h205 = h205;
        notifyPropertyChanged(BR.h205);
    }


    @Bindable
    public String getAb101() {
        return ab101;
    }

    public void setAb101(String ab101) {
        this.ab101 = ab101;
        notifyPropertyChanged(BR.ab101);
    }

    @Bindable
    public String getAb102() {
        return ab102;
    }

    public void setAb102(String ab102) {
        this.ab102 = ab102;
        notifyPropertyChanged(BR.ab102);
    }

    @Bindable
    public String getAb103() {
        return ab103;
    }

    public void setAb103(String ab103) {
        this.ab103 = ab103;
        setAb104a(ab103.equals("2") ? "" : this.ab104a);
        setAb104b(ab103.equals("2") ? "" : this.ab104b);
        setAb104c(ab103.equals("2") ? "" : this.ab104c);
        setAb104d(ab103.equals("2") ? "" : this.ab104d);
        setAb10496(ab103.equals("2") ? "" : this.ab10496);
        setAb105(ab103.equals("2") ? "" : this.ab105);
        notifyPropertyChanged(BR.ab103);
    }

    @Bindable
    public String getAb104() {
        return ab104;
    }

    public void setAb104(String ab104) {
        this.ab104 = ab104;
        notifyPropertyChanged(BR.ab104);
    }

    @Bindable
    public String getAb104a() {
        return ab104a;
    }

    public void setAb104a(String ab104a) {
        if (this.ab104a.equals(ab104a)) return;
        this.ab104a = ab104a;
        notifyPropertyChanged(BR.ab104a);
    }

    @Bindable
    public String getAb104b() {
        return ab104b;
    }

    public void setAb104b(String ab104b) {
        if (this.ab104b.equals(ab104b)) return;
        this.ab104b = ab104b;
        notifyPropertyChanged(BR.ab104b);
    }

    @Bindable
    public String getAb104c() {
        return ab104c;
    }

    public void setAb104c(String ab104c) {
        if (this.ab104c.equals(ab104c)) return;
        this.ab104c = ab104c;
        notifyPropertyChanged(BR.ab104c);
    }

    @Bindable
    public String getAb104d() {
        return ab104d;
    }

    public void setAb104d(String ab104d) {
        if (this.ab104d.equals(ab104d)) return;
        this.ab104d = ab104d;
        notifyPropertyChanged(BR.ab104d);
    }

    @Bindable
    public String getAb10496() {
        return ab10496;
    }

    public void setAb10496(String ab10496) {
        if (this.ab10496.equals(ab10496)) return;
        this.ab10496 = ab10496;
        setAb10496x(ab10496.equals("96") ? this.ab10496x : "");
        notifyPropertyChanged(BR.ab10496);
    }

    @Bindable
    public String getAb10496x() {
        return ab10496x;
    }

    public void setAb10496x(String ab10496x) {
        this.ab10496x = ab10496x;
        notifyPropertyChanged(BR.ab10496x);
    }

    @Bindable
    public String getAb105() {
        return ab105;
    }

    public void setAb105(String ab105) {
        this.ab105 = ab105;
        notifyPropertyChanged(BR.ab105);
    }

    @Bindable
    public String getAb106() {
        return ab106;
    }

    public void setAb106(String ab106) {
        this.ab106 = ab106;
        setAb107(ab106.equals("2") ? "" : this.ab107);
        setAb108a(ab106.equals("2") ? "" : this.ab108a);
        setAb108b(ab106.equals("2") ? "" : this.ab108b);
        setAb108c(ab106.equals("2") ? "" : this.ab108c);
        setAb108d(ab106.equals("2") ? "" : this.ab108d);
        setAb108e(ab106.equals("2") ? "" : this.ab108e);
        setAb108f(ab106.equals("2") ? "" : this.ab108f);
        setAb108g(ab106.equals("2") ? "" : this.ab108g);
        setAb108h(ab106.equals("2") ? "" : this.ab108h);
        setAb108i(ab106.equals("2") ? "" : this.ab108i);
        setAb108j(ab106.equals("2") ? "" : this.ab108j);
        setAb108k(ab106.equals("2") ? "" : this.ab108k);
        setAb10896(ab106.equals("2") ? "" : this.ab10896);
        setAb109(ab106.equals("2") ? "" : this.ab109);
        setAb110a(ab106.equals("2") ? "" : this.ab110a);
        setAb110b(ab106.equals("2") ? "" : this.ab110b);
        setAb110c(ab106.equals("2") ? "" : this.ab110c);
        setAb110d(ab106.equals("2") ? "" : this.ab110d);
        setAb110e(ab106.equals("2") ? "" : this.ab110e);
        setAb11096(ab106.equals("2") ? "" : this.ab11096);
        setAb111(ab106.equals("2") ? "" : this.ab111);
        notifyPropertyChanged(BR.ab106);
    }

    @Bindable
    public String getAb107() {
        return ab107;
    }

    public void setAb107(String ab107) {
        this.ab107 = ab107;
        setAb108a(ab107.equals("1") ? "" : this.ab108a);
        setAb108b(ab107.equals("1") ? "" : this.ab108b);
        setAb108c(ab107.equals("1") ? "" : this.ab108c);
        setAb108d(ab107.equals("1") ? "" : this.ab108d);
        setAb108e(ab107.equals("1") ? "" : this.ab108e);
        setAb108f(ab107.equals("1") ? "" : this.ab108f);
        setAb108g(ab107.equals("1") ? "" : this.ab108g);
        setAb108h(ab107.equals("1") ? "" : this.ab108h);
        setAb108i(ab107.equals("1") ? "" : this.ab108i);
        setAb108j(ab107.equals("1") ? "" : this.ab108j);
        setAb108k(ab107.equals("1") ? "" : this.ab108k);
        setAb10896(ab107.equals("1") ? "" : this.ab10896);
        notifyPropertyChanged(BR.ab107);
    }

    @Bindable
    public String getAb108() {
        return ab108;
    }

    public void setAb108(String ab108) {
        this.ab108 = ab108;
        notifyPropertyChanged(BR.ab108);
    }

    @Bindable
    public String getAb108a() {
        return ab108a;
    }

    public void setAb108a(String ab108a) {
        if (this.ab108a.equals(ab108a)) return;
        this.ab108a = ab108a;
        notifyPropertyChanged(BR.ab108a);
    }

    @Bindable
    public String getAb108b() {
        return ab108b;
    }

    public void setAb108b(String ab108b) {
        if (this.ab108b.equals(ab108b)) return;
        this.ab108b = ab108b;
        notifyPropertyChanged(BR.ab108b);
    }

    @Bindable
    public String getAb108c() {
        return ab108c;
    }

    public void setAb108c(String ab108c) {
        if (this.ab108c.equals(ab108c)) return;
        this.ab108c = ab108c;
        notifyPropertyChanged(BR.ab108c);
    }

    @Bindable
    public String getAb108d() {
        return ab108d;
    }

    public void setAb108d(String ab108d) {
        if (this.ab108d.equals(ab108d)) return;
        this.ab108d = ab108d;
        notifyPropertyChanged(BR.ab108d);
    }

    @Bindable
    public String getAb108e() {
        return ab108e;
    }

    public void setAb108e(String ab108e) {
        if (this.ab108e.equals(ab108e)) return;
        this.ab108e = ab108e;
        notifyPropertyChanged(BR.ab108e);
    }

    @Bindable
    public String getAb108f() {
        return ab108f;
    }

    public void setAb108f(String ab108f) {
        if (this.ab108f.equals(ab108f)) return;
        this.ab108f = ab108f;
        notifyPropertyChanged(BR.ab108f);
    }

    @Bindable
    public String getAb108g() {
        return ab108g;
    }

    public void setAb108g(String ab108g) {
        if (this.ab108g.equals(ab108g)) return;
        this.ab108g = ab108g;
        notifyPropertyChanged(BR.ab108g);
    }

    @Bindable
    public String getAb108h() {
        return ab108h;
    }

    public void setAb108h(String ab108h) {
        if (this.ab108h.equals(ab108h)) return;
        this.ab108h = ab108h;
        notifyPropertyChanged(BR.ab108h);
    }

    @Bindable
    public String getAb108i() {
        return ab108i;
    }

    public void setAb108i(String ab108i) {
        if (this.ab108i.equals(ab108i)) return;
        this.ab108i = ab108i;
        notifyPropertyChanged(BR.ab108i);
    }

    @Bindable
    public String getAb108j() {
        return ab108j;
    }

    public void setAb108j(String ab108j) {
        if (this.ab108j.equals(ab108j)) return;
        this.ab108j = ab108j;
        notifyPropertyChanged(BR.ab108j);
    }

    @Bindable
    public String getAb108k() {
        return ab108k;
    }

    public void setAb108k(String ab108k) {
        if (this.ab108k.equals(ab108k)) return;
        this.ab108k = ab108k;
        notifyPropertyChanged(BR.ab108k);
    }

    @Bindable
    public String getAb10896() {
        return ab10896;
    }

    public void setAb10896(String ab10896) {
        if (this.ab10896.equals(ab10896)) return;
        this.ab10896 = ab10896;
        setAb10896x(ab10896.equals("96") ? this.ab10896x : "");
        notifyPropertyChanged(BR.ab10896);
    }

    @Bindable
    public String getAb10896x() {
        return ab10896x;
    }

    public void setAb10896x(String ab10896x) {
        this.ab10896x = ab10896x;
        notifyPropertyChanged(BR.ab10896x);
    }

    @Bindable
    public String getAb109() {
        return ab109;
    }

    public void setAb109(String ab109) {
        this.ab109 = ab109;
        notifyPropertyChanged(BR.ab109);
    }

    @Bindable
    public String getAb10996x() {
        return ab10996x;
    }

    public void setAb10996x(String ab10996x) {
        this.ab10996x = ab10996x;
        notifyPropertyChanged(BR.ab10996x);
    }

    @Bindable
    public String getAb110() {
        return ab110;
    }

    public void setAb110(String ab110) {
        this.ab110 = ab110;
        notifyPropertyChanged(BR.ab110);
    }

    @Bindable
    public String getAb110a() {
        return ab110a;
    }

    public void setAb110a(String ab110a) {
        if (this.ab110a.equals(ab110a)) return;
        this.ab110a = ab110a;
        notifyPropertyChanged(BR.ab110a);
    }

    @Bindable
    public String getAb110b() {
        return ab110b;
    }

    public void setAb110b(String ab110b) {
        if (this.ab110b.equals(ab110b)) return;
        this.ab110b = ab110b;
        notifyPropertyChanged(BR.ab110b);
    }

    @Bindable
    public String getAb110c() {
        return ab110c;
    }

    public void setAb110c(String ab110c) {
        if (this.ab110c.equals(ab110c)) return;
        this.ab110c = ab110c;
        notifyPropertyChanged(BR.ab110c);
    }

    @Bindable
    public String getAb110d() {
        return ab110d;
    }

    public void setAb110d(String ab110d) {
        if (this.ab110d.equals(ab110d)) return;
        this.ab110d = ab110d;
        notifyPropertyChanged(BR.ab110d);
    }

    @Bindable
    public String getAb110e() {
        return ab110e;
    }

    public void setAb110e(String ab110e) {
        if (this.ab110e.equals(ab110e)) return;
        this.ab110e = ab110e;
        notifyPropertyChanged(BR.ab110e);
    }

    @Bindable
    public String getAb11096() {
        return ab11096;
    }

    public void setAb11096(String ab11096) {
        if (this.ab11096.equals(ab11096)) return;
        this.ab11096 = ab11096;
        setAb11096x(ab11096.equals("96") ? this.ab11096x : "");
        notifyPropertyChanged(BR.ab11096);
    }

    @Bindable
    public String getAb11096x() {
        return ab11096x;
    }

    public void setAb11096x(String ab11096x) {
        this.ab11096x = ab11096x;
        notifyPropertyChanged(BR.ab11096x);
    }

    @Bindable
    public String getAb111() {
        return ab111;
    }

    public void setAb111(String ab111) {
        this.ab111 = ab111;
        notifyPropertyChanged(BR.ab111);
    }

    @Bindable
    public String getAb112() {
        return ab112;
    }

    public void setAb112(String ab112) {
        this.ab112 = ab112;
        notifyPropertyChanged(BR.ab112);
    }

    @Bindable
    public String getAb113() {
        return ab113;
    }

    public void setAb113(String ab113) {
        this.ab113 = ab113;
        notifyPropertyChanged(BR.ab113);
    }

    @Bindable
    public String getAb113a() {
        return ab113a;
    }

    public void setAb113a(String ab113a) {
        if (this.ab113a.equals(ab113a)) return;
        this.ab113a = ab113a;
        notifyPropertyChanged(BR.ab113a);
    }

    @Bindable
    public String getAb113b() {
        return ab113b;
    }

    public void setAb113b(String ab113b) {
        if (this.ab113b.equals(ab113b)) return;
        this.ab113b = ab113b;
        notifyPropertyChanged(BR.ab113b);
    }

    @Bindable
    public String getAb113c() {
        return ab113c;
    }

    public void setAb113c(String ab113c) {
        if (this.ab113c.equals(ab113c)) return;
        this.ab113c = ab113c;
        setAb113a(ab113c.equals("3") ? "" : this.ab113a);
        setAb113b(ab113c.equals("3") ? "" : this.ab113b);
        setAb11398(ab113c.equals("3") ? "" : this.ab11398);
        setAb11396(ab113c.equals("3") ? "" : this.ab11396);
        notifyPropertyChanged(BR.ab113c);
    }

    @Bindable
    public String getAb11398() {
        return ab11398;
    }

    public void setAb11398(String ab11398) {
        if (this.ab11398.equals(ab11398)) return;
        this.ab11398 = ab11398;
        setAb113a(ab11398.equals("98") ? "" : this.ab113a);
        setAb113b(ab11398.equals("98") ? "" : this.ab113b);
        setAb113c(ab11398.equals("98") ? "" : this.ab113c);
        setAb11396(ab11398.equals("98") ? "" : this.ab11396);
        notifyPropertyChanged(BR.ab11398);
    }

    @Bindable
    public String getAb11396() {
        return ab11396;
    }

    public void setAb11396(String ab11396) {
        if (this.ab11396.equals(ab11396)) return;
        this.ab11396 = ab11396;
        setAb11396x(ab11396.equals("96") ? this.ab11396x : "");
        notifyPropertyChanged(BR.ab11396);
    }

    @Bindable
    public String getAb11396x() {
        return ab11396x;
    }

    public void setAb11396x(String ab11396x) {
        this.ab11396x = ab11396x;
        notifyPropertyChanged(BR.ab11396x);
    }

    @Bindable
    public String getAb114() {
        return ab114;
    }

    public void setAb114(String ab114) {
        this.ab114 = ab114;
        setAb115(ab114.equals("2") ? "" : this.ab115);
        setAb117(ab114.equals("2") ? "" : this.ab117);
        notifyPropertyChanged(BR.ab114);
    }

    @Bindable
    public String getAb115() {
        return ab115;
    }

    public void setAb115(String ab115) {
        this.ab115 = ab115;
        notifyPropertyChanged(BR.ab115);
    }

    @Bindable
    public String getAb117() {
        return ab117;
    }

    public void setAb117(String ab117) {
        this.ab117 = ab117;
        notifyPropertyChanged(BR.ab117);
    }

    @Bindable
    public String getAb118a() {
        return ab118a;
    }

    public void setAb118a(String ab118a) {
        this.ab118a = ab118a;
        notifyPropertyChanged(BR.ab118a);
    }

    @Bindable
    public String getAb118b() {
        return ab118b;
    }

    public void setAb118b(String ab118b) {
        this.ab118b = ab118b;
        notifyPropertyChanged(BR.ab118b);
    }

    @Bindable
    public String getAb118c() {
        return ab118c;
    }

    public void setAb118c(String ab118c) {
        this.ab118c = ab118c;
        notifyPropertyChanged(BR.ab118c);
    }

    @Bindable
    public String getAb118d() {
        return ab118d;
    }

    public void setAb118d(String ab118d) {
        this.ab118d = ab118d;
        notifyPropertyChanged(BR.ab118d);
    }

    @Bindable
    public String getAb118e() {
        return ab118e;
    }

    public void setAb118e(String ab118e) {
        this.ab118e = ab118e;
        notifyPropertyChanged(BR.ab118e);
    }

    @Bindable
    public String getAb118f() {
        return ab118f;
    }

    public void setAb118f(String ab118f) {
        this.ab118f = ab118f;
        notifyPropertyChanged(BR.ab118f);
    }

    @Bindable
    public String getAb118g() {
        return ab118g;
    }

    public void setAb118g(String ab118g) {
        this.ab118g = ab118g;
        notifyPropertyChanged(BR.ab118g);
    }

    @Bindable
    public String getAb118h() {
        return ab118h;
    }

    public void setAb118h(String ab118h) {
        this.ab118h = ab118h;
        notifyPropertyChanged(BR.ab118h);
    }

    @Bindable
    public String getAb118i() {
        return ab118i;
    }

    public void setAb118i(String ab118i) {
        this.ab118i = ab118i;
        notifyPropertyChanged(BR.ab118i);
    }

    @Bindable
    public String getAb118j() {
        return ab118j;
    }

    public void setAb118j(String ab118j) {
        this.ab118j = ab118j;
        notifyPropertyChanged(BR.ab118j);
    }

    @Bindable
    public String getAb118k() {
        return ab118k;
    }

    public void setAb118k(String ab118k) {
        this.ab118k = ab118k;
        notifyPropertyChanged(BR.ab118k);
    }

    @Bindable
    public String getAb118l() {
        return ab118l;
    }

    public void setAb118l(String ab118l) {
        this.ab118l = ab118l;
        notifyPropertyChanged(BR.ab118l);
    }

    @Bindable
    public String getAb118m() {
        return ab118m;
    }

    public void setAb118m(String ab118m) {
        this.ab118m = ab118m;
        notifyPropertyChanged(BR.ab118m);
    }

    @Bindable
    public String getAb118n() {
        return ab118n;
    }

    public void setAb118n(String ab118n) {
        this.ab118n = ab118n;
        notifyPropertyChanged(BR.ab118n);
    }

    @Bindable
    public String getAb118o() {
        return ab118o;
    }

    public void setAb118o(String ab118o) {
        this.ab118o = ab118o;
        notifyPropertyChanged(BR.ab118o);
    }

    @Bindable
    public String getAb118p() {
        return ab118p;
    }

    public void setAb118p(String ab118p) {
        this.ab118p = ab118p;
        notifyPropertyChanged(BR.ab118p);
    }

    @Bindable
    public String getAb118q() {
        return ab118q;
    }

    public void setAb118q(String ab118q) {
        this.ab118q = ab118q;
        notifyPropertyChanged(BR.ab118q);
    }

    @Bindable
    public String getAb118r() {
        return ab118r;
    }

    public void setAb118r(String ab118r) {
        this.ab118r = ab118r;
        notifyPropertyChanged(BR.ab118r);
    }

    @Bindable
    public String getAb118s() {
        return ab118s;
    }

    public void setAb118s(String ab118s) {
        this.ab118s = ab118s;
        notifyPropertyChanged(BR.ab118s);
    }

    @Bindable
    public String getAb118t() {
        return ab118t;
    }

    public void setAb118t(String ab118t) {
        this.ab118t = ab118t;
        notifyPropertyChanged(BR.ab118t);
    }

    @Bindable
    public String getAb118u() {
        return ab118u;
    }

    public void setAb118u(String ab118u) {
        this.ab118u = ab118u;
        notifyPropertyChanged(BR.ab118u);
    }

    @Bindable
    public String getAb119() {
        return ab119;
    }

    public void setAb119(String ab119) {
        this.ab119 = ab119;
        notifyPropertyChanged(BR.ab119);
    }

    @Bindable
    public String getM101() {
        return m101;
    }

    public void setM101(String m101) {
        this.m101 = m101;
        setM102(m101.equals("2") ? "" : this.m102);
        setM103(m101.equals("2") ? "" : this.m103);
        setM104(m101.equals("2") ? "" : this.m104);
        setM105a(m101.equals("2") ? "" : this.m105a);
        setM105b(m101.equals("2") ? "" : this.m105b);
        setM105c(m101.equals("2") ? "" : this.m105c);
        setM105d(m101.equals("2") ? "" : this.m105d);
        setM105e(m101.equals("2") ? "" : this.m105e);
        setM105f(m101.equals("2") ? "" : this.m105f);
        setM105g(m101.equals("2") ? "" : this.m105g);
        setM105h(m101.equals("2") ? "" : this.m105h);
        setM10596(m101.equals("2") ? "" : this.m10596);
        setM106a(m101.equals("2") ? "" : this.m106a);
        setM106b(m101.equals("2") ? "" : this.m106b);
        setM106c(m101.equals("2") ? "" : this.m106c);
        setM106d(m101.equals("2") ? "" : this.m106d);
        notifyPropertyChanged(BR.m101);
    }

    @Bindable
    public String getM102() {
        return m102;
    }

    public void setM102(String m102) {
        this.m102 = m102;
        notifyPropertyChanged(BR.m102);
    }

    @Bindable
    public String getM103() {
        return m103;
    }

    public void setM103(String m103) {
        this.m103 = m103;
        setM104(m103.equals("2") ? "" : this.m104);
        setM105a(m103.equals("1") ? "" : this.m105a);
        setM105b(m103.equals("1") ? "" : this.m105b);
        setM105c(m103.equals("1") ? "" : this.m105c);
        setM105d(m103.equals("1") ? "" : this.m105d);
        setM105e(m103.equals("1") ? "" : this.m105e);
        setM105f(m103.equals("1") ? "" : this.m105f);
        setM105g(m103.equals("1") ? "" : this.m105g);
        setM105h(m103.equals("1") ? "" : this.m105h);
        setM10596(m103.equals("1") ? "" : this.m10596);
        setM106a(m103.equals("2") ? "" : this.m106a);
        setM106b(m103.equals("2") ? "" : this.m106b);
        setM106c(m103.equals("2") ? "" : this.m106c);
        setM106d(m103.equals("2") ? "" : this.m106d);
        notifyPropertyChanged(BR.m103);
    }

    @Bindable
    public String getM104() {
        return m104;
    }

    public void setM104(String m104) {
        this.m104 = m104;
        notifyPropertyChanged(BR.m104);
    }

    @Bindable
    public String getM105() {
        return m105;
    }

    public void setM105(String m105) {
        this.m105 = m105;
        notifyPropertyChanged(BR.m105);
    }

    @Bindable
    public String getM105a() {
        return m105a;
    }

    public void setM105a(String m105a) {
        if (this.m105a.equals(m105a)) return;
        this.m105a = m105a;
        notifyPropertyChanged(BR.m105a);
    }

    @Bindable
    public String getM105b() {
        return m105b;
    }

    public void setM105b(String m105b) {
        if (this.m105b.equals(m105b)) return;
        this.m105b = m105b;
        notifyPropertyChanged(BR.m105b);
    }

    @Bindable
    public String getM105c() {
        return m105c;
    }

    public void setM105c(String m105c) {
        if (this.m105c.equals(m105c)) return;
        this.m105c = m105c;
        notifyPropertyChanged(BR.m105c);
    }

    @Bindable
    public String getM105d() {
        return m105d;
    }

    public void setM105d(String m105d) {
        if (this.m105d.equals(m105d)) return;
        this.m105d = m105d;
        notifyPropertyChanged(BR.m105d);
    }

    @Bindable
    public String getM105e() {
        return m105e;
    }

    public void setM105e(String m105e) {
        if (this.m105e.equals(m105e)) return;
        this.m105e = m105e;
        notifyPropertyChanged(BR.m105e);
    }

    @Bindable
    public String getM105f() {
        return m105f;
    }

    public void setM105f(String m105f) {
        if (this.m105f.equals(m105f)) return;
        this.m105f = m105f;
        notifyPropertyChanged(BR.m105f);
    }

    @Bindable
    public String getM105g() {
        return m105g;
    }

    public void setM105g(String m105g) {
        if (this.m105g.equals(m105g)) return;
        this.m105g = m105g;
        notifyPropertyChanged(BR.m105g);
    }

    @Bindable
    public String getM105h() {
        return m105h;
    }

    public void setM105h(String m105h) {
        if (this.m105h.equals(m105h)) return;
        this.m105h = m105h;
        notifyPropertyChanged(BR.m105h);
    }

    @Bindable
    public String getM10596() {
        return m10596;
    }

    public void setM10596(String m10596) {
        if (this.m10596.equals(m10596)) return;
        this.m10596 = m10596;
        setM10596x(m10596.equals("96") ? this.m10596x : "");
        notifyPropertyChanged(BR.m10596);
    }

    @Bindable
    public String getM10596x() {
        return m10596x;
    }

    public void setM10596x(String m10596x) {
        this.m10596x = m10596x;
        notifyPropertyChanged(BR.m10596x);
    }

    @Bindable
    public String getM106() {
        return m106;
    }

    public void setM106(String m106) {
        this.m106 = m106;
        notifyPropertyChanged(BR.m106);
    }

    @Bindable
    public String getM106a() {
        return m106a;
    }

    public void setM106a(String m106a) {
        if (this.m106a.equals(m106a)) return;
        this.m106a = m106a;
        notifyPropertyChanged(BR.m106a);
    }

    @Bindable
    public String getM106b() {
        return m106b;
    }

    public void setM106b(String m106b) {
        if (this.m106b.equals(m106b)) return;
        this.m106b = m106b;
        notifyPropertyChanged(BR.m106b);
    }

    @Bindable
    public String getM106c() {
        return m106c;
    }

    public void setM106c(String m106c) {
        if (this.m106c.equals(m106c)) return;
        this.m106c = m106c;
        notifyPropertyChanged(BR.m106c);
    }

    @Bindable
    public String getM106d() {
        return m106d;
    }

    public void setM106d(String m106d) {
        if (this.m106d.equals(m106d)) return;
        this.m106d = m106d;
        notifyPropertyChanged(BR.m106d);
    }


    public HHForm Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(HHFormsTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(HHFormsTable.COLUMN_UID));
        this.lhwuid = cursor.getString(cursor.getColumnIndexOrThrow(HHFormsTable.COLUMN_LHW_UID));
        this.lhwCode = cursor.getString(cursor.getColumnIndexOrThrow(HHFormsTable.COLUMN_LHW_CODE));
        this.khandandNo = cursor.getString(cursor.getColumnIndexOrThrow(HHFormsTable.COLUMN_KHANDAN_NO));
        this.district = cursor.getString(cursor.getColumnIndexOrThrow(HHFormsTable.COLUMN_DISTRICT));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(HHFormsTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(HHFormsTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(HHFormsTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(HHFormsTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(HHFormsTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(HHFormsTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(HHFormsTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(HHFormsTable.COLUMN_SYNCED_DATE));

        sH2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(HHFormsTable.COLUMN_SH2)));
        //sH3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(HHFormsTable.COLUMN_SH3)));
        sABHydrate(cursor.getString(cursor.getColumnIndexOrThrow(HHFormsTable.COLUMN_SAB)));
        sMHydrate(cursor.getString(cursor.getColumnIndexOrThrow(HHFormsTable.COLUMN_SM)));

        return this;
    }

    public void sH2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sH2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.h201 = json.getString("h201");
            this.h202 = json.getString("h202");
            this.h203 = json.getString("h203");
            this.h204a = json.getString("h204a");
            this.h204b = json.getString("h204b");
            this.h204c = json.getString("h204c");
            this.h204d = json.getString("h204d");
            this.h204e = json.getString("h204e");
            this.h204f = json.getString("h204f");
            this.h205 = json.getString("h205");
        }
    }


    public void sABHydrate(String string) throws JSONException {
        Log.d(TAG, "sABHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.adolUID = json.getString("adolUID");
            this.adolSno = json.getString("adolSno");
            this.adolAge = json.getString("adolAge");
            this.maritalStatus = json.getString("maritalStatus");
            this.ab101 = json.getString("ab101");
            this.ab102 = json.getString("ab102");
            this.ab103 = json.getString("ab103");
            this.ab104 = json.getString("ab104");
            this.ab104a = json.getString("ab104a");
            this.ab104b = json.getString("ab104b");
            this.ab104c = json.getString("ab104c");
            this.ab104d = json.getString("ab104d");
            this.ab10496 = json.getString("ab10496");
            this.ab10496x = json.getString("ab10496x");
            this.ab105 = json.getString("ab105");
            this.ab106 = json.getString("ab106");
            this.ab107 = json.getString("ab107");
            this.ab108 = json.getString("ab108");
            this.ab108a = json.getString("ab108a");
            this.ab108b = json.getString("ab108b");
            this.ab108c = json.getString("ab108c");
            this.ab108d = json.getString("ab108d");
            this.ab108e = json.getString("ab108e");
            this.ab108f = json.getString("ab108f");
            this.ab108g = json.getString("ab108g");
            this.ab108h = json.getString("ab108h");
            this.ab108i = json.getString("ab108i");
            this.ab108j = json.getString("ab108j");
            this.ab108k = json.getString("ab108k");
            this.ab10896 = json.getString("ab10896");
            this.ab10896x = json.getString("ab10896x");
            this.ab109 = json.getString("ab109");
            this.ab10996x = json.getString("ab10996x");
            this.ab110 = json.getString("ab110");
            this.ab110a = json.getString("ab110a");
            this.ab110b = json.getString("ab110b");
            this.ab110c = json.getString("ab110c");
            this.ab110d = json.getString("ab110d");
            this.ab110e = json.getString("ab110e");
            this.ab11096 = json.getString("ab11096");
            this.ab11096x = json.getString("ab11096x");
            this.ab111 = json.getString("ab111");
            this.ab112 = json.getString("ab112");
            this.ab113 = json.getString("ab113");
            this.ab113a = json.getString("ab113a");
            this.ab113b = json.getString("ab113b");
            this.ab113c = json.getString("ab113c");
            this.ab11398 = json.getString("ab11398");
            this.ab11396 = json.getString("ab11396");
            this.ab114 = json.getString("ab114");
            this.ab115 = json.getString("ab115");
            this.ab117 = json.getString("ab117");
            this.ab118a = json.getString("ab118a");
            this.ab118b = json.getString("ab118b");
            this.ab118c = json.getString("ab118c");
            this.ab118d = json.getString("ab118d");
            this.ab118e = json.getString("ab118e");
            this.ab118f = json.getString("ab118f");
            this.ab118g = json.getString("ab118g");
            this.ab118h = json.getString("ab118h");
            this.ab118i = json.getString("ab118i");
            this.ab118j = json.getString("ab118j");
            this.ab118k = json.getString("ab118k");
            this.ab118l = json.getString("ab118l");
            this.ab118m = json.getString("ab118m");
            this.ab118n = json.getString("ab118n");
            this.ab118o = json.getString("ab118o");
            this.ab118p = json.getString("ab118p");
            this.ab118q = json.getString("ab118q");
            this.ab118r = json.getString("ab118r");
            this.ab118s = json.getString("ab118s");
            this.ab118t = json.getString("ab118t");
            this.ab118u = json.getString("ab118u");
            this.ab119 = json.getString("ab119");
        }
    }

    public void sMHydrate(String string) throws JSONException {
        Log.d(TAG, "sMHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.maleUID = json.getString("maleUID");
            this.maleUID = json.getString("maleSno");
            this.maleAge = json.getString("maleAge");
            this.maritalStatus = json.getString("maritalStatus");
            this.m101 = json.getString("m101");
            this.m102 = json.getString("m102");
            this.m103 = json.getString("m103");
            this.m104 = json.getString("m104");
            this.m105 = json.getString("m105");
            this.m105a = json.getString("m105a");
            this.m105b = json.getString("m105b");
            this.m105c = json.getString("m105c");
            this.m105d = json.getString("m105d");
            this.m105e = json.getString("m105e");
            this.m105f = json.getString("m105f");
            this.m105g = json.getString("m105g");
            this.m105h = json.getString("m105h");
            this.m10596 = json.getString("m10596");
            this.m10596x = json.getString("m10596x");
            this.m106 = json.getString("m106");
            this.m106a = json.getString("m106a");
            this.m106b = json.getString("m106b");
            this.m106c = json.getString("m106c");
            this.m106d = json.getString("m106d");
        }
    }



    public String sH2toString() throws JSONException {
        Log.d(TAG, "sH2toString: ");
        JSONObject json = new JSONObject();
        json.put("h201", h201)
                .put("h202", h202)
                .put("h203", h203)
                .put("h204a", h204a)
                .put("h204b", h204b)
                .put("h204c", h204c)
                .put("h204d", h204d)
                .put("h204e", h204e)
                .put("h204f", h204f)
                .put("h205", h205);
        return json.toString();
    }


    public String sABtoString() throws JSONException {
        Log.d(TAG, "sABtoString: ");
        JSONObject json = new JSONObject();
        json.put("ab101", ab101)
                .put("ab102", ab102)
                .put("ab103", ab103)
                .put("ab104", ab104)
                .put("ab104a", ab104a)
                .put("ab104b", ab104b)
                .put("ab104c", ab104c)
                .put("ab104d", ab104d)
                .put("ab10496", ab10496)
                .put("ab10496x", ab10496x)
                .put("ab105", ab105)
                .put("ab106", ab106)
                .put("ab107", ab107)
                .put("ab108", ab108)
                .put("ab108a", ab108a)
                .put("ab108b", ab108b)
                .put("ab108c", ab108c)
                .put("ab108d", ab108d)
                .put("ab108e", ab108e)
                .put("ab108f", ab108f)
                .put("ab108g", ab108g)
                .put("ab108h", ab108h)
                .put("ab108i", ab108i)
                .put("ab108j", ab108j)
                .put("ab108k", ab108k)
                .put("ab10896", ab10896)
                .put("ab10896x", ab10896x)
                .put("ab109", ab109)
                .put("ab10996x", ab10996x)
                .put("ab110", ab110)
                .put("ab110a", ab110a)
                .put("ab110b", ab110b)
                .put("ab110c", ab110c)
                .put("ab110d", ab110d)
                .put("ab110e", ab110e)
                .put("ab11096", ab11096)
                .put("ab11096x", ab11096x)
                .put("ab111", ab111)
                .put("ab112", ab112)
                .put("ab113", ab113)
                .put("ab113a", ab113a)
                .put("ab113b", ab113b)
                .put("ab113c", ab113c)
                .put("ab11398", ab11398)
                .put("ab11396", ab11396)
                .put("ab114", ab114)
                .put("ab115", ab115)
                .put("ab117", ab117)
                .put("ab118a", ab118a)
                .put("ab118b", ab118b)
                .put("ab118c", ab118c)
                .put("ab118d", ab118d)
                .put("ab118e", ab118e)
                .put("ab118f", ab118f)
                .put("ab118g", ab118g)
                .put("ab118h", ab118h)
                .put("ab118i", ab118i)
                .put("ab118j", ab118j)
                .put("ab118k", ab118k)
                .put("ab118l", ab118l)
                .put("ab118m", ab118m)
                .put("ab118n", ab118n)
                .put("ab118o", ab118o)
                .put("ab118p", ab118p)
                .put("ab118q", ab118q)
                .put("ab118r", ab118r)
                .put("ab118s", ab118s)
                .put("ab118t", ab118t)
                .put("ab118u", ab118u)
                .put("adolUID", adolUID)
                .put("adolSno", adolSno)
                .put("adolAge", adolAge)
                .put("maritalStatus", maritalStatus)
                .put("ab119", ab119);
        return json.toString();
    }

    public String sMtoString() throws JSONException {
        Log.d(TAG, "sMtoString: ");
        JSONObject json = new JSONObject();
        json.put("m101", m101)
                .put("m102", m102)
                .put("m103", m103)
                .put("m104", m104)
                .put("m105", m105)
                .put("m105a", m105a)
                .put("m105b", m105b)
                .put("m105c", m105c)
                .put("m105d", m105d)
                .put("m105e", m105e)
                .put("m105f", m105f)
                .put("m105g", m105g)
                .put("m105h", m105h)
                .put("m10596", m10596)
                .put("m10596x", m10596x)
                .put("m106", m106)
                .put("m106a", m106a)
                .put("m106b", m106b)
                .put("m106c", m106c)
                .put("maleUID", maleUID)
                .put("maleSno", maleSno)
                .put("maleAge", maleAge)
                .put("maritalStatus", maritalStatus)
                .put("m106d", m106d);
        return json.toString();
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(HHFormsTable.COLUMN_ID, this.id);
        json.put(HHFormsTable.COLUMN_UID, this.uid);
        json.put(HHFormsTable.COLUMN_LHW_UID, this.lhwuid);
        json.put(HHFormsTable.COLUMN_LHW_CODE, this.lhwCode);
        json.put(HHFormsTable.COLUMN_KHANDAN_NO, this.khandandNo);
        json.put(HHFormsTable.COLUMN_DISTRICT, this.district);
        json.put(HHFormsTable.COLUMN_USERNAME, this.userName);
        json.put(HHFormsTable.COLUMN_SYSDATE, this.sysDate);
        json.put(HHFormsTable.COLUMN_DEVICEID, this.deviceId);
        json.put(HHFormsTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(HHFormsTable.COLUMN_ISTATUS, this.iStatus);
        json.put(HHFormsTable.COLUMN_APPVERSION, this.appver);

        // Household
        json.put(HHFormsTable.COLUMN_SH2, new JSONObject(sH2toString()));
     //   json.put(HHFormsTable.COLUMN_SH3, new JSONObject(sH3toString()));
        json.put(HHFormsTable.COLUMN_SAB, new JSONObject(sABtoString()));
        json.put(HHFormsTable.COLUMN_SM, new JSONObject(sMtoString()));
        return json;
    }


}
