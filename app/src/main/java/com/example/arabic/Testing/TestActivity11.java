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

public class TestActivity11 extends AppCompatActivity {
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
                    new answerclass(R.drawable.musamma, R.string.question201_A, R.string.question201_B, R.string.question201_C, R.string.question201_D, R.string.answer_201),
                    new answerclass(R.drawable.ayaam, R.string.question_202A, R.string.question_202B, R.string.question_202C, R.string.question_202D, R.string.answer_202),
                    new answerclass(R.drawable.yaum, R.string.question_203A, R.string.question_203B, R.string.question_203C, R.string.question_203D, R.string.answer_203),
                    new answerclass(R.drawable.vail, R.string.question_204A, R.string.question_204B, R.string.question_204C, R.string.question_204D, R.string.answer_204),
                    new answerclass(R.drawable.yaumaizin, R.string.question205_A, R.string.question205_B, R.string.question205_C, R.string.question205_C, R.string.answer_205),
                    new answerclass(R.drawable.naar, R.string.question_206A, R.string.question_206B, R.string.question_206C, R.string.question_206D, R.string.answer_206),
                    new answerclass(R.drawable.ilah, R.string.question_207A, R.string.question_207B, R.string.question_207C, R.string.question_207D, R.string.answer_207),
                    new answerclass(R.drawable.ihda, R.string.question208_A, R.string.question208_B, R.string.question208_C, R.string.question208_D, R.string.answer_208),
                    new answerclass(R.drawable.ahad, R.string.question209_A, R.string.question209_B, R.string.question209_C, R.string.question209_D, R.string.answer_209),
                    new answerclass(R.drawable.shuraka, R.string.question210_A, R.string.question210_B, R.string.question210_C, R.string.question210_D, R.string.answer_210),
                    new answerclass(R.drawable.shariik, R.string.question211_A, R.string.question211_B, R.string.question211_C, R.string.question211_D, R.string.answer_211),
                    new answerclass(R.drawable.aliha, R.string.question_212A, R.string.question_212B, R.string.question_212C, R.string.question_212D, R.string.answer_212),
                    new answerclass(R.drawable.aahd, R.string.question_213A, R.string.question_213B, R.string.question_213C, R.string.question_213D, R.string.answer_213),
                    new answerclass(R.drawable.arsh, R.string.question_214A, R.string.question_214B, R.string.question_214C, R.string.question_214D, R.string.answer_214),
                    new answerclass(R.drawable.shahada, R.string.question215_A,  R.string.question215_B, R.string.question215_C, R.string.question215_D, R.string.answer_215),
                    new answerclass(R.drawable.kutub, R.string.question_216A, R.string.question_216B, R.string.question_216C,  R.string.question_216D, R.string.answer_216),
                    new answerclass(R.drawable.kitaab, R.string.question_217A, R.string.question_217B, R.string.question_217C, R.string.question_217D, R.string.answer_217),
                    new answerclass(R.drawable.gayb, R.string.question218_A, R.string.question218_B, R.string.question218_C, R.string.question218_D, R.string.answer_218),
                    new answerclass(R.drawable.malikka, R.string.question219_A, R.string.question219_B, R.string.question219_C, R.string.question219_D, R.string.answer_219),
                    new answerclass(R.drawable.malak, R.string.question220_A, R.string.question220_B, R.string.question220_C, R.string.question220_D, R.string.answer_220),


            };

    final int PROGRESS_BAR = (int) Math.ceil(100 / questionBank.length);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test11);

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
                    Intent intent = new Intent(TestActivity11.this, LessonsActivity.class);
                    startActivity(intent);
                    TestActivity11.this.finish();

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
