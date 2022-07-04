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
import com.example.arabic.splashActivities.TestSplash2;
import com.example.arabic.splashActivities.TestSplash3;
import com.example.arabic.splashActivities.TestSplash4;
import com.example.arabicapp.R;

import java.util.ArrayList;
import java.util.List;

public class   LessonFourthActivty extends AppCompatActivity {
    List<Lesson1> lesson1List;
    RecyclerView rv1;
    FirstLessonAdapter firstLessonAdapter;
    TextView nextTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_third);
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
                Intent intent1 = new Intent(LessonFourthActivty.this, TestSplash4.class);
                startActivity(intent1);
                LessonFourthActivty.this.finish();
            }
        });

    }

    private void dataList() {

        lesson1List.add(new Lesson1(R.drawable.an,":'an","kimdir"));
        lesson1List.add(new Lesson1(R.drawable.bi,":bi","..yilda"));
        lesson1List.add(new Lesson1(R.drawable.min,":min","..ning"));
        lesson1List.add(new Lesson1(R.drawable.lilaa,":lilaa","uchun"));
        lesson1List.add(new Lesson1(R.drawable.ka,":ka","bir xil"));
        lesson1List.add(new Lesson1(R.drawable.xatta,":xatta","oldin"));
        lesson1List.add(new Lesson1(R.drawable.ta,":ta","qasam ichmoq"));
        lesson1List.add(new Lesson1(R.drawable.ila,":ila","...tomonga"));
        lesson1List.add(new Lesson1(R.drawable.va,":va","va"));
        lesson1List.add(new Lesson1(R.drawable.maa,":maa","..dan"));
        lesson1List.add(new Lesson1(R.drawable.ala,":ala","ustida"));
        lesson1List.add(new Lesson1(R.drawable.fima,": fima","nimada"));
        lesson1List.add(new Lesson1(R.drawable.ammaa,":ammaa","nima haqda"));
        lesson1List.add(new Lesson1(R.drawable.bima,": bima ","chunki"));
        lesson1List.add(new Lesson1(R.drawable.mimma,":mimma","bundan"));
        lesson1List.add(new Lesson1(R.drawable.limaa,": limaa","sabab"));
        lesson1List.add(new Lesson1(R.drawable.kama,":kyama","xuddi..?"));
        lesson1List.add(new Lesson1(R.drawable.annama,":annama","keyin"));
        lesson1List.add(new Lesson1(R.drawable.imma,":imma","agar"));
        lesson1List.add(new Lesson1(R.drawable.amma,":amma","qanday qilib"));


    }
}