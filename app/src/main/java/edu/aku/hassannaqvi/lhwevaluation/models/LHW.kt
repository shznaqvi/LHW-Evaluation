package edu.aku.hassannaqvi.lhwevaluation.models

import android.database.Cursor
import edu.aku.hassannaqvi.lhwevaluation.contracts.TableContracts.TableLhw
import org.apache.commons.lang3.StringUtils
import org.json.JSONObject

/**
 * Created by hussain.siddiqui on 01/06/2021.
 */

class LHW {
    var hf_Code: String = StringUtils.EMPTY
    var lhw_Name: String = StringUtils.EMPTY
    var lhw_Code: String = StringUtils.EMPTY

    fun sync(jsonObject: JSONObject): LHW {
        hf_Code = jsonObject.getString(TableLhw.COLUMN_HF_CODE)
        lhw_Name = jsonObject.getString(TableLhw.COLUMN_LHW_NAME)
        lhw_Code = jsonObject.getString(TableLhw.COLUMN_LHW_CODE)
        return this
    }

    fun hydrate(cursor: Cursor): LHW {
        hf_Code = cursor.getString(cursor.getColumnIndexOrThrow(TableLhw.COLUMN_HF_CODE))
        lhw_Name = cursor.getString(cursor.getColumnIndexOrThrow(TableLhw.COLUMN_LHW_NAME))
        lhw_Code = cursor.getString(cursor.getColumnIndexOrThrow(TableLhw.COLUMN_LHW_CODE))

        return this
    }


}