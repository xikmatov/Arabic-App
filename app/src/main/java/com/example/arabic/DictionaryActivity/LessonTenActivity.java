package com.example.arabic.DictionaryActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import com.example.arabic.adapters.FirstLessonAdapter;
import com.example.arabic.model.Lesson1;
import com.example.arabic.splashActivities.TestSplash10;
import com.example.arabic.splashActivities.TestSplash4;
import com.example.arabic.splashActivities.TestSplash5;
import com.example.arabic.splashActivities.TestSplash6;
import com.example.arabic.splashActivities.TestSplash7;
import com.example.arabic.splashActivities.TestSplash8;
import com.example.arabic.splashActivities.TestSplash9;
import com.example.arabicapp.R;

import java.util.ArrayList;
import java.util.List;

public class LessonTenActivity extends AppCompatActivity {
    List<Lesson1> lesson1List;
    RecyclerView rv1;
    FirstLessonAdapter firstLessonAdapter;
    TextView nextTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_ten);
        rv1 = findViewById(R.id.rv1);
        nextTv = findViewById(R.id.next_tv);
        rv1.setHasFixedSize(true);
        lesson1List = new ArrayList<>();
        dataList();
        firstLessonAdapter = new FirstLessonAdapter(lesson1List,this);
        rv1.setAdapter(firstLessonAdapter);


        nextTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(LessonTenActivity.this, TestSplash10.class);
                startActivity(intent1);
                LessonTenActivity.this.finish();
            }
        });

    }

    private void dataList() {

        lesson1List.add(new Lesson1(R.drawable.abadan,":abadan","abadiy"));
        lesson1List.add(new Lesson1(R.drawable.aliim,":aliim","og'riqli"));
        lesson1List.add(new Lesson1(R.drawable.alakhira,":al'akhira","oxirat"));
        lesson1List.add(new Lesson1(R.drawable.ajal,":ajal","davr"));
        lesson1List.add(new Lesson1(R.drawable.jaza,":jazza","mukofot"));
        lesson1List.add(new Lesson1(R.drawable.jahiim,":jahiim","do'zax"));
        lesson1List.add(new Lesson1(R.drawable.savaab,":savaab","mukofot"));
        lesson1List.add(new Lesson1(R.drawable.jahannam,":jahanaam","jahannam"));
        lesson1List.add(new Lesson1(R.drawable.jannat,":jannat","jannatlar"));
        lesson1List.add(new Lesson1(R.drawable.janna,":jannaa","jannat"));
        lesson1List.add(new Lesson1(R.drawable.saa,":saa","soat"));
        lesson1List.add(new Lesson1(R.drawable.hisaab,": hisaab","to'lash"));
        lesson1List.add(new Lesson1(R.drawable.aqiba,":aqiba","oxiri"));
        lesson1List.add(new Lesson1(R.drawable.asxaab,": asxab ","sheriklar"));
        lesson1List.add(new Lesson1(R.drawable.saaxib,":saxib","hamroh"));
        lesson1List.add(new Lesson1(R.drawable.qiyama,": qiyama","tirilish"));
        lesson1List.add(new Lesson1(R.drawable.iqab,":iqaab","jazo"));
        lesson1List.add(new Lesson1(R.drawable.azab,":azab","jazo"));
        lesson1List.add(new Lesson1(R.drawable.anhar,":anhaar","daryolar"));
        lesson1List.add(new Lesson1(R.drawable.nahaar,":nahaar","daryo"));


    }
}