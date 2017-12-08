package com.chazo.bandanalysis.http

/**
 * Created by Choi Jaeung on 2017-12-08.
 */
class Authorization : APIAdapter() {
    private val CLIENT_ID = "221942680"
    private val CLIENT_SECRET = "3bbQqQ27gDG8w5RBDFMLundFyehVEQjT"
    private val URI = "https://com.chazo.bandanalysis/main/redirect"
    private val GRANT_TYPE = "authorization_code"

    fun getLoginUrl(): String = "https://auth.band.us/oauth2/authorize?response_type=code&client_id=$CLIENT_ID&redirect_uri=$URI"
}