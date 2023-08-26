package com.bqliang.motionlayout.study

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bqliang.motionlayout.study.databinding.ActivityBasicMotionLayoutBinding

class BasicMotionLayoutActivity : AppCompatActivity() {

    private val binding: ActivityBasicMotionLayoutBinding by lazy {
        ActivityBasicMotionLayoutBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}