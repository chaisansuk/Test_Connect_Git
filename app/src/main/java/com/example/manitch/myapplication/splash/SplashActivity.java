package com.example.manitch.myapplication.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.manitch.myapplication.R;
import com.example.manitch.myapplication.index.MainActivity;

public class SplashActivity extends Activity {
    Handler handler;
    Runnable runnable;
    long delay_time;
    long time = 3000L;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        };
    }
    public void onResume() {
        super.onResume();
        delay_time = time;
        handler.postDelayed(runnable,delay_time);
        time = System.currentTimeMillis();
    }
    public void onPause() {
        super.onPause();
        handler.removeCallbacks(runnable);
        time = delay_time -(System.currentTimeMillis()-time);
    }
}
