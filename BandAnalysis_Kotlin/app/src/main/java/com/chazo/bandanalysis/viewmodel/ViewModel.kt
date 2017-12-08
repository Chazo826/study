package com.chazo.bandanalysis.viewmodel

/**
 * Created by Choi Jaeung on 2017-12-07.
 */
interface ViewModel {
    fun onCreate()
    fun onPause()
    fun onResume()
    fun onDestroy()
}