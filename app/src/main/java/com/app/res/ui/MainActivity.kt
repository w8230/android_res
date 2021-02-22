package com.app.res.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.res.R

/**
* Main Activity
* @author 김재일 <Jerry Kim>
* @version 1.0.0
* @since 2021년 02월 22일 7:49 PM
**/
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}