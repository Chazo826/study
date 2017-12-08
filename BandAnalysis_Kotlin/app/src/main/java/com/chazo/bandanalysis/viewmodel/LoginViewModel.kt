package com.chazo.bandanalysis.viewmodel

import android.util.Log
import com.chazo.bandanalysis.LogTag
import com.chazo.bandanalysis.Navigator.CallActivityNavigator
import com.chazo.bandanalysis.http.Authorization

/**
 * Created by Choi Jaeung on 2017-12-07.
 */
class LoginViewModel(private var navigator: CallActivityNavigator) : ViewModel {
    var authorization: Authorization = Authorization()
    override fun onCreate() {
        Log.d(LogTag.DEFAULT.tag, "onCreate")
    }

    override fun onPause() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onResume() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onDestroy() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun onClickedLoginButton(){
        navigator.callActivityWithUrl(authorization.getLoginUrl())
        Log.d(LogTag.DEFAULT.tag, "onClick")
    }
}