package edu.aku.hassannaqvi.smk_ce.models

import android.database.Cursor
import edu.aku.hassannaqvi.lhwevaluation.contracts.TableContracts.TableProvince
import org.apache.commons.lang3.StringUtils
import org.json.JSONObject

/**
 * Created by hussain.siddiqui on 01/06/2021.
 */

class Province {
    var province: String = StringUtils.EMPTY
    var pro_Id: String = StringUtils.EMPTY

    fun sync(jsonObject: JSONObject): Province {
        province = jsonObject.getString(TableProvince.COLUMN_PROVINCE)
        pro_Id = jsonObject.getString(TableProvince.COLUMN_PRO_ID)
        return this
    }

    fun hydrate(cursor: Cursor): Province {
        province = cursor.getString(cursor.getColumnIndexOrThrow(TableProvince.COLUMN_PROVINCE))
        pro_Id = cursor.getString(cursor.getColumnIndexOrThrow(TableProvince.COLUMN_PRO_ID))

        return this
    }


}