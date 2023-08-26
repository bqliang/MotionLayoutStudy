package com.bqliang.motionlayout.study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bqliang.motionlayout.study.databinding.ActivityPathRelativeBinding

class PathRelativeActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityPathRelativeBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}