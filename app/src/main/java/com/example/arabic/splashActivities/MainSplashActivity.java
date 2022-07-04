package com.example.arabic.splashActivities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.arabic.MainActivity;
import com.example.arabicapp.R;


public class MainSplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainSplashActivity.this, MainActivity.class);
                startActivity(intent);
                MainSplashActivity.this.finish();
            }
        },5000);
    }
}