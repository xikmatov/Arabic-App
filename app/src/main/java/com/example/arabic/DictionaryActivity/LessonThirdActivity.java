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
import com.example.arabicapp.R;

import java.util.ArrayList;
import java.util.List;

public class LessonThirdActivity extends AppCompatActivity {
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
                Intent intent1 = new Intent(LessonThirdActivity.this, TestSplash3.class);
                startActivity(intent1);
                LessonThirdActivity.this.finish();
            }
        });

    }

    private void dataList() {

        lesson1List.add(new Lesson1(R.drawable.ladun,":ladun","Bir joyda"));
        lesson1List.add(new Lesson1(R.drawable.summa,":summa","Keyinchalik"));
        lesson1List.add(new Lesson1(R.drawable.bal,":bal","Ammo"));
        lesson1List.add(new Lesson1(R.drawable.allya,":allya","Qilmaslik uchun.."));
        lesson1List.add(new Lesson1(R.drawable.za,":za","Egasi"));
        lesson1List.add(new Lesson1(R.drawable.zhi,":zhi","Egasi"));
        lesson1List.add(new Lesson1(R.drawable.zhu,":zhu","Egasi"));
        lesson1List.add(new Lesson1(R.drawable.zaat,":zaat","...egasi"));
        lesson1List.add(new Lesson1(R.drawable.uli,":uli","Odamlar egalari.."));
        lesson1List.add(new Lesson1(R.drawable.ulu,":uluu","Odamlar egalari"));
        lesson1List.add(new Lesson1(R.drawable.a_la,":a_hla","Qarindoshlar"));
        lesson1List.add(new Lesson1(R.drawable.al,": al","Oiladagi qarindoshlar"));
        lesson1List.add(new Lesson1(R.drawable.niama,":niama","Qanday chiroyli"));
        lesson1List.add(new Lesson1(R.drawable.biasa,": bisaa","Qanday yomon"));
        lesson1List.add(new Lesson1(R.drawable.biasama,":biasamma","Yomonlik"));
        lesson1List.add(new Lesson1(R.drawable.mithl,": mithl","Shunga o'xshash narsa"));
        lesson1List.add(new Lesson1(R.drawable.allya,":allya","Emas..?"));
        lesson1List.add(new Lesson1(R.drawable.mathal,":mathal","O'xshashlik"));
        lesson1List.add(new Lesson1(R.drawable.amthal,":amthal","o'xshashliklar"));
        lesson1List.add(new Lesson1(R.drawable.fi,":fi","ichida"));


    }
}