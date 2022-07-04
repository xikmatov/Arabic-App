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

public class TestActivity6 extends AppCompatActivity {
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
                    new answerclass(R.drawable.avval, R.string.question101_A, R.string.question101_B, R.string.question101_C, R.string.question101_D, R.string.answer_101),
                    new answerclass(R.drawable.baseer, R.string.question_102A, R.string.question_102B, R.string.question_102C, R.string.question_102D, R.string.answer_102),
                    new answerclass(R.drawable.ukhra, R.string.question_103A, R.string.question_103B, R.string.question_103C, R.string.question_103D, R.string.answer_103),
                    new answerclass(R.drawable.ukhra, R.string.question_104A, R.string.question_104B, R.string.question_104C, R.string.question_104D, R.string.answer_104),
                    new answerclass(R.drawable.akhar, R.string.question105_A, R.string.question105_B, R.string.question105_C, R.string.question105_C, R.string.answer_105),
                    new answerclass(R.drawable.hakeem, R.string.question_106A, R.string.question_106B, R.string.question_106C, R.string.question_106D, R.string.answer_106),
                    new answerclass(R.drawable.hafiiz, R.string.question_107A, R.string.question_107B, R.string.question_107C, R.string.question_107D, R.string.answer_107),
                    new answerclass(R.drawable.tavvaab, R.string.question108_A, R.string.question108_B, R.string.question108_C, R.string.question108_D, R.string.answer_108),
                    new answerclass(R.drawable.hamiim, R.string.question109_A, R.string.question109_B, R.string.question109_C, R.string.question109_D, R.string.answer_109),
                    new answerclass(R.drawable.hamiid, R.string.question110_A, R.string.question110_B, R.string.question110_C, R.string.question110_D, R.string.answer_110),
                    new answerclass(R.drawable.rahmaan, R.string.question111_A, R.string.question111_B, R.string.question111_C, R.string.question111_D, R.string.answer_111),
                    new answerclass(R.drawable.rabb, R.string.question_112A, R.string.question_112B, R.string.question_112C, R.string.question_112D, R.string.answer_112),
                    new answerclass(R.drawable.khabeer, R.string.question_113A, R.string.question_113B, R.string.question_113C, R.string.question_113D, R.string.answer_113),
                    new answerclass(R.drawable.shakuur, R.string.question_114A, R.string.question_114B, R.string.question_114C, R.string.question_114D, R.string.answer_114),
                    new answerclass(R.drawable.sami, R.string.question115_A,  R.string.question115_B, R.string.question115_C, R.string.question115_D, R.string.answer_115),
                    new answerclass(R.drawable.salyaam, R.string.question_116A, R.string.question_116B, R.string.question_116C,  R.string.question_116D, R.string.answer_116),
                    new answerclass(R.drawable.qadiir, R.string.question_117A, R.string.question_117B, R.string.question_117C, R.string.question_117D, R.string.answer_117),
                    new answerclass(R.drawable.gafuur, R.string.question118_A, R.string.question118_B, R.string.question118_C, R.string.question118_D, R.string.answer_118),
                    new answerclass(R.drawable.aziiz, R.string.question119_A, R.string.question119_B, R.string.question119_C, R.string.question119_D, R.string.answer_119),
                    new answerclass(R.drawable.vakiil, R.string.question120_A, R.string.question120_B, R.string.question120_C, R.string.question120_D, R.string.answer_120),


            };

    final int PROGRESS_BAR = (int) Math.ceil(100 / questionBank.length);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test6);

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
                    Intent intent = new Intent(TestActivity6.this, LessonsActivity.class);
                    startActivity(intent);
                    TestActivity6.this.finish();

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
