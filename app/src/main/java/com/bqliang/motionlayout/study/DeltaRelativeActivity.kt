package com.bqliang.motionlayout.study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bqliang.motionlayout.study.databinding.ActivityDeltaRelativeBinding

class DeltaRelativeActivity : AppCompatActivity() {

    private val binding: ActivityDeltaRelativeBinding by lazy {
        ActivityDeltaRelativeBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}