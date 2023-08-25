package com.bqliang.motionlayout.study.property

import android.os.Bundle
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import com.bqliang.motionlayout.study.databinding.ActivityPropertyAnimBinding

class PropertyAnimActivity : AppCompatActivity() {

    private val binding: ActivityPropertyAnimBinding by lazy {
        ActivityPropertyAnimBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.view1.setOnClickListener { view1 ->
            val distance = (view1.parent as RelativeLayout).width - view1.width
            view1.animate()
                .translationX(distance.toFloat())
                .start()
        }
    }
}