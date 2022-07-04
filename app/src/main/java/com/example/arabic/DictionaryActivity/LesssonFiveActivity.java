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
import com.example.arabicapp.R;

import java.util.ArrayList;
import java.util.List;

public class LesssonFiveActivity extends AppCompatActivity {
    List<Lesson1> lesson1List;
    RecyclerView rv1;
    FirstLessonAdapter firstLessonAdapter;
    TextView nextTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessson_five);
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
                Intent intent1 = new Intent(LesssonFiveActivity.this, TestSplash5.class);
                startActivity(intent1);
                LesssonFiveActivity.this.finish();
            }
        });

    }

    private void dataList() {

        lesson1List.add(new Lesson1(R.drawable.kullama,":'kullama","har doim.."));
        lesson1List.add(new Lesson1(R.drawable.kaannama,":kannama","..go'yo"));
        lesson1List.add(new Lesson1(R.drawable.innama,":innama","..rost"));
        lesson1List.add(new Lesson1(R.drawable.kaanna,":kanna","go'yo"));
        lesson1List.add(new Lesson1(R.drawable.anna2,":anna","keyin"));
        lesson1List.add(new Lesson1(R.drawable.inna,":inna","haqiqattan ham"));
        lesson1List.add(new Lesson1(R.drawable.laalla,":la'alla","ehtimol"));
        lesson1List.add(new Lesson1(R.drawable.lakinna,":lakinna","shunga qaramasdan"));
        lesson1List.add(new Lesson1(R.drawable.lakin,":lakin","lekin"));
        lesson1List.add(new Lesson1(R.drawable.iyya,":iyya","bitta"));
        lesson1List.add(new Lesson1(R.drawable.in,":in","agar"));
        lesson1List.add(new Lesson1(R.drawable.an,": an","keyin"));
        lesson1List.add(new Lesson1(R.drawable.lau,":lau","agar"));
        lesson1List.add(new Lesson1(R.drawable.lamma,": lamma ","qachon"));
        lesson1List.add(new Lesson1(R.drawable.asa,":'asa","extimol"));
        lesson1List.add(new Lesson1(R.drawable.kullu,": kullu","hamma narsa"));
        lesson1List.add(new Lesson1(R.drawable.ya,":yaa","haqida"));
        lesson1List.add(new Lesson1(R.drawable.yaayhuhal,":ya'ayyuhal","siz haqingizda"));
        lesson1List.add(new Lesson1(R.drawable.amiin,":amiin","to'liq ishonnsa bo'ladigan kishiga"));
        lesson1List.add(new Lesson1(R.drawable.ula,":ula","birinchi"));


    }
}