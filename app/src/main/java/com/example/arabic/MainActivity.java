package com.example.arabic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.arabicapp.R;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    Button button;
    TextView next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       next  =findViewById(R.id.next_tv);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LessonsActivity.class);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });


    }
}