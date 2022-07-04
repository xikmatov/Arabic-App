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
import com.example.arabicapp.R;

import java.util.ArrayList;
import java.util.List;

public class LessonSecondActivity extends AppCompatActivity {
    List<Lesson1> lesson1List;
    RecyclerView rv1;
    FirstLessonAdapter firstLessonAdapter;
    TextView nextTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_second);
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
                Intent intent1 = new Intent(LessonSecondActivity.this, TestSplash2.class);
                startActivity(intent1);
                LessonSecondActivity.this.finish();
            }
        });

    }

    private void dataList() {

        lesson1List.add(new Lesson1(R.drawable.mataa,":mataa","Qachon"));
        lesson1List.add(new Lesson1(R.drawable.man,":man","Kim"));
        lesson1List.add(new Lesson1(R.drawable.maa,":maa","Nima"));
        lesson1List.add(new Lesson1(R.drawable.kyayfa,":kyayfa","Kabi"));
        lesson1List.add(new Lesson1(R.drawable.ayna,":ayna","Qayerda"));
        lesson1List.add(new Lesson1(R.drawable.mazaa,":maaza","Nima"));
        lesson1List.add(new Lesson1(R.drawable.a_hal,":a/hal","Shundaymi"));
        lesson1List.add(new Lesson1(R.drawable.ayyu,":ayyu","Qaysi"));
        lesson1List.add(new Lesson1(R.drawable.lima,":limq","Nimaga"));
        lesson1List.add(new Lesson1(R.drawable.laula,":laula","Agar yo'q bo'lsa"));
        lesson1List.add(new Lesson1(R.drawable.limaza,":limaza","Nimaga"));
        lesson1List.add(new Lesson1(R.drawable.kaablya,": kaablya","Oldin"));
        lesson1List.add(new Lesson1(R.drawable.baad,":baad","Keyin"));
        lesson1List.add(new Lesson1(R.drawable.xin,": xin","Vaqtida"));
        lesson1List.add(new Lesson1(R.drawable.iz,":iz","Qachon(O'.z)"));
        lesson1List.add(new Lesson1(R.drawable.izya,": izya","Qachon(K.z)"));
        lesson1List.add(new Lesson1(R.drawable.fa,":fa","Shunday qilib"));
        lesson1List.add(new Lesson1(R.drawable.inda,":inda","Yaqin"));
        lesson1List.add(new Lesson1(R.drawable.lyadaa,":lyada","...dan"));
        lesson1List.add(new Lesson1(R.drawable.kyam,":kyam","Nechta"));


    }
}