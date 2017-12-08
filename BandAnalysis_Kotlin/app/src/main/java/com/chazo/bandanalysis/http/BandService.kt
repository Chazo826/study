package com.chazo.bandanalysis.http

import com.google.gson.JsonObject
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Choi Jaeung on 2017-12-07.
 */
interface BandService {
    interface UserService{
        @GET("v2/profile")
        fun getUserProfile(@Query("access_token") accessToken : String) : Call<JsonObject>
    }
}