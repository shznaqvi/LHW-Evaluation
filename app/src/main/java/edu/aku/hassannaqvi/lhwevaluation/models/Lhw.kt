package edu.aku.hassannaqvi.lhwevaluation.models

import android.database.Cursor
import edu.aku.hassannaqvi.lhwevaluation.contracts.TableContracts.LhwTable
import org.apache.commons.lang3.StringUtils
import org.json.JSONException
import org.json.JSONObject

class Lhw {
    var ID: Long = 0
    var tehsilName: String = StringUtils.EMPTY
    var tehsilCode: String = StringUtils.EMPTY
    var ucName: String = StringUtils.EMPTY
    var ucCode: String = StringUtils.EMPTY
    var hfName: String = StringUtils.EMPTY
    var hfCode: String = StringUtils.EMPTY
    var lhwName: String = StringUtils.EMPTY
    var lhwCode: String = StringUtils.EMPTY
    var lhwCnic: String = StringUtils.EMPTY
    var lhwSupervisor: String = StringUtils.EMPTY

    constructor() {
        // Default Constructor
    }

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): Lhw {
        tehsilName = jsonObject.getString(LhwTable.COLUMN_TEHSIL_NAME)
        tehsilCode = jsonObject.getString(LhwTable.COLUMN_TEHSIL_CODE)
        ucName = jsonObject.getString(LhwTable.COLUMN_UC_NAME)
        ucCode = jsonObject.getString(LhwTable.COLUMN_UC_CODE)
        hfName = jsonObject.getString(LhwTable.COLUMN_HF_NAME)
        hfCode = jsonObject.getString(LhwTable.COLUMN_HF_CODE)
        lhwName = jsonObject.getString(LhwTable.COLUMN_LHW_NAME)
        lhwCode = jsonObject.getString(LhwTable.COLUMN_LHW_CODE)
        lhwCnic = jsonObject.getString(LhwTable.COLUMN_LHW_CNIC)
        lhwSupervisor = jsonObject.getString(LhwTable.COLUMN_LHW_SUPERVISOR)
        return this
    }

    fun hydrate(cursor: Cursor): Lhw {
        ID = cursor.getLong(cursor.getColumnIndexOrThrow(LhwTable.COLUMN_ID))
        tehsilName = cursor.getString(cursor.getColumnIndexOrThrow(LhwTable.COLUMN_TEHSIL_NAME))
        tehsilCode = cursor.getString(cursor.getColumnIndexOrThrow(LhwTable.COLUMN_TEHSIL_CODE))
        ucName = cursor.getString(cursor.getColumnIndexOrThrow(LhwTable.COLUMN_UC_NAME))
        ucCode = cursor.getString(cursor.getColumnIndexOrThrow(LhwTable.COLUMN_UC_CODE))
        hfName = cursor.getString(cursor.getColumnIndexOrThrow(LhwTable.COLUMN_HF_NAME))
        hfCode = cursor.getString(cursor.getColumnIndexOrThrow(LhwTable.COLUMN_HF_CODE))
        lhwName = cursor.getString(cursor.getColumnIndexOrThrow(LhwTable.COLUMN_LHW_NAME))
        lhwCode = cursor.getString(cursor.getColumnIndexOrThrow(LhwTable.COLUMN_LHW_CODE))
        lhwCnic = cursor.getString(cursor.getColumnIndexOrThrow(LhwTable.COLUMN_LHW_CNIC))
        lhwSupervisor =
            cursor.getString(cursor.getColumnIndexOrThrow(LhwTable.COLUMN_LHW_SUPERVISOR))
        return this
    }

}