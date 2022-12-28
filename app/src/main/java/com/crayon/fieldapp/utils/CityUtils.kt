package com.crayon.fieldapp.utils

import android.content.Context
import com.crayon.fieldapp.data.model.SimpleModel
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException
import java.nio.charset.Charset


object CityUtils {
    /**
     * convert CityCode to City Name
     */
    fun convertCodeToCityName(mContext: Context, code: String): String {
        try {
            val obj = JSONArray(loadCityFromAsset(mContext))
            for (i in 0..obj.length() - 1) {
                val city = obj.getJSONObject(i)
                if (city.getString("code").equals(code)) {
                    return city.getString("name")
                }
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return "Chưa rõ Tỉnh/Thành Phố"
    }

    /**
     * convert Code to District Name
     */
    fun convertCodeToDistrictName(
        mContext: Context,
        cityCode: String,
        districtCode: String
    ): String {
        try {
            val obj = JSONArray(loadDistrictFromAsset(mContext, cityCode))
            for (i in 0..obj.length() - 1) {
                val district = obj.getJSONObject(i)
                if (district.getString("code").equals(districtCode)) {
                    return district.getString("name")
                }
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return "Chưa rõ Phường/Xã"
    }

    fun getAllCity(mContext: Context): ArrayList<SimpleModel> {
        var cities = ArrayList<SimpleModel>()
        try {
            val obj = JSONObject(loadCityFromAsset(mContext))
            val provinceIds = obj.keys()
            provinceIds.forEach { index ->
                val city = obj.getJSONObject(index)
                cities.add(SimpleModel(
                    id = index,
                    name = city.getString("name")
                ))
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return cities
    }

    fun getAllDistrictOfCity(mContext: Context, cityCode: String): ArrayList<SimpleModel> {
        var listDistrict = ArrayList<SimpleModel>()
        try {
            val obj = JSONObject(loadCityFromAsset(mContext))
            val provinceItem = obj.getJSONObject(cityCode)
            val districts = provinceItem.getJSONObject("districts")
            val districtIds = districts.keys()
            districtIds.forEach { index ->
                listDistrict.add(SimpleModel(
                    id = index,
                    name = districts.getString(index)
                ))

            }

        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return listDistrict
    }

    fun getAllBank(mContext: Context): ArrayList<SimpleModel> {
        var banks = ArrayList<SimpleModel>()
        try {
            val obj = JSONArray(loadBankFromAsset(mContext))
            for (i in 0..obj.length() - 1) {
                val bank = obj.getJSONObject(i)
                banks.add(SimpleModel(bank.getString("name"), bank.getString("code")))
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return banks
    }

    private fun loadCityFromAsset(context: Context): String {
        var json: String? = null
        try {
            val inputStream = context.getAssets().open("vietnam_city.json")
            val size = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            inputStream.close()
            json = String(buffer, Charset.defaultCharset())
        } catch (ex: IOException) {
            ex.printStackTrace()
            return ""
        }

        return json
    }

    private fun loadDistrictFromAsset(context: Context, cityCode: String): String {
        var json: String? = null
        try {

            val inputStream = context.getAssets().open("vietnam_city.json")
            val size = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            inputStream.close()
            json = String(buffer, Charset.defaultCharset())
        } catch (ex: IOException) {
            ex.printStackTrace()
            return ""
        }

        return json
    }

    private fun loadBankFromAsset(context: Context): String {
        var json: String? = null
        try {
            val inputStream = context.getAssets().open("banks/banks.json")
            val size = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            inputStream.close()
            json = String(buffer, Charset.defaultCharset())
        } catch (ex: IOException) {
            ex.printStackTrace()
            return ""
        }

        return json
    }
}
