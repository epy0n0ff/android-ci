package com.epy0n0ff.ci.ui.activity

import android.app.Activity
import android.os.Bundle
import com.epy0n0ff.ci.R

/**
 * Kotlin Activity
 * Created by epy0n0ff on 2015/11/19.
 */
class KotlinActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }
}