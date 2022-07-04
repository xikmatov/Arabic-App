package com.example.arabic.DictionaryActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import com.example.arabic.adapters.FirstLessonAdapter;
import com.example.arabic.model.Lesson1;
import com.example.arabic.splashActivities.TestSplash4;
import com.example.arabic.splashActivities.TestSplash5;
import com.example.arabic.splashActivities.TestSplash6;
import com.example.arabicapp.R;

import java.util.ArrayList;
import java.util.List;

public class LessonSixActivity extends AppCompatActivity {
    List<Lesson1> lesson1List;
    RecyclerView rv1;
    FirstLessonAdapter firstLessonAdapter;
    TextView nextTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_six);
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
                Intent intent1 = new Intent(LessonSixActivity.this, TestSplash6.class);
                startActivity(intent1);
                LessonSixActivity.this.finish();
            }
        });

    }

    private void dataList() {

        lesson1List.add(new Lesson1(R.drawable.avval,":'avval","birinchi"));
        lesson1List.add(new Lesson1(R.drawable.baseer,":bassir","ko'ruvchi"));
        lesson1List.add(new Lesson1(R.drawable.ukhra,":akhira","oxirgi"));
        lesson1List.add(new Lesson1(R.drawable.ukhra,":ukhra","boshqa"));
        lesson1List.add(new Lesson1(R.drawable.akhar,":akhar","boshqa"));
        lesson1List.add(new Lesson1(R.drawable.hakeem,":hakiim","dono"));
        lesson1List.add(new Lesson1(R.drawable.hafiiz,":hafiz","himoyachi"));
        lesson1List.add(new Lesson1(R.drawable.tavvaab,":tavvaab","kechirasiz"));
        lesson1List.add(new Lesson1(R.drawable.hamiim,":hammim","yaqin do'st"));
        lesson1List.add(new Lesson1(R.drawable.hamiid,":hamiid","maqtovga loyiq"));
        lesson1List.add(new Lesson1(R.drawable.rahmaan,":raxmaan","mexribon"));
        lesson1List.add(new Lesson1(R.drawable.rabb,": rabb","Rabbim"));
        lesson1List.add(new Lesson1(R.drawable.khabeer,":khabiir","bilish"));
        lesson1List.add(new Lesson1(R.drawable.shakuur,": shakuur ","rahmat"));
        lesson1List.add(new Lesson1(R.drawable.sami,":'sami","tinglash"));
        lesson1List.add(new Lesson1(R.drawable.salyaam,": salyyam","tinchlik"));
        lesson1List.add(new Lesson1(R.drawable.qadiir,":qadiir","qudratli"));
        lesson1List.add(new Lesson1(R.drawable.gafuur,":gafuur","kechirasiz"));
        lesson1List.add(new Lesson1(R.drawable.aziiz,":azziz","buyuk"));
        lesson1List.add(new Lesson1(R.drawable.vakiil,":vakiil","g'amxo'rlik"));


    }
}