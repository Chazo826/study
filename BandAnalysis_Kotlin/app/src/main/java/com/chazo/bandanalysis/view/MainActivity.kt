package com.chazo.bandanalysis.view

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.chazo.bandanalysis.LogTag
import com.chazo.bandanalysis.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        var uri: Uri = intent.data
        Log.d(LogTag.DEFAULT.tag, uri.toString())
        Log.d(LogTag.DEFAULT.tag, uri.getQueryParameter("code"))


        
    }
}
