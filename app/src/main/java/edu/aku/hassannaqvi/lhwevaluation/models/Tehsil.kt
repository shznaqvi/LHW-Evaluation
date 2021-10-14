package edu.aku.hassannaqvi.lhwevaluation.models

import android.database.Cursor
import edu.aku.hassannaqvi.lhwevaluation.contracts.TableContracts.TehsilTable
import org.apache.commons.lang3.StringUtils
import org.json.JSONException
import org.json.JSONObject

class Tehsil {
    var ID: Long = 0
    var districtName: String = StringUtils.EMPTY
    var districtCode: String = StringUtils.EMPTY
    var tehsilName: String = StringUtils.EMPTY
    var tehsilCode: String = StringUtils.EMPTY
    var f6: String = StringUtils.EMPTY

    constructor() {
        // Default Constructor
    }

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): Tehsil {
        districtName = jsonObject.getString(TehsilTable.COLUMN_DISTRICT_NAME)
        districtCode = jsonObject.getString(TehsilTable.COLUMN_DISTRICT_CODE)
        tehsilName = jsonObject.getString(TehsilTable.COLUMN_TEHSIL_NAME)
        tehsilCode = jsonObject.getString(TehsilTable.COLUMN_TEHSIL_CODE)
        f6 = jsonObject.getString(TehsilTable.COLUMN_F6)
        return this
    }

    fun hydrate(cursor: Cursor): Tehsil {
        ID = cursor.getLong(cursor.getColumnIndexOrThrow(TehsilTable.COLUMN_ID))
        districtName =
            cursor.getString(cursor.getColumnIndexOrThrow(TehsilTable.COLUMN_DISTRICT_NAME))
        districtCode =
            cursor.getString(cursor.getColumnIndexOrThrow(TehsilTable.COLUMN_DISTRICT_CODE))
        tehsilName = cursor.getString(cursor.getColumnIndexOrThrow(TehsilTable.COLUMN_TEHSIL_NAME))
        tehsilCode = cursor.getString(cursor.getColumnIndexOrThrow(TehsilTable.COLUMN_TEHSIL_CODE))
        f6 = cursor.getString(cursor.getColumnIndexOrThrow(TehsilTable.COLUMN_F6))
        return this
    }

}