package com.chazo.bandanalysis.http

import com.google.gson.JsonObject
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

/**
 * Created by Choi Jaeung on 2017-12-07.
 */
interface BandService {
    interface AuthService{
        //baseUrl = https://auth.band.us/
        @GET("oauth/token")
        fun getAccessToken(
                @Header("Authorization") authorization: String,
                @Query("grant_type") grantType: String,
                @Query("code") code: String): Call<JsonObject>
    }

    interface UserService{
        @GET("v2/profile")
        fun getUserProfile(@Query("access_token") accessToken : String) : Call<JsonObject>
    }
}