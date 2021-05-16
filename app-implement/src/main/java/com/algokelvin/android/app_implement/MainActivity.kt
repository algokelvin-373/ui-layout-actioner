package com.algokelvin.android.app_implement

import android.graphics.Typeface
import android.os.Bundle
import android.view.Gravity
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import ui.algokelvin.uiview.ConstMethod.setTextStylish

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUI()
    }
    private fun setUI() {
        txt_sample.setTextStylish(this, 20f, R.color.purple_500, Gravity.CENTER, Typeface.DEFAULT_BOLD)
        txt_sample02.setTextStylish(this, null, R.color.purple_500, Gravity.CENTER, Typeface.DEFAULT_BOLD)
        txt_sample03.setTextStylish(this, 18f, R.color.purple_500, null, null)
    }
}