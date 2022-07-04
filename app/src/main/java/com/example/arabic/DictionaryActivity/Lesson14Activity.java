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
import com.example.arabic.splashActivities.TestSplash14;
import com.example.arabic.splashActivities.TestSplash4;
import com.example.arabic.splashActivities.TestSplash5;
import com.example.arabic.splashActivities.TestSplash6;
import com.example.arabic.splashActivities.TestSplash7;
import com.example.arabic.splashActivities.TestSplash8;
import com.example.arabic.splashActivities.TestSplash9;
import com.example.arabicapp.R;

import java.util.ArrayList;
import java.util.List;

public class Lesson14Activity extends AppCompatActivity {
    List<Lesson1> lesson1List;
    RecyclerView rv1;
    FirstLessonAdapter firstLessonAdapter;
    TextView nextTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson14);
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
                Intent intent1 = new Intent(Lesson14Activity.this, TestSplash14.class);
                startActivity(intent1);
                Lesson14Activity.this.finish();
            }
        });

    }

    private void dataList() {

        lesson1List.add(new Lesson1(R.drawable.suduur,":suduur","ko'krak qafasi"));
        lesson1List.add(new Lesson1(R.drawable.sadr,":sadr","ko'krak qafasi"));
        lesson1List.add(new Lesson1(R.drawable.quluub,":qullub","yurak"));
        lesson1List.add(new Lesson1(R.drawable.ruuh,":ruuh","rux"));
        lesson1List.add(new Lesson1(R.drawable.aydii,":aydii","qo'llar"));
        lesson1List.add(new Lesson1(R.drawable.yad,":yad","qo'l"));
        lesson1List.add(new Lesson1(R.drawable.quvva,":quvva","kuch"));
        lesson1List.add(new Lesson1(R.drawable.arjul,":arjul","oyoqlar"));
        lesson1List.add(new Lesson1(R.drawable.rijaal,":jamia","hamma narsa"));
        lesson1List.add(new Lesson1(R.drawable.ikhvan,":ikhvan","birodarlar"));
        lesson1List.add(new Lesson1(R.drawable.anfus,":anfus","qalb"));
        lesson1List.add(new Lesson1(R.drawable.nafs,": nafs","rux"));
        lesson1List.add(new Lesson1(R.drawable.ab,":ab","ota"));
        lesson1List.add(new Lesson1(R.drawable.ammahat,": ammahat ","onalar"));
        lesson1List.add(new Lesson1(R.drawable.umm,":umm","ona"));
        lesson1List.add(new Lesson1(R.drawable.zauj,": zauj","turmush o'rtog'"));
        lesson1List.add(new Lesson1(R.drawable.aba,":aba","otalar"));
        lesson1List.add(new Lesson1(R.drawable.abat,":abat","ota"));
        lesson1List.add(new Lesson1(R.drawable.rijaal,":rijjal","erkaklar"));
        lesson1List.add(new Lesson1(R.drawable.rajul,":rajul","kishi"));


    }
}