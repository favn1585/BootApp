package com.boot.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        // TODO inject DataRepository and fetch all boot events + run recurring job

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}