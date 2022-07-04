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
import com.example.arabic.splashActivities.TestSplash7;
import com.example.arabicapp.R;

import java.util.ArrayList;
import java.util.List;

public class LessonSevenActivity extends AppCompatActivity {
    List<Lesson1> lesson1List;
    RecyclerView rv1;
    FirstLessonAdapter firstLessonAdapter;
    TextView nextTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_seven);
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
                Intent intent1 = new Intent(LessonSevenActivity.this, TestSplash7.class);
                startActivity(intent1);
                LessonSevenActivity.this.finish();
            }
        });

    }

    private void dataList() {

        lesson1List.add(new Lesson1(R.drawable.naseer,":'naseer","yordam berish"));
        lesson1List.add(new Lesson1(R.drawable.nazeer,":naziir","ogohlantirish"));
        lesson1List.add(new Lesson1(R.drawable.kariim,":kariim","oliyjanob"));
        lesson1List.add(new Lesson1(R.drawable.ashadda,":ashadda","kuchliroq"));
        lesson1List.add(new Lesson1(R.drawable.shadiid,":shadiid","qattiq"));
        lesson1List.add(new Lesson1(R.drawable.alam,":alam","yaxshi biladigan"));
        lesson1List.add(new Lesson1(R.drawable.aliim,":allim","habardor"));
        lesson1List.add(new Lesson1(R.drawable.ala2,":alaa","kattaroq"));
        lesson1List.add(new Lesson1(R.drawable.aliyy,":alliy","baland"));
        lesson1List.add(new Lesson1(R.drawable.aqrab,":aqrab","yaqinroq"));
        lesson1List.add(new Lesson1(R.drawable.qariib,":qariib","yaqin"));
        lesson1List.add(new Lesson1(R.drawable.kabiira,": kabira","katta"));
        lesson1List.add(new Lesson1(R.drawable.akbar,":akbar","ko'proq"));
        lesson1List.add(new Lesson1(R.drawable.kabiir,": kabiir ","katta"));
        lesson1List.add(new Lesson1(R.drawable.kasira,":'kasira","juda ko'p"));
        lesson1List.add(new Lesson1(R.drawable.aksar,": aksar","eng"));
        lesson1List.add(new Lesson1(R.drawable.kassir,":kasir","juda ko'p"));
        lesson1List.add(new Lesson1(R.drawable.quran,":quran","Quron"));
        lesson1List.add(new Lesson1(R.drawable.ayaat,":ayyat","belgilar"));
        lesson1List.add(new Lesson1(R.drawable.aya,":aya","belgi"));


    }
}