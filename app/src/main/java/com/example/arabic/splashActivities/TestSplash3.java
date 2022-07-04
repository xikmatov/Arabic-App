package com.example.arabic.splashActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


import com.example.arabic.Testing.TestActivity;
import com.example.arabic.Testing.TestActivity2;
import com.example.arabic.Testing.TestActivity3;
import com.example.arabicapp.R;

public class TestSplash3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_splash3);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(TestSplash3.this, TestActivity3.class);
                startActivity(intent);
                TestSplash3.this.finish();
            }
        },1000);
    }
}