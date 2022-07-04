package com.example.arabic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.arabic.DictionaryActivity.Lesson11Activity;
import com.example.arabic.DictionaryActivity.Lesson12Activity;
import com.example.arabic.DictionaryActivity.Lesson13Activity;
import com.example.arabic.DictionaryActivity.Lesson14Activity;
import com.example.arabic.DictionaryActivity.Lesson15Activity;
import com.example.arabic.DictionaryActivity.Lesson16Activity;
import com.example.arabic.DictionaryActivity.LessonEightActivity;
import com.example.arabic.DictionaryActivity.LessonFirstActivity;
import com.example.arabic.DictionaryActivity.LessonFourthActivty;
import com.example.arabic.DictionaryActivity.LessonNineActivity;
import com.example.arabic.DictionaryActivity.LessonSecondActivity;
import com.example.arabic.DictionaryActivity.LessonSevenActivity;
import com.example.arabic.DictionaryActivity.LessonSixActivity;
import com.example.arabic.DictionaryActivity.LessonTenActivity;
import com.example.arabic.DictionaryActivity.LessonThirdActivity;
import com.example.arabic.DictionaryActivity.LesssonFiveActivity;
import com.example.arabicapp.R;

public class LessonsActivity extends AppCompatActivity {
    Toolbar toolbar;
    CardView lesson1,lesson2,lesson3,lesson4,lesson5,lesson6,lesson7,lesson8,lesson9,lesson10,lesson11,lesson12,lesson13,lesson14,lesson15,lesson16,lesson17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        lesson1 = findViewById(R.id.lesson1);
        lesson2 = findViewById(R.id.lesson2);
        lesson3 = findViewById(R.id.lesson3);
        lesson4 = findViewById(R.id.lesson4);
        lesson5 = findViewById(R.id.lesson5);
        lesson6 = findViewById(R.id.lesson6);
        lesson7 = findViewById(R.id.lesson7);
        lesson8 = findViewById(R.id.lesson8);
        lesson9 = findViewById(R.id.lesson9);
        lesson10 = findViewById(R.id.lesson10);
        lesson11 = findViewById(R.id.lesson11);
        lesson12 = findViewById(R.id.lesson12);
        lesson13 = findViewById(R.id.lesson13);
        lesson14 = findViewById(R.id.lesson14);
        lesson15 = findViewById(R.id.lesson15);
        lesson16 = findViewById(R.id.lesson16);
        lesson1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LessonsActivity.this, LessonFirstActivity.class);
                startActivity(intent);

            }
        });
        lesson2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LessonsActivity.this, LessonSecondActivity.class);
                startActivity(intent);

            }
        });
        lesson3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LessonsActivity.this, LessonThirdActivity.class);
                startActivity(intent);

            }
        });
        lesson4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LessonsActivity.this, LessonFourthActivty.class);
                startActivity(intent);

            }
        });

        lesson5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LessonsActivity.this, LesssonFiveActivity.class);
                startActivity(intent);

            }
        });

        lesson6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LessonsActivity.this, LessonSixActivity.class);
                startActivity(intent);

            }
        });

        lesson7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LessonsActivity.this, LessonSevenActivity.class);
                startActivity(intent);

            }
        });



        lesson8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LessonsActivity.this, LessonEightActivity.class);
                startActivity(intent);

            }
        });

        lesson9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LessonsActivity.this, LessonNineActivity.class);
                startActivity(intent);

            }
        });

        lesson10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LessonsActivity.this, LessonTenActivity.class);
                startActivity(intent);

            }
        });


        lesson11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LessonsActivity.this, Lesson11Activity.class);
                startActivity(intent);

            }
        });

        lesson12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LessonsActivity.this, Lesson12Activity.class);
                startActivity(intent);

            }
        });

        lesson13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LessonsActivity.this, Lesson13Activity.class);
                startActivity(intent);

            }
        });


        lesson14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LessonsActivity.this, Lesson14Activity.class);
                startActivity(intent);

            }
        });



        lesson15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LessonsActivity.this, Lesson15Activity.class);
                startActivity(intent);

            }
        });

        lesson16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LessonsActivity.this, Lesson16Activity.class);
                startActivity(intent);

            }
        });


    }
}