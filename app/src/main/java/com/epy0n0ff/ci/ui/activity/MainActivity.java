package com.epy0n0ff.ci.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.epy0n0ff.ci.R;

/**
 * MainActivity
 * Created by epy0n0ff on 2015/09/24.
 */
public class MainActivity extends Activity {
  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_main);
    findViewById(R.id.activity_app_name).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), KotlinActivity.class);
        startActivity(intent);
      }
    });
  }
}
