package com.example.arabic.splashActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


import com.example.arabic.Testing.TestActivity;
import com.example.arabicapp.R;

public class TestSplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(TestSplash.this, TestActivity.class);
                startActivity(intent);
                TestSplash.this.finish();
            }
        },1000);
    }
}