package com.bqliang.motionlayout.study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bqliang.motionlayout.study.databinding.ActivityKeyFrameBasicBinding

class KeyFrameBasicActivity : AppCompatActivity() {

    private val binding: ActivityKeyFrameBasicBinding by lazy {
        ActivityKeyFrameBasicBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}