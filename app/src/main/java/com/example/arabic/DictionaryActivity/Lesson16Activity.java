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
import com.example.arabic.splashActivities.TestSplash16;
import com.example.arabic.splashActivities.TestSplash4;
import com.example.arabic.splashActivities.TestSplash5;
import com.example.arabic.splashActivities.TestSplash6;
import com.example.arabic.splashActivities.TestSplash7;
import com.example.arabic.splashActivities.TestSplash8;
import com.example.arabic.splashActivities.TestSplash9;
import com.example.arabicapp.R;

import java.util.ArrayList;
import java.util.List;

public class Lesson16Activity extends AppCompatActivity {
    List<Lesson1> lesson1List;
    RecyclerView rv1;
    FirstLessonAdapter firstLessonAdapter;
    TextView nextTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson16);
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
                Intent intent1 = new Intent(Lesson16Activity.this, TestSplash16.class);
                startActivity(intent1);
                Lesson16Activity.this.finish();
            }
        });

    }

    private void dataList() {

        lesson1List.add(new Lesson1(R.drawable.valiyy,":valiiy","himoyachi"));
        lesson1List.add(new Lesson1(R.drawable.auliya,":auliya","himoyachilar"));
        lesson1List.add(new Lesson1(R.drawable.qaum,":qaum","odamlar"));
        lesson1List.add(new Lesson1(R.drawable.zukuur,":zukuur","erkaklar"));
        lesson1List.add(new Lesson1(R.drawable.zakar,":zakar","kishi"));
        lesson1List.add(new Lesson1(R.drawable.mala,":mala","rahbarlar"));
        lesson1List.add(new Lesson1(R.drawable.unsaa,":unsaa","ayol"));
        lesson1List.add(new Lesson1(R.drawable.inaas,":innas","ayollar"));
        lesson1List.add(new Lesson1(R.drawable.kuffaar,":kuffar","kofirlar"));
        lesson1List.add(new Lesson1(R.drawable.ibaad,":ibaad","qullar"));
        lesson1List.add(new Lesson1(R.drawable.abd,":abd","qul"));
        lesson1List.add(new Lesson1(R.drawable.mujrim,": mujrim","zolimlar"));
        lesson1List.add(new Lesson1(R.drawable.adaai,":adaai","dushman"));
        lesson1List.add(new Lesson1(R.drawable.aduv,": aduv ","dushman"));
        lesson1List.add(new Lesson1(R.drawable.dunya,":dunya","dunyo"));
        lesson1List.add(new Lesson1(R.drawable.buyoot,": buyyot","uylar"));
        lesson1List.add(new Lesson1(R.drawable.beyt,":beyt","uy"));
        lesson1List.add(new Lesson1(R.drawable.sabiil,":sabiil","yo'l"));
        lesson1List.add(new Lesson1(R.drawable.diyaar,":diyaar","uy-joy"));
        lesson1List.add(new Lesson1(R.drawable.daar,":daar","turar joy"));


    }
}