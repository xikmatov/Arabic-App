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

public class TestActivity4 extends AppCompatActivity {
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
                    new answerclass(R.drawable.an, R.string.question61_A, R.string.question61_B, R.string.question61_C, R.string.question61_D, R.string.answer_61),
                    new answerclass(R.drawable.bi, R.string.question_62A, R.string.question_62B, R.string.question_62C, R.string.question_62D, R.string.answer_62),
                    new answerclass(R.drawable.min, R.string.question_63A, R.string.question_63B, R.string.question_63C, R.string.question_63D, R.string.answer_63),
                    new answerclass(R.drawable.lilaa, R.string.question_64A, R.string.question_64B, R.string.question_64C, R.string.question_64D, R.string.answer_64),
                    new answerclass(R.drawable.ka, R.string.question_65A, R.string.question_65B, R.string.question_65C, R.string.question_65C, R.string.answer_65),
                    new answerclass(R.drawable.xatta, R.string.question_66A, R.string.question_66B, R.string.question_66C, R.string.question_66D, R.string.answer_66),
                    new answerclass(R.drawable.ta, R.string.question67_A, R.string.question67_B, R.string.question67_C, R.string.question67_D, R.string.answer_67),
                    new answerclass(R.drawable.ila, R.string.question68_A, R.string.question68_B, R.string.question68_C, R.string.question68_D, R.string.answer_68),
                    new answerclass(R.drawable.va, R.string.question_69A, R.string.question_69B, R.string.question_69C, R.string.question_69D, R.string.answer_69),
                    new answerclass(R.drawable.maa, R.string.question70_A, R.string.question70_B, R.string.question70_C, R.string.question70_D, R.string.answer_70),
                    new answerclass(R.drawable.ala, R.string.question71_A, R.string.question71_B, R.string.question71_C, R.string.question71_D, R.string.answer_71),
                    new answerclass(R.drawable.fima, R.string.question_72A, R.string.question_72B, R.string.question_72C, R.string.question_72D, R.string.answer_72),
                    new answerclass(R.drawable.ammaa, R.string.question_73A, R.string.question_73B, R.string.question_73C, R.string.question_73D, R.string.answer_73),
                    new answerclass(R.drawable.bima, R.string.question_74A, R.string.question_74B, R.string.question_74C, R.string.question_74D, R.string.answer_74),
                    new answerclass(R.drawable.mimma, R.string.question_75A,  R.string.question_75B, R.string.question_75C, R.string.question_75D, R.string.answer_75),
                    new answerclass(R.drawable.lima, R.string.question_76A, R.string.question_76B, R.string.question_76C,  R.string.question_76D, R.string.answer_76),
                    new answerclass(R.drawable.kama, R.string.question77_A, R.string.question77_B, R.string.question77_C, R.string.question77_D, R.string.answer_77),
                    new answerclass(R.drawable.annama, R.string.question78_A, R.string.question78_B, R.string.question78_C, R.string.question78_D, R.string.answer_78),
                    new answerclass(R.drawable.imma, R.string.question_79A, R.string.question_79B, R.string.question_79C, R.string.question_79D, R.string.answer_79),
                    new answerclass(R.drawable.amma, R.string.question80_A, R.string.question80_B, R.string.question80_C, R.string.question80_D, R.string.answer_80),


            };

    final int PROGRESS_BAR = (int) Math.ceil(100 / questionBank.length);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test4);

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
                    Intent intent = new Intent(TestActivity4.this, LessonsActivity.class);
                    startActivity(intent);
                    TestActivity4.this.finish();

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
