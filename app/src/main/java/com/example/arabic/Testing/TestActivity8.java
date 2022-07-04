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

public class TestActivity8 extends AppCompatActivity {
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
                    new answerclass(R.drawable.ard, R.string.question141_A, R.string.question141_B, R.string.question141_C, R.string.question141_D, R.string.answer_141),
                    new answerclass(R.drawable.bayyinat, R.string.question_142A, R.string.question_142B, R.string.question_142C, R.string.question_142D, R.string.answer_142),
                    new answerclass(R.drawable.bayyina, R.string.question_143A, R.string.question_143B, R.string.question_143C, R.string.question_143D, R.string.answer_143),
                    new answerclass(R.drawable.bahr, R.string.question_144A, R.string.question_144B, R.string.question_144C, R.string.question_144D, R.string.answer_144),
                    new answerclass(R.drawable.jibaal, R.string.question145_A, R.string.question145_B, R.string.question145_C, R.string.question145_C, R.string.answer_145),
                    new answerclass(R.drawable.jabal, R.string.question_146A, R.string.question_146B, R.string.question_146C, R.string.question_146D, R.string.answer_146),
                    new answerclass(R.drawable.layl, R.string.question_147A, R.string.question_147B, R.string.question_147C, R.string.question_147D, R.string.answer_147),
                    new answerclass(R.drawable.qamar, R.string.question148_A, R.string.question148_B, R.string.question148_C, R.string.question148_D, R.string.answer_148),
                    new answerclass(R.drawable.shams, R.string.question149_A, R.string.question149_B, R.string.question149_C, R.string.question149_D, R.string.answer_149),
                    new answerclass(R.drawable.samud, R.string.question150_A, R.string.question150_B, R.string.question150_C, R.string.question150_D, R.string.answer_150),
                    new answerclass(R.drawable.aad, R.string.question151_A, R.string.question151_B, R.string.question151_C, R.string.question151_D, R.string.answer_151),
                    new answerclass(R.drawable.nahaar, R.string.question_152A, R.string.question_152B, R.string.question_152C, R.string.question_152D, R.string.answer_152),
                    new answerclass(R.drawable.firaun, R.string.question_153A, R.string.question_153B, R.string.question_153C, R.string.question_153D, R.string.answer_153),
                    new answerclass(R.drawable.samavat, R.string.question_154A, R.string.question_154B, R.string.question_154C, R.string.question_154D, R.string.answer_154),
                    new answerclass(R.drawable.sama, R.string.question155_A,  R.string.question155_B, R.string.question155_C, R.string.question155_D, R.string.answer_155),
                    new answerclass(R.drawable.anaam, R.string.question_156A, R.string.question_156B, R.string.question_156C,  R.string.question_156D, R.string.answer_156),
                    new answerclass(R.drawable.shayatin, R.string.question_157A, R.string.question_157B, R.string.question_157C, R.string.question_157D, R.string.answer_157),
                    new answerclass(R.drawable.shaytan, R.string.question158_A, R.string.question158_B, R.string.question158_C, R.string.question158_D, R.string.answer_158),
                    new answerclass(R.drawable.nabi, R.string.question159_A, R.string.question159_B, R.string.question159_C, R.string.question159_D, R.string.answer_159),
                    new answerclass(R.drawable.rusul, R.string.question160_A, R.string.question160_B, R.string.question160_C, R.string.question160_D, R.string.answer_160),


            };

    final int PROGRESS_BAR = (int) Math.ceil(100 / questionBank.length);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test8);

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
                    Intent intent = new Intent(TestActivity8.this, LessonsActivity.class);
                    startActivity(intent);
                    TestActivity8.this.finish();

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
