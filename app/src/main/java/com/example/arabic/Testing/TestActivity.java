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

public class TestActivity extends AppCompatActivity {
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
                    new answerclass(R.drawable.ki2, R.string.question1_A, R.string.question1_B, R.string.question1_C, R.string.question1_D, R.string.answer_1),
                    new answerclass(R.drawable.hunna2, R.string.question_2A, R.string.question_2B, R.string.question_2C, R.string.question_2D, R.string.answer_2),
                    new answerclass(R.drawable.haa, R.string.question_3A, R.string.question_3B, R.string.question_3C, R.string.question_3D, R.string.answer_3),
                    new answerclass(R.drawable.naa2, R.string.question_4A, R.string.question_4B, R.string.question_4C, R.string.question_4D, R.string.answer_4),
                    new answerclass(R.drawable.i2, R.string.question5_A, R.string.question5_B, R.string.question5_C, R.string.question5_D, R.string.answer_5),
                    new answerclass(R.drawable.kum2, R.string.question_6A, R.string.question_6B, R.string.question_6C, R.string.question_6D, R.string.answer_6),
                    new answerclass(R.drawable.ka2, R.string.question_7A, R.string.question_7B, R.string.question_7C, R.string.question_7D, R.string.answer_7),
                    new answerclass(R.drawable.hum2, R.string.question8_A, R.string.question8_B, R.string.question8_C, R.string.question8_D, R.string.answer_8),
                    new answerclass(R.drawable.hu, R.string.question9_A, R.string.question9_B, R.string.question9_C, R.string.question9_D, R.string.answer_9),
                    new answerclass(R.drawable.antumaa, R.string.question10_A, R.string.question10_B, R.string.question10_C, R.string.question10_D, R.string.answer_10),
                    new answerclass(R.drawable.humaa, R.string.question11_A, R.string.question11_B, R.string.question11_C, R.string.question11_D, R.string.answer_11),
                    new answerclass(R.drawable.hiya, R.string.question_12A, R.string.question_12B, R.string.question_12C, R.string.question_12D, R.string.answer_12),
                    new answerclass(R.drawable.nahnu, R.string.question_13A, R.string.question_13B, R.string.question_13C, R.string.question_13D, R.string.answer_13),
                    new answerclass(R.drawable.ana, R.string.question_14A, R.string.question_14B, R.string.question_14C, R.string.question_14D, R.string.answer_14),
                    new answerclass(R.drawable.antum, R.string.question15_A, R.string.question15_B, R.string.question15_C, R.string.question15_D, R.string.answer_15),
                    new answerclass(R.drawable.anta, R.string.question_16A, R.string.question_16B, R.string.question_16C, R.string.question_16D, R.string.answer_16),
                    new answerclass(R.drawable.hum, R.string.question_17A, R.string.question_17B, R.string.question_17C, R.string.question_17D, R.string.answer_17),
                    new answerclass(R.drawable.huwa, R.string.question18_A, R.string.question18_B, R.string.question18_C, R.string.question18_D, R.string.answer_18),
                    new answerclass(R.drawable.anti, R.string.question19_A, R.string.question19_B, R.string.question19_C, R.string.question19_D, R.string.answer_19),
                    new answerclass(R.drawable.hunna, R.string.question20_A, R.string.question20_B, R.string.question20_C, R.string.question20_D, R.string.answer_20),


            };

    final int PROGRESS_BAR = (int) Math.ceil(100 / questionBank.length);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

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
                    Intent intent = new Intent(TestActivity.this, LessonsActivity.class);
                    startActivity(intent);
                    TestActivity.this.finish();

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
