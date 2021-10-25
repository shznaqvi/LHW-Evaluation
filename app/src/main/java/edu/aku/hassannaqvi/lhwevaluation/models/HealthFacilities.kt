package edu.aku.hassannaqvi.smk_ce.models

import android.database.Cursor
import edu.aku.hassannaqvi.lhwevaluation.contracts.TableContracts.TableHealthFacilities
import org.apache.commons.lang3.StringUtils
import org.json.JSONObject

/**
 * Created by hussain.siddiqui on 01/06/2021.
 */

class HealthFacilities {
    var dist_id: String = StringUtils.EMPTY
    var uc_Id: String = StringUtils.EMPTY
    var hfCode: String = StringUtils.EMPTY
    var hfName: String = StringUtils.EMPTY

    fun sync(jsonObject: JSONObject): HealthFacilities {
        dist_id = jsonObject.getString(TableHealthFacilities.COLUMN_DIST_ID)
        hfCode = jsonObject.getString(TableHealthFacilities.COLUMN_HF_CODE)
        hfName = jsonObject.getString(TableHealthFacilities.COLUMN_HF_NAME)
        return this
    }

    fun hydrate(cursor: Cursor): HealthFacilities {
        dist_id = cursor.getString(cursor.getColumnIndexOrThrow(TableHealthFacilities.COLUMN_DIST_ID))
        hfCode = cursor.getString(cursor.getColumnIndexOrThrow(TableHealthFacilities.COLUMN_HF_CODE))
        hfName = cursor.getString(cursor.getColumnIndexOrThrow(TableHealthFacilities.COLUMN_HF_NAME))

        return this
    }


}