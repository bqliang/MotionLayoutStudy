package com.bqliang.motionlayout.study.transition

import android.os.Bundle
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.transition.TransitionManager
import com.bqliang.motionlayout.study.databinding.ActivityPropertyAnimBinding

class TransitionAnimActivity : AppCompatActivity() {

    private val binding: ActivityPropertyAnimBinding by lazy {
        ActivityPropertyAnimBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.view1.setOnClickListener { view1 ->
            val layoutParams = view1.layoutParams as RelativeLayout.LayoutParams
            TransitionManager.beginDelayedTransition(binding.root)
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT)
            view1.requestLayout()
        }
    }
}