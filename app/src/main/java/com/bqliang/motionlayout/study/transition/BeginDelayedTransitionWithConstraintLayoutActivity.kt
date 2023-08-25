package com.bqliang.motionlayout.study.transition

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet
import androidx.transition.TransitionManager
import com.bqliang.motionlayout.study.R
import com.bqliang.motionlayout.study.databinding.ActivityBeginDelayedTransitionWithConstraintLayoutStartBinding

class BeginDelayedTransitionWithConstraintLayoutActivity : AppCompatActivity() {

    private val binding: ActivityBeginDelayedTransitionWithConstraintLayoutStartBinding by lazy {
        ActivityBeginDelayedTransitionWithConstraintLayoutStartBinding.inflate(layoutInflater)
    }

    private var toggle = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.view.setOnClickListener { view ->
            val constraintSet = ConstraintSet()
            if (toggle) constraintSet.clone(
                this,
                R.layout.activity_begin_delayed_transition_with_constraint_layout_start
            )
            else constraintSet.clone(
                this,
                R.layout.activity_begin_delayed_transition_with_constraint_layout_end
            )
            TransitionManager.beginDelayedTransition(binding.root)
            constraintSet.applyTo(binding.root)
            toggle = !toggle
        }
    }
}