package com.epy0n0ff.ci.ui.activity

import android.app.Activity
import android.os.Bundle
import com.epy0n0ff.ci.R
import org.jetbrains.anko.toast
import kotlinx.android.synthetic.activity_kotlin.activity_app_name

/**
 * kotlin-android-extensions example
 * Created by epy0n0ff on 2015/11/19.
 */
class KotlinAndroidExtensionsActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_kotlin)

        toast(activity_app_name.text.toString())
    }
}