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

public class TestActivity10 extends AppCompatActivity {
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
                    new answerclass(R.drawable.abadan, R.string.question181_A, R.string.question181_B, R.string.question181_C, R.string.question181_D, R.string.answer_181),
                    new answerclass(R.drawable.aliim, R.string.question_182A, R.string.question_182B, R.string.question_182C, R.string.question_182D, R.string.answer_182),
                    new answerclass(R.drawable.alakhira, R.string.question_183A, R.string.question_183B, R.string.question_183C, R.string.question_183D, R.string.answer_183),
                    new answerclass(R.drawable.ajal, R.string.question_184A, R.string.question_184B, R.string.question_184C, R.string.question_184D, R.string.answer_184),
                    new answerclass(R.drawable.jaza, R.string.question_185A, R.string.question_185B, R.string.question_185C, R.string.question_185C, R.string.answer_185),
                    new answerclass(R.drawable.jahiim, R.string.question_186A, R.string.question_186B, R.string.question_186C, R.string.question_186D, R.string.answer_186),
                    new answerclass(R.drawable.savaab, R.string.question187_A, R.string.question187_B, R.string.question187_C, R.string.question187_D, R.string.answer_187),
                    new answerclass(R.drawable.jahannam, R.string.question188_A, R.string.question188_B, R.string.question188_C, R.string.question188_D, R.string.answer_188),
                    new answerclass(R.drawable.jannat, R.string.question_189A, R.string.question_189B, R.string.question_189C, R.string.question_189D, R.string.answer_189),
                    new answerclass(R.drawable.janna, R.string.question190_A, R.string.question190_B, R.string.question190_C, R.string.question190_D, R.string.answer_190),
                    new answerclass(R.drawable.saa, R.string.question191_A, R.string.question191_B, R.string.question191_C, R.string.question191_D, R.string.answer_191),
                    new answerclass(R.drawable.hisaab, R.string.question_192A, R.string.question_192B, R.string.question_192C, R.string.question_192D, R.string.answer_192),
                    new answerclass(R.drawable.aqiba, R.string.question_193A, R.string.question_193B, R.string.question_193C, R.string.question_193D, R.string.answer_193),
                    new answerclass(R.drawable.asxaab, R.string.question_194A, R.string.question_194B, R.string.question_194C, R.string.question_194D, R.string.answer_194),
                    new answerclass(R.drawable.saaxib, R.string.question_195A,  R.string.question_195B, R.string.question_195C, R.string.question_195D, R.string.answer_195),
                    new answerclass(R.drawable.qiyama, R.string.question_196A, R.string.question_196B, R.string.question_196C,  R.string.question_196D, R.string.answer_196),
                    new answerclass(R.drawable.iqab, R.string.question197_A, R.string.question197_B, R.string.question197_C, R.string.question197_D, R.string.answer_197),
                    new answerclass(R.drawable.azab, R.string.question198_A, R.string.question198_B, R.string.question198_C, R.string.question198_D, R.string.answer_198),
                    new answerclass(R.drawable.anhar, R.string.question_199A, R.string.question_199B, R.string.question_199C, R.string.question_199D, R.string.answer_199),
                    new answerclass(R.drawable.nahaar, R.string.question200_A, R.string.question200_B, R.string.question200_C, R.string.question200_D, R.string.answer_200),


            };

    final int PROGRESS_BAR = (int) Math.ceil(100 / questionBank.length);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test10);

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
                    Intent intent = new Intent(TestActivity10.this, LessonsActivity.class);
                    startActivity(intent);
                    TestActivity10.this.finish();

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
