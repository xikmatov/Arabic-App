package com.example.arabic.splashActivities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.arabic.Testing.TestActivity4;
import com.example.arabicapp.R;

public class TestSplash4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_splash4);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(TestSplash4.this, TestActivity4.class);
                startActivity(intent);
                TestSplash4.this.finish();
            }
        },1000);
    }
}