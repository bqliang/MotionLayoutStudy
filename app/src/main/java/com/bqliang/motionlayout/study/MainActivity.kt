package com.bqliang.motionlayout.study

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bqliang.motionlayout.study.databinding.ActivityMainBinding
import com.bqliang.motionlayout.study.property.PropertyAnimActivity
import com.bqliang.motionlayout.study.transition.BeginDelayedTransitionWithConstraintLayoutActivity
import com.bqliang.motionlayout.study.transition.GoActivity
import com.bqliang.motionlayout.study.transition.TransitionAnimActivity

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnPropertyAnim.setOnClickListener {
            launchActivity<PropertyAnimActivity>()
        }

        binding.btnTransitionAnim.setOnClickListener {
            launchActivity<TransitionAnimActivity>()
        }

        binding.btnTransitionGo.setOnClickListener {
            launchActivity<GoActivity>()
        }

        binding.btnBeginDelayedTransitionWithConstraintLayout.setOnClickListener {
            launchActivity<BeginDelayedTransitionWithConstraintLayoutActivity>()
        }

        binding.btnSimpleMotionLayout.setOnClickListener {
            launchActivity<SimpleMotionLayoutActivity>()
        }

        binding.btnBasicMotionLayout.setOnClickListener {
            launchActivity<BasicMotionLayoutActivity>()
        }

        binding.btnBasicKeyFrame.setOnClickListener {
            launchActivity<KeyFrameBasicActivity>()
        }

        binding.btnDeltaRelative.setOnClickListener {
            launchActivity<DeltaRelativeActivity>()
        }

        binding.btnPathRelative.setOnClickListener {
            launchActivity<PathRelativeActivity>()
        }

        binding.btnTest.setOnClickListener {
            launchActivity<TestActivity>()
        }
    }
}