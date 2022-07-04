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
import com.example.arabic.splashActivities.TestSplash4;
import com.example.arabic.splashActivities.TestSplash5;
import com.example.arabic.splashActivities.TestSplash6;
import com.example.arabic.splashActivities.TestSplash7;
import com.example.arabic.splashActivities.TestSplash8;
import com.example.arabic.splashActivities.TestSplash9;
import com.example.arabicapp.R;

import java.util.ArrayList;
import java.util.List;

public class Lesson12Activity extends AppCompatActivity {
    List<Lesson1> lesson1List;
    RecyclerView rv1;
    FirstLessonAdapter firstLessonAdapter;
    TextView nextTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson12);
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
                Intent intent1 = new Intent(Lesson12Activity.this, TestSplash12.class);
                startActivity(intent1);
                Lesson12Activity.this.finish();
            }
        });

    }

    private void dataList() {

        lesson1List.add(new Lesson1(R.drawable.kalima,":kalima","so'z"));
        lesson1List.add(new Lesson1(R.drawable.vahida,":vahida","yolg'iz"));
        lesson1List.add(new Lesson1(R.drawable.vahid,":vahid","bittasi"));
        lesson1List.add(new Lesson1(R.drawable.missaq,":missaq","shartnoma"));
        lesson1List.add(new Lesson1(R.drawable.taqva,":taqva","Xudodan qo'rqish"));
        lesson1List.add(new Lesson1(R.drawable.amur,":amur","ishlar"));
        lesson1List.add(new Lesson1(R.drawable.amr,":amr","buyuruq"));
        lesson1List.add(new Lesson1(R.drawable.hikma,":hikma","donolik"));
        lesson1List.add(new Lesson1(R.drawable.baaatil,":baatil","yolg'on"));
        lesson1List.add(new Lesson1(R.drawable.haqq,":haqq","rost"));
        lesson1List.add(new Lesson1(R.drawable.zakaa,":zakaa","zakot"));
        lesson1List.add(new Lesson1(R.drawable.diin,": diin","din"));
        lesson1List.add(new Lesson1(R.drawable.hamd,":hamd","maqtov"));
        lesson1List.add(new Lesson1(R.drawable.mubiin,": mubiin ","aniq"));
        lesson1List.add(new Lesson1(R.drawable.shahiid,":shahiid","guvoh"));
        lesson1List.add(new Lesson1(R.drawable.shuhada,": shuhada","guvohlar"));
        lesson1List.add(new Lesson1(R.drawable.nuur,":nuur","yoriqlik"));
        lesson1List.add(new Lesson1(R.drawable.sala,":sala","namoz"));
        lesson1List.add(new Lesson1(R.drawable.fadl,":fadl","rahm shavqat"));
        lesson1List.add(new Lesson1(R.drawable.sultan,":sultan","vakolat"));


    }
}