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
import com.example.arabic.splashActivities.TestSplash4;
import com.example.arabic.splashActivities.TestSplash5;
import com.example.arabic.splashActivities.TestSplash6;
import com.example.arabic.splashActivities.TestSplash7;
import com.example.arabic.splashActivities.TestSplash8;
import com.example.arabic.splashActivities.TestSplash9;
import com.example.arabicapp.R;

import java.util.ArrayList;
import java.util.List;

public class Lesson11Activity extends AppCompatActivity {
    List<Lesson1> lesson1List;
    RecyclerView rv1;
    FirstLessonAdapter firstLessonAdapter;
    TextView nextTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson11);
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
                Intent intent1 = new Intent(Lesson11Activity.this, TestSplash11.class);
                startActivity(intent1);
                Lesson11Activity.this.finish();
            }
        });

    }

    private void dataList() {

        lesson1List.add(new Lesson1(R.drawable.musamma,":musamma","tashkil etilgan"));
        lesson1List.add(new Lesson1(R.drawable.ayaam,":ayyam","kunlar"));
        lesson1List.add(new Lesson1(R.drawable.yaum,":yaum","kun"));
        lesson1List.add(new Lesson1(R.drawable.vail,":vail","qayg'u"));
        lesson1List.add(new Lesson1(R.drawable.yaumaizin,":yaumaaizin","qaysi kun"));
        lesson1List.add(new Lesson1(R.drawable.naar,":naar","olov"));
        lesson1List.add(new Lesson1(R.drawable.ilah,":illah","Alloh"));
        lesson1List.add(new Lesson1(R.drawable.ihda,":ihda","bittasi"));
        lesson1List.add(new Lesson1(R.drawable.ahad,":ahad","bir"));
        lesson1List.add(new Lesson1(R.drawable.shuraka,":shuraaka","sheriklar"));
        lesson1List.add(new Lesson1(R.drawable.shariik,":shariik","sherik"));
        lesson1List.add(new Lesson1(R.drawable.aliha,": aaliha","xudolar"));
        lesson1List.add(new Lesson1(R.drawable.aahd,":aahd","ko'rinmas"));
        lesson1List.add(new Lesson1(R.drawable.arsh,": arsh ","taxt"));
        lesson1List.add(new Lesson1(R.drawable.shahada,":shahada","sertifikat"));
        lesson1List.add(new Lesson1(R.drawable.kutub,": kutuub","kitoblar"));
        lesson1List.add(new Lesson1(R.drawable.kitaab,":kitaab","kitob"));
        lesson1List.add(new Lesson1(R.drawable.gayb,":gayb","ko'rinmas"));
        lesson1List.add(new Lesson1(R.drawable.malikka,":maliykka","farishtalar"));
        lesson1List.add(new Lesson1(R.drawable.malak,":malak","farishta"));


    }
}