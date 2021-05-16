package com.algokelvin.android.app_implement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.algokelvin.android.app_implement.R
import ui.algokelvin.uiview.ConstVal
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt_sample.text = ConstVal.TAG
    }
}