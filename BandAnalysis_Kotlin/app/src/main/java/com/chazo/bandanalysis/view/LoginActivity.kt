package com.chazo.bandanalysis.view

import android.content.Intent
import android.databinding.DataBindingUtil
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.chazo.bandanalysis.navigator.CallActivityNavigator
import com.chazo.bandanalysis.R
import com.chazo.bandanalysis.databinding.LoginBinding
import com.chazo.bandanalysis.viewmodel.LoginViewModel

class LoginActivity : AppCompatActivity(), CallActivityNavigator{

    private val loginViewModel: LoginViewModel = LoginViewModel(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: LoginBinding = DataBindingUtil.setContentView(this, R.layout.login)
        binding.viewModel = loginViewModel
        loginViewModel.onCreate()
    }

    override fun callActivityWithUrl(url: String) {
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        finish()
    }
}
