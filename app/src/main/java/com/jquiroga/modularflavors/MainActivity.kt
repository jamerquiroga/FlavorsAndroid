package com.jquiroga.modularflavors

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.jquiroga.samplelibrary.CoreConstants
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvWelcomeMessage.text = Constants.FLAVOR_NAME

        tvSampleValueLibrary.text = CoreConstants.SAMPLE_VALUE

        tvFlavorLibrary.text = CoreConstants.LIBRARY_FLAVOR

    }
}
