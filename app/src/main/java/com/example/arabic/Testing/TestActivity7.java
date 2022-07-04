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

public class TestActivity7 extends AppCompatActivity {
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
                    new answerclass(R.drawable.naseer, R.string.question121_A, R.string.question121_B, R.string.question121_C, R.string.question121_D, R.string.answer_121),
                    new answerclass(R.drawable.nazeer, R.string.question_122A, R.string.question_122B, R.string.question_122C, R.string.question_122D, R.string.answer_122),
                    new answerclass(R.drawable.kariim, R.string.question_123A, R.string.question_123B, R.string.question_123C, R.string.question_123D, R.string.answer_123),
                    new answerclass(R.drawable.ashadda, R.string.question124_A, R.string.question124_B, R.string.question124_C, R.string.question124_D, R.string.answer_124),
                    new answerclass(R.drawable.shadiid, R.string.question_125A, R.string.question_125B, R.string.question_125C, R.string.question_125C, R.string.answer_125),
                    new answerclass(R.drawable.alam, R.string.question_126A, R.string.question_126B, R.string.question_126C, R.string.question_126D, R.string.answer_126),
                    new answerclass(R.drawable.aliim, R.string.question127_A, R.string.question127_B, R.string.question127_C, R.string.question127_D, R.string.answer_127),
                    new answerclass(R.drawable.ala2, R.string.question128_A, R.string.question128_B, R.string.question128_C, R.string.question128_D, R.string.answer_128),
                    new answerclass(R.drawable.aliyy, R.string.question129_A, R.string.question129_B, R.string.question129_C, R.string.question129_D, R.string.answer_129),
                    new answerclass(R.drawable.aqrab, R.string.question130_A, R.string.question130_B, R.string.question130_C, R.string.question130_D, R.string.answer_130),
                    new answerclass(R.drawable.qariib, R.string.question_131A, R.string.question_131B, R.string.question_131C, R.string.question_131D, R.string.answer_131),
                    new answerclass(R.drawable.kabiira, R.string.question_132A, R.string.question_132B, R.string.question_132C, R.string.question_132D, R.string.answer_132),
                    new answerclass(R.drawable.akbar, R.string.question_133A, R.string.question_133B, R.string.question_133C, R.string.question_133D, R.string.answer_133),
                    new answerclass(R.drawable.kabiir, R.string.question_134A, R.string.question_134B, R.string.question_134C, R.string.question_134D, R.string.answer_134),
                    new answerclass(R.drawable.kasira, R.string.question_135A,  R.string.question_135B, R.string.question_135C, R.string.question_135D, R.string.answer_135),
                    new answerclass(R.drawable.aksar, R.string.question136_A, R.string.question136_B, R.string.question136_C,  R.string.question136_D, R.string.answer_136),
                    new answerclass(R.drawable.kassir, R.string.question137_A, R.string.question137_B, R.string.question137_C, R.string.question137_D, R.string.answer_137),
                    new answerclass(R.drawable.quran, R.string.question_138A, R.string.question_138B, R.string.question_138C, R.string.question_138D, R.string.answer_138),
                    new answerclass(R.drawable.ayaat, R.string.question_139A, R.string.question_139B, R.string.question_139C, R.string.question_139D, R.string.answer_139),
                    new answerclass(R.drawable.aya, R.string.question140_A, R.string.question140_B, R.string.question140_C, R.string.question140_D, R.string.answer_140),


            };

    final int PROGRESS_BAR = (int) Math.ceil(100 / questionBank.length);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test7);

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
                    Intent intent = new Intent(TestActivity7.this, LessonsActivity.class);
                    startActivity(intent);
                    TestActivity7.this.finish();

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
