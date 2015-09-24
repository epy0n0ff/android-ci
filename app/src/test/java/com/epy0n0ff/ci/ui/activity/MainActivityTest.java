package com.epy0n0ff.ci.ui.activity;

import android.app.Activity;
import android.widget.TextView;
import com.epy0n0ff.ci.BuildConfig;
import com.epy0n0ff.ci.R;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * MainActivity test class
 * Created by epy0n0ff on 2015/09/24.
 */
@RunWith(RobolectricGradleTestRunner.class) @Config(
    sdk = 21,
    constants = BuildConfig.class)
public class MainActivityTest {
  @Test public void onCreate() {
    Activity activity = Robolectric.setupActivity(MainActivity.class);

    assertThat("check text",
        ((TextView) activity.findViewById(R.id.activity_app_name)).getText().toString(),
        is(activity.getApplicationContext().getString(R.string.app_name)));
  }
}