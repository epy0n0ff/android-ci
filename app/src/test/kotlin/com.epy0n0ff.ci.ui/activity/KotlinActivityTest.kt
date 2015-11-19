package com.epy0n0ff.ci.ui.activity

import android.widget.TextView
import com.epy0n0ff.ci.R
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import kotlin.test.assertEquals

/**
 * KotlinActivity Test
 * Created by epy0n0ff on 2015/11/19.
 */
@RunWith(RobolectricTestRunner::class)
@Config(sdk = intArrayOf(21), manifest = "./src/main/AndroidManifest.xml")
public class KotlinActivityTest {
    @Test fun onCreate() {
        val activity = Robolectric.buildActivity(KotlinActivity::class.java).create().get()
        var textView = activity.findViewById(R.id.activity_app_name) as TextView
        assertEquals(textView.text.toString(),
                activity.applicationContext.getString(R.string.app_name))
    }
}