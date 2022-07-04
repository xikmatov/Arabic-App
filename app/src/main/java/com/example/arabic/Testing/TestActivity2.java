package com.example.arabic.Testing;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.arabic.LessonsActivity;

import com.example.arabic.model.answerclass;
import com.example.arabicapp.R;

public class TestActivity2 extends AppCompatActivity {
    private TextView optionA, optionB, optionC, optionD;
    private TextView questionnumber, score;
    private ImageView question;
    private TextView chechkout1, checkout2;
    int currentIndex;
    private int qqq = 20;
    int mscore = 0;
    int qn = 1;
    ProgressBar progressBar;

    int CurrentQuestion, CurrentOptionA, CurrentOptionB, CurrentOptionC, CurrentOptionD;

    private answerclass[] questionBank = new answerclass[]
            {
                    new answerclass(R.drawable.mataa, R.string.question21_A, R.string.question21_B, R.string.question21_C, R.string.question21_D, R.string.answer_21),
                    new answerclass(R.drawable.man, R.string.question_22A, R.string.question_22B, R.string.question_22C, R.string.question_22D, R.string.answer_22),
                    new answerclass(R.drawable.maa, R.string.question_23A, R.string.question_23B, R.string.question_23C, R.string.question_23D, R.string.answer_23),
                    new answerclass(R.drawable.kyayfa, R.string.question_24A, R.string.question_24B, R.string.question_24C, R.string.question_24D, R.string.answer_24),
                    new answerclass(R.drawable.ayna, R.string.question25_A, R.string.question25_B, R.string.question25_C, R.string.question25_C, R.string.answer_4),
                    new answerclass(R.drawable.mazaa, R.string.question_26A, R.string.question_26B, R.string.question_26C, R.string.question_26D, R.string.answer_26),
                    new answerclass(R.drawable.a_hal, R.string.question_27A, R.string.question_27B, R.string.question_27C, R.string.question_27D, R.string.answer_27),
                    new answerclass(R.drawable.ayyu, R.string.questio28_A, R.string.question28_B, R.string.question28_C, R.string.question28_D, R.string.answer_28),
                    new answerclass(R.drawable.lima, R.string.question29_A, R.string.question29_B, R.string.question29_C, R.string.question29_D, R.string.answer_29),
                    new answerclass(R.drawable.laula, R.string.question30_A, R.string.question30_B, R.string.question30_C, R.string.question30_D, R.string.answer_30),
                    new answerclass(R.drawable.limaza, R.string.question31_A, R.string.question31_B, R.string.question31_C, R.string.question31_D, R.string.answer_31),
                    new answerclass(R.drawable.kaablya, R.string.question_32A, R.string.question_32B, R.string.question_32C, R.string.question_32D, R.string.answer_32),
                    new answerclass(R.drawable.baad, R.string.question_33A, R.string.question_33B, R.string.question_33C, R.string.question_33D, R.string.answer_33),
                    new answerclass(R.drawable.xin, R.string.question_34A, R.string.question_34B, R.string.question_34C, R.string.question_34D, R.string.answer_34),
                    new answerclass(R.drawable.anti, R.string.question_35A, R.string.question_35B, R.string.question_35C, R.string.question_35D, R.string.answer_35),
                    new answerclass(R.drawable.hum, R.string.question_36A, R.string.question_36B, R.string.question_36C, R.string.question_36D, R.string.answer_36),
                    new answerclass(R.drawable.hiya, R.string.question37_A, R.string.question37_B, R.string.question37_C, R.string.question37_D, R.string.answer_37),
                    new answerclass(R.drawable.ka2, R.string.question38_A, R.string.question38_B, R.string.question38_C, R.string.question38_D, R.string.answer_38),
                    new answerclass(R.drawable.hunna2, R.string.question_39A, R.string.question_39B, R.string.question_39C, R.string.question_39D, R.string.answer_4),
                    new answerclass(R.drawable.kyam, R.string.question40_A, R.string.question40_B, R.string.question40_C, R.string.question40_D, R.string.answer_40),


            };

    final int PROGRESS_BAR = (int) Math.ceil(100 / questionBank.length);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);

        optionA = findViewById(R.id.optionA);
        optionB = findViewById(R.id.optionB);
        optionC = findViewById(R.id.optionC);
        optionD = findViewById(R.id.optionD);

        question = findViewById(R.id.question);
        score = findViewById(R.id.score);
        questionnumber = findViewById(R.id.QuestionNumber);

        chechkout1 = findViewById(R.id.selectoption);
        checkout2 = findViewById(R.id.CorrectAnswer);
        progressBar = findViewById(R.id.progress_bar);

        CurrentQuestion = questionBank[currentIndex].getQuestionid();
        question.setImageResource(CurrentQuestion);
        CurrentOptionA = questionBank[currentIndex].getOptionA();
        optionA.setText(CurrentOptionA);
        CurrentOptionB = questionBank[currentIndex].getOptionB();
        optionB.setText(CurrentOptionB);
        CurrentOptionC = questionBank[currentIndex].getOptionC();
        optionC.setText(CurrentOptionC);
        CurrentOptionD = questionBank[currentIndex].getOptionD();
        optionD.setText(CurrentOptionD);

        optionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(CurrentOptionA);
                updateQuestion();

            }
        });

        optionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(CurrentOptionB);
                updateQuestion();


            }
        });
        optionC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(CurrentOptionC);
                updateQuestion();


            }
        });
        optionD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                checkAnswer(CurrentOptionD);
                updateQuestion();

            }
        });


    }

    private void checkAnswer(int userSelection) {

        int correctanswer = questionBank[currentIndex].getAnswerid();

        chechkout1.setText(userSelection);
        checkout2.setText(correctanswer);

        String m = chechkout1.getText().toString().trim();
        String n = checkout2.getText().toString().trim();

        if (m.equals(n)) {
            Toast.makeText(getApplicationContext(), "Right", Toast.LENGTH_SHORT).show();
            mscore = mscore + 1;
        } else {
            Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
        }


    }

    @SuppressLint("SetTextI18n")
    private void updateQuestion() {

        currentIndex = (currentIndex + 1) % questionBank.length;

        if (currentIndex == 0) {
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("Game Over");
            alert.setCancelable(false);
            alert.setMessage("Your Score " + mscore + " points");
            alert.setPositiveButton("Next Step", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(TestActivity2.this, LessonsActivity.class);
                    startActivity(intent);
                    TestActivity2.this.finish();

                }
            });
            alert.setNegativeButton("Try again", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    mscore = 0;
                    qn = 1;
                    progressBar.setProgress(0);
                    score.setText("Score" + mscore + "/" + questionBank.length);
                    questionnumber.setText(qn + "/" + questionBank.length + "Question");
                }
            });


            alert.show();
        }


        CurrentQuestion = questionBank[currentIndex].getQuestionid();
        question.setImageResource(CurrentQuestion);
        CurrentOptionA = questionBank[currentIndex].getOptionA();
        optionA.setText(CurrentOptionA);
        CurrentOptionB = questionBank[currentIndex].getOptionB();
        optionB.setText(CurrentOptionB);
        CurrentOptionC = questionBank[currentIndex].getOptionC();
        optionC.setText(CurrentOptionC);
        CurrentOptionD = questionBank[currentIndex].getOptionD();
        optionD.setText(CurrentOptionD);

        qn = qn + 1;

        if (qn <= questionBank.length) {
            questionnumber.setText(qn + "/" + questionBank.length + "Question");
        }
        score.setText("Score" + mscore + "/" + questionBank.length);
        progressBar.incrementProgressBy(PROGRESS_BAR);


    }

}
