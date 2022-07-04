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

public class TestActivity5 extends AppCompatActivity {
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
                    new answerclass(R.drawable.kullama, R.string.question81_A, R.string.question81_B, R.string.question81_C, R.string.question81_D, R.string.answer_81),
                    new answerclass(R.drawable.kaannama, R.string.question_82A, R.string.question_82B, R.string.question_82C, R.string.question_82D, R.string.answer_82),
                    new answerclass(R.drawable.innama, R.string.question_83A, R.string.question_83B, R.string.question_83C, R.string.question_83D, R.string.answer_83),
                    new answerclass(R.drawable.kaanna, R.string.question_84A, R.string.question_84B, R.string.question_84C, R.string.question_84D, R.string.answer_84),
                    new answerclass(R.drawable.anna2, R.string.question_85A, R.string.question_85B, R.string.question_85C, R.string.question_85C, R.string.answer_85),
                    new answerclass(R.drawable.inna, R.string.question_86A, R.string.question_86B, R.string.question_86C, R.string.question_86D, R.string.answer_86),
                    new answerclass(R.drawable.laalla, R.string.question87_A, R.string.question87_B, R.string.question87_C, R.string.question87_D, R.string.answer_87),
                    new answerclass(R.drawable.lakinna, R.string.question88_A, R.string.question88_B, R.string.question88_C, R.string.question88_D, R.string.answer_88),
                    new answerclass(R.drawable.lakin, R.string.question_89A, R.string.question_89B, R.string.question_89C, R.string.question_89D, R.string.answer_89),
                    new answerclass(R.drawable.iyya, R.string.question90_A, R.string.question90_B, R.string.question90_C, R.string.question90_D, R.string.answer_90),
                    new answerclass(R.drawable.in, R.string.question91_A, R.string.question91_B, R.string.question91_C, R.string.question91_D, R.string.answer_91),
                    new answerclass(R.drawable.an, R.string.question_92A, R.string.question_92B, R.string.question_92C, R.string.question_92D, R.string.answer_92),
                    new answerclass(R.drawable.lau, R.string.question_93A, R.string.question_93B, R.string.question_93C, R.string.question_93D, R.string.answer_93),
                    new answerclass(R.drawable.lamma, R.string.question_94A, R.string.question_94B, R.string.question_94C, R.string.question_94D, R.string.answer_94),
                    new answerclass(R.drawable.asa, R.string.question_95A,  R.string.question_95B, R.string.question_95C, R.string.question_95D, R.string.answer_95),
                    new answerclass(R.drawable.kullu, R.string.question_96A, R.string.question_96B, R.string.question_96C,  R.string.question_96D, R.string.answer_96),
                    new answerclass(R.drawable.ya, R.string.question97_A, R.string.question97_B, R.string.question97_C, R.string.question97_D, R.string.answer_97),
                    new answerclass(R.drawable.yaayhuhal, R.string.question98_A, R.string.question98_B, R.string.question98_C, R.string.question98_D, R.string.answer_98),
                    new answerclass(R.drawable.amiin, R.string.question_99A, R.string.question_99B, R.string.question_99C, R.string.question_99D, R.string.answer_99),
                    new answerclass(R.drawable.ula, R.string.question100_A, R.string.question100_B, R.string.question100_C, R.string.question100_D, R.string.answer_100),


            };

    final int PROGRESS_BAR = (int) Math.ceil(100 / questionBank.length);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test5);

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
                    Intent intent = new Intent(TestActivity5.this, LessonsActivity.class);
                    startActivity(intent);
                    TestActivity5.this.finish();

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
