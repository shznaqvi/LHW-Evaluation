package edu.aku.hassannaqvi.lhwevaluation.models;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

import android.database.Cursor;
import android.util.Log;
import android.widget.Switch;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.PropertyChangeRegistry;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.lhwevaluation.BR;
import edu.aku.hassannaqvi.lhwevaluation.contracts.TableContracts;
import edu.aku.hassannaqvi.lhwevaluation.contracts.TableContracts.FamilyMembersTable;
import edu.aku.hassannaqvi.lhwevaluation.core.MainApp;

public class FamilyMembers extends BaseObservable {

    private final String TAG = "FamilyMembers";
    private transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    //Not saving in DB
    private final LocalDate localDate = null;
    private final boolean exist = false;
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = StringUtils.EMPTY;
    private String uid = StringUtils.EMPTY;
    private String uuid = StringUtils.EMPTY;
    private final String lhwuid = StringUtils.EMPTY;
    private String distCode = StringUtils.EMPTY;
    private String userName = StringUtils.EMPTY;
    private String sysDate = StringUtils.EMPTY;
    private String lhwCode = StringUtils.EMPTY;
    private String kNo = StringUtils.EMPTY;
    private String deviceId = StringUtils.EMPTY;
    private String deviceTag = StringUtils.EMPTY;
    private String appver = StringUtils.EMPTY;
    private String endTime = StringUtils.EMPTY;
    private String iStatus = StringUtils.EMPTY;
    private String iStatus96x = StringUtils.EMPTY;
    private String synced = StringUtils.EMPTY;
    private String syncDate = StringUtils.EMPTY;
    private String sno = StringUtils.EMPTY;
    // SECTION VARIABLES
    private String sH3 = StringUtils.EMPTY;
    // FIELD VARIABLES
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
    private String memCate = StringUtils.EMPTY;
    private boolean expanded;
    private boolean mwra;
   // private String indexed;


    public FamilyMembers() {

        setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setAppver(MainApp.appInfo.getAppVersion());
        setAppver(MainApp.appInfo.getAppVersion());
        setDistCode(MainApp.hhForm.getDistrict());


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

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    @Bindable
    public String getLhwCode() {
        return lhwCode;
    }

    public void setLhwCode(String lhwCode) {
        this.lhwCode = lhwCode;
        notifyChange(BR.lhwCode);
    }

    @Bindable
    public String getkNo() {
        return kNo;
    }

    public void setkNo(String kNo) {
        this.kNo = kNo;
        notifyChange(BR.kNo);
    }

    @Bindable
    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
        notifyChange(BR.expanded);
    }

    public String getDistCode() {
        return distCode;
    }

    public void setDistCode(String distCode) {
        this.distCode = distCode;
    }

    @Bindable
    public boolean isMwra() {
        return mwra;
    }

    public void setMwra(boolean mwra) {
        this.mwra = mwra;

        notifyChange(BR.mwra);
    }

    public String getMemCate() {
        return memCate;
    }

    public void setMemCate(String memCate) {
        this.memCate = memCate;
       // notifyChange(BR.memCate);
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

    public String getsH3() {
        return sH3;
    }

    public void setsH3(String sH3) {
        this.sH3 = sH3;
    }

    @Bindable
    public String getH301() {
        return h301;
    }

    public void setH301(String h301) {
        this.h301 = h301;
        setSno(h301);
        notifyChange(BR.h301);
    }

    @Bindable
    public String getH302() {
        return h302;
    }

    public void setH302(String h302) {
        this.h302 = h302;
        notifyChange(BR.h302);
    }

    @Bindable
    public String getH303() {
        return h303;
    }

    public void setH303(String h303) {
        this.h303 = h303;
        notifyChange(BR.h303);
        updateMemCategory();
    }

    @Bindable
    public String getH304d() {
        return h304d;
    }

    public void setH304d(String h304d) {
        this.h304d = h304d;
        CaluculateAge();
        notifyChange(BR.h304d);
    }

    @Bindable
    public String getH304m() {
        return h304m;
    }

    public void setH304m(String h304m) {
        this.h304m = h304m;
        if (h304m.equals("98")) {
            setH304d("98");
        }
        notifyChange(BR.h304m);
        CaluculateAge();
    }

    @Bindable
    public String getH304y() {
        return h304y;
    }

    public void setH304y(String h304y) {
        this.h304y = h304y;

        if (h304y.equals("9998")) {
            setH304m("98");
            setH305("");
        }
        // Calculate age
        CaluculateAge();
        notifyChange(BR.h304y);
    }

    @Bindable
    public String getH305() {
        return h305;
    }

    public void setH305(String h305) {
        this.h305 = h305;
        notifyChange(BR.h305);
        updateMemCategory();
    }

    @Bindable
    public String getH306() {
        return h306;
    }

    public void setH306(String h306) {
        this.h306 = h306;
        notifyChange(BR.h306);
        updateMemCategory();
    }

    @Bindable
    public String getH307() {
        return h307;
    }

    public void setH307(String h307) {
        this.h307 = h307;
        setH308(h307.equals("2") ? this.h308 : "");
        notifyChange(BR.h307);
    }

    @Bindable
    public String getH308() {
        return h308;
    }

    public void setH308(String h308) {
        this.h308 = h308;
        notifyChange(BR.h308);
    }

    @Bindable
    public String getH309() {
        return h309;
    }

    public void setH309(String h309) {
        this.h309 = h309;
        notifyChange(BR.h309);
        updateMemCategory();
    }

    public FamilyMembers Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.FamilyMembersTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.FamilyMembersTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_UUID));
        this.lhwCode = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_LHW_CODE));
        this.distCode = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_DISTRICT));
        this.kNo = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.FamilyMembersTable.COLUMN_KHANDAN_NO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.FamilyMembersTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_SYSDATE));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_SNO));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.FamilyMembersTable.COLUMN_SYNCED_DATE));

        sH3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.FamilyMembersTable.COLUMN_SH3)));

        return this;
    }

    public void sH3Hydrate(String string) throws JSONException {
        Log.d(TAG, "sA2Hydrate: " + string);
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

            updateMemCategory();
        }
    }


    public JSONObject toJSONObject() {

        JSONObject json = new JSONObject();

        try {
            json.put(TableContracts.FamilyMembersTable.COLUMN_ID, this.id);
            json.put(TableContracts.FamilyMembersTable.COLUMN_UID, this.uid);
            json.put(TableContracts.FamilyMembersTable.COLUMN_UUID, this.uuid);
            json.put(TableContracts.FamilyMembersTable.COLUMN_LHW_CODE, this.lhwCode);
            json.put(TableContracts.FamilyMembersTable.COLUMN_KHANDAN_NO, this.kNo);
            json.put(TableContracts.FamilyMembersTable.COLUMN_USERNAME, this.userName);
            json.put(TableContracts.FamilyMembersTable.COLUMN_SYSDATE, this.sysDate);
            json.put(TableContracts.FamilyMembersTable.COLUMN_DEVICEID, this.deviceId);
            json.put(TableContracts.FamilyMembersTable.COLUMN_DEVICETAGID, this.deviceTag);
            json.put(TableContracts.FamilyMembersTable.COLUMN_ISTATUS, this.iStatus);
            json.put(FamilyMembersTable.COLUMN_DISTRICT, this.distCode);
            json.put(FamilyMembersTable.COLUMN_SNO, this.sno);
            json.put(FamilyMembersTable.COLUMN_APPVERSION, this.appver);
            //  json.put(FamilyMembersTable.COLUMN_SYNCED, this.synced);
            //  json.put(FamilyMembersTable.COLUMN_SYNCED_DATE, this.syncDate);

            json.put(FamilyMembersTable.COLUMN_SH3, new JSONObject(sH3toString()));
            return json;
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, "toJSONObject: " + e.getMessage());
            return null;
        }
    }

    public String sH3toString() throws JSONException {
        Log.d(TAG, "sA2toString: ");
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


    private void CaluculateAge() {
        Log.d(TAG, "CaluculateAge: " + this.h304y + "-" + this.h304m + "-" + this.h304d);

        if (!this.h304y.equals("") && !this.h304y.equals("9998") && !this.h304m.equals("") && !this.h304d.equals("")) {

            int day = !this.h304d.equals("98") ? Integer.parseInt(this.h304d) : 15;
            int month = !this.h304m.equals("98") ? Integer.parseInt(this.h304m) : 6;
            int year = Integer.parseInt(this.h304y);

            SimpleDateFormat df = new SimpleDateFormat("yyyy MM dd", Locale.ENGLISH);
            String todayDate = df.format(Calendar.getInstance().getTime());
            Calendar cal = Calendar.getInstance();
            Calendar cur = Calendar.getInstance();

            try {
                cal.setTime(df.parse(year + " " + month + " " + day));
                long millis = System.currentTimeMillis() - cal.getTimeInMillis();
                cal.setTimeInMillis(millis);

             /*   int mYear = cal.get(Calendar.YEAR)-1970;
                int mMonth = cal.get(Calendar.MONTH);
                int mDay = cal.get(Calendar.DAY_OF_MONTH)-1;

                Log.d(TAG, "CaluculateAge: " + (mYear) + "-" + mMonth + "-" + mDay);
*/
                long tYear = MILLISECONDS.toDays(millis) / 365;
                long tMonth = (MILLISECONDS.toDays(millis) - (tYear * 365)) / 30;
                long tDay = MILLISECONDS.toDays(millis) - ((tYear * 365) + (tMonth * 30));

                Log.d(TAG, "CaluculateAge: Y-" + tYear + " M-" + tMonth + " D-" + tDay);
               /* setH231d(String.valueOf(tDay));
                setH231m(String.valueOf(tMonth));*/
                setH305(String.valueOf(tYear));
                //setAge(String.valueOf(((tYear) * 12) + tMonth));


        /*        String.format("%d min, %d sec",
                        ,
                        TimeUnit.MILLISECONDS.toSeconds(millis) -
                                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis))
                );*/

            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
    }



    /**
     * Memeber Categories:
     * 1 = MWRA
     * 2 = Adolescent
     * 3 = Male > 19y
     */
    private void updateMemCategory() {
        if (getH303().equals("") || getH305().equals("") || getH306().equals("") || getH309().equals(""))
            return;
        String memGender = getH303();
        String memMaritalStatus = getH306();
        String memStatus = getH309();
        int memAge = Integer.parseInt(getH305());



        switch(memGender)
        {
            // Male
            case "1":
                if(memAge > 19 && (memStatus.equals("1"))) {
                setMemCate("3");
                }else if((memAge >= 10 && memAge <= 19          // 10 to 19 year old Adolescent
                         && memStatus.equals("1"))) {
                    setMemCate("2");
                }
                else{
                    setMemCate("");
                }

                break;

            case  "2":
                // Unmarried Adolescent girl
                if(memMaritalStatus.equals("2")){
                    if((memAge >= 10 && memAge <= 19   // 15 to 49 year old Unmarried girl
                            && memStatus.equals("1"))) {
                        setMemCate("2");
                    }else{
                        setMemCate("");
                    }
                // MWRA
                }else if ((memAge >= 15 && memAge <= 49)
                    && memStatus.equals("1")) {

                    setMemCate("1");
                }else{
                    setMemCate("");
                }

                    break;

        }
    }

    private synchronized void notifyChange(int propertyId) {
        if (propertyChangeRegistry == null) {
            propertyChangeRegistry = new PropertyChangeRegistry();
        }
        propertyChangeRegistry.notifyChange(this, propertyId);
    }

    @Override
    public synchronized void addOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        if (propertyChangeRegistry == null) {
            propertyChangeRegistry = new PropertyChangeRegistry();
        }
        propertyChangeRegistry.add(callback);

    }

    @Override
    public synchronized void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        if (propertyChangeRegistry != null) {
            propertyChangeRegistry.remove(callback);
        }
    }

}
