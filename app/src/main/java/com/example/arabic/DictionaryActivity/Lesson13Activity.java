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
import com.example.arabic.splashActivities.TestSplash11;
import com.example.arabic.splashActivities.TestSplash12;
import com.example.arabic.splashActivities.TestSplash13;
import com.example.arabic.splashActivities.TestSplash4;
import com.example.arabic.splashActivities.TestSplash5;
import com.example.arabic.splashActivities.TestSplash6;
import com.example.arabic.splashActivities.TestSplash7;
import com.example.arabic.splashActivities.TestSplash8;
import com.example.arabic.splashActivities.TestSplash9;
import com.example.arabicapp.R;

import java.util.ArrayList;
import java.util.List;

public class Lesson13Activity extends AppCompatActivity {
    List<Lesson1> lesson1List;
    RecyclerView rv1;
    FirstLessonAdapter firstLessonAdapter;
    TextView nextTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson13);
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
                Intent intent1 = new Intent(Lesson13Activity.this, TestSplash13.class);
                startActivity(intent1);
                Lesson13Activity.this.finish();
            }
        });

    }

    private void dataList() {

        lesson1List.add(new Lesson1(R.drawable.aalya,":aalya","baraka"));
        lesson1List.add(new Lesson1(R.drawable.niama2,":niamma","rahm shavqat"));
        lesson1List.add(new Lesson1(R.drawable.mulk,":mulk","qirollik"));
        lesson1List.add(new Lesson1(R.drawable.maa,":maa","suv"));
        lesson1List.add(new Lesson1(R.drawable.izn,":izn","qaror"));
        lesson1List.add(new Lesson1(R.drawable.ajmain,":ajmain","hamma birgalikda"));
        lesson1List.add(new Lesson1(R.drawable.ajmaun,":ajmaun","hamma"));
        lesson1List.add(new Lesson1(R.drawable.sava,":sava","xuddi shu"));
        lesson1List.add(new Lesson1(R.drawable.jamia,":jamia","hamma narsa"));
        lesson1List.add(new Lesson1(R.drawable.bas,":bas","jazo"));
        lesson1List.add(new Lesson1(R.drawable.fariiq,":fariiq","guruh"));
        lesson1List.add(new Lesson1(R.drawable.absaar,": absar","ko'rish"));
        lesson1List.add(new Lesson1(R.drawable.vujuh,":vujuh","yuzlar"));
        lesson1List.add(new Lesson1(R.drawable.vajh,": vajh ","yuz"));
        lesson1List.add(new Lesson1(R.drawable.afvah,":afvah","og'izlar"));
        lesson1List.add(new Lesson1(R.drawable.ayun,": ayun","ko'zlar"));
        lesson1List.add(new Lesson1(R.drawable.ayn,":ayn","ko'z"));
        lesson1List.add(new Lesson1(R.drawable.qalp,":qalp","yurak"));
        lesson1List.add(new Lesson1(R.drawable.alsina,":alsina","tillar"));
        lesson1List.add(new Lesson1(R.drawable.lisaan,":lissan","til"));


    }
}