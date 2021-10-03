package com.algokelvin.android.app_implement

import android.graphics.drawable.GradientDrawable
import android.os.Build
import android.os.Bundle
import android.view.Gravity
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val border = GradientDrawable()
        border.setColor(-0x1) //white background
        border.setStroke(5, -0x1000000) //black border with full opacity
        border.cornerRadius = 10.0f
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN) {
            btn_sample.setBackgroundDrawable(border)
        } else {
            btn_sample.setBackground(border)
        }
        btn_sample.gravity = Gravity.CENTER
        val paddingDp = 16
        val density = getResources().getDisplayMetrics().density
        val paddingPixel = (paddingDp * density).toInt()
        btn_sample.setPadding(0, paddingPixel, 0, paddingPixel)
    }
}