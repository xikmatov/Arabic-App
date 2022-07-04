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

public class TestActivity3 extends AppCompatActivity {
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
                    new answerclass(R.drawable.ladun, R.string.question41_A, R.string.question41_B, R.string.question41_C, R.string.question41_D, R.string.answer_41),
                    new answerclass(R.drawable.summa, R.string.question_42A, R.string.question_42B, R.string.question_42C, R.string.question_42D, R.string.answer_42),
                    new answerclass(R.drawable.bal, R.string.question_43A, R.string.question_43B, R.string.question_43C, R.string.question_43D, R.string.answer_43),
                    new answerclass(R.drawable.allya, R.string.question_44A, R.string.question_44B, R.string.question_44C, R.string.question_44D, R.string.answer_44),
                    new answerclass(R.drawable.za, R.string.question45_A, R.string.question45_B, R.string.question45_C, R.string.question45_C, R.string.answer_45),
                    new answerclass(R.drawable.mazaa, R.string.question_46A, R.string.question_46B, R.string.question_46C, R.string.question_46D, R.string.answer_46),
                    new answerclass(R.drawable.a_hal, R.string.question_47A, R.string.question_47B, R.string.question_47C, R.string.question_47D, R.string.answer_47),
                    new answerclass(R.drawable.zaat, R.string.question48_A, R.string.question48_B, R.string.question48_C, R.string.question48_D, R.string.answer_48),
                    new answerclass(R.drawable.uli, R.string.question49_A, R.string.question49_B, R.string.question49_C, R.string.question49_D, R.string.answer_49),
                    new answerclass(R.drawable.laula, R.string.question50_A, R.string.question50_B, R.string.question50_C, R.string.question50_D, R.string.answer_50),
                    new answerclass(R.drawable.a_la, R.string.question51_A, R.string.question51_B, R.string.question51_C, R.string.question51_D, R.string.answer_51),
                    new answerclass(R.drawable.al, R.string.question_52A, R.string.question_52B, R.string.question_52C, R.string.question_52D, R.string.answer_52),
                    new answerclass(R.drawable.niama, R.string.question_53A, R.string.question_53B, R.string.question_53C, R.string.question_53D, R.string.answer_53),
                    new answerclass(R.drawable.biasa, R.string.question_54A, R.string.question_54B, R.string.question_54C, R.string.question_54D, R.string.answer_54),
                    new answerclass(R.drawable.biasama, R.string.question55_A, R.string.question55_B, R.string.question55_C, R.string.question55_D, R.string.answer_55),
                    new answerclass(R.drawable.mithl, R.string.question_56A, R.string.question_56B, R.string.question_56C, R.string.question_56D, R.string.answer_56),
                    new answerclass(R.drawable.allya, R.string.question_57A, R.string.question_57B, R.string.question_57C, R.string.question_57D, R.string.answer_57),
                    new answerclass(R.drawable.mathal, R.string.question58_A, R.string.question58_B, R.string.question58_C, R.string.question58_D, R.string.answer_58),
                    new answerclass(R.drawable.amthal, R.string.question59_A, R.string.question59_B, R.string.question59_C, R.string.question59_D, R.string.answer_59),
                    new answerclass(R.drawable.fi, R.string.question60_A, R.string.question60_B, R.string.question60_C, R.string.question60_D, R.string.answer_60),


            };

    final int PROGRESS_BAR = (int) Math.ceil(100 / questionBank.length);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test3);

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
                    Intent intent = new Intent(TestActivity3.this, LessonsActivity.class);
                    startActivity(intent);
                    TestActivity3.this.finish();

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
