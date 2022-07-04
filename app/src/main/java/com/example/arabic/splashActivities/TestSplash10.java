package com.example.arabic.splashActivities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.arabic.Testing.TestActivity10;
import com.example.arabicapp.R;

public class TestSplash10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_splash10);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(TestSplash10.this, TestActivity10.class);
                startActivity(intent);
                TestSplash10.this.finish();
            }
        },1000);
    }
}