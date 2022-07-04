package com.example.arabic.DictionaryActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.arabic.MainActivity;

import com.example.arabic.adapters.FirstLessonAdapter;
import com.example.arabic.model.Lesson1;
import com.example.arabic.splashActivities.TestSplash;
import com.example.arabicapp.R;

import java.util.ArrayList;
import java.util.List;

public class LessonFirstActivity extends AppCompatActivity {
    List<Lesson1> lesson1List;
    RecyclerView rv1;
    FirstLessonAdapter firstLessonAdapter;
    TextView nextTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_first);
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
                Intent intent1 = new Intent(LessonFirstActivity.this, TestSplash.class);
                startActivity(intent1);
                LessonFirstActivity.this.finish();
            }
        });

    }

    private void dataList() {

        lesson1List.add(new Lesson1(R.drawable.huwa,":huva","U"));
        lesson1List.add(new Lesson1(R.drawable.hum,"hum","Ular"));
        lesson1List.add(new Lesson1(R.drawable.anta,":anta","Sen"));
        lesson1List.add(new Lesson1(R.drawable.antum,":antum","Siz"));
        lesson1List.add(new Lesson1(R.drawable.ana,":ana","Men"));
        lesson1List.add(new Lesson1(R.drawable.nahnu,":naxna","Biz"));
        lesson1List.add(new Lesson1(R.drawable.hiya,":hiya","U"));
        lesson1List.add(new Lesson1(R.drawable.hunna,":hunna","Ular"));
        lesson1List.add(new Lesson1(R.drawable.anti,":anti","Sen"));
        lesson1List.add(new Lesson1(R.drawable.humaa,":humaa","O'sha ikkitasi"));
        lesson1List.add(new Lesson1(R.drawable.antumaa,":antumaa","Siz ikkalangiz ham"));
        lesson1List.add(new Lesson1(R.drawable.hu,": ..hu","Uning"));
        lesson1List.add(new Lesson1(R.drawable.hum2,": ..hum","Ular"));
        lesson1List.add(new Lesson1(R.drawable.ka2,": ..ka","Seniki"));
        lesson1List.add(new Lesson1(R.drawable.kum2,": ..kum","Sizning"));
        lesson1List.add(new Lesson1(R.drawable.i2,": ..i","Mening"));
        lesson1List.add(new Lesson1(R.drawable.naa2,": ..naa","Bizning"));
        lesson1List.add(new Lesson1(R.drawable.haa,": ..haa","U"));
        lesson1List.add(new Lesson1(R.drawable.hunna2,": ..hunna","Ular"));
        lesson1List.add(new Lesson1(R.drawable.ki2,": ..ki","Seniki"));


    }
}