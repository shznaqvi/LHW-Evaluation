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
import edu.aku.hassannaqvi.lhwevaluation.contracts.TableContracts.FormsTable;
import edu.aku.hassannaqvi.lhwevaluation.core.MainApp;

public class Form extends BaseObservable implements Observable {

    private final String TAG = "Form";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = StringUtils.EMPTY;
    private String uid = StringUtils.EMPTY;
    private final String wuid = StringUtils.EMPTY;
    private final String cuid = StringUtils.EMPTY;
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
    private String sB = StringUtils.EMPTY;
    private String sC = StringUtils.EMPTY;
    private String sH1 = StringUtils.EMPTY;
    private String sH2 = StringUtils.EMPTY;
    private String sH3 = StringUtils.EMPTY;
    private String sW1 = StringUtils.EMPTY;
    private String sW2 = StringUtils.EMPTY;
    private String sW3 = StringUtils.EMPTY;
    private String sW4 = StringUtils.EMPTY;
    private String sAB = StringUtils.EMPTY;
    private String sM = StringUtils.EMPTY;

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
    private String h301 = StringUtils.EMPTY;
    private String h302 = StringUtils.EMPTY;
    private String h303 = StringUtils.EMPTY;
    private String h304d = StringUtils.EMPTY;
    private String h304m = StringUtils.EMPTY;
    private String h304y = StringUtils.EMPTY;
    private String h305 = StringUtils.EMPTY;
    private String h306 = StringUtils.EMPTY;
    private String h307 = StringUtils.EMPTY;
    private String h308 = StringUtils.EMPTY;
    private String h309 = StringUtils.EMPTY;
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
    private String w209 = StringUtils.EMPTY;
    private String w209a = StringUtils.EMPTY;
    private String w209b = StringUtils.EMPTY;
    private String w209c = StringUtils.EMPTY;
    private String w209d = StringUtils.EMPTY;
    private String w209e = StringUtils.EMPTY;
    private String w209f = StringUtils.EMPTY;
    private String w209g = StringUtils.EMPTY;
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
    private String w302h = StringUtils.EMPTY;
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
    private String w311i = StringUtils.EMPTY;
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
    private String ab1105 = StringUtils.EMPTY;
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


    public Form() {
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

    public String getsB() {
        return sB;
    }

    public void setsB(String sB) {
        this.sB = sB;
    }


    public String getsC() {
        return sC;
    }

    public void setsC(String sC) {
        this.sC = sC;
    }


    public String getsH1() {
        return sH1;
    }

    public void setsH1(String sH1) {
        this.sH1 = sH1;
    }


    public String getsH2() {
        return sH2;
    }

    public void setsH2(String sH2) {
        this.sH2 = sH2;
    }


    public String getsH3() {
        return sH3;
    }

    public void setsH3(String sH3) {
        this.sH3 = sH3;
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


    public String getsW4() {
        return sW4;
    }

    public void setsW4(String sW4) {
        this.sW4 = sW4;
    }


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
        notifyPropertyChanged(BR.b101);
    }

    @Bindable
    public String getB102() {
        return b102;
    }

    public void setB102(String b102) {
        this.b102 = b102;
        notifyPropertyChanged(BR.b102);
    }

    @Bindable
    public String getB103() {
        return b103;
    }

    public void setB103(String b103) {
        this.b103 = b103;
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
    public String getH301() {
        return h301;
    }

    public void setH301(String h301) {
        this.h301 = h301;
        notifyPropertyChanged(BR.h301);
    }

    @Bindable
    public String getH302() {
        return h302;
    }

    public void setH302(String h302) {
        this.h302 = h302;
        notifyPropertyChanged(BR.h302);
    }

    @Bindable
    public String getH303() {
        return h303;
    }

    public void setH303(String h303) {
        this.h303 = h303;
        notifyPropertyChanged(BR.h303);
    }

    @Bindable
    public String getH304d() {
        return h304d;
    }

    public void setH304d(String h304d) {
        this.h304d = h304d;
        notifyPropertyChanged(BR.h304d);
    }

    @Bindable
    public String getH304m() {
        return h304m;
    }

    public void setH304m(String h304m) {
        this.h304m = h304m;
        notifyPropertyChanged(BR.h304m);
    }

    @Bindable
    public String getH304y() {
        return h304y;
    }

    public void setH304y(String h304y) {
        this.h304y = h304y;
        notifyPropertyChanged(BR.h304y);
    }

    @Bindable
    public String getH305() {
        return h305;
    }

    public void setH305(String h305) {
        this.h305 = h305;
        notifyPropertyChanged(BR.h305);
    }

    @Bindable
    public String getH306() {
        return h306;
    }

    public void setH306(String h306) {
        this.h306 = h306;
        notifyPropertyChanged(BR.h306);
    }

    @Bindable
    public String getH307() {
        return h307;
    }

    public void setH307(String h307) {
        this.h307 = h307;
        notifyPropertyChanged(BR.h307);
    }

    @Bindable
    public String getH308() {
        return h308;
    }

    public void setH308(String h308) {
        this.h308 = h308;
        notifyPropertyChanged(BR.h308);
    }

    @Bindable
    public String getH309() {
        return h309;
    }

    public void setH309(String h309) {
        this.h309 = h309;
        notifyPropertyChanged(BR.h309);
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
        this.w203a = w203a;
        notifyPropertyChanged(BR.w203a);
    }

    @Bindable
    public String getW203b() {
        return w203b;
    }

    public void setW203b(String w203b) {
        this.w203b = w203b;
        notifyPropertyChanged(BR.w203b);
    }

    @Bindable
    public String getW203c() {
        return w203c;
    }

    public void setW203c(String w203c) {
        this.w203c = w203c;
        notifyPropertyChanged(BR.w203c);
    }

    @Bindable
    public String getW203d() {
        return w203d;
    }

    public void setW203d(String w203d) {
        this.w203d = w203d;
        notifyPropertyChanged(BR.w203d);
    }

    @Bindable
    public String getW203e() {
        return w203e;
    }

    public void setW203e(String w203e) {
        this.w203e = w203e;
        notifyPropertyChanged(BR.w203e);
    }

    @Bindable
    public String getW20396() {
        return w20396;
    }

    public void setW20396(String w20396) {
        this.w20396 = w20396;
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
        this.w204a = w204a;
        notifyPropertyChanged(BR.w204a);
    }

    @Bindable
    public String getW204b() {
        return w204b;
    }

    public void setW204b(String w204b) {
        this.w204b = w204b;
        notifyPropertyChanged(BR.w204b);
    }

    @Bindable
    public String getW204c() {
        return w204c;
    }

    public void setW204c(String w204c) {
        this.w204c = w204c;
        notifyPropertyChanged(BR.w204c);
    }

    @Bindable
    public String getW204d() {
        return w204d;
    }

    public void setW204d(String w204d) {
        this.w204d = w204d;
        notifyPropertyChanged(BR.w204d);
    }

    @Bindable
    public String getW204e() {
        return w204e;
    }

    public void setW204e(String w204e) {
        this.w204e = w204e;
        notifyPropertyChanged(BR.w204e);
    }

    @Bindable
    public String getW204f() {
        return w204f;
    }

    public void setW204f(String w204f) {
        this.w204f = w204f;
        notifyPropertyChanged(BR.w204f);
    }

    @Bindable
    public String getW204g() {
        return w204g;
    }

    public void setW204g(String w204g) {
        this.w204g = w204g;
        notifyPropertyChanged(BR.w204g);
    }

    @Bindable
    public String getW204h() {
        return w204h;
    }

    public void setW204h(String w204h) {
        this.w204h = w204h;
        notifyPropertyChanged(BR.w204h);
    }

    @Bindable
    public String getW204i() {
        return w204i;
    }

    public void setW204i(String w204i) {
        this.w204i = w204i;
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
        this.w205a = w205a;
        notifyPropertyChanged(BR.w205a);
    }

    @Bindable
    public String getW205b() {
        return w205b;
    }

    public void setW205b(String w205b) {
        this.w205b = w205b;
        notifyPropertyChanged(BR.w205b);
    }

    @Bindable
    public String getW205c() {
        return w205c;
    }

    public void setW205c(String w205c) {
        this.w205c = w205c;
        notifyPropertyChanged(BR.w205c);
    }

    @Bindable
    public String getW205d() {
        return w205d;
    }

    public void setW205d(String w205d) {
        this.w205d = w205d;
        notifyPropertyChanged(BR.w205d);
    }

    @Bindable
    public String getW205e() {
        return w205e;
    }

    public void setW205e(String w205e) {
        this.w205e = w205e;
        notifyPropertyChanged(BR.w205e);
    }

    @Bindable
    public String getW20598() {
        return w20598;
    }

    public void setW20598(String w20598) {
        this.w20598 = w20598;
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
        this.w206a = w206a;
        notifyPropertyChanged(BR.w206a);
    }

    @Bindable
    public String getW206b() {
        return w206b;
    }

    public void setW206b(String w206b) {
        this.w206b = w206b;
        notifyPropertyChanged(BR.w206b);
    }

    @Bindable
    public String getW206c() {
        return w206c;
    }

    public void setW206c(String w206c) {
        this.w206c = w206c;
        notifyPropertyChanged(BR.w206c);
    }

    @Bindable
    public String getW206d() {
        return w206d;
    }

    public void setW206d(String w206d) {
        this.w206d = w206d;
        notifyPropertyChanged(BR.w206d);
    }

    @Bindable
    public String getW206e() {
        return w206e;
    }

    public void setW206e(String w206e) {
        this.w206e = w206e;
        notifyPropertyChanged(BR.w206e);
    }

    @Bindable
    public String getW206f() {
        return w206f;
    }

    public void setW206f(String w206f) {
        this.w206f = w206f;
        notifyPropertyChanged(BR.w206f);
    }

    @Bindable
    public String getW206g() {
        return w206g;
    }

    public void setW206g(String w206g) {
        this.w206g = w206g;
        notifyPropertyChanged(BR.w206g);
    }

    @Bindable
    public String getW206h() {
        return w206h;
    }

    public void setW206h(String w206h) {
        this.w206h = w206h;
        notifyPropertyChanged(BR.w206h);
    }

    @Bindable
    public String getW206i() {
        return w206i;
    }

    public void setW206i(String w206i) {
        this.w206i = w206i;
        notifyPropertyChanged(BR.w206i);
    }

    @Bindable
    public String getW206j() {
        return w206j;
    }

    public void setW206j(String w206j) {
        this.w206j = w206j;
        notifyPropertyChanged(BR.w206j);
    }

    @Bindable
    public String getW206k() {
        return w206k;
    }

    public void setW206k(String w206k) {
        this.w206k = w206k;
        notifyPropertyChanged(BR.w206k);
    }

    @Bindable
    public String getW20698() {
        return w20698;
    }

    public void setW20698(String w20698) {
        this.w20698 = w20698;
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
        this.w207a = w207a;
        notifyPropertyChanged(BR.w207a);
    }

    @Bindable
    public String getW207b() {
        return w207b;
    }

    public void setW207b(String w207b) {
        this.w207b = w207b;
        notifyPropertyChanged(BR.w207b);
    }

    @Bindable
    public String getW207c() {
        return w207c;
    }

    public void setW207c(String w207c) {
        this.w207c = w207c;
        notifyPropertyChanged(BR.w207c);
    }

    @Bindable
    public String getW207d() {
        return w207d;
    }

    public void setW207d(String w207d) {
        this.w207d = w207d;
        notifyPropertyChanged(BR.w207d);
    }

    @Bindable
    public String getW207e() {
        return w207e;
    }

    public void setW207e(String w207e) {
        this.w207e = w207e;
        notifyPropertyChanged(BR.w207e);
    }

    @Bindable
    public String getW207f() {
        return w207f;
    }

    public void setW207f(String w207f) {
        this.w207f = w207f;
        notifyPropertyChanged(BR.w207f);
    }

    @Bindable
    public String getW207g() {
        return w207g;
    }

    public void setW207g(String w207g) {
        this.w207g = w207g;
        notifyPropertyChanged(BR.w207g);
    }

    @Bindable
    public String getW207h() {
        return w207h;
    }

    public void setW207h(String w207h) {
        this.w207h = w207h;
        notifyPropertyChanged(BR.w207h);
    }

    @Bindable
    public String getW207i() {
        return w207i;
    }

    public void setW207i(String w207i) {
        this.w207i = w207i;
        notifyPropertyChanged(BR.w207i);
    }

    @Bindable
    public String getW207j() {
        return w207j;
    }

    public void setW207j(String w207j) {
        this.w207j = w207j;
        notifyPropertyChanged(BR.w207j);
    }

    @Bindable
    public String getW20798() {
        return w20798;
    }

    public void setW20798(String w20798) {
        this.w20798 = w20798;
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
        this.w208a = w208a;
        notifyPropertyChanged(BR.w208a);
    }

    @Bindable
    public String getW208b() {
        return w208b;
    }

    public void setW208b(String w208b) {
        this.w208b = w208b;
        notifyPropertyChanged(BR.w208b);
    }

    @Bindable
    public String getW208c() {
        return w208c;
    }

    public void setW208c(String w208c) {
        this.w208c = w208c;
        notifyPropertyChanged(BR.w208c);
    }

    @Bindable
    public String getW208d() {
        return w208d;
    }

    public void setW208d(String w208d) {
        this.w208d = w208d;
        notifyPropertyChanged(BR.w208d);
    }

    @Bindable
    public String getW208e() {
        return w208e;
    }

    public void setW208e(String w208e) {
        this.w208e = w208e;
        notifyPropertyChanged(BR.w208e);
    }

    @Bindable
    public String getW208f() {
        return w208f;
    }

    public void setW208f(String w208f) {
        this.w208f = w208f;
        notifyPropertyChanged(BR.w208f);
    }

    @Bindable
    public String getW20898() {
        return w20898;
    }

    public void setW20898(String w20898) {
        this.w20898 = w20898;
        notifyPropertyChanged(BR.w20898);
    }

    @Bindable
    public String getW20897() {
        return w20897;
    }

    public void setW20897(String w20897) {
        this.w20897 = w20897;
        notifyPropertyChanged(BR.w20897);
    }

    @Bindable
    public String getW209() {
        return w209;
    }

    public void setW209(String w209) {
        this.w209 = w209;
        notifyPropertyChanged(BR.w209);
    }

    @Bindable
    public String getW209a() {
        return w209a;
    }

    public void setW209a(String w209a) {
        this.w209a = w209a;
        notifyPropertyChanged(BR.w209a);
    }

    @Bindable
    public String getW209b() {
        return w209b;
    }

    public void setW209b(String w209b) {
        this.w209b = w209b;
        notifyPropertyChanged(BR.w209b);
    }

    @Bindable
    public String getW209c() {
        return w209c;
    }

    public void setW209c(String w209c) {
        this.w209c = w209c;
        notifyPropertyChanged(BR.w209c);
    }

    @Bindable
    public String getW209d() {
        return w209d;
    }

    public void setW209d(String w209d) {
        this.w209d = w209d;
        notifyPropertyChanged(BR.w209d);
    }

    @Bindable
    public String getW209e() {
        return w209e;
    }

    public void setW209e(String w209e) {
        this.w209e = w209e;
        notifyPropertyChanged(BR.w209e);
    }

    @Bindable
    public String getW209f() {
        return w209f;
    }

    public void setW209f(String w209f) {
        this.w209f = w209f;
        notifyPropertyChanged(BR.w209f);
    }

    @Bindable
    public String getW209g() {
        return w209g;
    }

    public void setW209g(String w209g) {
        this.w209g = w209g;
        notifyPropertyChanged(BR.w209g);
    }

    @Bindable
    public String getW20998() {
        return w20998;
    }

    public void setW20998(String w20998) {
        this.w20998 = w20998;
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
        this.w302a = w302a;
        notifyPropertyChanged(BR.w302a);
    }

    @Bindable
    public String getW302b() {
        return w302b;
    }

    public void setW302b(String w302b) {
        this.w302b = w302b;
        notifyPropertyChanged(BR.w302b);
    }

    @Bindable
    public String getW302c() {
        return w302c;
    }

    public void setW302c(String w302c) {
        this.w302c = w302c;
        notifyPropertyChanged(BR.w302c);
    }

    @Bindable
    public String getW302d() {
        return w302d;
    }

    public void setW302d(String w302d) {
        this.w302d = w302d;
        notifyPropertyChanged(BR.w302d);
    }

    @Bindable
    public String getW302e() {
        return w302e;
    }

    public void setW302e(String w302e) {
        this.w302e = w302e;
        notifyPropertyChanged(BR.w302e);
    }

    @Bindable
    public String getW302f() {
        return w302f;
    }

    public void setW302f(String w302f) {
        this.w302f = w302f;
        notifyPropertyChanged(BR.w302f);
    }

    @Bindable
    public String getW302h() {
        return w302h;
    }

    public void setW302h(String w302h) {
        this.w302h = w302h;
        notifyPropertyChanged(BR.w302h);
    }

    @Bindable
    public String getW30296() {
        return w30296;
    }

    public void setW30296(String w30296) {
        this.w30296 = w30296;
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
        this.w305a = w305a;
        notifyPropertyChanged(BR.w305a);
    }

    @Bindable
    public String getW305b() {
        return w305b;
    }

    public void setW305b(String w305b) {
        this.w305b = w305b;
        notifyPropertyChanged(BR.w305b);
    }

    @Bindable
    public String getW305c() {
        return w305c;
    }

    public void setW305c(String w305c) {
        this.w305c = w305c;
        notifyPropertyChanged(BR.w305c);
    }

    @Bindable
    public String getW305d() {
        return w305d;
    }

    public void setW305d(String w305d) {
        this.w305d = w305d;
        notifyPropertyChanged(BR.w305d);
    }

    @Bindable
    public String getW305e() {
        return w305e;
    }

    public void setW305e(String w305e) {
        this.w305e = w305e;
        notifyPropertyChanged(BR.w305e);
    }

    @Bindable
    public String getW305f() {
        return w305f;
    }

    public void setW305f(String w305f) {
        this.w305f = w305f;
        notifyPropertyChanged(BR.w305f);
    }

    @Bindable
    public String getW305g() {
        return w305g;
    }

    public void setW305g(String w305g) {
        this.w305g = w305g;
        notifyPropertyChanged(BR.w305g);
    }

    @Bindable
    public String getW305h() {
        return w305h;
    }

    public void setW305h(String w305h) {
        this.w305h = w305h;
        notifyPropertyChanged(BR.w305h);
    }

    @Bindable
    public String getW305i() {
        return w305i;
    }

    public void setW305i(String w305i) {
        this.w305i = w305i;
        notifyPropertyChanged(BR.w305i);
    }

    @Bindable
    public String getW305j() {
        return w305j;
    }

    public void setW305j(String w305j) {
        this.w305j = w305j;
        notifyPropertyChanged(BR.w305j);
    }

    @Bindable
    public String getW305k() {
        return w305k;
    }

    public void setW305k(String w305k) {
        this.w305k = w305k;
        notifyPropertyChanged(BR.w305k);
    }

    @Bindable
    public String getW305l() {
        return w305l;
    }

    public void setW305l(String w305l) {
        this.w305l = w305l;
        notifyPropertyChanged(BR.w305l);
    }

    @Bindable
    public String getW305m() {
        return w305m;
    }

    public void setW305m(String w305m) {
        this.w305m = w305m;
        notifyPropertyChanged(BR.w305m);
    }

    @Bindable
    public String getW30596() {
        return w30596;
    }

    public void setW30596(String w30596) {
        this.w30596 = w30596;
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
        notifyPropertyChanged(BR.w306);
    }

    @Bindable
    public String getW307() {
        return w307;
    }

    public void setW307(String w307) {
        this.w307 = w307;
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
        this.w310a = w310a;
        notifyPropertyChanged(BR.w310a);
    }

    @Bindable
    public String getW310b() {
        return w310b;
    }

    public void setW310b(String w310b) {
        this.w310b = w310b;
        notifyPropertyChanged(BR.w310b);
    }

    @Bindable
    public String getW310c() {
        return w310c;
    }

    public void setW310c(String w310c) {
        this.w310c = w310c;
        notifyPropertyChanged(BR.w310c);
    }

    @Bindable
    public String getW310d() {
        return w310d;
    }

    public void setW310d(String w310d) {
        this.w310d = w310d;
        notifyPropertyChanged(BR.w310d);
    }

    @Bindable
    public String getW310e() {
        return w310e;
    }

    public void setW310e(String w310e) {
        this.w310e = w310e;
        notifyPropertyChanged(BR.w310e);
    }

    @Bindable
    public String getW31096() {
        return w31096;
    }

    public void setW31096(String w31096) {
        this.w31096 = w31096;
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
        this.w311a = w311a;
        notifyPropertyChanged(BR.w311a);
    }

    @Bindable
    public String getW311b() {
        return w311b;
    }

    public void setW311b(String w311b) {
        this.w311b = w311b;
        notifyPropertyChanged(BR.w311b);
    }

    @Bindable
    public String getW311c() {
        return w311c;
    }

    public void setW311c(String w311c) {
        this.w311c = w311c;
        notifyPropertyChanged(BR.w311c);
    }

    @Bindable
    public String getW311d() {
        return w311d;
    }

    public void setW311d(String w311d) {
        this.w311d = w311d;
        notifyPropertyChanged(BR.w311d);
    }

    @Bindable
    public String getW311e() {
        return w311e;
    }

    public void setW311e(String w311e) {
        this.w311e = w311e;
        notifyPropertyChanged(BR.w311e);
    }

    @Bindable
    public String getW311f() {
        return w311f;
    }

    public void setW311f(String w311f) {
        this.w311f = w311f;
        notifyPropertyChanged(BR.w311f);
    }

    @Bindable
    public String getW311g() {
        return w311g;
    }

    public void setW311g(String w311g) {
        this.w311g = w311g;
        notifyPropertyChanged(BR.w311g);
    }

    @Bindable
    public String getW311i() {
        return w311i;
    }

    public void setW311i(String w311i) {
        this.w311i = w311i;
        notifyPropertyChanged(BR.w311i);
    }

    @Bindable
    public String getW31196() {
        return w31196;
    }

    public void setW31196(String w31196) {
        this.w31196 = w31196;
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
        notifyPropertyChanged(BR.w312);
    }

    @Bindable
    public String getW313() {
        return w313;
    }

    public void setW313(String w313) {
        this.w313 = w313;
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
        this.w403a = w403a;
        notifyPropertyChanged(BR.w403a);
    }

    @Bindable
    public String getW403b() {
        return w403b;
    }

    public void setW403b(String w403b) {
        this.w403b = w403b;
        notifyPropertyChanged(BR.w403b);
    }

    @Bindable
    public String getW403c() {
        return w403c;
    }

    public void setW403c(String w403c) {
        this.w403c = w403c;
        notifyPropertyChanged(BR.w403c);
    }

    @Bindable
    public String getW403d() {
        return w403d;
    }

    public void setW403d(String w403d) {
        this.w403d = w403d;
        notifyPropertyChanged(BR.w403d);
    }

    @Bindable
    public String getW403e() {
        return w403e;
    }

    public void setW403e(String w403e) {
        this.w403e = w403e;
        notifyPropertyChanged(BR.w403e);
    }

    @Bindable
    public String getW403f() {
        return w403f;
    }

    public void setW403f(String w403f) {
        this.w403f = w403f;
        notifyPropertyChanged(BR.w403f);
    }

    @Bindable
    public String getW403g() {
        return w403g;
    }

    public void setW403g(String w403g) {
        this.w403g = w403g;
        notifyPropertyChanged(BR.w403g);
    }

    @Bindable
    public String getW403h() {
        return w403h;
    }

    public void setW403h(String w403h) {
        this.w403h = w403h;
        notifyPropertyChanged(BR.w403h);
    }

    @Bindable
    public String getW403i() {
        return w403i;
    }

    public void setW403i(String w403i) {
        this.w403i = w403i;
        notifyPropertyChanged(BR.w403i);
    }

    @Bindable
    public String getW403j() {
        return w403j;
    }

    public void setW403j(String w403j) {
        this.w403j = w403j;
        notifyPropertyChanged(BR.w403j);
    }

    @Bindable
    public String getW40396() {
        return w40396;
    }

    public void setW40396(String w40396) {
        this.w40396 = w40396;
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
        this.w405a = w405a;
        notifyPropertyChanged(BR.w405a);
    }

    @Bindable
    public String getW405b() {
        return w405b;
    }

    public void setW405b(String w405b) {
        this.w405b = w405b;
        notifyPropertyChanged(BR.w405b);
    }

    @Bindable
    public String getW405c() {
        return w405c;
    }

    public void setW405c(String w405c) {
        this.w405c = w405c;
        notifyPropertyChanged(BR.w405c);
    }

    @Bindable
    public String getW405d() {
        return w405d;
    }

    public void setW405d(String w405d) {
        this.w405d = w405d;
        notifyPropertyChanged(BR.w405d);
    }

    @Bindable
    public String getW405e() {
        return w405e;
    }

    public void setW405e(String w405e) {
        this.w405e = w405e;
        notifyPropertyChanged(BR.w405e);
    }

    @Bindable
    public String getW405f() {
        return w405f;
    }

    public void setW405f(String w405f) {
        this.w405f = w405f;
        notifyPropertyChanged(BR.w405f);
    }

    @Bindable
    public String getW405g() {
        return w405g;
    }

    public void setW405g(String w405g) {
        this.w405g = w405g;
        notifyPropertyChanged(BR.w405g);
    }

    @Bindable
    public String getW405h() {
        return w405h;
    }

    public void setW405h(String w405h) {
        this.w405h = w405h;
        notifyPropertyChanged(BR.w405h);
    }

    @Bindable
    public String getW405i() {
        return w405i;
    }

    public void setW405i(String w405i) {
        this.w405i = w405i;
        notifyPropertyChanged(BR.w405i);
    }

    @Bindable
    public String getW405j() {
        return w405j;
    }

    public void setW405j(String w405j) {
        this.w405j = w405j;
        notifyPropertyChanged(BR.w405j);
    }

    @Bindable
    public String getW405k() {
        return w405k;
    }

    public void setW405k(String w405k) {
        this.w405k = w405k;
        notifyPropertyChanged(BR.w405k);
    }

    @Bindable
    public String getW405l() {
        return w405l;
    }

    public void setW405l(String w405l) {
        this.w405l = w405l;
        notifyPropertyChanged(BR.w405l);
    }

    @Bindable
    public String getW405m() {
        return w405m;
    }

    public void setW405m(String w405m) {
        this.w405m = w405m;
        notifyPropertyChanged(BR.w405m);
    }

    @Bindable
    public String getW405n() {
        return w405n;
    }

    public void setW405n(String w405n) {
        this.w405n = w405n;
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
        this.w419a = w419a;
        notifyPropertyChanged(BR.w419a);
    }

    @Bindable
    public String getW419b() {
        return w419b;
    }

    public void setW419b(String w419b) {
        this.w419b = w419b;
        notifyPropertyChanged(BR.w419b);
    }

    @Bindable
    public String getW419c() {
        return w419c;
    }

    public void setW419c(String w419c) {
        this.w419c = w419c;
        notifyPropertyChanged(BR.w419c);
    }

    @Bindable
    public String getW419d() {
        return w419d;
    }

    public void setW419d(String w419d) {
        this.w419d = w419d;
        notifyPropertyChanged(BR.w419d);
    }

    @Bindable
    public String getW420() {
        return w420;
    }

    public void setW420(String w420) {
        this.w420 = w420;
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
        this.ab104a = ab104a;
        notifyPropertyChanged(BR.ab104a);
    }

    @Bindable
    public String getAb104b() {
        return ab104b;
    }

    public void setAb104b(String ab104b) {
        this.ab104b = ab104b;
        notifyPropertyChanged(BR.ab104b);
    }

    @Bindable
    public String getAb104c() {
        return ab104c;
    }

    public void setAb104c(String ab104c) {
        this.ab104c = ab104c;
        notifyPropertyChanged(BR.ab104c);
    }

    @Bindable
    public String getAb104d() {
        return ab104d;
    }

    public void setAb104d(String ab104d) {
        this.ab104d = ab104d;
        notifyPropertyChanged(BR.ab104d);
    }

    @Bindable
    public String getAb10496() {
        return ab10496;
    }

    public void setAb10496(String ab10496) {
        this.ab10496 = ab10496;
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
        notifyPropertyChanged(BR.ab106);
    }

    @Bindable
    public String getAb107() {
        return ab107;
    }

    public void setAb107(String ab107) {
        this.ab107 = ab107;
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
        this.ab108a = ab108a;
        notifyPropertyChanged(BR.ab108a);
    }

    @Bindable
    public String getAb108b() {
        return ab108b;
    }

    public void setAb108b(String ab108b) {
        this.ab108b = ab108b;
        notifyPropertyChanged(BR.ab108b);
    }

    @Bindable
    public String getAb108c() {
        return ab108c;
    }

    public void setAb108c(String ab108c) {
        this.ab108c = ab108c;
        notifyPropertyChanged(BR.ab108c);
    }

    @Bindable
    public String getAb108d() {
        return ab108d;
    }

    public void setAb108d(String ab108d) {
        this.ab108d = ab108d;
        notifyPropertyChanged(BR.ab108d);
    }

    @Bindable
    public String getAb108e() {
        return ab108e;
    }

    public void setAb108e(String ab108e) {
        this.ab108e = ab108e;
        notifyPropertyChanged(BR.ab108e);
    }

    @Bindable
    public String getAb108f() {
        return ab108f;
    }

    public void setAb108f(String ab108f) {
        this.ab108f = ab108f;
        notifyPropertyChanged(BR.ab108f);
    }

    @Bindable
    public String getAb108g() {
        return ab108g;
    }

    public void setAb108g(String ab108g) {
        this.ab108g = ab108g;
        notifyPropertyChanged(BR.ab108g);
    }

    @Bindable
    public String getAb108h() {
        return ab108h;
    }

    public void setAb108h(String ab108h) {
        this.ab108h = ab108h;
        notifyPropertyChanged(BR.ab108h);
    }

    @Bindable
    public String getAb108i() {
        return ab108i;
    }

    public void setAb108i(String ab108i) {
        this.ab108i = ab108i;
        notifyPropertyChanged(BR.ab108i);
    }

    @Bindable
    public String getAb108j() {
        return ab108j;
    }

    public void setAb108j(String ab108j) {
        this.ab108j = ab108j;
        notifyPropertyChanged(BR.ab108j);
    }

    @Bindable
    public String getAb108k() {
        return ab108k;
    }

    public void setAb108k(String ab108k) {
        this.ab108k = ab108k;
        notifyPropertyChanged(BR.ab108k);
    }

    @Bindable
    public String getAb10896() {
        return ab10896;
    }

    public void setAb10896(String ab10896) {
        this.ab10896 = ab10896;
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
        this.ab110a = ab110a;
        notifyPropertyChanged(BR.ab110a);
    }

    @Bindable
    public String getAb110b() {
        return ab110b;
    }

    public void setAb110b(String ab110b) {
        this.ab110b = ab110b;
        notifyPropertyChanged(BR.ab110b);
    }

    @Bindable
    public String getAb110c() {
        return ab110c;
    }

    public void setAb110c(String ab110c) {
        this.ab110c = ab110c;
        notifyPropertyChanged(BR.ab110c);
    }

    @Bindable
    public String getAb110d() {
        return ab110d;
    }

    public void setAb110d(String ab110d) {
        this.ab110d = ab110d;
        notifyPropertyChanged(BR.ab110d);
    }

    @Bindable
    public String getAb1105() {
        return ab1105;
    }

    public void setAb1105(String ab1105) {
        this.ab1105 = ab1105;
        notifyPropertyChanged(BR.ab1105);
    }

    @Bindable
    public String getAb11096() {
        return ab11096;
    }

    public void setAb11096(String ab11096) {
        this.ab11096 = ab11096;
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
        this.ab113a = ab113a;
        notifyPropertyChanged(BR.ab113a);
    }

    @Bindable
    public String getAb113b() {
        return ab113b;
    }

    public void setAb113b(String ab113b) {
        this.ab113b = ab113b;
        notifyPropertyChanged(BR.ab113b);
    }

    @Bindable
    public String getAb113c() {
        return ab113c;
    }

    public void setAb113c(String ab113c) {
        this.ab113c = ab113c;
        notifyPropertyChanged(BR.ab113c);
    }

    @Bindable
    public String getAb11398() {
        return ab11398;
    }

    public void setAb11398(String ab11398) {
        this.ab11398 = ab11398;
        notifyPropertyChanged(BR.ab11398);
    }

    @Bindable
    public String getAb11396() {
        return ab11396;
    }

    public void setAb11396(String ab11396) {
        this.ab11396 = ab11396;
        notifyPropertyChanged(BR.ab11396);
    }

    @Bindable
    public String getAb114() {
        return ab114;
    }

    public void setAb114(String ab114) {
        this.ab114 = ab114;
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
        this.m105a = m105a;
        notifyPropertyChanged(BR.m105a);
    }

    @Bindable
    public String getM105b() {
        return m105b;
    }

    public void setM105b(String m105b) {
        this.m105b = m105b;
        notifyPropertyChanged(BR.m105b);
    }

    @Bindable
    public String getM105c() {
        return m105c;
    }

    public void setM105c(String m105c) {
        this.m105c = m105c;
        notifyPropertyChanged(BR.m105c);
    }

    @Bindable
    public String getM105d() {
        return m105d;
    }

    public void setM105d(String m105d) {
        this.m105d = m105d;
        notifyPropertyChanged(BR.m105d);
    }

    @Bindable
    public String getM105e() {
        return m105e;
    }

    public void setM105e(String m105e) {
        this.m105e = m105e;
        notifyPropertyChanged(BR.m105e);
    }

    @Bindable
    public String getM105f() {
        return m105f;
    }

    public void setM105f(String m105f) {
        this.m105f = m105f;
        notifyPropertyChanged(BR.m105f);
    }

    @Bindable
    public String getM105g() {
        return m105g;
    }

    public void setM105g(String m105g) {
        this.m105g = m105g;
        notifyPropertyChanged(BR.m105g);
    }

    @Bindable
    public String getM105h() {
        return m105h;
    }

    public void setM105h(String m105h) {
        this.m105h = m105h;
        notifyPropertyChanged(BR.m105h);
    }

    @Bindable
    public String getM10596() {
        return m10596;
    }

    public void setM10596(String m10596) {
        this.m10596 = m10596;
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
        this.m106a = m106a;
        notifyPropertyChanged(BR.m106a);
    }

    @Bindable
    public String getM106b() {
        return m106b;
    }

    public void setM106b(String m106b) {
        this.m106b = m106b;
        notifyPropertyChanged(BR.m106b);
    }

    @Bindable
    public String getM106c() {
        return m106c;
    }

    public void setM106c(String m106c) {
        this.m106c = m106c;
        notifyPropertyChanged(BR.m106c);
    }

    @Bindable
    public String getM106d() {
        return m106d;
    }

    public void setM106d(String m106d) {
        this.m106d = m106d;
        notifyPropertyChanged(BR.m106d);
    }


    public Form Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_UID));
        this.cluster = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_CLUSTER));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_HHID));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED_DATE));

        sAHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA)));
        sBHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SB)));
        sCHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SC)));
        sH1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SH1)));
        sH2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SH2)));
        sH3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SH3)));
        sW1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SW1)));
        sW2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SW2)));
        sW3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SW3)));
        sW4Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SW4)));
        sABHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SAB)));
        sMHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SM)));

        return this;
    }

    public void sAHydrate(String string) throws JSONException {
        Log.d(TAG, "sAHydrate: " + string);
        if (string != null) {

            JSONObject json = null;
            json = new JSONObject(string);
            this.a101 = json.getString("a101");
            this.a102 = json.getString("a102");
            this.a103 = json.getString("a103");
            this.a104n = json.getString("a104n");
            this.a104c = json.getString("a104c");
            this.a105 = json.getString("a105");
            this.a106 = json.getString("a106");
            this.a107 = json.getString("a107");
            this.a10796x = json.getString("a10796x");
            this.a108 = json.getString("a108");
            this.a109 = json.getString("a109");
            this.lhwphoto = json.getString("lhwphoto");
            this.secw2inst = json.getString("secw2inst");
        }
    }

    public void sBHydrate(String string) throws JSONException {
        Log.d(TAG, "sBHydrate: " + string);
        if (string != null) {

            JSONObject json = null;
            json = new JSONObject(string);
            this.b101 = json.getString("b101");
            this.b102 = json.getString("b102");
            this.b103 = json.getString("b103");
            this.b10396x = json.getString("b10396x");
            this.b104 = json.getString("b104");
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

    public void sH1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sH1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.h101 = json.getString("h101");
            this.h102 = json.getString("h102");
            this.h103 = json.getString("h103");
            this.h104a = json.getString("h104a");
            this.h104b = json.getString("h104b");
            this.h104c = json.getString("h104c");
            this.h104d = json.getString("h104d");
            this.h104e = json.getString("h104e");
            this.h104f = json.getString("h104f");
        }
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

    public void sH3Hydrate(String string) throws JSONException {
        Log.d(TAG, "sH3Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.h301 = json.getString("h301");
            this.h302 = json.getString("h302");
            this.h303 = json.getString("h303");
            this.h304d = json.getString("h304d");
            this.h304m = json.getString("h304m");
            this.h304y = json.getString("h304y");
            this.h305 = json.getString("h305");
            this.h306 = json.getString("h306");
            this.h307 = json.getString("h307");
            this.h308 = json.getString("h308");
            this.h309 = json.getString("h309");
        }
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
            this.w209 = json.getString("w209");
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
            this.w302h = json.getString("w302h");
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
            this.w311i = json.getString("w311i");
            this.w31196 = json.getString("w31196");
            this.w31196x = json.getString("w31196x");
            this.w312 = json.getString("w312");
            this.w313 = json.getString("w313");
            this.w31396x = json.getString("w31396x");
        }
    }

    public void sW4Hydrate(String string) throws JSONException {
        Log.d(TAG, "sW4Hydrate: " + string);
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
        }
    }

    public void sABHydrate(String string) throws JSONException {
        Log.d(TAG, "sABHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
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
            this.ab1105 = json.getString("ab1105");
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


    public String sAtoString() throws JSONException {
        Log.d(TAG, "sAtoString: ");
        JSONObject json = new JSONObject();
        json.put("a101", a101)
                .put("a102", a102)
                .put("a103", a103)
                .put("a104n", a104n)
                .put("a104c", a104c)
                .put("a105", a105)
                .put("a106", a106)
                .put("a107", a107)
                .put("a10796x", a10796x)
                .put("a108", a108)
                .put("a109", a109)
                .put("lhwphoto", lhwphoto)
                .put("secw2inst", secw2inst);
        return json.toString();
    }

    public String sBtoString() throws JSONException {
        Log.d(TAG, "sBtoString: ");
        JSONObject json = new JSONObject();
        json.put("b101", b101)
                .put("b102", b102)
                .put("b103", b103)
                .put("b10396x", b10396x)
                .put("b104", b104)
                .put("b107a", b107a)
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

    public String sH1toString() throws JSONException {
        Log.d(TAG, "sH1toString: ");
        JSONObject json = new JSONObject();
        json.put("h101", h101)
                .put("h102", h102)
                .put("h103", h103)
                .put("h104a", h104a)
                .put("h104b", h104b)
                .put("h104c", h104c)
                .put("h104d", h104d)
                .put("h104e", h104e)
                .put("h104f", h104f);
        return json.toString();
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

    public String sH3toString() throws JSONException {
        Log.d(TAG, "sH3toString: ");
        JSONObject json = new JSONObject();
        json.put("h301", h301)
                .put("h302", h302)
                .put("h303", h303)
                .put("h304d", h304d)
                .put("h304m", h304m)
                .put("h304y", h304y)
                .put("h305", h305)
                .put("h306", h306)
                .put("h307", h307)
                .put("h308", h308)
                .put("h309", h309);
        return json.toString();
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
                .put("w209", w209)
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
                .put("w302h", w302h)
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
                .put("w311i", w311i)
                .put("w31196", w31196)
                .put("w31196x", w31196x)
                .put("w312", w312)
                .put("w313", w313)
                .put("w31396x", w31396x);
        return json.toString();
    }

    public String sW4toString() throws JSONException {
        Log.d(TAG, "sW4toString: ");
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
                .put("w405n", w405n)
                .put("w406a", w406a)
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
                .put("w412j", w412j)
                .put("w413a", w413a)
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
                .put("w42096x", w42096x);
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
                .put("ab1105", ab1105)
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
                .put("m106d", m106d);
        return json.toString();
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(FormsTable.COLUMN_ID, this.id);
        json.put(FormsTable.COLUMN_UID, this.uid);
        json.put(FormsTable.COLUMN_CLUSTER, this.cluster);
        json.put(FormsTable.COLUMN_HHID, this.hhid);
        json.put(FormsTable.COLUMN_USERNAME, this.userName);
        json.put(FormsTable.COLUMN_SYSDATE, this.sysDate);
        json.put(FormsTable.COLUMN_DEVICEID, this.deviceId);
        json.put(FormsTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(FormsTable.COLUMN_ISTATUS, this.iStatus);
        //  json.put(FormsTable.COLUMN_SYNCED, this.synced);
        //  json.put(FormsTable.COLUMN_SYNCED_DATE, this.syncDate);

        // Household

        json.put(FormsTable.COLUMN_SA, new JSONObject(sAtoString()));
        json.put(FormsTable.COLUMN_SB, new JSONObject(sBtoString()));
        json.put(FormsTable.COLUMN_SC, new JSONObject(sCtoString()));
        json.put(FormsTable.COLUMN_SH1, new JSONObject(sH1toString()));
        json.put(FormsTable.COLUMN_SH2, new JSONObject(sH2toString()));
        json.put(FormsTable.COLUMN_SH3, new JSONObject(sH3toString()));
        json.put(FormsTable.COLUMN_SW1, new JSONObject(sW1toString()));
        json.put(FormsTable.COLUMN_SW2, new JSONObject(sW2toString()));
        json.put(FormsTable.COLUMN_SW3, new JSONObject(sW3toString()));
        json.put(FormsTable.COLUMN_SW4, new JSONObject(sW4toString()));
        json.put(FormsTable.COLUMN_SAB, new JSONObject(sABtoString()));
        json.put(FormsTable.COLUMN_SM, new JSONObject(sMtoString()));
        return json;
    }


}
