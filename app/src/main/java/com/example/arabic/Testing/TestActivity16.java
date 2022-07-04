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

 public class TestActivity16 extends AppCompatActivity {
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
                    new answerclass(R.drawable.valiyy, R.string.question301_A, R.string.question301_B, R.string.question301_C, R.string.question301_D, R.string.answer_301),
                    new answerclass(R.drawable.auliya, R.string.question_302A, R.string.question_302B, R.string.question_302C, R.string.question_302D, R.string.answer_302),
                    new answerclass(R.drawable.qaum, R.string.question_303A, R.string.question_303B, R.string.question_303C, R.string.question_303D, R.string.answer_303),
                    new answerclass(R.drawable.zukuur , R.string.question_304A, R.string.question_304B, R.string.question_304C, R.string.question_304D, R.string.answer_304),
                    new answerclass(R.drawable.zakar, R.string.question_305A, R.string.question_305B, R.string.question_305C, R.string.question_305C, R.string.answer_305),
                    new answerclass(R.drawable.mala, R.string.question_306A, R.string.question_306B, R.string.question_306C, R.string.question_306D, R.string.answer_306),
                    new answerclass(R.drawable.unsaa, R.string.question307_A, R.string.question307_B, R.string.question307_C, R.string.question307_D, R.string.answer_307),
                    new answerclass(R.drawable.inaas, R.string.question308_A, R.string.question308_B, R.string.question308_C, R.string.question308_D, R.string.answer_308),
                    new answerclass(R.drawable.kuffaar, R.string.question_309A, R.string.question_309B, R.string.question_309C, R.string.question_309D, R.string.answer_309),
                    new answerclass(R.drawable.ibaad, R.string.question310_A, R.string.question310_B, R.string.question310_C, R.string.question310_D, R.string.answer_310),
                    new answerclass(R.drawable.abd, R.string.question311_A, R.string.question311_B, R.string.question311_C, R.string.question311_D, R.string.answer_311),
                    new answerclass(R.drawable.mujrim, R.string.question_312A, R.string.question_312B, R.string.question_312C, R.string.question_312D, R.string.answer_312),
                    new answerclass(R.drawable.adaai, R.string.question_313A, R.string.question_313B, R.string.question_313C, R.string.question_313D, R.string.answer_313),
                    new answerclass(R.drawable.aduv, R.string.question_314A, R.string.question_314B, R.string.question_314C, R.string.question_314D, R.string.answer_314),
                    new answerclass(R.drawable.dunya, R.string.question_315A,  R.string.question_315B, R.string.question_315C, R.string.question_315D, R.string.answer_315),
                    new answerclass(R.drawable.buyoot, R.string.question_316A, R.string.question_316B, R.string.question_316C,  R.string.question_316D, R.string.answer_316),
                    new answerclass(R.drawable.beyt, R.string.question317_A, R.string.question317_B, R.string.question317_C, R.string.question317_D, R.string.answer_317),
                    new answerclass(R.drawable.sabiil, R.string.question318_A, R.string.question318_B, R.string.question318_C, R.string.question318_D, R.string.answer_318),
                    new answerclass(R.drawable.diyaar, R.string.question_319A, R.string.question_319B, R.string.question_319C, R.string.question_319D, R.string.answer_319),
                    new answerclass(R.drawable.daar, R.string.question320_A, R.string.question320_B, R.string.question320_C, R.string.question320_D, R.string.answer_320),


            };

    final int PROGRESS_BAR = (int) Math.ceil(100 / questionBank.length);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test16);

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
                    Intent intent = new Intent(TestActivity16.this, LessonsActivity.class);
                    startActivity(intent);
                    TestActivity16.this.finish();

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
