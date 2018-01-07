package com.chazo.bandanalysis.preference

import android.content.Context

/**
 * Created by Choi Jaeung on 2017-12-09.
 */
abstract class Pref(val context:Context) {
    val Auth:String = "authorization"
    val User:String = "User"

    abstract fun putString(key:String, content:String)
    abstract fun getString(key:String): String

}