package com.chazo.bandanalysis.http

import android.util.Base64

/**
 * Created by Choi Jaeung on 2017-12-08.
 */
open class APIAdapter{


    fun getBase64encode(content: String): String {
        return Base64.encodeToString(content.toByteArray(), Base64.NO_WRAP)
    }

}