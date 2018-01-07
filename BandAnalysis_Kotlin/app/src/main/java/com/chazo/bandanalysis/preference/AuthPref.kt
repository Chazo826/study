package com.chazo.bandanalysis.preference

import android.content.Context
import android.content.SharedPreferences

/**
 * Created by Choi Jaeung on 2017-12-09.
 */
class AuthPref : Pref {
    private val preference: SharedPreferences
    constructor(context: Context) : super(context){
        this.preference = context.getSharedPreferences(Auth, Context.MODE_PRIVATE)
    }



    override fun putString(key: String, content: String) {
        preference.edit().putString(key, content).apply()
    }

    override fun getString(key: String): String = preference.getString(key, null)
}