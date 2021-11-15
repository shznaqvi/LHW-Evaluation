package edu.aku.hassannaqvi.lhwevaluation.models

import android.database.Cursor
import edu.aku.hassannaqvi.lhwevaluation.contracts.TableContracts.TableTehsil
import org.apache.commons.lang3.StringUtils
import org.json.JSONObject

/**
 * Created by hussain.siddiqui on 01/06/2021.
 */

class Tehsil {
    var tehsilCode: String = StringUtils.EMPTY
    var tehsilName: String = StringUtils.EMPTY
    var dist_id: String = StringUtils.EMPTY

    fun sync(jsonObject: JSONObject): Tehsil {
        tehsilCode = jsonObject.getString(TableTehsil.COLUMN_TEHSIL_CODE)
        tehsilName = jsonObject.getString(TableTehsil.COLUMN_TEHSIL_NAME)
        dist_id = jsonObject.getString(TableTehsil.COLUMN_DIST_ID)
        return this
    }

    fun hydrate(cursor: Cursor): Tehsil {
        tehsilCode = cursor.getString(cursor.getColumnIndexOrThrow(TableTehsil.COLUMN_TEHSIL_CODE))
        tehsilName = cursor.getString(cursor.getColumnIndexOrThrow(TableTehsil.COLUMN_TEHSIL_NAME))
        dist_id = cursor.getString(cursor.getColumnIndexOrThrow(TableTehsil.COLUMN_DIST_ID))
        return this
    }


}