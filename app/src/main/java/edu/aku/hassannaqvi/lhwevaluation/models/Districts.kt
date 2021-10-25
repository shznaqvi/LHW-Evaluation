package edu.aku.hassannaqvi.smk_ce.models

import android.database.Cursor
import edu.aku.hassannaqvi.lhwevaluation.contracts.TableContracts.TableDistricts
import org.apache.commons.lang3.StringUtils
import org.json.JSONObject

/**
 * Created by hassan.naqvi on 10/31/2016.
 * @update ali.azaz
 */
class Districts {
    var districtCode: String = StringUtils.EMPTY
    var districtName: String = StringUtils.EMPTY

    fun sync(jsonObject: JSONObject): Districts {
        districtCode = jsonObject.getString(TableDistricts.COLUMN_DISTRICT_CODE)
        districtName = jsonObject.getString(TableDistricts.COLUMN_DISTRICT_NAME)
        return this
    }

    fun hydrate(cursor: Cursor): Districts {
        districtCode = cursor.getString(cursor.getColumnIndexOrThrow(TableDistricts.COLUMN_DISTRICT_CODE))
        districtName = cursor.getString(cursor.getColumnIndexOrThrow(TableDistricts.COLUMN_DISTRICT_NAME))
        return this
    }


}