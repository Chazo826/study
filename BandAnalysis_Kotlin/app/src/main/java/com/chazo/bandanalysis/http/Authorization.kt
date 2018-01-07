package com.chazo.bandanalysis.http

import android.util.Log
import com.chazo.bandanalysis.LogTag
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.IOException
import com.chazo.bandanalysis.http.BandService.AuthService

import java.util.logging.Logger

/**
 * Created by Choi Jaeung on 2017-12-08.
 */
class Authorization : APIAdapter() {
    private val BASE_URL = "https://auth.band.us/"
    private val CLIENT_ID = "221942680"
    private val CLIENT_SECRET = "3bbQqQ27gDG8w5RBDFMLundFyehVEQjT"
    private val URI = "https://com.chazo.bandanalysis/main/redirect"
    private val GRANT_TYPE = "authorization_code"

    private val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    fun getLoginUrl(): String = "https://auth.band.us/oauth2/authorize?response_type=code&client_id=$CLIENT_ID&redirect_uri=$URI"

    private fun requestAccessToken(authorizationCode: String) {
        val service = retrofit.create(AuthService::class.java)
        val call = service.getAccessToken(
                "Basic " + getBase64encode(CLIENT_ID + ":" + CLIENT_SECRET),
                GRANT_TYPE,
                authorizationCode)

        call.enqueue(object : Callback<JsonObject> {
            override fun onResponse(call: Call<JsonObject>, response: Response<JsonObject>) {
                try {
                    if (response.isSuccessful) {

                    } else {
                        Log.d(LogTag.RETROFIT.tag, "result code: $response.code()\n$response.errorBody()!!.string()")
                    }
                } catch (e: IOException) {
                    e.printStackTrace()
                }

            }

            override fun onFailure(call: Call<JsonObject>, t: Throwable) {
                t.printStackTrace()
            }
        })
    }

}