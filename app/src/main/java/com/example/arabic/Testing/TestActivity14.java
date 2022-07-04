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

public class TestActivity14 extends AppCompatActivity {
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
                    new answerclass(R.drawable.suduur, R.string.question261_A, R.string.question261_B, R.string.question261_C, R.string.question261_D, R.string.answer_261),
                    new answerclass(R.drawable.sadr, R.string.question_262A, R.string.question_262B, R.string.question_262C, R.string.question_262D, R.string.answer_262),
                    new answerclass(R.drawable.quluub, R.string.question_263A, R.string.question_263B, R.string.question_263C, R.string.question_263D, R.string.answer_263),
                    new answerclass(R.drawable.ruuh, R.string.question_264A, R.string.question_264B, R.string.question_264C, R.string.question_264D, R.string.answer_264),
                    new answerclass(R.drawable.aydii, R.string.question_265A, R.string.question_265B, R.string.question_265C, R.string.question_265C, R.string.answer_265),
                    new answerclass(R.drawable.yad, R.string.question_266A, R.string.question_266B, R.string.question_266C, R.string.question_266D, R.string.answer_266),
                    new answerclass(R.drawable.quvva, R.string.question267_A, R.string.question267_B, R.string.question267_C, R.string.question267_D, R.string.answer_267),
                    new answerclass(R.drawable.arjul, R.string.question268_A, R.string.question268_B, R.string.question268_C, R.string.question268_D, R.string.answer_268),
                    new answerclass(R.drawable.rijl, R.string.question_269A, R.string.question_269B, R.string.question_269C, R.string.question_269D, R.string.answer_269),
                    new answerclass(R.drawable.ikhvan, R.string.question270_A, R.string.question270_B, R.string.question270_C, R.string.question270_D, R.string.answer_270),
                    new answerclass(R.drawable.anfus, R.string.question271_A, R.string.question271_B, R.string.question271_C, R.string.question271_D, R.string.answer_271),
                    new answerclass(R.drawable.nafs, R.string.question_272A, R.string.question_272B, R.string.question_272C, R.string.question_272D, R.string.answer_272),
                    new answerclass(R.drawable.ab, R.string.question_273A, R.string.question_273B, R.string.question_273C, R.string.question_273D, R.string.answer_273),
                    new answerclass(R.drawable.ammahat, R.string.question_274A, R.string.question_274B, R.string.question_274C, R.string.question_274D, R.string.answer_274),
                    new answerclass(R.drawable.umm, R.string.question_275A,  R.string.question_275B, R.string.question_275C, R.string.question_275D, R.string.answer_275),
                    new answerclass(R.drawable.zauj, R.string.question_276A, R.string.question_276B, R.string.question_276C,  R.string.question_276D, R.string.answer_276),
                    new answerclass(R.drawable.aba, R.string.question277_A, R.string.question277_B, R.string.question277_C, R.string.question277_D, R.string.answer_277),
                    new answerclass(R.drawable.abat, R.string.question278_A, R.string.question278_B, R.string.question278_C, R.string.question278_D, R.string.answer_278),
                    new answerclass(R.drawable.rijaal, R.string.question_279A, R.string.question_279B, R.string.question_279C, R.string.question_279D, R.string.answer_279),
                    new answerclass(R.drawable.rajul, R.string.question280_A, R.string.question280_B, R.string.question280_C, R.string.question280_D, R.string.answer_280),


            };

    final int PROGRESS_BAR = (int) Math.ceil(100 / questionBank.length);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test14);

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
                    Intent intent = new Intent(TestActivity14.this, LessonsActivity.class);
                    startActivity(intent);
                    TestActivity14.this.finish();

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
