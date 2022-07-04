package com.example.arabic.splashActivities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.arabic.Testing.TestActivity8;
import com.example.arabicapp.R;

public class TestSplash8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_splash8);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(TestSplash8.this, TestActivity8.class);
                startActivity(intent);
                TestSplash8.this.finish();
            }
        },1000);
    }
}