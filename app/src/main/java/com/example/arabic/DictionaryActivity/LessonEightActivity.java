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
import com.example.arabic.splashActivities.TestSplash8;
import com.example.arabicapp.R;

import java.util.ArrayList;
import java.util.List;

public class LessonEightActivity extends AppCompatActivity {
    List<Lesson1> lesson1List;
    RecyclerView rv1;
    FirstLessonAdapter firstLessonAdapter;
    TextView nextTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_eight);
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
                Intent intent1 = new Intent(LessonEightActivity.this, TestSplash8.class);
                startActivity(intent1);
                LessonEightActivity.this.finish();
            }
        });

    }

    private void dataList() {

        lesson1List.add(new Lesson1(R.drawable.ard,":'ard","yer"));
        lesson1List.add(new Lesson1(R.drawable.bayyinat,":bayyinat","tasdiqlash"));
        lesson1List.add(new Lesson1(R.drawable.bayyina,":bayyina","dalil"));
        lesson1List.add(new Lesson1(R.drawable.bahr,":bahr","dengiz"));
        lesson1List.add(new Lesson1(R.drawable.jibaal,":jibbal","tog'lar"));
        lesson1List.add(new Lesson1(R.drawable.jabal,":jabal","tog'"));
        lesson1List.add(new Lesson1(R.drawable.layl,":layl","kecha"));
        lesson1List.add(new Lesson1(R.drawable.qamar,":qamar","oy"));
        lesson1List.add(new Lesson1(R.drawable.shams,":shams","quyosh"));
        lesson1List.add(new Lesson1(R.drawable.samud,":samuud","Odamlar Payg'ambari Solih"));
        lesson1List.add(new Lesson1(R.drawable.aad,":aad","Odamlar Payg'ambar Gud"));
        lesson1List.add(new Lesson1(R.drawable.nahaar,": nahhar","kun"));
        lesson1List.add(new Lesson1(R.drawable.firaun,":firaun","firavn"));
        lesson1List.add(new Lesson1(R.drawable.samavat,": samavaat ","jannat"));
        lesson1List.add(new Lesson1(R.drawable.sama,":'sama","osmon"));
        lesson1List.add(new Lesson1(R.drawable.anaam,": anaam","chorva mollari"));
        lesson1List.add(new Lesson1(R.drawable.shayatin,":shayatin","shaytonlar"));
        lesson1List.add(new Lesson1(R.drawable.shaytan,":shaytan","shayton"));
        lesson1List.add(new Lesson1(R.drawable.nabi,":nabii","Payg'ambar"));
        lesson1List.add(new Lesson1(R.drawable.rusul,":rusul","xabarchilar"));


    }
}