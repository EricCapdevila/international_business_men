package com.example.international_business_men.views.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.international_business_men.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // observe viewModel.dataHandler and viewModel.errorHandler
}