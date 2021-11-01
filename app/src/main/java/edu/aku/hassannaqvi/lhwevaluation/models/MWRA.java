package edu.aku.hassannaqvi.lhwevaluation.models;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.PropertyChangeRegistry;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.time.LocalDate;

import edu.aku.hassannaqvi.lhwevaluation.BR;
import edu.aku.hassannaqvi.lhwevaluation.contracts.TableContracts.MWRAListTable;
import edu.aku.hassannaqvi.lhwevaluation.core.MainApp;

public class MWRA extends BaseObservable {

    private final String TAG = "MWRA";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    //Not saving in DB
    private final LocalDate localDate = null;
    private final boolean exist = false;
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = StringUtils.EMPTY;
    private String uid = StringUtils.EMPTY;
    private String uuid = StringUtils.EMPTY;
    private String cluster = StringUtils.EMPTY;
    private String hhid = StringUtils.EMPTY;
    private String userName = StringUtils.EMPTY;
    private String sysDate = StringUtils.EMPTY;
    private String indexed = StringUtils.EMPTY;
    private String deviceId = StringUtils.EMPTY;
    private String deviceTag = StringUtils.EMPTY;
    private String appver = StringUtils.EMPTY;
    private String endTime = StringUtils.EMPTY;
    private String iStatus = StringUtils.EMPTY;
    private String iStatus96x = StringUtils.EMPTY;
    private String synced = StringUtils.EMPTY;
    private String syncDate = StringUtils.EMPTY;

    // SECTION VARIABLES
    private String sW1 = StringUtils.EMPTY;
    private String sW2 = StringUtils.EMPTY;
    private String sW3 = StringUtils.EMPTY;
    private String sW41 = StringUtils.EMPTY;
    private String sW42 = StringUtils.EMPTY;
    private String sW43 = StringUtils.EMPTY;

    // FIELD VARIABLES
    private String w101 = StringUtils.EMPTY;
    private String w102 = StringUtils.EMPTY;
    private String w103 = StringUtils.EMPTY;
    private String w104 = StringUtils.EMPTY;
    private String w105 = StringUtils.EMPTY;
    private String w106y = StringUtils.EMPTY;
    private String w106m = StringUtils.EMPTY;
    private String secw2inst = StringUtils.EMPTY;
    private String w201 = StringUtils.EMPTY;
    private String w202 = StringUtils.EMPTY;
    private String w203 = StringUtils.EMPTY;
    private String w203a = StringUtils.EMPTY;
    private String w203b = StringUtils.EMPTY;
    private String w203c = StringUtils.EMPTY;
    private String w203d = StringUtils.EMPTY;
    private String w203e = StringUtils.EMPTY;
    private String w20396 = StringUtils.EMPTY;
    private String w20396x = StringUtils.EMPTY;
    private String w204 = StringUtils.EMPTY;
    private String w204a = StringUtils.EMPTY;
    private String w204b = StringUtils.EMPTY;
    private String w204c = StringUtils.EMPTY;
    private String w204d = StringUtils.EMPTY;
    private String w204e = StringUtils.EMPTY;
    private String w204f = StringUtils.EMPTY;
    private String w204g = StringUtils.EMPTY;
    private String w204h = StringUtils.EMPTY;
    private String w204i = StringUtils.EMPTY;
    private String w205 = StringUtils.EMPTY;
    private String w205a = StringUtils.EMPTY;
    private String w205b = StringUtils.EMPTY;
    private String w205c = StringUtils.EMPTY;
    private String w205d = StringUtils.EMPTY;
    private String w205e = StringUtils.EMPTY;
    private String w20598 = StringUtils.EMPTY;
    private String w206 = StringUtils.EMPTY;
    private String w206a = StringUtils.EMPTY;
    private String w206b = StringUtils.EMPTY;
    private String w206c = StringUtils.EMPTY;
    private String w206d = StringUtils.EMPTY;
    private String w206e = StringUtils.EMPTY;
    private String w206f = StringUtils.EMPTY;
    private String w206g = StringUtils.EMPTY;
    private String w206h = StringUtils.EMPTY;
    private String w206i = StringUtils.EMPTY;
    private String w206j = StringUtils.EMPTY;
    private String w206k = StringUtils.EMPTY;
    private String w20698 = StringUtils.EMPTY;
    private String w207 = StringUtils.EMPTY;
    private String w207a = StringUtils.EMPTY;
    private String w207b = StringUtils.EMPTY;
    private String w207c = StringUtils.EMPTY;
    private String w207d = StringUtils.EMPTY;
    private String w207e = StringUtils.EMPTY;
    private String w207f = StringUtils.EMPTY;
    private String w207g = StringUtils.EMPTY;
    private String w207h = StringUtils.EMPTY;
    private String w207i = StringUtils.EMPTY;
    private String w207j = StringUtils.EMPTY;
    private String w20798 = StringUtils.EMPTY;
    private String w208 = StringUtils.EMPTY;
    private String w208a = StringUtils.EMPTY;
    private String w208b = StringUtils.EMPTY;
    private String w208c = StringUtils.EMPTY;
    private String w208d = StringUtils.EMPTY;
    private String w208e = StringUtils.EMPTY;
    private String w208f = StringUtils.EMPTY;
    private String w20898 = StringUtils.EMPTY;
    private String w20897 = StringUtils.EMPTY;
    private String w209a = StringUtils.EMPTY;
    private String w209b = StringUtils.EMPTY;
    private String w209c = StringUtils.EMPTY;
    private String w209d = StringUtils.EMPTY;
    private String w209e = StringUtils.EMPTY;
    private String w209f = StringUtils.EMPTY;
    private String w209g = StringUtils.EMPTY;
    private String w20997 = StringUtils.EMPTY;
    private String w20998 = StringUtils.EMPTY;
    private String w210 = StringUtils.EMPTY;
    private String w301 = StringUtils.EMPTY;
    private String w302 = StringUtils.EMPTY;
    private String w302a = StringUtils.EMPTY;
    private String w302b = StringUtils.EMPTY;
    private String w302c = StringUtils.EMPTY;
    private String w302d = StringUtils.EMPTY;
    private String w302e = StringUtils.EMPTY;
    private String w302f = StringUtils.EMPTY;
    private String w302g = StringUtils.EMPTY;
    private String w30296 = StringUtils.EMPTY;
    private String w30296x = StringUtils.EMPTY;
    private String w303 = StringUtils.EMPTY;
    private String w304 = StringUtils.EMPTY;
    private String w305 = StringUtils.EMPTY;
    private String w305a = StringUtils.EMPTY;
    private String w305b = StringUtils.EMPTY;
    private String w305c = StringUtils.EMPTY;
    private String w305d = StringUtils.EMPTY;
    private String w305e = StringUtils.EMPTY;
    private String w305f = StringUtils.EMPTY;
    private String w305g = StringUtils.EMPTY;
    private String w305h = StringUtils.EMPTY;
    private String w305i = StringUtils.EMPTY;
    private String w305j = StringUtils.EMPTY;
    private String w305k = StringUtils.EMPTY;
    private String w305l = StringUtils.EMPTY;
    private String w305m = StringUtils.EMPTY;
    private String w30596 = StringUtils.EMPTY;
    private String w30596x = StringUtils.EMPTY;
    private String w306 = StringUtils.EMPTY;
    private String w307 = StringUtils.EMPTY;
    private String w30796x = StringUtils.EMPTY;
    private String w308 = StringUtils.EMPTY;
    private String w309 = StringUtils.EMPTY;
    private String w310 = StringUtils.EMPTY;
    private String w310a = StringUtils.EMPTY;
    private String w310b = StringUtils.EMPTY;
    private String w310c = StringUtils.EMPTY;
    private String w310d = StringUtils.EMPTY;
    private String w310e = StringUtils.EMPTY;
    private String w31096 = StringUtils.EMPTY;
    private String w31096x = StringUtils.EMPTY;
    private String w311 = StringUtils.EMPTY;
    private String w311a = StringUtils.EMPTY;
    private String w311b = StringUtils.EMPTY;
    private String w311c = StringUtils.EMPTY;
    private String w311d = StringUtils.EMPTY;
    private String w311e = StringUtils.EMPTY;
    private String w311f = StringUtils.EMPTY;
    private String w311g = StringUtils.EMPTY;
    private String w311h = StringUtils.EMPTY;
    private String w31196 = StringUtils.EMPTY;
    private String w31196x = StringUtils.EMPTY;
    private String w312 = StringUtils.EMPTY;
    private String w313 = StringUtils.EMPTY;
    private String w31396x = StringUtils.EMPTY;
    private String w401 = StringUtils.EMPTY;
    private String w402 = StringUtils.EMPTY;
    private String w403 = StringUtils.EMPTY;
    private String w403a = StringUtils.EMPTY;
    private String w403b = StringUtils.EMPTY;
    private String w403c = StringUtils.EMPTY;
    private String w403d = StringUtils.EMPTY;
    private String w403e = StringUtils.EMPTY;
    private String w403f = StringUtils.EMPTY;
    private String w403g = StringUtils.EMPTY;
    private String w403h = StringUtils.EMPTY;
    private String w403i = StringUtils.EMPTY;
    private String w403j = StringUtils.EMPTY;
    private String w40396 = StringUtils.EMPTY;
    private String w40396x = StringUtils.EMPTY;
    private String w404 = StringUtils.EMPTY;
    private String w405 = StringUtils.EMPTY;
    private String w405a = StringUtils.EMPTY;
    private String w405b = StringUtils.EMPTY;
    private String w405c = StringUtils.EMPTY;
    private String w405d = StringUtils.EMPTY;
    private String w405e = StringUtils.EMPTY;
    private String w405f = StringUtils.EMPTY;
    private String w405g = StringUtils.EMPTY;
    private String w405h = StringUtils.EMPTY;
    private String w405i = StringUtils.EMPTY;
    private String w405j = StringUtils.EMPTY;
    private String w405k = StringUtils.EMPTY;
    private String w405l = StringUtils.EMPTY;
    private String w405m = StringUtils.EMPTY;
    private String w405n = StringUtils.EMPTY;
    private String w406a = StringUtils.EMPTY;
    private String w406b = StringUtils.EMPTY;
    private String w406c = StringUtils.EMPTY;
    private String w406d = StringUtils.EMPTY;
    private String w406e = StringUtils.EMPTY;
    private String w407a = StringUtils.EMPTY;
    private String w407b = StringUtils.EMPTY;
    private String w407c = StringUtils.EMPTY;
    private String w407d = StringUtils.EMPTY;
    private String w407e = StringUtils.EMPTY;
    private String w407f = StringUtils.EMPTY;
    private String w407g = StringUtils.EMPTY;
    private String w407h = StringUtils.EMPTY;
    private String w407i = StringUtils.EMPTY;
    private String w408a = StringUtils.EMPTY;
    private String w408b = StringUtils.EMPTY;
    private String w408c = StringUtils.EMPTY;
    private String w408d = StringUtils.EMPTY;
    private String w409a = StringUtils.EMPTY;
    private String w409b = StringUtils.EMPTY;
    private String w409c = StringUtils.EMPTY;
    private String w409d = StringUtils.EMPTY;
    private String w409e = StringUtils.EMPTY;
    private String w409f = StringUtils.EMPTY;
    private String w409g = StringUtils.EMPTY;
    private String w409h = StringUtils.EMPTY;
    private String w409i = StringUtils.EMPTY;
    private String w409j = StringUtils.EMPTY;
    private String w410a = StringUtils.EMPTY;
    private String w410b = StringUtils.EMPTY;
    private String w410c = StringUtils.EMPTY;
    private String w410d = StringUtils.EMPTY;
    private String w410e = StringUtils.EMPTY;
    private String w410f = StringUtils.EMPTY;
    private String w410g = StringUtils.EMPTY;
    private String w410h = StringUtils.EMPTY;
    private String w410i = StringUtils.EMPTY;
    private String w410j = StringUtils.EMPTY;
    private String w410k = StringUtils.EMPTY;
    private String w410l = StringUtils.EMPTY;
    private String w411a = StringUtils.EMPTY;
    private String w411b = StringUtils.EMPTY;
    private String w411c = StringUtils.EMPTY;
    private String w411d = StringUtils.EMPTY;
    private String w411e = StringUtils.EMPTY;
    private String w411f = StringUtils.EMPTY;
    private String w411g = StringUtils.EMPTY;
    private String w411h = StringUtils.EMPTY;
    private String w411i = StringUtils.EMPTY;
    private String w412a = StringUtils.EMPTY;
    private String w412b = StringUtils.EMPTY;
    private String w412c = StringUtils.EMPTY;
    private String w412d = StringUtils.EMPTY;
    private String w412e = StringUtils.EMPTY;
    private String w412f = StringUtils.EMPTY;
    private String w412g = StringUtils.EMPTY;
    private String w412h = StringUtils.EMPTY;
    private String w412i = StringUtils.EMPTY;
    private String w412j = StringUtils.EMPTY;
    private String w413a = StringUtils.EMPTY;
    private String w413b = StringUtils.EMPTY;
    private String w413c = StringUtils.EMPTY;
    private String w413d = StringUtils.EMPTY;
    private String w413e = StringUtils.EMPTY;
    private String w413f = StringUtils.EMPTY;
    private String w413g = StringUtils.EMPTY;
    private String w414a = StringUtils.EMPTY;
    private String w414b = StringUtils.EMPTY;
    private String w414c = StringUtils.EMPTY;
    private String w414d = StringUtils.EMPTY;
    private String w414e = StringUtils.EMPTY;
    private String w414f = StringUtils.EMPTY;
    private String w414g = StringUtils.EMPTY;
    private String w414h = StringUtils.EMPTY;
    private String w414i = StringUtils.EMPTY;
    private String w415a = StringUtils.EMPTY;
    private String w415b = StringUtils.EMPTY;
    private String w415c = StringUtils.EMPTY;
    private String w415d = StringUtils.EMPTY;
    private String w415e = StringUtils.EMPTY;
    private String w416a = StringUtils.EMPTY;
    private String w416b = StringUtils.EMPTY;
    private String w416c = StringUtils.EMPTY;
    private String w416d = StringUtils.EMPTY;
    private String w416e = StringUtils.EMPTY;
    private String w416f = StringUtils.EMPTY;
    private String w417a = StringUtils.EMPTY;
    private String w417b = StringUtils.EMPTY;
    private String w417c = StringUtils.EMPTY;
    private String w417d = StringUtils.EMPTY;
    private String w417e = StringUtils.EMPTY;
    private String w417f = StringUtils.EMPTY;
    private String w417g = StringUtils.EMPTY;
    private String w418a = StringUtils.EMPTY;
    private String w418b = StringUtils.EMPTY;
    private String w418c = StringUtils.EMPTY;
    private String w418d = StringUtils.EMPTY;
    private String w418e = StringUtils.EMPTY;
    private String w418f = StringUtils.EMPTY;
    private String w418g = StringUtils.EMPTY;
    private String w418h = StringUtils.EMPTY;
    private String w418i = StringUtils.EMPTY;
    private String w418j = StringUtils.EMPTY;
    private String w419 = StringUtils.EMPTY;
    private String w419a = StringUtils.EMPTY;
    private String w419b = StringUtils.EMPTY;
    private String w419c = StringUtils.EMPTY;
    private String w419d = StringUtils.EMPTY;
    private String w420 = StringUtils.EMPTY;
    private String w42096x = StringUtils.EMPTY;
    private String w421a = StringUtils.EMPTY;
    private String w421b = StringUtils.EMPTY;
    private String w421c = StringUtils.EMPTY;
    private String w421d = StringUtils.EMPTY;
    private String w421e = StringUtils.EMPTY;
    private String w421f = StringUtils.EMPTY;
    private String w421g = StringUtils.EMPTY;
    private String w421h = StringUtils.EMPTY;
    private boolean expanded;


    public MWRA() {
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

    @Bindable
    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
        notifyPropertyChanged(BR.expanded);
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


    public String getsW1() {
        return sW1;
    }

    public void setsW1(String sW1) {
        this.sW1 = sW1;
    }


    public String getsW2() {
        return sW2;
    }

    public void setsW2(String sW2) {
        this.sW2 = sW2;
    }


    public String getsW3() {
        return sW3;
    }

    public void setsW3(String sW3) {
        this.sW3 = sW3;
    }


    public String getsW41() {
        return sW41;
    }

    public void setsW41(String sW41) {
        this.sW41 = sW41;
    }


    public String getsW42() {
        return sW42;
    }

    public void setsW42(String sW42) {
        this.sW42 = sW42;
    }


    public String getsW43() {
        return sW43;
    }

    public void setsW43(String sW43) {
        this.sW43 = sW43;
    }


    @Bindable
    public String getIndexed() {
        return indexed;
    }

    public void setIndexed(String Indexed) {
        this.indexed = Indexed;
        notifyPropertyChanged(BR.indexed);
    }


    @Bindable
    public String getW101() {
        return w101;
    }

    public void setW101(String w101) {
        this.w101 = w101;
        notifyPropertyChanged(BR.w101);
    }

    @Bindable
    public String getW102() {
        return w102;
    }

    public void setW102(String w102) {
        this.w102 = w102;
        notifyPropertyChanged(BR.w102);
    }

    @Bindable
    public String getW103() {
        return w103;
    }

    public void setW103(String w103) {
        this.w103 = w103;
        /*setW207a(w103.equals("1") ? "" : this.w207a);
        setW207b(w103.equals("1") ? "" : this.w207b);
        setW207c(w103.equals("1") ? "" : this.w207c);
        setW207d(w103.equals("1") ? "" : this.w207d);
        setW207e(w103.equals("1") ? "" : this.w207e);
        setW207f(w103.equals("1") ? "" : this.w207f);
        setW207g(w103.equals("1") ? "" : this.w207g);
        setW207h(w103.equals("1") ? "" : this.w207h);
        setW207i(w103.equals("1") ? "" : this.w207i);
        setW207j(w103.equals("1") ? "" : this.w207j);
        setW20798(w103.equals("1") ? "" : this.w20798);
        setW208a(w103.equals("1") ? "" : this.w208a);
        setW208b(w103.equals("1") ? "" : this.w208b);
        setW208c(w103.equals("1") ? "" : this.w208c);
        setW208d(w103.equals("1") ? "" : this.w208d);
        setW208e(w103.equals("1") ? "" : this.w208e);
        setW208f(w103.equals("1") ? "" : this.w208f);
        setW20897(w103.equals("1") ? "" : this.w20897);
        setW20898(w103.equals("1") ? "" : this.w20898);
        setW209a(w103.equals("1") ? "" : this.w209a);
        setW209b(w103.equals("1") ? "" : this.w209b);
        setW209c(w103.equals("1") ? "" : this.w209c);
        setW209d(w103.equals("1") ? "" : this.w209d);
        setW209e(w103.equals("1") ? "" : this.w209e);
        setW209f(w103.equals("1") ? "" : this.w209f);
        setW209g(w103.equals("1") ? "" : this.w209g);
        setW20997(w103.equals("1") ? "" : this.w20997);
        setW20998(w103.equals("1") ? "" : this.w20998);
        setW210(w103.equals("1") ? "" : this.w210);*/
        setW104(w103.equals("2") ? "" : this.w104);
        notifyPropertyChanged(BR.w103);
    }

    @Bindable
    public String getW104() {
        return w104;
    }

    public void setW104(String w104) {
        this.w104 = w104;
        notifyPropertyChanged(BR.w104);
    }

    @Bindable
    public String getW105() {
        return w105;
    }

    public void setW105(String w105) {
        this.w105 = w105;
        setW106m(w105.length() > 0 ? Integer.parseInt(w105) == 0 ? "" : this.w106m : this.w106m);
        setW106y(w105.length() > 0 ? Integer.parseInt(w105) == 0 ? "" : this.w106y : this.w106y);
        notifyPropertyChanged(BR.w105);
    }

    @Bindable
    public String getW106y() {
        return w106y;
    }

    public void setW106y(String w106y) {
        this.w106y = w106y;
        notifyPropertyChanged(BR.w106y);
    }

    @Bindable
    public String getW106m() {
        return w106m;
    }

    public void setW106m(String w106m) {
        this.w106m = w106m;
        notifyPropertyChanged(BR.w106m);
    }

    @Bindable
    public String getSecw2inst() {
        return secw2inst;
    }

    public void setSecw2inst(String secw2inst) {
        this.secw2inst = secw2inst;
        notifyPropertyChanged(BR.secw2inst);
    }

    @Bindable
    public String getW201() {
        return w201;
    }

    public void setW201(String w201) {
        this.w201 = w201;
        notifyPropertyChanged(BR.w201);
    }

    @Bindable
    public String getW202() {
        return w202;
    }

    public void setW202(String w202) {
        this.w202 = w202;
        setW203a(w202.equals("6") ? "" : this.w203a);
        setW203b(w202.equals("6") ? "" : this.w203b);
        setW203c(w202.equals("6") ? "" : this.w203c);
        setW203d(w202.equals("6") ? "" : this.w203d);
        setW203e(w202.equals("6") ? "" : this.w203e);
        setW20396(w202.equals("6") ? "" : this.w20396);

        setW204a(w202.equals("6") ? "" : this.w204a);
        setW204b(w202.equals("6") ? "" : this.w204b);
        setW204c(w202.equals("6") ? "" : this.w204c);
        setW204d(w202.equals("6") ? "" : this.w204d);
        setW204e(w202.equals("6") ? "" : this.w204e);
        setW204f(w202.equals("6") ? "" : this.w204f);
        setW204g(w202.equals("6") ? "" : this.w204g);
        setW204h(w202.equals("6") ? "" : this.w204h);
        setW204i(w202.equals("6") ? "" : this.w204i);

        setW205a(w202.equals("6") ? "" : this.w205a);
        setW205b(w202.equals("6") ? "" : this.w205b);
        setW205c(w202.equals("6") ? "" : this.w205c);
        setW205d(w202.equals("6") ? "" : this.w205d);
        setW205e(w202.equals("6") ? "" : this.w205e);
        setW20598(w202.equals("6") ? "" : this.w20598);

        setW206a(w202.equals("6") ? "" : this.w206a);
        setW206b(w202.equals("6") ? "" : this.w206b);
        setW206c(w202.equals("6") ? "" : this.w206c);
        setW206d(w202.equals("6") ? "" : this.w206d);
        setW206e(w202.equals("6") ? "" : this.w206e);
        setW206f(w202.equals("6") ? "" : this.w206f);
        setW206g(w202.equals("6") ? "" : this.w206g);
        setW206h(w202.equals("6") ? "" : this.w206h);
        setW206i(w202.equals("6") ? "" : this.w206i);
        setW206j(w202.equals("6") ? "" : this.w206j);
        setW206k(w202.equals("6") ? "" : this.w206k);
        setW20698(w202.equals("6") ? "" : this.w20698);

        setW207a(w202.equals("6") ? "" : this.w207a);
        setW207b(w202.equals("6") ? "" : this.w207b);
        setW207c(w202.equals("6") ? "" : this.w207c);
        setW207d(w202.equals("6") ? "" : this.w207d);
        setW207e(w202.equals("6") ? "" : this.w207e);
        setW207f(w202.equals("6") ? "" : this.w207f);
        setW207g(w202.equals("6") ? "" : this.w207g);
        setW207h(w202.equals("6") ? "" : this.w207h);
        setW207i(w202.equals("6") ? "" : this.w207i);
        setW207j(w202.equals("6") ? "" : this.w207j);
        setW20798(w202.equals("6") ? "" : this.w20798);

        setW208a(w202.equals("6") ? "" : this.w208a);
        setW208b(w202.equals("6") ? "" : this.w208b);
        setW208c(w202.equals("6") ? "" : this.w208c);
        setW208d(w202.equals("6") ? "" : this.w208d);
        setW208e(w202.equals("6") ? "" : this.w208e);
        setW208f(w202.equals("6") ? "" : this.w208f);
        setW20897(w202.equals("6") ? "" : this.w20897);
        setW20898(w202.equals("6") ? "" : this.w20898);

        setW209a(w202.equals("6") ? "" : this.w209a);
        setW209b(w202.equals("6") ? "" : this.w209b);
        setW209c(w202.equals("6") ? "" : this.w209c);
        setW209d(w202.equals("6") ? "" : this.w209d);
        setW209e(w202.equals("6") ? "" : this.w209e);
        setW209f(w202.equals("6") ? "" : this.w209f);
        setW209g(w202.equals("6") ? "" : this.w209g);
        setW20997(w202.equals("6") ? "" : this.w20997);
        setW20998(w202.equals("6") ? "" : this.w20998);

        setW210(w202.equals("6") ? "" : this.w210);
        notifyPropertyChanged(BR.w202);
    }

    @Bindable
    public String getW203() {
        return w203;
    }

    public void setW203(String w203) {
        this.w203 = w203;
        notifyPropertyChanged(BR.w203);
    }

    @Bindable
    public String getW203a() {
        return w203a;
    }

    public void setW203a(String w203a) {
        if (this.w203a.equals(w203a)) return;
        this.w203a = w203a;
        notifyPropertyChanged(BR.w203a);
    }

    @Bindable
    public String getW203b() {
        return w203b;
    }

    public void setW203b(String w203b) {
        if (this.w203b.equals(w203b)) return;
        this.w203b = w203b;
        notifyPropertyChanged(BR.w203b);
    }

    @Bindable
    public String getW203c() {
        return w203c;
    }

    public void setW203c(String w203c) {
        if (this.w203c.equals(w203c)) return;
        this.w203c = w203c;
        notifyPropertyChanged(BR.w203c);
    }

    @Bindable
    public String getW203d() {
        return w203d;
    }

    public void setW203d(String w203d) {
        if (this.w203d.equals(w203d)) return;
        this.w203d = w203d;
        notifyPropertyChanged(BR.w203d);
    }

    @Bindable
    public String getW203e() {
        return w203e;
    }

    public void setW203e(String w203e) {
        if (this.w203e.equals(w203e)) return;
        this.w203e = w203e;
        notifyPropertyChanged(BR.w203e);
    }

    @Bindable
    public String getW20396() {
        return w20396;
    }

    public void setW20396(String w20396) {
        if (this.w20396.equals(w20396)) return;
        this.w20396 = w20396;
        setW20396x(w20396.equals("96") ? this.w20396x : "");
        notifyPropertyChanged(BR.w20396);
    }

    @Bindable
    public String getW20396x() {
        return w20396x;
    }

    public void setW20396x(String w20396x) {
        this.w20396x = w20396x;
        notifyPropertyChanged(BR.w20396x);
    }

    @Bindable
    public String getW204() {
        return w204;
    }

    public void setW204(String w204) {
        this.w204 = w204;
        notifyPropertyChanged(BR.w204);
    }

    @Bindable
    public String getW204a() {
        return w204a;
    }

    public void setW204a(String w204a) {
        if (this.w204a.equals(w204a)) return;
        this.w204a = w204a;
        notifyPropertyChanged(BR.w204a);
    }

    @Bindable
    public String getW204b() {
        return w204b;
    }

    public void setW204b(String w204b) {
        if (this.w204b.equals(w204b)) return;
        this.w204b = w204b;
        notifyPropertyChanged(BR.w204b);
    }

    @Bindable
    public String getW204c() {
        return w204c;
    }

    public void setW204c(String w204c) {
        if (this.w204c.equals(w204c)) return;
        this.w204c = w204c;
        notifyPropertyChanged(BR.w204c);
    }

    @Bindable
    public String getW204d() {
        return w204d;
    }

    public void setW204d(String w204d) {
        if (this.w204d.equals(w204d)) return;
        this.w204d = w204d;
        notifyPropertyChanged(BR.w204d);
    }

    @Bindable
    public String getW204e() {
        return w204e;
    }

    public void setW204e(String w204e) {
        if (this.w204e.equals(w204e)) return;
        this.w204e = w204e;
        notifyPropertyChanged(BR.w204e);
    }

    @Bindable
    public String getW204f() {
        return w204f;
    }

    public void setW204f(String w204f) {
        if (this.w204f.equals(w204f)) return;
        this.w204f = w204f;
        notifyPropertyChanged(BR.w204f);
    }

    @Bindable
    public String getW204g() {
        return w204g;
    }

    public void setW204g(String w204g) {
        if (this.w204g.equals(w204g)) return;
        this.w204g = w204g;
        notifyPropertyChanged(BR.w204g);
    }

    @Bindable
    public String getW204h() {
        return w204h;
    }

    public void setW204h(String w204h) {
        if (this.w204h.equals(w204h)) return;
        this.w204h = w204h;
        notifyPropertyChanged(BR.w204h);
    }

    @Bindable
    public String getW204i() {
        return w204i;
    }

    public void setW204i(String w204i) {
        if (this.w204i.equals(w204i)) return;
        this.w204i = w204i;
        setW204a(w204i.equals("9") ? "" : this.w204a);
        setW204b(w204i.equals("9") ? "" : this.w204b);
        setW204c(w204i.equals("9") ? "" : this.w204c);
        setW204d(w204i.equals("9") ? "" : this.w204d);
        setW204e(w204i.equals("9") ? "" : this.w204e);
        setW204f(w204i.equals("9") ? "" : this.w204f);
        setW204g(w204i.equals("9") ? "" : this.w204g);
        setW204h(w204i.equals("9") ? "" : this.w204h);
        notifyPropertyChanged(BR.w204i);
    }

    @Bindable
    public String getW205() {
        return w205;
    }

    public void setW205(String w205) {
        this.w205 = w205;
        notifyPropertyChanged(BR.w205);
    }

    @Bindable
    public String getW205a() {
        return w205a;
    }

    public void setW205a(String w205a) {
        if (this.w205a.equals(w205a)) return;
        this.w205a = w205a;
        notifyPropertyChanged(BR.w205a);
    }

    @Bindable
    public String getW205b() {
        return w205b;
    }

    public void setW205b(String w205b) {
        if (this.w205b.equals(w205b)) return;
        this.w205b = w205b;
        notifyPropertyChanged(BR.w205b);
    }

    @Bindable
    public String getW205c() {
        return w205c;
    }

    public void setW205c(String w205c) {
        if (this.w205c.equals(w205c)) return;
        this.w205c = w205c;
        notifyPropertyChanged(BR.w205c);
    }

    @Bindable
    public String getW205d() {
        return w205d;
    }

    public void setW205d(String w205d) {
        if (this.w205d.equals(w205d)) return;
        this.w205d = w205d;
        notifyPropertyChanged(BR.w205d);
    }

    @Bindable
    public String getW205e() {
        return w205e;
    }

    public void setW205e(String w205e) {
        if (this.w205e.equals(w205e)) return;
        this.w205e = w205e;
        setW205a(w205e.equals("5") ? "" : this.w205a);
        setW205b(w205e.equals("5") ? "" : this.w205b);
        setW205c(w205e.equals("5") ? "" : this.w205c);
        setW205d(w205e.equals("5") ? "" : this.w205d);
        setW20598(w205e.equals("5") ? "" : this.w20598);
        notifyPropertyChanged(BR.w205e);
    }

    @Bindable
    public String getW20598() {
        return w20598;
    }

    public void setW20598(String w20598) {
        if (this.w20598.equals(w20598)) return;
        this.w20598 = w20598;
        setW205a(w20598.equals("98") ? "" : this.w205a);
        setW205b(w20598.equals("98") ? "" : this.w205b);
        setW205c(w20598.equals("98") ? "" : this.w205c);
        setW205d(w20598.equals("98") ? "" : this.w205d);
        setW205e(w20598.equals("98") ? "" : this.w205e);
        notifyPropertyChanged(BR.w20598);
    }

    @Bindable
    public String getW206() {
        return w206;
    }

    public void setW206(String w206) {
        this.w206 = w206;
        notifyPropertyChanged(BR.w206);
    }

    @Bindable
    public String getW206a() {
        return w206a;
    }

    public void setW206a(String w206a) {
        if (this.w206a.equals(w206a)) return;
        this.w206a = w206a;
        notifyPropertyChanged(BR.w206a);
    }

    @Bindable
    public String getW206b() {
        return w206b;
    }

    public void setW206b(String w206b) {
        if (this.w206b.equals(w206b)) return;
        this.w206b = w206b;
        notifyPropertyChanged(BR.w206b);
    }

    @Bindable
    public String getW206c() {
        return w206c;
    }

    public void setW206c(String w206c) {
        if (this.w206c.equals(w206c)) return;
        this.w206c = w206c;
        notifyPropertyChanged(BR.w206c);
    }

    @Bindable
    public String getW206d() {
        return w206d;
    }

    public void setW206d(String w206d) {
        if (this.w206d.equals(w206d)) return;
        this.w206d = w206d;
        notifyPropertyChanged(BR.w206d);
    }

    @Bindable
    public String getW206e() {
        return w206e;
    }

    public void setW206e(String w206e) {
        if (this.w206e.equals(w206e)) return;
        this.w206e = w206e;
        notifyPropertyChanged(BR.w206e);
    }

    @Bindable
    public String getW206f() {
        return w206f;
    }

    public void setW206f(String w206f) {
        if (this.w206f.equals(w206f)) return;
        this.w206f = w206f;
        notifyPropertyChanged(BR.w206f);
    }

    @Bindable
    public String getW206g() {
        return w206g;
    }

    public void setW206g(String w206g) {
        if (this.w206g.equals(w206g)) return;
        this.w206g = w206g;
        notifyPropertyChanged(BR.w206g);
    }

    @Bindable
    public String getW206h() {
        return w206h;
    }

    public void setW206h(String w206h) {
        if (this.w206h.equals(w206h)) return;
        this.w206h = w206h;
        notifyPropertyChanged(BR.w206h);
    }

    @Bindable
    public String getW206i() {
        return w206i;
    }

    public void setW206i(String w206i) {
        if (this.w206i.equals(w206i)) return;
        this.w206i = w206i;
        notifyPropertyChanged(BR.w206i);
    }

    @Bindable
    public String getW206j() {
        return w206j;
    }

    public void setW206j(String w206j) {
        if (this.w206j.equals(w206j)) return;
        this.w206j = w206j;
        notifyPropertyChanged(BR.w206j);
    }

    @Bindable
    public String getW206k() {
        return w206k;
    }

    public void setW206k(String w206k) {
        if (this.w206k.equals(w206k)) return;
        this.w206k = w206k;
        setW206a(w206k.equals("11") ? "" : this.w206a);
        setW206b(w206k.equals("11") ? "" : this.w206b);
        setW206c(w206k.equals("11") ? "" : this.w206c);
        setW206d(w206k.equals("11") ? "" : this.w206d);
        setW206e(w206k.equals("11") ? "" : this.w206e);
        setW206f(w206k.equals("11") ? "" : this.w206f);
        setW206g(w206k.equals("11") ? "" : this.w206g);
        setW206h(w206k.equals("11") ? "" : this.w206h);
        setW206i(w206k.equals("11") ? "" : this.w206i);
        setW206j(w206k.equals("11") ? "" : this.w206j);
        setW20698(w206k.equals("11") ? "" : this.w20698);
        notifyPropertyChanged(BR.w206k);
    }

    @Bindable
    public String getW20698() {
        return w20698;
    }

    public void setW20698(String w20698) {
        if (this.w20698.equals(w20698)) return;
        this.w20698 = w20698;
        setW206a(w20698.equals("98") ? "" : this.w206a);
        setW206b(w20698.equals("98") ? "" : this.w206b);
        setW206c(w20698.equals("98") ? "" : this.w206c);
        setW206d(w20698.equals("98") ? "" : this.w206d);
        setW206e(w20698.equals("98") ? "" : this.w206e);
        setW206f(w20698.equals("98") ? "" : this.w206f);
        setW206g(w20698.equals("98") ? "" : this.w206g);
        setW206h(w20698.equals("98") ? "" : this.w206h);
        setW206i(w20698.equals("98") ? "" : this.w206i);
        setW206j(w20698.equals("98") ? "" : this.w206j);
        setW206k(w20698.equals("98") ? "" : this.w206k);
        notifyPropertyChanged(BR.w20698);
    }

    @Bindable
    public String getW207() {
        return w207;
    }

    public void setW207(String w207) {
        this.w207 = w207;
        notifyPropertyChanged(BR.w207);
    }

    @Bindable
    public String getW207a() {
        return w207a;
    }

    public void setW207a(String w207a) {
        if (this.w207a.equals(w207a)) return;
        this.w207a = w207a;
        notifyPropertyChanged(BR.w207a);
    }

    @Bindable
    public String getW207b() {
        return w207b;
    }

    public void setW207b(String w207b) {
        if (this.w207b.equals(w207b)) return;
        this.w207b = w207b;
        notifyPropertyChanged(BR.w207b);
    }

    @Bindable
    public String getW207c() {
        return w207c;
    }

    public void setW207c(String w207c) {
        if (this.w207c.equals(w207c)) return;
        this.w207c = w207c;
        notifyPropertyChanged(BR.w207c);
    }

    @Bindable
    public String getW207d() {
        return w207d;
    }

    public void setW207d(String w207d) {
        if (this.w207d.equals(w207d)) return;
        this.w207d = w207d;
        notifyPropertyChanged(BR.w207d);
    }

    @Bindable
    public String getW207e() {
        return w207e;
    }

    public void setW207e(String w207e) {
        if (this.w207e.equals(w207e)) return;
        this.w207e = w207e;
        notifyPropertyChanged(BR.w207e);
    }

    @Bindable
    public String getW207f() {
        return w207f;
    }

    public void setW207f(String w207f) {
        if (this.w207f.equals(w207f)) return;
        this.w207f = w207f;
        notifyPropertyChanged(BR.w207f);
    }

    @Bindable
    public String getW207g() {
        return w207g;
    }

    public void setW207g(String w207g) {
        if (this.w207g.equals(w207g)) return;
        this.w207g = w207g;
        notifyPropertyChanged(BR.w207g);
    }

    @Bindable
    public String getW207h() {
        return w207h;
    }

    public void setW207h(String w207h) {
        if (this.w207h.equals(w207h)) return;
        this.w207h = w207h;
        notifyPropertyChanged(BR.w207h);
    }

    @Bindable
    public String getW207i() {
        return w207i;
    }

    public void setW207i(String w207i) {
        if (this.w207i.equals(w207i)) return;
        this.w207i = w207i;
        notifyPropertyChanged(BR.w207i);
    }

    @Bindable
    public String getW207j() {
        return w207j;
    }

    public void setW207j(String w207j) {
        if (this.w207j.equals(w207j)) return;
        this.w207j = w207j;
        setW207a(w207j.equals("10") ? "" : this.w207a);
        setW207b(w207j.equals("10") ? "" : this.w207b);
        setW207c(w207j.equals("10") ? "" : this.w207c);
        setW207d(w207j.equals("10") ? "" : this.w207d);
        setW207e(w207j.equals("10") ? "" : this.w207e);
        setW207f(w207j.equals("10") ? "" : this.w207f);
        setW207g(w207j.equals("10") ? "" : this.w207g);
        setW207h(w207j.equals("10") ? "" : this.w207h);
        setW207i(w207j.equals("10") ? "" : this.w207i);
        setW20798(w207j.equals("10") ? "" : this.w20798);
        notifyPropertyChanged(BR.w207j);
    }

    @Bindable
    public String getW20798() {
        return w20798;
    }

    public void setW20798(String w20798) {
        if (this.w20798.equals(w20798)) return;
        this.w20798 = w20798;
        setW207a(w20798.equals("98") ? "" : this.w207a);
        setW207b(w20798.equals("98") ? "" : this.w207b);
        setW207c(w20798.equals("98") ? "" : this.w207c);
        setW207d(w20798.equals("98") ? "" : this.w207d);
        setW207e(w20798.equals("98") ? "" : this.w207e);
        setW207f(w20798.equals("98") ? "" : this.w207f);
        setW207g(w20798.equals("98") ? "" : this.w207g);
        setW207h(w20798.equals("98") ? "" : this.w207h);
        setW207i(w20798.equals("98") ? "" : this.w207i);
        setW207j(w20798.equals("98") ? "" : this.w207j);
        notifyPropertyChanged(BR.w20798);
    }

    @Bindable
    public String getW208() {
        return w208;
    }

    public void setW208(String w208) {
        this.w208 = w208;
        notifyPropertyChanged(BR.w208);
    }

    @Bindable
    public String getW208a() {
        return w208a;
    }

    public void setW208a(String w208a) {
        if (this.w208a.equals(w208a)) return;
        this.w208a = w208a;
        notifyPropertyChanged(BR.w208a);
    }

    @Bindable
    public String getW208b() {
        return w208b;
    }

    public void setW208b(String w208b) {
        if (this.w208b.equals(w208b)) return;
        this.w208b = w208b;
        notifyPropertyChanged(BR.w208b);
    }

    @Bindable
    public String getW208c() {
        return w208c;
    }

    public void setW208c(String w208c) {
        if (this.w208c.equals(w208c)) return;
        this.w208c = w208c;
        notifyPropertyChanged(BR.w208c);
    }

    @Bindable
    public String getW208d() {
        return w208d;
    }

    public void setW208d(String w208d) {
        if (this.w208d.equals(w208d)) return;
        this.w208d = w208d;
        notifyPropertyChanged(BR.w208d);
    }

    @Bindable
    public String getW208e() {
        return w208e;
    }

    public void setW208e(String w208e) {
        if (this.w208e.equals(w208e)) return;
        this.w208e = w208e;
        notifyPropertyChanged(BR.w208e);
    }

    @Bindable
    public String getW208f() {
        return w208f;
    }

    public void setW208f(String w208f) {
        if (this.w208f.equals(w208f)) return;
        this.w208f = w208f;
        setW208a(w208f.equals("6") ? "" : this.w208a);
        setW208b(w208f.equals("6") ? "" : this.w208b);
        setW208c(w208f.equals("6") ? "" : this.w208c);
        setW208d(w208f.equals("6") ? "" : this.w208d);
        setW208e(w208f.equals("6") ? "" : this.w208e);
        setW20897(w208f.equals("6") ? "" : this.w20897);
        setW20898(w20898.equals("6") ? "" : this.w20898);
        notifyPropertyChanged(BR.w208f);
    }

    @Bindable
    public String getW20898() {
        return w20898;
    }

    public void setW20898(String w20898) {
        if (this.w20898.equals(w20898)) return;
        this.w20898 = w20898;
        setW208a(w20898.equals("98") ? "" : this.w208a);
        setW208b(w20898.equals("98") ? "" : this.w208b);
        setW208c(w20898.equals("98") ? "" : this.w208c);
        setW208d(w20898.equals("98") ? "" : this.w208d);
        setW208e(w20898.equals("98") ? "" : this.w208e);
        setW208f(w20898.equals("98") ? "" : this.w208f);
        setW20897(w20898.equals("98") ? "" : this.w20897);
        notifyPropertyChanged(BR.w20898);
    }

    @Bindable
    public String getW20897() {
        return w20897;
    }

    public void setW20897(String w20897) {
        if (this.w20897.equals(w20897)) return;
        this.w20897 = w20897;
        setW208a(w20897.equals("97") ? "" : this.w208a);
        setW208b(w20897.equals("97") ? "" : this.w208b);
        setW208c(w20897.equals("97") ? "" : this.w208c);
        setW208d(w20897.equals("97") ? "" : this.w208d);
        setW208e(w20897.equals("97") ? "" : this.w208e);
        setW208f(w20897.equals("97") ? "" : this.w208f);
        setW20898(w20897.equals("97") ? "" : this.w20898);
        notifyPropertyChanged(BR.w20897);
    }


    @Bindable
    public String getW209a() {
        return w209a;
    }

    public void setW209a(String w209a) {
        if (this.w209a.equals(w209a)) return;
        this.w209a = w209a;
        notifyPropertyChanged(BR.w209a);
    }

    @Bindable
    public String getW209b() {
        return w209b;
    }

    public void setW209b(String w209b) {
        if (this.w209b.equals(w209b)) return;
        this.w209b = w209b;
        notifyPropertyChanged(BR.w209b);
    }

    @Bindable
    public String getW209c() {
        return w209c;
    }

    public void setW209c(String w209c) {
        if (this.w209c.equals(w209c)) return;
        this.w209c = w209c;
        notifyPropertyChanged(BR.w209c);
    }

    @Bindable
    public String getW209d() {
        return w209d;
    }

    public void setW209d(String w209d) {
        if (this.w209d.equals(w209d)) return;
        this.w209d = w209d;
        notifyPropertyChanged(BR.w209d);
    }

    @Bindable
    public String getW209e() {
        return w209e;
    }

    public void setW209e(String w209e) {
        if (this.w209e.equals(w209e)) return;
        this.w209e = w209e;
        notifyPropertyChanged(BR.w209e);
    }

    @Bindable
    public String getW209f() {
        return w209f;
    }

    public void setW209f(String w209f) {
        if (this.w209f.equals(w209f)) return;
        this.w209f = w209f;
        notifyPropertyChanged(BR.w209f);
    }

    @Bindable
    public String getW209g() {
        return w209g;
    }

    public void setW209g(String w209g) {
        if (this.w209g.equals(w209g)) return;
        this.w209g = w209g;
        setW209a(w209g.equals("7") ? "" : this.w209a);
        setW209b(w209g.equals("7") ? "" : this.w209b);
        setW209c(w209g.equals("7") ? "" : this.w209c);
        setW209d(w209g.equals("7") ? "" : this.w209d);
        setW209e(w209g.equals("7") ? "" : this.w209e);
        setW209f(w209g.equals("7") ? "" : this.w209f);
        setW20997(w209g.equals("7") ? "" : this.w20997);
        setW20998(w209g.equals("7") ? "" : this.w20998);
        notifyPropertyChanged(BR.w209g);
    }

    @Bindable
    public String getW20997() {
        return w20997;
    }

    public void setW20997(String w20997) {
        if (this.w20997.equals(w20997)) return;
        this.w20997 = w20997;
        setW209a(w20997.equals("97") ? "" : this.w209a);
        setW209b(w20997.equals("97") ? "" : this.w209b);
        setW209c(w20997.equals("97") ? "" : this.w209c);
        setW209d(w20997.equals("97") ? "" : this.w209d);
        setW209e(w20997.equals("97") ? "" : this.w209e);
        setW209f(w20997.equals("97") ? "" : this.w209f);
        setW209g(w20997.equals("97") ? "" : this.w209g);
        setW20998(w20997.equals("97") ? "" : this.w20998);
        notifyPropertyChanged(BR.w20997);
    }

    @Bindable
    public String getW20998() {
        return w20998;
    }

    public void setW20998(String w20998) {
        if (this.w20998.equals(w20998)) return;
        this.w20998 = w20998;
        setW209a(w20998.equals("98") ? "" : this.w209a);
        setW209b(w20998.equals("98") ? "" : this.w209b);
        setW209c(w20998.equals("98") ? "" : this.w209c);
        setW209d(w20998.equals("98") ? "" : this.w209d);
        setW209e(w20998.equals("98") ? "" : this.w209e);
        setW209f(w20998.equals("98") ? "" : this.w209f);
        setW209g(w20998.equals("98") ? "" : this.w209g);
        setW20997(w20998.equals("98") ? "" : this.w20997);
        notifyPropertyChanged(BR.w20998);
    }

    @Bindable
    public String getW210() {
        return w210;
    }

    public void setW210(String w210) {
        this.w210 = w210;
        notifyPropertyChanged(BR.w210);
    }

    @Bindable
    public String getW301() {
        return w301;
    }

    public void setW301(String w301) {
        this.w301 = w301;
        setW302a(w301.equals("2") ? "" : this.w302a);
        setW302b(w301.equals("2") ? "" : this.w302b);
        setW302c(w301.equals("2") ? "" : this.w302c);
        setW302d(w301.equals("2") ? "" : this.w302d);
        setW302e(w301.equals("2") ? "" : this.w302e);
        setW302f(w301.equals("2") ? "" : this.w302f);
        setW302g(w301.equals("2") ? "" : this.w302g);
        setW30296(w301.equals("2") ? "" : this.w30296);
        notifyPropertyChanged(BR.w301);
    }

    @Bindable
    public String getW302() {
        return w302;
    }

    public void setW302(String w302) {
        this.w302 = w302;
        notifyPropertyChanged(BR.w302);
    }

    @Bindable
    public String getW302a() {
        return w302a;
    }

    public void setW302a(String w302a) {
        if (this.w302a.equals(w302a)) return;
        this.w302a = w302a;
        notifyPropertyChanged(BR.w302a);
    }

    @Bindable
    public String getW302b() {
        return w302b;
    }

    public void setW302b(String w302b) {
        if (this.w302b.equals(w302b)) return;
        this.w302b = w302b;
        notifyPropertyChanged(BR.w302b);
    }

    @Bindable
    public String getW302c() {
        return w302c;
    }

    public void setW302c(String w302c) {
        if (this.w302c.equals(w302c)) return;
        this.w302c = w302c;
        notifyPropertyChanged(BR.w302c);
    }

    @Bindable
    public String getW302d() {
        return w302d;
    }

    public void setW302d(String w302d) {
        if (this.w302d.equals(w302d)) return;
        this.w302d = w302d;
        notifyPropertyChanged(BR.w302d);
    }

    @Bindable
    public String getW302e() {
        return w302e;
    }

    public void setW302e(String w302e) {
        if (this.w302e.equals(w302e)) return;
        this.w302e = w302e;
        notifyPropertyChanged(BR.w302e);
    }

    @Bindable
    public String getW302f() {
        return w302f;
    }

    public void setW302f(String w302f) {
        if (this.w302f.equals(w302f)) return;
        this.w302f = w302f;
        notifyPropertyChanged(BR.w302f);
    }

    @Bindable
    public String getW302g() {
        return w302g;
    }

    public void setW302g(String w302g) {
        if (this.w302g.equals(w302g)) return;
        this.w302g = w302g;
        notifyPropertyChanged(BR.w302g);
    }

    @Bindable
    public String getW30296() {
        return w30296;
    }

    public void setW30296(String w30296) {
        if (this.w30296.equals(w30296)) return;
        this.w30296 = w30296;
        setW30296x(w30296.equals("96") ? this.w30296x : "");
        notifyPropertyChanged(BR.w30296);
    }

    @Bindable
    public String getW30296x() {
        return w30296x;
    }

    public void setW30296x(String w30296x) {
        this.w30296x = w30296x;
        notifyPropertyChanged(BR.w30296x);
    }

    @Bindable
    public String getW303() {
        return w303;
    }

    public void setW303(String w303) {
        this.w303 = w303;
        notifyPropertyChanged(BR.w303);
    }

    @Bindable
    public String getW304() {
        return w304;
    }

    public void setW304(String w304) {
        this.w304 = w304;
        setW305a(w304.equals("2") ? "" : this.w305a);
        setW305b(w304.equals("2") ? "" : this.w305b);
        setW305c(w304.equals("2") ? "" : this.w305c);
        setW305d(w304.equals("2") ? "" : this.w305d);
        setW305e(w304.equals("2") ? "" : this.w305e);
        setW305f(w304.equals("2") ? "" : this.w305f);
        setW305g(w304.equals("2") ? "" : this.w305g);
        setW305h(w304.equals("2") ? "" : this.w305h);
        setW305i(w304.equals("2") ? "" : this.w305i);
        setW305j(w304.equals("2") ? "" : this.w305j);
        setW305k(w304.equals("2") ? "" : this.w305k);
        setW305l(w304.equals("2") ? "" : this.w305l);
        setW305m(w304.equals("2") ? "" : this.w305m);
        setW30596(w304.equals("2") ? "" : this.w30596);
        notifyPropertyChanged(BR.w304);
    }

    @Bindable
    public String getW305() {
        return w305;
    }

    public void setW305(String w305) {
        this.w305 = w305;
        notifyPropertyChanged(BR.w305);
    }

    @Bindable
    public String getW305a() {
        return w305a;
    }

    public void setW305a(String w305a) {
        if (this.w305a.equals(w305a)) return;
        this.w305a = w305a;
        notifyPropertyChanged(BR.w305a);
    }

    @Bindable
    public String getW305b() {
        return w305b;
    }

    public void setW305b(String w305b) {
        if (this.w305b.equals(w305b)) return;
        this.w305b = w305b;
        notifyPropertyChanged(BR.w305b);
    }

    @Bindable
    public String getW305c() {
        return w305c;
    }

    public void setW305c(String w305c) {
        if (this.w305c.equals(w305c)) return;
        this.w305c = w305c;
        notifyPropertyChanged(BR.w305c);
    }

    @Bindable
    public String getW305d() {
        return w305d;
    }

    public void setW305d(String w305d) {
        if (this.w305d.equals(w305d)) return;
        this.w305d = w305d;
        notifyPropertyChanged(BR.w305d);
    }

    @Bindable
    public String getW305e() {
        return w305e;
    }

    public void setW305e(String w305e) {
        if (this.w305e.equals(w305e)) return;
        this.w305e = w305e;
        notifyPropertyChanged(BR.w305e);
    }

    @Bindable
    public String getW305f() {
        return w305f;
    }

    public void setW305f(String w305f) {
        if (this.w305f.equals(w305f)) return;
        this.w305f = w305f;
        notifyPropertyChanged(BR.w305f);
    }

    @Bindable
    public String getW305g() {
        return w305g;
    }

    public void setW305g(String w305g) {
        if (this.w305g.equals(w305g)) return;
        this.w305g = w305g;
        notifyPropertyChanged(BR.w305g);
    }

    @Bindable
    public String getW305h() {
        return w305h;
    }

    public void setW305h(String w305h) {
        if (this.w305h.equals(w305h)) return;
        this.w305h = w305h;
        notifyPropertyChanged(BR.w305h);
    }

    @Bindable
    public String getW305i() {
        return w305i;
    }

    public void setW305i(String w305i) {
        if (this.w305i.equals(w305i)) return;
        this.w305i = w305i;
        notifyPropertyChanged(BR.w305i);
    }

    @Bindable
    public String getW305j() {
        return w305j;
    }

    public void setW305j(String w305j) {
        if (this.w305j.equals(w305j)) return;
        this.w305j = w305j;
        notifyPropertyChanged(BR.w305j);
    }

    @Bindable
    public String getW305k() {
        return w305k;
    }

    public void setW305k(String w305k) {
        if (this.w305k.equals(w305k)) return;
        this.w305k = w305k;
        notifyPropertyChanged(BR.w305k);
    }

    @Bindable
    public String getW305l() {
        return w305l;
    }

    public void setW305l(String w305l) {
        if (this.w305l.equals(w305l)) return;
        this.w305l = w305l;
        notifyPropertyChanged(BR.w305l);
    }

    @Bindable
    public String getW305m() {
        return w305m;
    }

    public void setW305m(String w305m) {
        if (this.w305m.equals(w305m)) return;
        this.w305m = w305m;
        notifyPropertyChanged(BR.w305m);
    }

    @Bindable
    public String getW30596() {
        return w30596;
    }

    public void setW30596(String w30596) {
        if (this.w30596.equals(w30596)) return;
        this.w30596 = w30596;
        setW30596x(w30596.equals("96") ? this.w30596x : "");
        notifyPropertyChanged(BR.w30596);
    }

    @Bindable
    public String getW30596x() {
        return w30596x;
    }

    public void setW30596x(String w30596x) {
        this.w30596x = w30596x;
        notifyPropertyChanged(BR.w30596x);
    }

    @Bindable
    public String getW306() {
        return w306;
    }

    public void setW306(String w306) {
        this.w306 = w306;

        // if No: 7-8-9-10 are null
        setW307(w306.equals("2") ? "" : this.w307);
        setW308(w306.equals("2") ? "" : this.w308);
        setW309(w306.equals("2") ? "" : this.w309);
        setW310a(w306.equals("2") ? "" : this.w310a);
        setW310b(w306.equals("2") ? "" : this.w310b);
        setW310c(w306.equals("2") ? "" : this.w310c);
        setW310d(w306.equals("2") ? "" : this.w310d);
        setW310e(w306.equals("2") ? "" : this.w310e);
        setW31096(w306.equals("2") ? "" : this.w31096);

        // if Yes: 11-12-13 are null
        setW311a(w306.equals("1") ? "" : this.w311a);
        setW311b(w306.equals("1") ? "" : this.w311b);
        setW311c(w306.equals("1") ? "" : this.w311c);
        setW311d(w306.equals("1") ? "" : this.w311d);
        setW311e(w306.equals("1") ? "" : this.w311e);
        setW311f(w306.equals("1") ? "" : this.w311f);
        setW311g(w306.equals("1") ? "" : this.w311g);
        setW311h(w306.equals("1") ? "" : this.w311h);
        setW31196(w306.equals("1") ? "" : this.w31196);
        setW312(w306.equals("1") ? "" : this.w312);
        setW313(w306.equals("1") ? "" : this.w313);
        notifyPropertyChanged(BR.w306);
    }

    @Bindable
    public String getW307() {
        return w307;
    }

    public void setW307(String w307) {
        this.w307 = w307;
        setW30796x(w307.equals("96") ? this.w30796x : "");
        setW308(w307.equals("12") || w307.equals("13") ? "10" : this.w308);
        notifyPropertyChanged(BR.w307);
    }

    @Bindable
    public String getW30796x() {
        return w30796x;
    }

    public void setW30796x(String w30796x) {
        this.w30796x = w30796x;
        notifyPropertyChanged(BR.w30796x);
    }

    @Bindable
    public String getW308() {
        return w308;
    }

    public void setW308(String w308) {
        this.w308 = w308;
        notifyPropertyChanged(BR.w308);
    }

    @Bindable
    public String getW309() {
        return w309;
    }

    public void setW309(String w309) {
        this.w309 = w309;
        setW310a(w309.equals("1") ? "" : this.w310a);
        setW310b(w309.equals("1") ? "" : this.w310b);
        setW310c(w309.equals("1") ? "" : this.w310c);
        setW310d(w309.equals("1") ? "" : this.w310d);
        setW310e(w309.equals("1") ? "" : this.w310e);
        setW31096(w309.equals("1") ? "" : this.w31096);
      /*  setW311a(!w309.equals("2") ? "" : this.w311a);
        setW311b(!w309.equals("2") ? "" : this.w311b);
        setW311c(!w309.equals("2") ? "" : this.w311c);
        setW311d(!w309.equals("2") ? "" : this.w311d);
        setW311e(!w309.equals("2") ? "" : this.w311e);
        setW311f(!w309.equals("2") ? "" : this.w311f);
        setW311g(!w309.equals("2") ? "" : this.w311g);
        setW311h(!w309.equals("2") ? "" : this.w311h);
        setW31196(!w309.equals("2") ? "" : this.w31196);
        setW312(!w309.equals("2") ? "" : this.w312);
        setW313(!w309.equals("2") ? "" : this.w313);*/
        notifyPropertyChanged(BR.w309);
    }

    @Bindable
    public String getW310() {
        return w310;
    }

    public void setW310(String w310) {
        this.w310 = w310;
        notifyPropertyChanged(BR.w310);
    }

    @Bindable
    public String getW310a() {
        return w310a;
    }

    public void setW310a(String w310a) {
        if (this.w310a.equals(w310a)) return;
        this.w310a = w310a;
        notifyPropertyChanged(BR.w310a);
    }

    @Bindable
    public String getW310b() {
        return w310b;
    }

    public void setW310b(String w310b) {
        if (this.w310b.equals(w310b)) return;
        this.w310b = w310b;
        notifyPropertyChanged(BR.w310b);
    }

    @Bindable
    public String getW310c() {
        return w310c;
    }

    public void setW310c(String w310c) {
        if (this.w310c.equals(w310c)) return;
        this.w310c = w310c;
        notifyPropertyChanged(BR.w310c);
    }

    @Bindable
    public String getW310d() {
        return w310d;
    }

    public void setW310d(String w310d) {
        if (this.w310d.equals(w310d)) return;
        this.w310d = w310d;
        notifyPropertyChanged(BR.w310d);
    }

    @Bindable
    public String getW310e() {
        return w310e;
    }

    public void setW310e(String w310e) {
        if (this.w310e.equals(w310e)) return;
        this.w310e = w310e;
        notifyPropertyChanged(BR.w310e);
    }

    @Bindable
    public String getW31096() {
        return w31096;
    }

    public void setW31096(String w31096) {
        if (this.w31096.equals(w31096)) return;
        this.w31096 = w31096;
        setW31096x(w31096.equals("96") ? this.w31096x : "");
        notifyPropertyChanged(BR.w31096);
    }

    @Bindable
    public String getW31096x() {
        return w31096x;
    }

    public void setW31096x(String w31096x) {
        this.w31096x = w31096x;
        notifyPropertyChanged(BR.w31096x);
    }

    @Bindable
    public String getW311() {
        return w311;
    }

    public void setW311(String w311) {
        this.w311 = w311;
        notifyPropertyChanged(BR.w311);
    }

    @Bindable
    public String getW311a() {
        return w311a;
    }

    public void setW311a(String w311a) {
        if (this.w311a.equals(w311a)) return;
        this.w311a = w311a;
        notifyPropertyChanged(BR.w311a);
    }

    @Bindable
    public String getW311b() {
        return w311b;
    }

    public void setW311b(String w311b) {
        if (this.w311b.equals(w311b)) return;
        this.w311b = w311b;
        notifyPropertyChanged(BR.w311b);
    }

    @Bindable
    public String getW311c() {
        return w311c;
    }

    public void setW311c(String w311c) {
        if (this.w311c.equals(w311c)) return;
        this.w311c = w311c;
        notifyPropertyChanged(BR.w311c);
    }

    @Bindable
    public String getW311d() {
        return w311d;
    }

    public void setW311d(String w311d) {
        if (this.w311d.equals(w311d)) return;
        this.w311d = w311d;
        notifyPropertyChanged(BR.w311d);
    }

    @Bindable
    public String getW311e() {
        return w311e;
    }

    public void setW311e(String w311e) {
        if (this.w311e.equals(w311e)) return;
        this.w311e = w311e;
        notifyPropertyChanged(BR.w311e);
    }

    @Bindable
    public String getW311f() {
        return w311f;
    }

    public void setW311f(String w311f) {
        if (this.w311f.equals(w311f)) return;
        this.w311f = w311f;
        notifyPropertyChanged(BR.w311f);
    }

    @Bindable
    public String getW311g() {
        return w311g;
    }

    public void setW311g(String w311g) {
        if (this.w311g.equals(w311g)) return;
        this.w311g = w311g;
        notifyPropertyChanged(BR.w311g);
    }

    @Bindable
    public String getW311h() {
        return w311h;
    }

    public void setW311h(String w311h) {
        if (this.w311h.equals(w311h)) return;
        this.w311h = w311h;
        notifyPropertyChanged(BR.w311h);
    }

    @Bindable
    public String getW31196() {
        return w31196;
    }

    public void setW31196(String w31196) {
        if (this.w31196.equals(w31196)) return;
        this.w31196 = w31196;
        setW31196x(w31196.equals("96") ? this.w31196x : "");
        notifyPropertyChanged(BR.w31196);
    }

    @Bindable
    public String getW31196x() {
        return w31196x;
    }

    public void setW31196x(String w31196x) {
        this.w31196x = w31196x;
        notifyPropertyChanged(BR.w31196x);
    }

    @Bindable
    public String getW312() {
        return w312;
    }

    public void setW312(String w312) {
        this.w312 = w312;
        setW313(w312.equals("2") ? "" : this.w31396x);
        notifyPropertyChanged(BR.w312);
    }

    @Bindable
    public String getW313() {
        return w313;
    }

    public void setW313(String w313) {
        this.w313 = w313;
        setW31396x(w313.equals("96") ? this.w31396x : "");
        notifyPropertyChanged(BR.w313);
    }

    @Bindable
    public String getW31396x() {
        return w31396x;
    }

    public void setW31396x(String w31396x) {
        this.w31396x = w31396x;
        notifyPropertyChanged(BR.w31396x);
    }

    @Bindable
    public String getW401() {
        return w401;
    }

    public void setW401(String w401) {
        this.w401 = w401;
        setW402(w401.equals("2") ? "" : this.w402);
        setW403a(w401.equals("1") ? "" : this.w403a);
        setW403b(w401.equals("1") ? "" : this.w403b);
        setW403c(w401.equals("1") ? "" : this.w403c);
        setW403d(w401.equals("1") ? "" : this.w403d);
        setW403e(w401.equals("1") ? "" : this.w403e);
        setW403f(w401.equals("1") ? "" : this.w403f);
        setW403g(w401.equals("1") ? "" : this.w403g);
        setW403h(w401.equals("1") ? "" : this.w403h);
        setW403i(w401.equals("1") ? "" : this.w403i);
        setW403j(w401.equals("1") ? "" : this.w403j);
        setW40396(w401.equals("1") ? "" : this.w40396);
        setW404(w401.equals("2") ? "" : this.w404);
        setW405a(w401.equals("2") ? "" : this.w405a);
        setW405b(w401.equals("2") ? "" : this.w405b);
        setW405c(w401.equals("2") ? "" : this.w405c);
        setW405d(w401.equals("2") ? "" : this.w405d);
        setW405e(w401.equals("2") ? "" : this.w405e);
        setW405f(w401.equals("2") ? "" : this.w405f);
        setW405g(w401.equals("2") ? "" : this.w405g);
        setW405h(w401.equals("2") ? "" : this.w405h);
        setW405i(w401.equals("2") ? "" : this.w405i);
        setW405j(w401.equals("2") ? "" : this.w405j);
        setW405k(w401.equals("2") ? "" : this.w405k);
        setW405l(w401.equals("2") ? "" : this.w405l);
        setW405m(w401.equals("2") ? "" : this.w405m);
        setW405n(w401.equals("2") ? "" : this.w405n);
        notifyPropertyChanged(BR.w401);
    }

    @Bindable
    public String getW402() {
        return w402;
    }

    public void setW402(String w402) {
        this.w402 = w402;
        notifyPropertyChanged(BR.w402);
    }

    @Bindable
    public String getW403() {
        return w403;
    }

    public void setW403(String w403) {
        this.w403 = w403;
        notifyPropertyChanged(BR.w403);
    }

    @Bindable
    public String getW403a() {
        return w403a;
    }

    public void setW403a(String w403a) {
        if (this.w403a.equals(w403a)) return;
        this.w403a = w403a;
        notifyPropertyChanged(BR.w403a);
    }

    @Bindable
    public String getW403b() {
        return w403b;
    }

    public void setW403b(String w403b) {
        if (this.w403b.equals(w403b)) return;
        this.w403b = w403b;
        notifyPropertyChanged(BR.w403b);
    }

    @Bindable
    public String getW403c() {
        return w403c;
    }

    public void setW403c(String w403c) {
        if (this.w403c.equals(w403c)) return;
        this.w403c = w403c;
        notifyPropertyChanged(BR.w403c);
    }

    @Bindable
    public String getW403d() {
        return w403d;
    }

    public void setW403d(String w403d) {
        if (this.w403d.equals(w403d)) return;
        this.w403d = w403d;
        notifyPropertyChanged(BR.w403d);
    }

    @Bindable
    public String getW403e() {
        return w403e;
    }

    public void setW403e(String w403e) {
        if (this.w403e.equals(w403e)) return;
        this.w403e = w403e;
        notifyPropertyChanged(BR.w403e);
    }

    @Bindable
    public String getW403f() {
        return w403f;
    }

    public void setW403f(String w403f) {
        if (this.w403f.equals(w403f)) return;
        this.w403f = w403f;
        notifyPropertyChanged(BR.w403f);
    }

    @Bindable
    public String getW403g() {
        return w403g;
    }

    public void setW403g(String w403g) {
        if (this.w403g.equals(w403g)) return;
        this.w403g = w403g;
        notifyPropertyChanged(BR.w403g);
    }

    @Bindable
    public String getW403h() {
        return w403h;
    }

    public void setW403h(String w403h) {
        if (this.w403h.equals(w403h)) return;
        this.w403h = w403h;
        notifyPropertyChanged(BR.w403h);
    }

    @Bindable
    public String getW403i() {
        return w403i;
    }

    public void setW403i(String w403i) {
        if (this.w403i.equals(w403i)) return;
        this.w403i = w403i;
        notifyPropertyChanged(BR.w403i);
    }

    @Bindable
    public String getW403j() {
        return w403j;
    }

    public void setW403j(String w403j) {
        if (this.w403j.equals(w403j)) return;
        this.w403j = w403j;
        notifyPropertyChanged(BR.w403j);
    }

    @Bindable
    public String getW40396() {
        return w40396;
    }

    public void setW40396(String w40396) {
        if (this.w40396.equals(w40396)) return;
        this.w40396 = w40396;
        setW40396x(w40396.equals("96") ? this.w40396x : "");
        notifyPropertyChanged(BR.w40396);
    }

    @Bindable
    public String getW40396x() {
        return w40396x;
    }

    public void setW40396x(String w40396x) {
        this.w40396x = w40396x;
        notifyPropertyChanged(BR.w40396x);
    }

    @Bindable
    public String getW404() {
        return w404;
    }

    public void setW404(String w404) {
        this.w404 = w404;
        notifyPropertyChanged(BR.w404);
    }

    @Bindable
    public String getW405() {
        return w405;
    }

    public void setW405(String w405) {
        this.w405 = w405;
        notifyPropertyChanged(BR.w405);
    }

    @Bindable
    public String getW405a() {
        return w405a;
    }

    public void setW405a(String w405a) {
        if (this.w405a.equals(w405a)) return;
        this.w405a = w405a;
        setW406a(w405a.equals("1") ? this.w406a : "");
        setW406b(w405a.equals("1") ? this.w406b : "");
        setW406c(w405a.equals("1") ? this.w406c : "");
        setW406d(w405a.equals("1") ? this.w406d : "");
        setW406e(w405a.equals("1") ? this.w406e : "");
        notifyPropertyChanged(BR.w405a);
    }

    @Bindable
    public String getW405b() {
        return w405b;
    }

    public void setW405b(String w405b) {
        if (this.w405b.equals(w405b)) return;
        this.w405b = w405b;
        setW407a(w405b.equals("2") ? this.w407a : "");
        setW407b(w405b.equals("2") ? this.w407b : "");
        setW407c(w405b.equals("2") ? this.w407c : "");
        setW407d(w405b.equals("2") ? this.w407d : "");
        setW407e(w405b.equals("2") ? this.w407e : "");
        setW407f(w405b.equals("2") ? this.w407f : "");
        setW407g(w405b.equals("2") ? this.w407g : "");
        setW407h(w405b.equals("2") ? this.w407h : "");
        setW407i(w405b.equals("2") ? this.w407i : "");
        notifyPropertyChanged(BR.w405b);
    }

    @Bindable
    public String getW405c() {
        return w405c;
    }

    public void setW405c(String w405c) {
        if (this.w405c.equals(w405c)) return;
        this.w405c = w405c;
        setW408a(w405c.equals("3") ? this.w408a : "");
        setW408b(w405c.equals("3") ? this.w408b : "");
        setW408c(w405c.equals("3") ? this.w408c : "");
        setW408d(w405c.equals("3") ? this.w408d : "");
        notifyPropertyChanged(BR.w405c);
    }

    @Bindable
    public String getW405d() {
        return w405d;
    }

    public void setW405d(String w405d) {
        if (this.w405d.equals(w405d)) return;
        this.w405d = w405d;
        setW409a(w405d.equals("4") ? this.w409a : "");
        setW409b(w405d.equals("4") ? this.w409b : "");
        setW409c(w405d.equals("4") ? this.w409c : "");
        setW409d(w405d.equals("4") ? this.w409d : "");
        setW409e(w405d.equals("4") ? this.w409e : "");
        setW409f(w405d.equals("4") ? this.w409f : "");
        setW409g(w405d.equals("4") ? this.w409g : "");
        setW409h(w405d.equals("4") ? this.w409h : "");
        setW409i(w405d.equals("4") ? this.w409i : "");
        setW409j(w405d.equals("4") ? this.w409j : "");
        notifyPropertyChanged(BR.w405d);
    }

    @Bindable
    public String getW405e() {
        return w405e;
    }

    public void setW405e(String w405e) {
        if (this.w405e.equals(w405e)) return;
        this.w405e = w405e;
        setW410a(w405e.equals("5") ? this.w410a : "");
        setW410b(w405e.equals("5") ? this.w410b : "");
        setW410c(w405e.equals("5") ? this.w410c : "");
        setW410d(w405e.equals("5") ? this.w410d : "");
        setW410e(w405e.equals("5") ? this.w410e : "");
        setW410f(w405e.equals("5") ? this.w410f : "");
        setW410g(w405e.equals("5") ? this.w410g : "");
        setW410h(w405e.equals("5") ? this.w410h : "");
        setW410i(w405e.equals("5") ? this.w410i : "");
        setW410j(w405e.equals("5") ? this.w410j : "");
        setW410k(w405e.equals("5") ? this.w410k : "");
        setW410l(w405e.equals("5") ? this.w410l : "");
        notifyPropertyChanged(BR.w405e);
    }

    @Bindable
    public String getW405f() {
        return w405f;
    }

    public void setW405f(String w405f) {
        if (this.w405f.equals(w405f)) return;
        this.w405f = w405f;
        setW411a(w405f.equals("6") ? this.w411a : "");
        setW411b(w405f.equals("6") ? this.w411b : "");
        setW411c(w405f.equals("6") ? this.w411c : "");
        setW411d(w405f.equals("6") ? this.w411d : "");
        setW411e(w405f.equals("6") ? this.w411e : "");
        setW411f(w405f.equals("6") ? this.w411f : "");
        setW411g(w405f.equals("6") ? this.w411g : "");
        setW411h(w405f.equals("6") ? this.w411h : "");
        setW411i(w405f.equals("6") ? this.w411i : "");
        notifyPropertyChanged(BR.w405f);
    }

    @Bindable
    public String getW405g() {
        return w405g;
    }

    public void setW405g(String w405g) {
        if (this.w405g.equals(w405g)) return;
        this.w405g = w405g;
        setW412a(w405g.equals("7") ? this.w412a : "");
        setW412b(w405g.equals("7") ? this.w412b : "");
        setW412c(w405g.equals("7") ? this.w412c : "");
        setW412d(w405g.equals("7") ? this.w412d : "");
        setW412e(w405g.equals("7") ? this.w412e : "");
        setW412f(w405g.equals("7") ? this.w412f : "");
        setW412g(w405g.equals("7") ? this.w412g : "");
        setW412h(w405g.equals("7") ? this.w412h : "");
        setW412i(w405g.equals("7") ? this.w412i : "");
        setW412j(w405g.equals("7") ? this.w412j : "");
        notifyPropertyChanged(BR.w405g);
    }

    @Bindable
    public String getW405h() {
        return w405h;
    }

    public void setW405h(String w405h) {
        if (this.w405h.equals(w405h)) return;
        this.w405h = w405h;
        setW413a(w405h.equals("8") ? this.w413a : "");
        setW413b(w405h.equals("8") ? this.w413b : "");
        setW413c(w405h.equals("8") ? this.w413c : "");
        setW413d(w405h.equals("8") ? this.w413d : "");
        setW413e(w405h.equals("8") ? this.w413e : "");
        setW413f(w405h.equals("8") ? this.w413f : "");
        setW413g(w405h.equals("8") ? this.w413g : "");
        notifyPropertyChanged(BR.w405h);
    }

    @Bindable
    public String getW405i() {
        return w405i;
    }

    public void setW405i(String w405i) {
        if (this.w405i.equals(w405i)) return;
        this.w405i = w405i;
        setW414a(w405i.equals("9") ? this.w414a : "");
        setW414b(w405i.equals("9") ? this.w414b : "");
        setW414c(w405i.equals("9") ? this.w414c : "");
        setW414d(w405i.equals("9") ? this.w414d : "");
        setW414e(w405i.equals("9") ? this.w414e : "");
        setW414f(w405i.equals("9") ? this.w414f : "");
        setW414g(w405i.equals("9") ? this.w414g : "");
        setW414h(w405i.equals("9") ? this.w414h : "");
        setW414i(w405i.equals("9") ? this.w414i : "");
        notifyPropertyChanged(BR.w405i);
    }

    @Bindable
    public String getW405j() {
        return w405j;
    }

    public void setW405j(String w405j) {
        if (this.w405j.equals(w405j)) return;
        this.w405j = w405j;
        setW415a(w405j.equals("10") ? this.w415a : "");
        setW415b(w405j.equals("10") ? this.w415b : "");
        setW415c(w405j.equals("10") ? this.w415c : "");
        setW415d(w405j.equals("10") ? this.w415d : "");
        setW415e(w405j.equals("10") ? this.w415e : "");
        notifyPropertyChanged(BR.w405j);
    }

    @Bindable
    public String getW405k() {
        return w405k;
    }

    public void setW405k(String w405k) {
        if (this.w405k.equals(w405k)) return;
        this.w405k = w405k;
        setW421a(w405k.equals("11") ? this.w421a : "");
        setW421b(w405k.equals("11") ? this.w421b : "");
        setW421c(w405k.equals("11") ? this.w421c : "");
        setW421d(w405k.equals("11") ? this.w421d : "");
        setW421e(w405k.equals("11") ? this.w421e : "");
        setW421f(w405k.equals("11") ? this.w421f : "");
        setW421g(w405k.equals("11") ? this.w421g : "");
        setW421h(w405k.equals("11") ? this.w421h : "");
        notifyPropertyChanged(BR.w405k);
    }

    @Bindable
    public String getW405l() {
        return w405l;
    }

    public void setW405l(String w405l) {
        if (this.w405l.equals(w405l)) return;
        this.w405l = w405l;
        setW416a(w405l.equals("12") ? this.w416a : "");
        setW416b(w405l.equals("12") ? this.w416b : "");
        setW416c(w405l.equals("12") ? this.w416c : "");
        setW416d(w405l.equals("12") ? this.w416d : "");
        setW416e(w405l.equals("12") ? this.w416e : "");
        setW416f(w405l.equals("12") ? this.w416f : "");
        notifyPropertyChanged(BR.w405l);
    }

    @Bindable
    public String getW405m() {
        return w405m;
    }

    public void setW405m(String w405m) {
        if (this.w405m.equals(w405m)) return;
        this.w405m = w405m;
        setW417a(w405m.equals("13") ? this.w417a : "");
        setW417b(w405m.equals("13") ? this.w417b : "");
        setW417c(w405m.equals("13") ? this.w417c : "");
        setW417d(w405m.equals("13") ? this.w417d : "");
        setW417e(w405m.equals("13") ? this.w417e : "");
        setW417f(w405m.equals("13") ? this.w417f : "");
        setW417g(w405m.equals("13") ? this.w417g : "");
        notifyPropertyChanged(BR.w405m);
    }

    @Bindable
    public String getW405n() {
        return w405n;
    }

    public void setW405n(String w405n) {
        if (this.w405n.equals(w405n)) return;
        this.w405n = w405n;
        setW418a(w405n.equals("14") ? this.w418a : "");
        setW418b(w405n.equals("14") ? this.w418b : "");
        setW418c(w405n.equals("14") ? this.w418c : "");
        setW418d(w405n.equals("14") ? this.w418d : "");
        setW418e(w405n.equals("14") ? this.w418e : "");
        setW418f(w405n.equals("14") ? this.w418f : "");
        setW418g(w405n.equals("14") ? this.w418g : "");
        setW418h(w405n.equals("14") ? this.w418h : "");
        setW418i(w405n.equals("14") ? this.w418i : "");
        setW418j(w405n.equals("14") ? this.w418j : "");
        notifyPropertyChanged(BR.w405n);
    }

    @Bindable
    public String getW406a() {
        return w406a;
    }

    public void setW406a(String w406a) {
        this.w406a = w406a;
        notifyPropertyChanged(BR.w406a);
    }

    @Bindable
    public String getW406b() {
        return w406b;
    }

    public void setW406b(String w406b) {
        this.w406b = w406b;
        notifyPropertyChanged(BR.w406b);
    }

    @Bindable
    public String getW406c() {
        return w406c;
    }

    public void setW406c(String w406c) {
        this.w406c = w406c;
        notifyPropertyChanged(BR.w406c);
    }

    @Bindable
    public String getW406d() {
        return w406d;
    }

    public void setW406d(String w406d) {
        this.w406d = w406d;
        notifyPropertyChanged(BR.w406d);
    }

    @Bindable
    public String getW406e() {
        return w406e;
    }

    public void setW406e(String w406e) {
        this.w406e = w406e;
        notifyPropertyChanged(BR.w406e);
    }

    @Bindable
    public String getW407a() {
        return w407a;
    }

    public void setW407a(String w407a) {
        this.w407a = w407a;
        notifyPropertyChanged(BR.w407a);
    }

    @Bindable
    public String getW407b() {
        return w407b;
    }

    public void setW407b(String w407b) {
        this.w407b = w407b;
        notifyPropertyChanged(BR.w407b);
    }

    @Bindable
    public String getW407c() {
        return w407c;
    }

    public void setW407c(String w407c) {
        this.w407c = w407c;
        notifyPropertyChanged(BR.w407c);
    }

    @Bindable
    public String getW407d() {
        return w407d;
    }

    public void setW407d(String w407d) {
        this.w407d = w407d;
        notifyPropertyChanged(BR.w407d);
    }

    @Bindable
    public String getW407e() {
        return w407e;
    }

    public void setW407e(String w407e) {
        this.w407e = w407e;
        notifyPropertyChanged(BR.w407e);
    }

    @Bindable
    public String getW407f() {
        return w407f;
    }

    public void setW407f(String w407f) {
        this.w407f = w407f;
        notifyPropertyChanged(BR.w407f);
    }

    @Bindable
    public String getW407g() {
        return w407g;
    }

    public void setW407g(String w407g) {
        this.w407g = w407g;
        notifyPropertyChanged(BR.w407g);
    }

    @Bindable
    public String getW407h() {
        return w407h;
    }

    public void setW407h(String w407h) {
        this.w407h = w407h;
        notifyPropertyChanged(BR.w407h);
    }

    @Bindable
    public String getW407i() {
        return w407i;
    }

    public void setW407i(String w407i) {
        this.w407i = w407i;
        notifyPropertyChanged(BR.w407i);
    }

    @Bindable
    public String getW408a() {
        return w408a;
    }

    public void setW408a(String w408a) {
        this.w408a = w408a;
        notifyPropertyChanged(BR.w408a);
    }

    @Bindable
    public String getW408b() {
        return w408b;
    }

    public void setW408b(String w408b) {
        this.w408b = w408b;
        notifyPropertyChanged(BR.w408b);
    }

    @Bindable
    public String getW408c() {
        return w408c;
    }

    public void setW408c(String w408c) {
        this.w408c = w408c;
        notifyPropertyChanged(BR.w408c);
    }

    @Bindable
    public String getW408d() {
        return w408d;
    }

    public void setW408d(String w408d) {
        this.w408d = w408d;
        notifyPropertyChanged(BR.w408d);
    }

    @Bindable
    public String getW409a() {
        return w409a;
    }

    public void setW409a(String w409a) {
        this.w409a = w409a;
        notifyPropertyChanged(BR.w409a);
    }

    @Bindable
    public String getW409b() {
        return w409b;
    }

    public void setW409b(String w409b) {
        this.w409b = w409b;
        notifyPropertyChanged(BR.w409b);
    }

    @Bindable
    public String getW409c() {
        return w409c;
    }

    public void setW409c(String w409c) {
        this.w409c = w409c;
        notifyPropertyChanged(BR.w409c);
    }

    @Bindable
    public String getW409d() {
        return w409d;
    }

    public void setW409d(String w409d) {
        this.w409d = w409d;
        notifyPropertyChanged(BR.w409d);
    }

    @Bindable
    public String getW409e() {
        return w409e;
    }

    public void setW409e(String w409e) {
        this.w409e = w409e;
        notifyPropertyChanged(BR.w409e);
    }

    @Bindable
    public String getW409f() {
        return w409f;
    }

    public void setW409f(String w409f) {
        this.w409f = w409f;
        notifyPropertyChanged(BR.w409f);
    }

    @Bindable
    public String getW409g() {
        return w409g;
    }

    public void setW409g(String w409g) {
        this.w409g = w409g;
        notifyPropertyChanged(BR.w409g);
    }

    @Bindable
    public String getW409h() {
        return w409h;
    }

    public void setW409h(String w409h) {
        this.w409h = w409h;
        notifyPropertyChanged(BR.w409h);
    }

    @Bindable
    public String getW409i() {
        return w409i;
    }

    public void setW409i(String w409i) {
        this.w409i = w409i;
        notifyPropertyChanged(BR.w409i);
    }

    @Bindable
    public String getW409j() {
        return w409j;
    }

    public void setW409j(String w409j) {
        this.w409j = w409j;
        notifyPropertyChanged(BR.w409j);
    }

    @Bindable
    public String getW410a() {
        return w410a;
    }

    public void setW410a(String w410a) {
        this.w410a = w410a;
        notifyPropertyChanged(BR.w410a);
    }

    @Bindable
    public String getW410b() {
        return w410b;
    }

    public void setW410b(String w410b) {
        this.w410b = w410b;
        notifyPropertyChanged(BR.w410b);
    }

    @Bindable
    public String getW410c() {
        return w410c;
    }

    public void setW410c(String w410c) {
        this.w410c = w410c;
        notifyPropertyChanged(BR.w410c);
    }

    @Bindable
    public String getW410d() {
        return w410d;
    }

    public void setW410d(String w410d) {
        this.w410d = w410d;
        notifyPropertyChanged(BR.w410d);
    }

    @Bindable
    public String getW410e() {
        return w410e;
    }

    public void setW410e(String w410e) {
        this.w410e = w410e;
        notifyPropertyChanged(BR.w410e);
    }

    @Bindable
    public String getW410f() {
        return w410f;
    }

    public void setW410f(String w410f) {
        this.w410f = w410f;
        notifyPropertyChanged(BR.w410f);
    }

    @Bindable
    public String getW410g() {
        return w410g;
    }

    public void setW410g(String w410g) {
        this.w410g = w410g;
        notifyPropertyChanged(BR.w410g);
    }

    @Bindable
    public String getW410h() {
        return w410h;
    }

    public void setW410h(String w410h) {
        this.w410h = w410h;
        notifyPropertyChanged(BR.w410h);
    }

    @Bindable
    public String getW410i() {
        return w410i;
    }

    public void setW410i(String w410i) {
        this.w410i = w410i;
        notifyPropertyChanged(BR.w410i);
    }

    @Bindable
    public String getW410j() {
        return w410j;
    }

    public void setW410j(String w410j) {
        this.w410j = w410j;
        notifyPropertyChanged(BR.w410j);
    }

    @Bindable
    public String getW410k() {
        return w410k;
    }

    public void setW410k(String w410k) {
        this.w410k = w410k;
        notifyPropertyChanged(BR.w410k);
    }

    @Bindable
    public String getW410l() {
        return w410l;
    }

    public void setW410l(String w410l) {
        this.w410l = w410l;
        notifyPropertyChanged(BR.w410l);
    }

    @Bindable
    public String getW411a() {
        return w411a;
    }

    public void setW411a(String w411a) {
        this.w411a = w411a;
        notifyPropertyChanged(BR.w411a);
    }

    @Bindable
    public String getW411b() {
        return w411b;
    }

    public void setW411b(String w411b) {
        this.w411b = w411b;
        notifyPropertyChanged(BR.w411b);
    }

    @Bindable
    public String getW411c() {
        return w411c;
    }

    public void setW411c(String w411c) {
        this.w411c = w411c;
        notifyPropertyChanged(BR.w411c);
    }

    @Bindable
    public String getW411d() {
        return w411d;
    }

    public void setW411d(String w411d) {
        this.w411d = w411d;
        notifyPropertyChanged(BR.w411d);
    }

    @Bindable
    public String getW411e() {
        return w411e;
    }

    public void setW411e(String w411e) {
        this.w411e = w411e;
        notifyPropertyChanged(BR.w411e);
    }

    @Bindable
    public String getW411f() {
        return w411f;
    }

    public void setW411f(String w411f) {
        this.w411f = w411f;
        notifyPropertyChanged(BR.w411f);
    }

    @Bindable
    public String getW411g() {
        return w411g;
    }

    public void setW411g(String w411g) {
        this.w411g = w411g;
        notifyPropertyChanged(BR.w411g);
    }

    @Bindable
    public String getW411h() {
        return w411h;
    }

    public void setW411h(String w411h) {
        this.w411h = w411h;
        notifyPropertyChanged(BR.w411h);
    }

    @Bindable
    public String getW411i() {
        return w411i;
    }

    public void setW411i(String w411i) {
        this.w411i = w411i;
        notifyPropertyChanged(BR.w411i);
    }

    @Bindable
    public String getW412a() {
        return w412a;
    }

    public void setW412a(String w412a) {
        this.w412a = w412a;
        notifyPropertyChanged(BR.w412a);
    }

    @Bindable
    public String getW412b() {
        return w412b;
    }

    public void setW412b(String w412b) {
        this.w412b = w412b;
        notifyPropertyChanged(BR.w412b);
    }

    @Bindable
    public String getW412c() {
        return w412c;
    }

    public void setW412c(String w412c) {
        this.w412c = w412c;
        notifyPropertyChanged(BR.w412c);
    }

    @Bindable
    public String getW412d() {
        return w412d;
    }

    public void setW412d(String w412d) {
        this.w412d = w412d;
        notifyPropertyChanged(BR.w412d);
    }

    @Bindable
    public String getW412e() {
        return w412e;
    }

    public void setW412e(String w412e) {
        this.w412e = w412e;
        notifyPropertyChanged(BR.w412e);
    }

    @Bindable
    public String getW412f() {
        return w412f;
    }

    public void setW412f(String w412f) {
        this.w412f = w412f;
        notifyPropertyChanged(BR.w412f);
    }

    @Bindable
    public String getW412g() {
        return w412g;
    }

    public void setW412g(String w412g) {
        this.w412g = w412g;
        notifyPropertyChanged(BR.w412g);
    }

    @Bindable
    public String getW412h() {
        return w412h;
    }

    public void setW412h(String w412h) {
        this.w412h = w412h;
        notifyPropertyChanged(BR.w412h);
    }

    @Bindable
    public String getW412i() {
        return w412i;
    }

    public void setW412i(String w412i) {
        this.w412i = w412i;
        notifyPropertyChanged(BR.w412i);
    }

    @Bindable
    public String getW412j() {
        return w412j;
    }

    public void setW412j(String w412j) {
        this.w412j = w412j;
        notifyPropertyChanged(BR.w412j);
    }

    @Bindable
    public String getW413a() {
        return w413a;
    }

    public void setW413a(String w413a) {
        this.w413a = w413a;
        notifyPropertyChanged(BR.w413a);
    }

    @Bindable
    public String getW413b() {
        return w413b;
    }

    public void setW413b(String w413b) {
        this.w413b = w413b;
        notifyPropertyChanged(BR.w413b);
    }

    @Bindable
    public String getW413c() {
        return w413c;
    }

    public void setW413c(String w413c) {
        this.w413c = w413c;
        notifyPropertyChanged(BR.w413c);
    }

    @Bindable
    public String getW413d() {
        return w413d;
    }

    public void setW413d(String w413d) {
        this.w413d = w413d;
        notifyPropertyChanged(BR.w413d);
    }

    @Bindable
    public String getW413e() {
        return w413e;
    }

    public void setW413e(String w413e) {
        this.w413e = w413e;
        notifyPropertyChanged(BR.w413e);
    }

    @Bindable
    public String getW413f() {
        return w413f;
    }

    public void setW413f(String w413f) {
        this.w413f = w413f;
        notifyPropertyChanged(BR.w413f);
    }

    @Bindable
    public String getW413g() {
        return w413g;
    }

    public void setW413g(String w413g) {
        this.w413g = w413g;
        notifyPropertyChanged(BR.w413g);
    }

    @Bindable
    public String getW414a() {
        return w414a;
    }

    public void setW414a(String w414a) {
        this.w414a = w414a;
        notifyPropertyChanged(BR.w414a);
    }

    @Bindable
    public String getW414b() {
        return w414b;
    }

    public void setW414b(String w414b) {
        this.w414b = w414b;
        notifyPropertyChanged(BR.w414b);
    }

    @Bindable
    public String getW414c() {
        return w414c;
    }

    public void setW414c(String w414c) {
        this.w414c = w414c;
        notifyPropertyChanged(BR.w414c);
    }

    @Bindable
    public String getW414d() {
        return w414d;
    }

    public void setW414d(String w414d) {
        this.w414d = w414d;
        notifyPropertyChanged(BR.w414d);
    }

    @Bindable
    public String getW414e() {
        return w414e;
    }

    public void setW414e(String w414e) {
        this.w414e = w414e;
        notifyPropertyChanged(BR.w414e);
    }

    @Bindable
    public String getW414f() {
        return w414f;
    }

    public void setW414f(String w414f) {
        this.w414f = w414f;
        notifyPropertyChanged(BR.w414f);
    }

    @Bindable
    public String getW414g() {
        return w414g;
    }

    public void setW414g(String w414g) {
        this.w414g = w414g;
        notifyPropertyChanged(BR.w414g);
    }

    @Bindable
    public String getW414h() {
        return w414h;
    }

    public void setW414h(String w414h) {
        this.w414h = w414h;
        notifyPropertyChanged(BR.w414h);
    }

    @Bindable
    public String getW414i() {
        return w414i;
    }

    public void setW414i(String w414i) {
        this.w414i = w414i;
        notifyPropertyChanged(BR.w414i);
    }

    @Bindable
    public String getW415a() {
        return w415a;
    }

    public void setW415a(String w415a) {
        this.w415a = w415a;
        notifyPropertyChanged(BR.w415a);
    }

    @Bindable
    public String getW415b() {
        return w415b;
    }

    public void setW415b(String w415b) {
        this.w415b = w415b;
        notifyPropertyChanged(BR.w415b);
    }

    @Bindable
    public String getW415c() {
        return w415c;
    }

    public void setW415c(String w415c) {
        this.w415c = w415c;
        notifyPropertyChanged(BR.w415c);
    }

    @Bindable
    public String getW415d() {
        return w415d;
    }

    public void setW415d(String w415d) {
        this.w415d = w415d;
        notifyPropertyChanged(BR.w415d);
    }

    @Bindable
    public String getW415e() {
        return w415e;
    }

    public void setW415e(String w415e) {
        this.w415e = w415e;
        notifyPropertyChanged(BR.w415e);
    }

    @Bindable
    public String getW416a() {
        return w416a;
    }

    public void setW416a(String w416a) {
        this.w416a = w416a;
        notifyPropertyChanged(BR.w416a);
    }

    @Bindable
    public String getW416b() {
        return w416b;
    }

    public void setW416b(String w416b) {
        this.w416b = w416b;
        notifyPropertyChanged(BR.w416b);
    }

    @Bindable
    public String getW416c() {
        return w416c;
    }

    public void setW416c(String w416c) {
        this.w416c = w416c;
        notifyPropertyChanged(BR.w416c);
    }

    @Bindable
    public String getW416d() {
        return w416d;
    }

    public void setW416d(String w416d) {
        this.w416d = w416d;
        notifyPropertyChanged(BR.w416d);
    }

    @Bindable
    public String getW416e() {
        return w416e;
    }

    public void setW416e(String w416e) {
        this.w416e = w416e;
        notifyPropertyChanged(BR.w416e);
    }

    @Bindable
    public String getW416f() {
        return w416f;
    }

    public void setW416f(String w416f) {
        this.w416f = w416f;
        notifyPropertyChanged(BR.w416f);
    }

    @Bindable
    public String getW417a() {
        return w417a;
    }

    public void setW417a(String w417a) {
        this.w417a = w417a;
        notifyPropertyChanged(BR.w417a);
    }

    @Bindable
    public String getW417b() {
        return w417b;
    }

    public void setW417b(String w417b) {
        this.w417b = w417b;
        notifyPropertyChanged(BR.w417b);
    }

    @Bindable
    public String getW417c() {
        return w417c;
    }

    public void setW417c(String w417c) {
        this.w417c = w417c;
        notifyPropertyChanged(BR.w417c);
    }

    @Bindable
    public String getW417d() {
        return w417d;
    }

    public void setW417d(String w417d) {
        this.w417d = w417d;
        notifyPropertyChanged(BR.w417d);
    }

    @Bindable
    public String getW417e() {
        return w417e;
    }

    public void setW417e(String w417e) {
        this.w417e = w417e;
        notifyPropertyChanged(BR.w417e);
    }

    @Bindable
    public String getW417f() {
        return w417f;
    }

    public void setW417f(String w417f) {
        this.w417f = w417f;
        notifyPropertyChanged(BR.w417f);
    }

    @Bindable
    public String getW417g() {
        return w417g;
    }

    public void setW417g(String w417g) {
        this.w417g = w417g;
        notifyPropertyChanged(BR.w417g);
    }

    @Bindable
    public String getW418a() {
        return w418a;
    }

    public void setW418a(String w418a) {
        this.w418a = w418a;
        notifyPropertyChanged(BR.w418a);
    }

    @Bindable
    public String getW418b() {
        return w418b;
    }

    public void setW418b(String w418b) {
        this.w418b = w418b;
        notifyPropertyChanged(BR.w418b);
    }

    @Bindable
    public String getW418c() {
        return w418c;
    }

    public void setW418c(String w418c) {
        this.w418c = w418c;
        notifyPropertyChanged(BR.w418c);
    }

    @Bindable
    public String getW418d() {
        return w418d;
    }

    public void setW418d(String w418d) {
        this.w418d = w418d;
        notifyPropertyChanged(BR.w418d);
    }

    @Bindable
    public String getW418e() {
        return w418e;
    }

    public void setW418e(String w418e) {
        this.w418e = w418e;
        notifyPropertyChanged(BR.w418e);
    }

    @Bindable
    public String getW418f() {
        return w418f;
    }

    public void setW418f(String w418f) {
        this.w418f = w418f;
        notifyPropertyChanged(BR.w418f);
    }

    @Bindable
    public String getW418g() {
        return w418g;
    }

    public void setW418g(String w418g) {
        this.w418g = w418g;
        notifyPropertyChanged(BR.w418g);
    }

    @Bindable
    public String getW418h() {
        return w418h;
    }

    public void setW418h(String w418h) {
        this.w418h = w418h;
        notifyPropertyChanged(BR.w418h);
    }

    @Bindable
    public String getW418i() {
        return w418i;
    }

    public void setW418i(String w418i) {
        this.w418i = w418i;
        notifyPropertyChanged(BR.w418i);
    }

    @Bindable
    public String getW418j() {
        return w418j;
    }

    public void setW418j(String w418j) {
        this.w418j = w418j;
        notifyPropertyChanged(BR.w418j);
    }

    @Bindable
    public String getW419() {
        return w419;
    }

    public void setW419(String w419) {
        this.w419 = w419;
        notifyPropertyChanged(BR.w419);
    }

    @Bindable
    public String getW419a() {
        return w419a;
    }

    public void setW419a(String w419a) {
        if (this.w419a.equals(w419a)) return;
        this.w419a = w419a;
        notifyPropertyChanged(BR.w419a);
    }

    @Bindable
    public String getW419b() {
        return w419b;
    }

    public void setW419b(String w419b) {
        if (this.w419b.equals(w419b)) return;
        this.w419b = w419b;
        notifyPropertyChanged(BR.w419b);
    }

    @Bindable
    public String getW419c() {
        return w419c;
    }

    public void setW419c(String w419c) {
        if (this.w419c.equals(w419c)) return;
        this.w419c = w419c;
        notifyPropertyChanged(BR.w419c);
    }

    @Bindable
    public String getW419d() {
        return w419d;
    }

    public void setW419d(String w419d) {
        if (this.w419d.equals(w419d)) return;
        this.w419d = w419d;
        notifyPropertyChanged(BR.w419d);
    }

    @Bindable
    public String getW420() {
        return w420;
    }

    public void setW420(String w420) {
        this.w420 = w420;
        setW42096x(w420.equals("96") ? this.w42096x : "");
        notifyPropertyChanged(BR.w420);
    }

    @Bindable
    public String getW42096x() {
        return w42096x;
    }

    public void setW42096x(String w42096x) {
        this.w42096x = w42096x;
        notifyPropertyChanged(BR.w42096x);
    }

    @Bindable
    public String getW421a() {
        return w421a;
    }

    public void setW421a(String w421a) {
        this.w421a = w421a;
        notifyPropertyChanged(BR.w421a);
    }

    @Bindable
    public String getW421b() {
        return w421b;
    }

    public void setW421b(String w421b) {
        this.w421b = w421b;
        notifyPropertyChanged(BR.w421b);
    }

    @Bindable
    public String getW421c() {
        return w421c;
    }

    public void setW421c(String w421c) {
        this.w421c = w421c;
        notifyPropertyChanged(BR.w421c);
    }

    @Bindable
    public String getW421d() {
        return w421d;
    }

    public void setW421d(String w421d) {
        this.w421d = w421d;
        notifyPropertyChanged(BR.w421d);
    }

    @Bindable
    public String getW421e() {
        return w421e;
    }

    public void setW421e(String w421e) {
        this.w421e = w421e;
        notifyPropertyChanged(BR.w421e);
    }

    @Bindable
    public String getW421f() {
        return w421f;
    }

    public void setW421f(String w421f) {
        this.w421f = w421f;
        notifyPropertyChanged(BR.w421f);
    }

    @Bindable
    public String getW421g() {
        return w421g;
    }

    public void setW421g(String w421g) {
        this.w421g = w421g;
        notifyPropertyChanged(BR.w421g);
    }

    @Bindable
    public String getW421h() {
        return w421h;
    }

    public void setW421h(String w421h) {
        this.w421h = w421h;
        notifyPropertyChanged(BR.w421h);
    }


    public MWRA Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(MWRAListTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(MWRAListTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(MWRAListTable.COLUMN_UUID));
        this.cluster = cursor.getString(cursor.getColumnIndexOrThrow(MWRAListTable.COLUMN_CLUSTER));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(MWRAListTable.COLUMN_HHID));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(MWRAListTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(MWRAListTable.COLUMN_SYSDATE));
        this.indexed = cursor.getString(cursor.getColumnIndexOrThrow(MWRAListTable.COLUMN_INDEXED));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(MWRAListTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(MWRAListTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(MWRAListTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(MWRAListTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(MWRAListTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(MWRAListTable.COLUMN_SYNCED_DATE));

        sW1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(MWRAListTable.COLUMN_SW1)));
        sW2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(MWRAListTable.COLUMN_SW2)));
        sW3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(MWRAListTable.COLUMN_SW3)));
        sW41Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(MWRAListTable.COLUMN_SW41)));
        sW42Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(MWRAListTable.COLUMN_SW42)));
        sW43Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(MWRAListTable.COLUMN_SW43)));

        return this;
    }

    public void sW1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sW1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.w101 = json.getString("w101");
            this.w102 = json.getString("w102");
            this.w103 = json.getString("w103");
            this.w104 = json.getString("w104");
            this.w105 = json.getString("w105");
            this.w106y = json.getString("w106y");
            this.w106m = json.getString("w106m");
        }
    }

    public void sW2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sW2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.w201 = json.getString("w201");
            this.w202 = json.getString("w202");
            this.w203 = json.getString("w203");
            this.w203a = json.getString("w203a");
            this.w203b = json.getString("w203b");
            this.w203c = json.getString("w203c");
            this.w203d = json.getString("w203d");
            this.w203e = json.getString("w203e");
            this.w20396 = json.getString("w20396");
            this.w20396x = json.getString("w20396x");
            this.w204 = json.getString("w204");
            this.w204a = json.getString("w204a");
            this.w204b = json.getString("w204b");
            this.w204c = json.getString("w204c");
            this.w204d = json.getString("w204d");
            this.w204e = json.getString("w204e");
            this.w204f = json.getString("w204f");
            this.w204g = json.getString("w204g");
            this.w204h = json.getString("w204h");
            this.w204i = json.getString("w204i");
            this.w205 = json.getString("w205");
            this.w205a = json.getString("w205a");
            this.w205b = json.getString("w205b");
            this.w205c = json.getString("w205c");
            this.w205d = json.getString("w205d");
            this.w205e = json.getString("w205e");
            this.w20598 = json.getString("w20598");
            this.w206 = json.getString("w206");
            this.w206a = json.getString("w206a");
            this.w206b = json.getString("w206b");
            this.w206c = json.getString("w206c");
            this.w206d = json.getString("w206d");
            this.w206e = json.getString("w206e");
            this.w206f = json.getString("w206f");
            this.w206g = json.getString("w206g");
            this.w206h = json.getString("w206h");
            this.w206i = json.getString("w206i");
            this.w206j = json.getString("w206j");
            this.w206k = json.getString("w206k");
            this.w20698 = json.getString("w20698");
            this.w207 = json.getString("w207");
            this.w207a = json.getString("w207a");
            this.w207b = json.getString("w207b");
            this.w207c = json.getString("w207c");
            this.w207d = json.getString("w207d");
            this.w207e = json.getString("w207e");
            this.w207f = json.getString("w207f");
            this.w207g = json.getString("w207g");
            this.w207h = json.getString("w207h");
            this.w207i = json.getString("w207i");
            this.w207j = json.getString("w207j");
            this.w20798 = json.getString("w20798");
            this.w208 = json.getString("w208");
            this.w208a = json.getString("w208a");
            this.w208b = json.getString("w208b");
            this.w208c = json.getString("w208c");
            this.w208d = json.getString("w208d");
            this.w208e = json.getString("w208e");
            this.w208f = json.getString("w208f");
            this.w20898 = json.getString("w20898");
            this.w20897 = json.getString("w20897");
            this.w20997 = json.getString("w209");
            this.w209a = json.getString("w209a");
            this.w209b = json.getString("w209b");
            this.w209c = json.getString("w209c");
            this.w209d = json.getString("w209d");
            this.w209e = json.getString("w209e");
            this.w209f = json.getString("w209f");
            this.w209g = json.getString("w209g");
            this.w20998 = json.getString("w20998");
            this.w210 = json.getString("w210");
        }
    }

    public void sW3Hydrate(String string) throws JSONException {
        Log.d(TAG, "sW3Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.w301 = json.getString("w301");
            this.w302 = json.getString("w302");
            this.w302a = json.getString("w302a");
            this.w302b = json.getString("w302b");
            this.w302c = json.getString("w302c");
            this.w302d = json.getString("w302d");
            this.w302e = json.getString("w302e");
            this.w302f = json.getString("w302f");
            this.w302g = json.getString("w302g");
            this.w30296 = json.getString("w30296");
            this.w30296x = json.getString("w30296x");
            this.w303 = json.getString("w303");
            this.w304 = json.getString("w304");
            this.w305 = json.getString("w305");
            this.w305a = json.getString("w305a");
            this.w305b = json.getString("w305b");
            this.w305c = json.getString("w305c");
            this.w305d = json.getString("w305d");
            this.w305e = json.getString("w305e");
            this.w305f = json.getString("w305f");
            this.w305g = json.getString("w305g");
            this.w305h = json.getString("w305h");
            this.w305i = json.getString("w305i");
            this.w305j = json.getString("w305j");
            this.w305k = json.getString("w305k");
            this.w305l = json.getString("w305l");
            this.w305m = json.getString("w305m");
            this.w30596 = json.getString("w30596");
            this.w30596x = json.getString("w30596x");
            this.w306 = json.getString("w306");
            this.w307 = json.getString("w307");
            this.w30796x = json.getString("w30796x");
            this.w308 = json.getString("w308");
            this.w309 = json.getString("w309");
            this.w310 = json.getString("w310");
            this.w310a = json.getString("w310a");
            this.w310b = json.getString("w310b");
            this.w310c = json.getString("w310c");
            this.w310d = json.getString("w310d");
            this.w310e = json.getString("w310e");
            this.w31096 = json.getString("w31096");
            this.w31096x = json.getString("w31096x");
            this.w311 = json.getString("w311");
            this.w311a = json.getString("w311a");
            this.w311b = json.getString("w311b");
            this.w311c = json.getString("w311c");
            this.w311d = json.getString("w311d");
            this.w311e = json.getString("w311e");
            this.w311f = json.getString("w311f");
            this.w311g = json.getString("w311g");
            this.w311h = json.getString("w311h");
            this.w31196 = json.getString("w31196");
            this.w31196x = json.getString("w31196x");
            this.w312 = json.getString("w312");
            this.w313 = json.getString("w313");
            this.w31396x = json.getString("w31396x");
        }
    }

    public void sW41Hydrate(String string) throws JSONException {
        Log.d(TAG, "sW41Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.w401 = json.getString("w401");
            this.w402 = json.getString("w402");
            this.w403 = json.getString("w403");
            this.w403a = json.getString("w403a");
            this.w403b = json.getString("w403b");
            this.w403c = json.getString("w403c");
            this.w403d = json.getString("w403d");
            this.w403e = json.getString("w403e");
            this.w403f = json.getString("w403f");
            this.w403g = json.getString("w403g");
            this.w403h = json.getString("w403h");
            this.w403i = json.getString("w403i");
            this.w403j = json.getString("w403j");
            this.w40396 = json.getString("w40396");
            this.w40396x = json.getString("w40396x");
            this.w404 = json.getString("w404");
            this.w405 = json.getString("w405");
            this.w405a = json.getString("w405a");
            this.w405b = json.getString("w405b");
            this.w405c = json.getString("w405c");
            this.w405d = json.getString("w405d");
            this.w405e = json.getString("w405e");
            this.w405f = json.getString("w405f");
            this.w405g = json.getString("w405g");
            this.w405h = json.getString("w405h");
            this.w405i = json.getString("w405i");
            this.w405j = json.getString("w405j");
            this.w405k = json.getString("w405k");
            this.w405l = json.getString("w405l");
            this.w405m = json.getString("w405m");
            this.w405n = json.getString("w405n");
        }
    }

    public void sW42Hydrate(String string) throws JSONException {
        Log.d(TAG, "sW42Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.w406a = json.getString("w406a");
            this.w406b = json.getString("w406b");
            this.w406c = json.getString("w406c");
            this.w406d = json.getString("w406d");
            this.w406e = json.getString("w406e");
            this.w407a = json.getString("w407a");
            this.w407b = json.getString("w407b");
            this.w407c = json.getString("w407c");
            this.w407d = json.getString("w407d");
            this.w407e = json.getString("w407e");
            this.w407f = json.getString("w407f");
            this.w407g = json.getString("w407g");
            this.w407h = json.getString("w407h");
            this.w407i = json.getString("w407i");
            this.w408a = json.getString("w408a");
            this.w408b = json.getString("w408b");
            this.w408c = json.getString("w408c");
            this.w408d = json.getString("w408d");
            this.w409a = json.getString("w409a");
            this.w409b = json.getString("w409b");
            this.w409c = json.getString("w409c");
            this.w409d = json.getString("w409d");
            this.w409e = json.getString("w409e");
            this.w409f = json.getString("w409f");
            this.w409g = json.getString("w409g");
            this.w409h = json.getString("w409h");
            this.w409i = json.getString("w409i");
            this.w409j = json.getString("w409j");
            this.w410a = json.getString("w410a");
            this.w410b = json.getString("w410b");
            this.w410c = json.getString("w410c");
            this.w410d = json.getString("w410d");
            this.w410e = json.getString("w410e");
            this.w410f = json.getString("w410f");
            this.w410g = json.getString("w410g");
            this.w410h = json.getString("w410h");
            this.w410i = json.getString("w410i");
            this.w410j = json.getString("w410j");
            this.w410k = json.getString("w410k");
            this.w410l = json.getString("w410l");
            this.w411a = json.getString("w411a");
            this.w411b = json.getString("w411b");
            this.w411c = json.getString("w411c");
            this.w411d = json.getString("w411d");
            this.w411e = json.getString("w411e");
            this.w411f = json.getString("w411f");
            this.w411g = json.getString("w411g");
            this.w411h = json.getString("w411h");
            this.w411i = json.getString("w411i");
            this.w412a = json.getString("w412a");
            this.w412b = json.getString("w412b");
            this.w412c = json.getString("w412c");
            this.w412d = json.getString("w412d");
            this.w412e = json.getString("w412e");
            this.w412f = json.getString("w412f");
            this.w412g = json.getString("w412g");
            this.w412h = json.getString("w412h");
            this.w412i = json.getString("w412i");
            this.w412j = json.getString("w412j");
        }
    }

    public void sW43Hydrate(String string) throws JSONException {
        Log.d(TAG, "sW43Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.w413a = json.getString("w413a");
            this.w413b = json.getString("w413b");
            this.w413c = json.getString("w413c");
            this.w413d = json.getString("w413d");
            this.w413e = json.getString("w413e");
            this.w413f = json.getString("w413f");
            this.w413g = json.getString("w413g");
            this.w414a = json.getString("w414a");
            this.w414b = json.getString("w414b");
            this.w414c = json.getString("w414c");
            this.w414d = json.getString("w414d");
            this.w414e = json.getString("w414e");
            this.w414f = json.getString("w414f");
            this.w414g = json.getString("w414g");
            this.w414h = json.getString("w414h");
            this.w414i = json.getString("w414i");
            this.w415a = json.getString("w415a");
            this.w415b = json.getString("w415b");
            this.w415c = json.getString("w415c");
            this.w415d = json.getString("w415d");
            this.w415e = json.getString("w415e");
            this.w416a = json.getString("w416a");
            this.w416b = json.getString("w416b");
            this.w416c = json.getString("w416c");
            this.w416d = json.getString("w416d");
            this.w416e = json.getString("w416e");
            this.w416f = json.getString("w416f");
            this.w417a = json.getString("w417a");
            this.w417b = json.getString("w417b");
            this.w417c = json.getString("w417c");
            this.w417d = json.getString("w417d");
            this.w417e = json.getString("w417e");
            this.w417f = json.getString("w417f");
            this.w417g = json.getString("w417g");
            this.w418a = json.getString("w418a");
            this.w418b = json.getString("w418b");
            this.w418c = json.getString("w418c");
            this.w418d = json.getString("w418d");
            this.w418e = json.getString("w418e");
            this.w418f = json.getString("w418f");
            this.w418g = json.getString("w418g");
            this.w418h = json.getString("w418h");
            this.w418i = json.getString("w418i");
            this.w418j = json.getString("w418j");
            this.w419 = json.getString("w419");
            this.w419a = json.getString("w419a");
            this.w419b = json.getString("w419b");
            this.w419c = json.getString("w419c");
            this.w419d = json.getString("w419d");
            this.w420 = json.getString("w420");
            this.w42096x = json.getString("w42096x");
            this.w421a = json.getString("w421a");
            this.w421b = json.getString("w421b");
            this.w421c = json.getString("w421c");
            this.w421d = json.getString("w421d");
            this.w421e = json.getString("w421e");
            this.w421f = json.getString("w421f");
            this.w421g = json.getString("w421g");
            this.w421h = json.getString("w421h");
        }
    }


    public String sW1toString() throws JSONException {
        Log.d(TAG, "sW1toString: ");
        JSONObject json = new JSONObject();
        json.put("w101", w101)
                .put("w102", w102)
                .put("w103", w103)
                .put("w104", w104)
                .put("w105", w105)
                .put("w106y", w106y)
                .put("w106m", w106m);
        return json.toString();
    }

    public String sW2toString() throws JSONException {
        Log.d(TAG, "sW2toString: ");
        JSONObject json = new JSONObject();
        json.put("w201", w201)
                .put("w202", w202)
                .put("w203", w203)
                .put("w203a", w203a)
                .put("w203b", w203b)
                .put("w203c", w203c)
                .put("w203d", w203d)
                .put("w203e", w203e)
                .put("w20396", w20396)
                .put("w20396x", w20396x)
                .put("w204", w204)
                .put("w204a", w204a)
                .put("w204b", w204b)
                .put("w204c", w204c)
                .put("w204d", w204d)
                .put("w204e", w204e)
                .put("w204f", w204f)
                .put("w204g", w204g)
                .put("w204h", w204h)
                .put("w204i", w204i)
                .put("w205", w205)
                .put("w205a", w205a)
                .put("w205b", w205b)
                .put("w205c", w205c)
                .put("w205d", w205d)
                .put("w205e", w205e)
                .put("w20598", w20598)
                .put("w206", w206)
                .put("w206a", w206a)
                .put("w206b", w206b)
                .put("w206c", w206c)
                .put("w206d", w206d)
                .put("w206e", w206e)
                .put("w206f", w206f)
                .put("w206g", w206g)
                .put("w206h", w206h)
                .put("w206i", w206i)
                .put("w206j", w206j)
                .put("w206k", w206k)
                .put("w20698", w20698)
                .put("w207", w207)
                .put("w207a", w207a)
                .put("w207b", w207b)
                .put("w207c", w207c)
                .put("w207d", w207d)
                .put("w207e", w207e)
                .put("w207f", w207f)
                .put("w207g", w207g)
                .put("w207h", w207h)
                .put("w207i", w207i)
                .put("w207j", w207j)
                .put("w20798", w20798)
                .put("w208", w208)
                .put("w208a", w208a)
                .put("w208b", w208b)
                .put("w208c", w208c)
                .put("w208d", w208d)
                .put("w208e", w208e)
                .put("w208f", w208f)
                .put("w20898", w20898)
                .put("w20897", w20897)
                .put("w209", w20997)
                .put("w209a", w209a)
                .put("w209b", w209b)
                .put("w209c", w209c)
                .put("w209d", w209d)
                .put("w209e", w209e)
                .put("w209f", w209f)
                .put("w209g", w209g)
                .put("w20998", w20998)
                .put("w210", w210);
        return json.toString();
    }

    public String sW3toString() throws JSONException {
        Log.d(TAG, "sW3toString: ");
        JSONObject json = new JSONObject();
        json.put("w301", w301)
                .put("w302", w302)
                .put("w302a", w302a)
                .put("w302b", w302b)
                .put("w302c", w302c)
                .put("w302d", w302d)
                .put("w302e", w302e)
                .put("w302f", w302f)
                .put("w302g", w302g)
                .put("w30296", w30296)
                .put("w30296x", w30296x)
                .put("w303", w303)
                .put("w304", w304)
                .put("w305", w305)
                .put("w305a", w305a)
                .put("w305b", w305b)
                .put("w305c", w305c)
                .put("w305d", w305d)
                .put("w305e", w305e)
                .put("w305f", w305f)
                .put("w305g", w305g)
                .put("w305h", w305h)
                .put("w305i", w305i)
                .put("w305j", w305j)
                .put("w305k", w305k)
                .put("w305l", w305l)
                .put("w305m", w305m)
                .put("w30596", w30596)
                .put("w30596x", w30596x)
                .put("w306", w306)
                .put("w307", w307)
                .put("w30796x", w30796x)
                .put("w308", w308)
                .put("w309", w309)
                .put("w310", w310)
                .put("w310a", w310a)
                .put("w310b", w310b)
                .put("w310c", w310c)
                .put("w310d", w310d)
                .put("w310e", w310e)
                .put("w31096", w31096)
                .put("w31096x", w31096x)
                .put("w311", w311)
                .put("w311a", w311a)
                .put("w311b", w311b)
                .put("w311c", w311c)
                .put("w311d", w311d)
                .put("w311e", w311e)
                .put("w311f", w311f)
                .put("w311g", w311g)
                .put("w311h", w311h)
                .put("w31196", w31196)
                .put("w31196x", w31196x)
                .put("w312", w312)
                .put("w313", w313)
                .put("w31396x", w31396x);
        return json.toString();
    }

    public String sW41toString() throws JSONException {
        Log.d(TAG, "sW41toString: ");
        JSONObject json = new JSONObject();
        json.put("w401", w401)
                .put("w402", w402)
                .put("w403", w403)
                .put("w403a", w403a)
                .put("w403b", w403b)
                .put("w403c", w403c)
                .put("w403d", w403d)
                .put("w403e", w403e)
                .put("w403f", w403f)
                .put("w403g", w403g)
                .put("w403h", w403h)
                .put("w403i", w403i)
                .put("w403j", w403j)
                .put("w40396", w40396)
                .put("w40396x", w40396x)
                .put("w404", w404)
                .put("w405", w405)
                .put("w405a", w405a)
                .put("w405b", w405b)
                .put("w405c", w405c)
                .put("w405d", w405d)
                .put("w405e", w405e)
                .put("w405f", w405f)
                .put("w405g", w405g)
                .put("w405h", w405h)
                .put("w405i", w405i)
                .put("w405j", w405j)
                .put("w405k", w405k)
                .put("w405l", w405l)
                .put("w405m", w405m)
                .put("w405n", w405n);
        return json.toString();
    }

    public String sW42toString() throws JSONException {
        Log.d(TAG, "sW42toString: ");
        JSONObject json = new JSONObject();
        json.put("w406a", w406a)
                .put("w406b", w406b)
                .put("w406c", w406c)
                .put("w406d", w406d)
                .put("w406e", w406e)
                .put("w407a", w407a)
                .put("w407b", w407b)
                .put("w407c", w407c)
                .put("w407d", w407d)
                .put("w407e", w407e)
                .put("w407f", w407f)
                .put("w407g", w407g)
                .put("w407h", w407h)
                .put("w407i", w407i)
                .put("w408a", w408a)
                .put("w408b", w408b)
                .put("w408c", w408c)
                .put("w408d", w408d)
                .put("w409a", w409a)
                .put("w409b", w409b)
                .put("w409c", w409c)
                .put("w409d", w409d)
                .put("w409e", w409e)
                .put("w409f", w409f)
                .put("w409g", w409g)
                .put("w409h", w409h)
                .put("w409i", w409i)
                .put("w409j", w409j)
                .put("w410a", w410a)
                .put("w410b", w410b)
                .put("w410c", w410c)
                .put("w410d", w410d)
                .put("w410e", w410e)
                .put("w410f", w410f)
                .put("w410g", w410g)
                .put("w410h", w410h)
                .put("w410i", w410i)
                .put("w410j", w410j)
                .put("w410k", w410k)
                .put("w410l", w410l)
                .put("w411a", w411a)
                .put("w411b", w411b)
                .put("w411c", w411c)
                .put("w411d", w411d)
                .put("w411e", w411e)
                .put("w411f", w411f)
                .put("w411g", w411g)
                .put("w411h", w411h)
                .put("w411i", w411i)
                .put("w412a", w412a)
                .put("w412b", w412b)
                .put("w412c", w412c)
                .put("w412d", w412d)
                .put("w412e", w412e)
                .put("w412f", w412f)
                .put("w412g", w412g)
                .put("w412h", w412h)
                .put("w412i", w412i)
                .put("w412j", w412j);
        return json.toString();
    }

    public String sW43toString() throws JSONException {
        Log.d(TAG, "sW43toString: ");
        JSONObject json = new JSONObject();
        json.put("w413a", w413a)
                .put("w413b", w413b)
                .put("w413c", w413c)
                .put("w413d", w413d)
                .put("w413e", w413e)
                .put("w413f", w413f)
                .put("w413g", w413g)
                .put("w414a", w414a)
                .put("w414b", w414b)
                .put("w414c", w414c)
                .put("w414d", w414d)
                .put("w414e", w414e)
                .put("w414f", w414f)
                .put("w414g", w414g)
                .put("w414h", w414h)
                .put("w414i", w414i)
                .put("w415a", w415a)
                .put("w415b", w415b)
                .put("w415c", w415c)
                .put("w415d", w415d)
                .put("w415e", w415e)
                .put("w416a", w416a)
                .put("w416b", w416b)
                .put("w416c", w416c)
                .put("w416d", w416d)
                .put("w416e", w416e)
                .put("w416f", w416f)
                .put("w417a", w417a)
                .put("w417b", w417b)
                .put("w417c", w417c)
                .put("w417d", w417d)
                .put("w417e", w417e)
                .put("w417f", w417f)
                .put("w417g", w417g)
                .put("w418a", w418a)
                .put("w418b", w418b)
                .put("w418c", w418c)
                .put("w418d", w418d)
                .put("w418e", w418e)
                .put("w418f", w418f)
                .put("w418g", w418g)
                .put("w418h", w418h)
                .put("w418i", w418i)
                .put("w418j", w418j)
                .put("w419", w419)
                .put("w419a", w419a)
                .put("w419b", w419b)
                .put("w419c", w419c)
                .put("w419d", w419d)
                .put("w420", w420)
                .put("w42096x", w42096x)
                .put("w421a", w421a)
                .put("w421b", w421b)
                .put("w421c", w421c)
                .put("w421d", w421d)
                .put("w421e", w421e)
                .put("w421f", w421f)
                .put("w421g", w421g)
                .put("w421h", w421h);
        return json.toString();
    }


    public JSONObject toJSONObject() {

        JSONObject json = new JSONObject();

        try {
            json.put(MWRAListTable.COLUMN_ID, this.id);
            json.put(MWRAListTable.COLUMN_UID, this.uid);
            json.put(MWRAListTable.COLUMN_UUID, this.uuid);
            json.put(MWRAListTable.COLUMN_CLUSTER, this.cluster);
            json.put(MWRAListTable.COLUMN_HHID, this.hhid);
            json.put(MWRAListTable.COLUMN_USERNAME, this.userName);
            json.put(MWRAListTable.COLUMN_SYSDATE, this.sysDate);
            json.put(MWRAListTable.COLUMN_INDEXED, this.indexed);
            json.put(MWRAListTable.COLUMN_DEVICEID, this.deviceId);
            json.put(MWRAListTable.COLUMN_DEVICETAGID, this.deviceTag);
            json.put(MWRAListTable.COLUMN_ISTATUS, this.iStatus);
            //  json.put(MWRAListTable.COLUMN_SYNCED, this.synced);
            //  json.put(MWRAListTable.COLUMN_SYNCED_DATE, this.syncDate);

            json.put(MWRAListTable.COLUMN_SW1, new JSONObject(sW1toString()));
            json.put(MWRAListTable.COLUMN_SW2, new JSONObject(sW2toString()));
            json.put(MWRAListTable.COLUMN_SW3, new JSONObject(sW3toString()));
            json.put(MWRAListTable.COLUMN_SW41, new JSONObject(sW41toString()));
            json.put(MWRAListTable.COLUMN_SW42, new JSONObject(sW42toString()));
            json.put(MWRAListTable.COLUMN_SW43, new JSONObject(sW43toString()));
            return json;
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, "toJSONObject: " + e.getMessage());
            return null;
        }
    }
}
