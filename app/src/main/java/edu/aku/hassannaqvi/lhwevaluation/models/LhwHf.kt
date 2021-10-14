package edu.aku.hassannaqvi.lhwevaluation.models

import android.database.Cursor
import edu.aku.hassannaqvi.lhwevaluation.contracts.TableContracts.LhwHfTable
import org.apache.commons.lang3.StringUtils
import org.json.JSONException
import org.json.JSONObject

class LhwHf {
    var ID: Long = 0
    var provinceName: String = StringUtils.EMPTY
    var provinceCode: String = StringUtils.EMPTY
    var districtName: String = StringUtils.EMPTY
    var districtCode: String = StringUtils.EMPTY
    var tehsilName: String = StringUtils.EMPTY
    var tehsilCode: String = StringUtils.EMPTY
    var ucName: String = StringUtils.EMPTY
    var ucCode: String = StringUtils.EMPTY
    var hfName: String = StringUtils.EMPTY
    var hfCode: String = StringUtils.EMPTY

    constructor() {
        // Default Constructor
    }

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): LhwHf {
        provinceName = jsonObject.getString(LhwHfTable.COLUMN_PROVINCE_NAME)
        provinceCode = jsonObject.getString(LhwHfTable.COLUMN_PROVINCE_CODE)
        districtName = jsonObject.getString(LhwHfTable.COLUMN_DISTRICT_NAME)
        districtCode = jsonObject.getString(LhwHfTable.COLUMN_DISTRICT_CODE)
        tehsilName = jsonObject.getString(LhwHfTable.COLUMN_TEHSIL_NAME)
        tehsilCode = jsonObject.getString(LhwHfTable.COLUMN_TEHSIL_CODE)
        ucName = jsonObject.getString(LhwHfTable.COLUMN_UC_NAME)
        ucCode = jsonObject.getString(LhwHfTable.COLUMN_UC_CODE)
        hfName = jsonObject.getString(LhwHfTable.COLUMN_HF_NAME)
        hfCode = jsonObject.getString(LhwHfTable.COLUMN_HF_CODE)
        return this
    }

    fun hydrate(cursor: Cursor): LhwHf {
        ID = cursor.getLong(cursor.getColumnIndexOrThrow(LhwHfTable.COLUMN_ID))
        provinceName =
            cursor.getString(cursor.getColumnIndexOrThrow(LhwHfTable.COLUMN_PROVINCE_NAME))
        provinceCode =
            cursor.getString(cursor.getColumnIndexOrThrow(LhwHfTable.COLUMN_PROVINCE_CODE))
        districtName =
            cursor.getString(cursor.getColumnIndexOrThrow(LhwHfTable.COLUMN_DISTRICT_NAME))
        districtCode =
            cursor.getString(cursor.getColumnIndexOrThrow(LhwHfTable.COLUMN_DISTRICT_CODE))
        tehsilName = cursor.getString(cursor.getColumnIndexOrThrow(LhwHfTable.COLUMN_TEHSIL_NAME))
        tehsilCode = cursor.getString(cursor.getColumnIndexOrThrow(LhwHfTable.COLUMN_TEHSIL_CODE))
        ucName = cursor.getString(cursor.getColumnIndexOrThrow(LhwHfTable.COLUMN_UC_NAME))
        ucCode = cursor.getString(cursor.getColumnIndexOrThrow(LhwHfTable.COLUMN_UC_CODE))
        hfName = cursor.getString(cursor.getColumnIndexOrThrow(LhwHfTable.COLUMN_HF_NAME))
        hfCode = cursor.getString(cursor.getColumnIndexOrThrow(LhwHfTable.COLUMN_HF_CODE))
        return this
    }

}