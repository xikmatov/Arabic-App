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

public class TestActivity13 extends AppCompatActivity {
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
                    new answerclass(R.drawable.aalya, R.string.question241_A, R.string.question241_B, R.string.question241_C, R.string.question241_D, R.string.answer_241),
                    new answerclass(R.drawable.niama2, R.string.question_242A, R.string.question_242B, R.string.question_242C, R.string.question_242D, R.string.answer_242),
                    new answerclass(R.drawable.mulk, R.string.question_243A, R.string.question_243B, R.string.question_243C, R.string.question_243D, R.string.answer_243),
                    new answerclass(R.drawable.maa, R.string.question_244A, R.string.question_244B, R.string.question_244C, R.string.question_244D, R.string.answer_244),
                    new answerclass(R.drawable.izn, R.string.question245_A, R.string.question245_B, R.string.question245_C, R.string.question245_C, R.string.answer_245),
                    new answerclass(R.drawable.ajmain, R.string.question_246A, R.string.question_246B, R.string.question_246C, R.string.question_246D, R.string.answer_246),
                    new answerclass(R.drawable.ajmaun, R.string.question_247A, R.string.question_247B, R.string.question_247C, R.string.question_247D, R.string.answer_247),
                    new answerclass(R.drawable.sava, R.string.question248_A, R.string.question248_B, R.string.question248_C, R.string.question248_D, R.string.answer_248),
                    new answerclass(R.drawable.jamia, R.string.question249_A, R.string.question249_B, R.string.question249_C, R.string.question249_D, R.string.answer_249),
                    new answerclass(R.drawable.bas, R.string.question250_A, R.string.question250_B, R.string.question250_C, R.string.question250_D, R.string.answer_250),
                    new answerclass(R.drawable.fariiq, R.string.question251_A, R.string.question251_B, R.string.question251_C, R.string.question251_D, R.string.answer_251),
                    new answerclass(R.drawable.absaar, R.string.question_252A, R.string.question_252B, R.string.question_252C, R.string.question_252D, R.string.answer_252),
                    new answerclass(R.drawable.vujuh, R.string.question_253A, R.string.question_253B, R.string.question_253C, R.string.question_253D, R.string.answer_253),
                    new answerclass(R.drawable.vajh, R.string.question_254A, R.string.question_254B, R.string.question_254C, R.string.question_254D, R.string.answer_254),
                    new answerclass(R.drawable.afvah, R.string.question255_A,  R.string.question255_B, R.string.question255_C, R.string.question255_D, R.string.answer_255),
                    new answerclass(R.drawable.ayun, R.string.question_256A, R.string.question_256B, R.string.question_256C,  R.string.question_256D, R.string.answer_256),
                    new answerclass(R.drawable.ayn, R.string.question_257A, R.string.question_257B, R.string.question_257C, R.string.question_257D, R.string.answer_257),
                    new answerclass(R.drawable.qalp, R.string.question258_A, R.string.question258_B, R.string.question258_C, R.string.question258_D, R.string.answer_258),
                    new answerclass(R.drawable.alsina, R.string.question259_A, R.string.question259_B, R.string.question259_C, R.string.question259_D, R.string.answer_259),
                    new answerclass(R.drawable.lisaan, R.string.question260_A, R.string.question260_B, R.string.question260_C, R.string.question260_D, R.string.answer_260),


            };

    final int PROGRESS_BAR = (int) Math.ceil(100 / questionBank.length);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test13);

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
                    Intent intent = new Intent(TestActivity13.this, LessonsActivity.class);
                    startActivity(intent);
                    TestActivity13.this.finish();

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
