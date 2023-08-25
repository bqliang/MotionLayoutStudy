package com.bqliang.motionlayout.study

import android.content.Context
import android.content.Intent

inline fun <reified T> Context.launchActivity() {
    val intent = Intent(this, T::class.java)
    startActivity(intent)
}