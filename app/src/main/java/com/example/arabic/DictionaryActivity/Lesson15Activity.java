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
import com.example.arabic.splashActivities.TestSplash15;
import com.example.arabic.splashActivities.TestSplash4;
import com.example.arabic.splashActivities.TestSplash5;
import com.example.arabic.splashActivities.TestSplash6;
import com.example.arabic.splashActivities.TestSplash7;
import com.example.arabic.splashActivities.TestSplash8;
import com.example.arabic.splashActivities.TestSplash9;
import com.example.arabicapp.R;

import java.util.ArrayList;
import java.util.List;

public class Lesson15Activity extends AppCompatActivity {
    List<Lesson1> lesson1List;
    RecyclerView rv1;
    FirstLessonAdapter firstLessonAdapter;
    TextView nextTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson15);
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
                Intent intent1 = new Intent(Lesson15Activity.this, TestSplash15.class);
                startActivity(intent1);
                Lesson15Activity.this.finish();
            }
        });

    }

    private void dataList() {

        lesson1List.add(new Lesson1(R.drawable.azvaaj,":azvaaj","turmush o'rtoqlar"));
        lesson1List.add(new Lesson1(R.drawable.zurriyat,":zurriyat","bolalar"));
        lesson1List.add(new Lesson1(R.drawable.nisa,":nisa","ayollar"));
        lesson1List.add(new Lesson1(R.drawable.imraa,":imra","ayol"));
        lesson1List.add(new Lesson1(R.drawable.ibn,":ibn","o'g'il"));
        lesson1List.add(new Lesson1(R.drawable.aulad,":aulad","bolalar"));
        lesson1List.add(new Lesson1(R.drawable.valad,":valad","bola"));
        lesson1List.add(new Lesson1(R.drawable.banuun,":banuun","o'g'illar"));
        lesson1List.add(new Lesson1(R.drawable.abnaa,":abnaa","o'g'illar"));
        lesson1List.add(new Lesson1(R.drawable.banin,":banin","og'illar"));
        lesson1List.add(new Lesson1(R.drawable.ahii,":ahii","aka"));
        lesson1List.add(new Lesson1(R.drawable.vaalidayn,": vaalidayn","2 ta ota ona"));
        lesson1List.add(new Lesson1(R.drawable.valiid,":valiid","ota"));
        lesson1List.add(new Lesson1(R.drawable.akha,": akha ","aka"));
        lesson1List.add(new Lesson1(R.drawable.ahuu,":ahuu","aka"));
        lesson1List.add(new Lesson1(R.drawable.akh,": akh","aka"));
        lesson1List.add(new Lesson1(R.drawable.naas,":naas","odamlar"));
        lesson1List.add(new Lesson1(R.drawable.umam,":umam","hamjamiyat"));
        lesson1List.add(new Lesson1(R.drawable.umma,":umma","jamiyat"));
        lesson1List.add(new Lesson1(R.drawable.insaan,":insan","inson"));


    }
}