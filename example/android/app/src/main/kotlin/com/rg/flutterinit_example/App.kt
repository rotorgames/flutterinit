package com.rg.flutterinit_example

import android.app.Application
import android.util.Log
import com.rg.flutterinit.FlutterInitBinding
import com.rg.flutterinit.FlutterInitRegister

class App : Application(), FlutterInitRegister {
    override fun setup(binding: FlutterInitBinding) {
        Log.v("FlutterInitRegister", "Registered")
    }
}