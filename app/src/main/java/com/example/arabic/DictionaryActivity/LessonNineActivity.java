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
import com.example.arabic.splashActivities.TestSplash9;
import com.example.arabicapp.R;

import java.util.ArrayList;
import java.util.List;

public class LessonNineActivity extends AppCompatActivity {
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
                Intent intent1 = new Intent(LessonNineActivity.this, TestSplash9.class);
                startActivity(intent1);
                LessonNineActivity.this.finish();
            }
        });

    }

    private void dataList() {

        lesson1List.add(new Lesson1(R.drawable.rasuul,":rasuul","Rasululloh"));
        lesson1List.add(new Lesson1(R.drawable.anbiya,":anbiya","Payg'ambarlar"));
        lesson1List.add(new Lesson1(R.drawable.nabiyyin,":nabiyyin","Payg'ambarlar"));
        lesson1List.add(new Lesson1(R.drawable.nabiyyun,":nabiyyun","Payg'ambarlar"));
        lesson1List.add(new Lesson1(R.drawable.ibrahim,":Ibrahim","Ibrohim payg'ambar"));
        lesson1List.add(new Lesson1(R.drawable.nuh,":Nuh","Nuh payg'ambar"));
        lesson1List.add(new Lesson1(R.drawable.adam,":Adam","Payg'ambar Odam"));
        lesson1List.add(new Lesson1(R.drawable.isxaq,":Isxaq","Payg'ambar Ishoq"));
        lesson1List.add(new Lesson1(R.drawable.ismail,":Ismail","Payg'ambar Ismoil"));
        lesson1List.add(new Lesson1(R.drawable.lut,":Lut","Payg'ambar Lut"));
        lesson1List.add(new Lesson1(R.drawable.yusuf,":Yusuf","Payg'ambar Yusuf"));
        lesson1List.add(new Lesson1(R.drawable.israil,": Israil","Isroil"));
        lesson1List.add(new Lesson1(R.drawable.yaqub,":Yaqub","Yoqub payg'ambar"));
        lesson1List.add(new Lesson1(R.drawable.saalih,": Saalih ","Payg'ambar Solih"));
        lesson1List.add(new Lesson1(R.drawable.shuaib,":'Shuaib","Payg'ambar Shuyib"));
        lesson1List.add(new Lesson1(R.drawable.hud,": Hud","Payg'ambar Gud"));
        lesson1List.add(new Lesson1(R.drawable.isa,":Isa","Payg'ambar Iso"));
        lesson1List.add(new Lesson1(R.drawable.musa,":Musa","Muso payg'ambar"));
        lesson1List.add(new Lesson1(R.drawable.ujur,":ujur","mukofotlar"));
        lesson1List.add(new Lesson1(R.drawable.ajr,":ajr","mukofot"));


    }
}