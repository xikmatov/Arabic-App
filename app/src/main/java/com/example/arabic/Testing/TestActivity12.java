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

public class TestActivity12 extends AppCompatActivity {
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
                    new answerclass(R.drawable.kalima, R.string.question221_A, R.string.question221_B, R.string.question221_C, R.string.question221_D, R.string.answer_221),
                    new answerclass(R.drawable.vahida, R.string.question_222A, R.string.question_222B, R.string.question_222C, R.string.question_222D, R.string.answer_222),
                    new answerclass(R.drawable.vahid, R.string.question_223A, R.string.question_223B, R.string.question_223C, R.string.question_223D, R.string.answer_223),
                    new answerclass(R.drawable.missaq, R.string.question224_A, R.string.question224_B, R.string.question224_C, R.string.question224_D, R.string.answer_224),
                    new answerclass(R.drawable.taqva, R.string.question_225A, R.string.question_225B, R.string.question_225C, R.string.question_225C, R.string.answer_225),
                    new answerclass(R.drawable.amur, R.string.question_226A, R.string.question_226B, R.string.question_226C, R.string.question_226D, R.string.answer_226),
                    new answerclass(R.drawable.amr, R.string.question227_A, R.string.question227_B, R.string.question227_C, R.string.question227_D, R.string.answer_227),
                    new answerclass(R.drawable.hikma, R.string.question228_A, R.string.question228_B, R.string.question228_C, R.string.question228_D, R.string.answer_228),
                    new answerclass(R.drawable.baaatil, R.string.question229_A, R.string.question229_B, R.string.question229_C, R.string.question229_D, R.string.answer_229),
                    new answerclass(R.drawable.haqq, R.string.question230_A, R.string.question230_B, R.string.question230_C, R.string.question230_D, R.string.answer_230),
                    new answerclass(R.drawable.zakaa, R.string.question_231A, R.string.question_231B, R.string.question_231C, R.string.question_231D, R.string.answer_231),
                    new answerclass(R.drawable.diin, R.string.question_232A, R.string.question_232B, R.string.question_232C, R.string.question_232D, R.string.answer_232),
                    new answerclass(R.drawable.hamd, R.string.question_233A, R.string.question_233B, R.string.question_233C, R.string.question_233D, R.string.answer_233),
                    new answerclass(R.drawable.mubiin, R.string.question_234A, R.string.question_234B, R.string.question_234C, R.string.question_234D, R.string.answer_234),
                    new answerclass(R.drawable.shahiid, R.string.question_235A,  R.string.question_235B, R.string.question_235C, R.string.question_235D, R.string.answer_235),
                    new answerclass(R.drawable.shuhada, R.string.question236_A, R.string.question236_B, R.string.question236_C,  R.string.question236_D, R.string.answer_236),
                    new answerclass(R.drawable.nuur, R.string.question237_A, R.string.question237_B, R.string.question237_C, R.string.question237_D, R.string.answer_237),
                    new answerclass(R.drawable.sala, R.string.question_238A, R.string.question_238B, R.string.question_238C, R.string.question_238D, R.string.answer_238),
                    new answerclass(R.drawable.fadl, R.string.question_239A, R.string.question_239B, R.string.question_239C, R.string.question_239D, R.string.answer_239),
                    new answerclass(R.drawable.sultan, R.string.question240_A, R.string.question240_B, R.string.question240_C, R.string.question240_D, R.string.answer_240),


            };

    final int PROGRESS_BAR = (int) Math.ceil(100 / questionBank.length);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test12);

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
                    Intent intent = new Intent(TestActivity12.this, LessonsActivity.class);
                    startActivity(intent);
                    TestActivity12.this.finish();

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
