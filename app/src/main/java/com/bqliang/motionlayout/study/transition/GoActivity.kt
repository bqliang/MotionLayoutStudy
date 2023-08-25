package com.bqliang.motionlayout.study.transition

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.transition.Scene
import androidx.transition.TransitionManager
import com.bqliang.motionlayout.study.R

class GoActivity : AppCompatActivity() {

    private var toggle = false
    private lateinit var startScene: Scene
    private lateinit var endScene: Scene

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_go)

        val root = findViewById<ViewGroup>(R.id.go_root_layout)
        // 创建 start 和 end 两个场景
        startScene = Scene.getSceneForLayout(root, R.layout.activity_go_start, this)
        endScene = Scene.getSceneForLayout(root, R.layout.activity_go_end, this)
        initEvent()
    }

    private fun initEvent() {
        findViewById<View>(R.id.view).setOnClickListener { view ->
            // 点击的时候根据不同的状态去切换场景
            val targetScene = if (toggle) startScene else endScene
            TransitionManager.go(targetScene)
            // ???
            initEvent()
            toggle = !toggle
        }
    }
}