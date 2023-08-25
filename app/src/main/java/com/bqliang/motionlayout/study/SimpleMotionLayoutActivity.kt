package com.bqliang.motionlayout.study

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bqliang.motionlayout.study.databinding.ActivitySimpleMotionLayoutBinding

class SimpleMotionLayoutActivity : AppCompatActivity() {

    private val binding: ActivitySimpleMotionLayoutBinding by lazy {
        ActivitySimpleMotionLayoutBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}