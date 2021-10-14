package edu.aku.hassannaqvi.lhwevaluation.models

import android.database.Cursor
import edu.aku.hassannaqvi.lhwevaluation.contracts.TableContracts.DistrictTable
import org.apache.commons.lang3.StringUtils
import org.json.JSONException
import org.json.JSONObject

class District {
    var ID: Long = 0
    var provinceName: String = StringUtils.EMPTY
    var provinceCode: String = StringUtils.EMPTY
    var districtName: String = StringUtils.EMPTY
    var districtCode: String = StringUtils.EMPTY

    constructor() {
        // Default Constructor
    }

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): District {
        provinceName = jsonObject.getString(DistrictTable.COLUMN_PROVINCE_NAME)
        provinceCode = jsonObject.getString(DistrictTable.COLUMN_PROVINCE_CODE)
        districtName = jsonObject.getString(DistrictTable.COLUMN_DISTRICT_NAME)
        districtCode = jsonObject.getString(DistrictTable.COLUMN_DISTRICT_CODE)
        return this
    }

    fun hydrate(cursor: Cursor): District {
        ID = cursor.getLong(cursor.getColumnIndexOrThrow(DistrictTable.COLUMN_ID))
        provinceName =
            cursor.getString(cursor.getColumnIndexOrThrow(DistrictTable.COLUMN_PROVINCE_NAME))
        provinceCode =
            cursor.getString(cursor.getColumnIndexOrThrow(DistrictTable.COLUMN_PROVINCE_CODE))
        districtName =
            cursor.getString(cursor.getColumnIndexOrThrow(DistrictTable.COLUMN_DISTRICT_NAME))
        districtCode =
            cursor.getString(cursor.getColumnIndexOrThrow(DistrictTable.COLUMN_DISTRICT_CODE))
        return this
    }

}