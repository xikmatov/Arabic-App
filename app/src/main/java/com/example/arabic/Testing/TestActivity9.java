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

public class TestActivity9 extends AppCompatActivity {
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
                    new answerclass(R.drawable.rasuul, R.string.question161_A, R.string.question161_B, R.string.question161_C, R.string.question161_D, R.string.answer_161),
                    new answerclass(R.drawable.anbiya, R.string.question_162A, R.string.question_162B, R.string.question_162C, R.string.question_162D, R.string.answer_162),
                    new answerclass(R.drawable.nabiyyin, R.string.question_163A, R.string.question_163B, R.string.question_163C, R.string.question_163D, R.string.answer_163),
                    new answerclass(R.drawable.nabiyyun, R.string.question_164A, R.string.question_164B, R.string.question_164C, R.string.question_164D, R.string.answer_164),
                    new answerclass(R.drawable.ibrahim, R.string.question_165A, R.string.question_165B, R.string.question_165C, R.string.question_165C, R.string.answer_165),
                    new answerclass(R.drawable.nuh, R.string.question_166A, R.string.question_166B, R.string.question_166C, R.string.question_166D, R.string.answer_166),
                    new answerclass(R.drawable.adam, R.string.question167_A, R.string.question167_B, R.string.question167_C, R.string.question167_D, R.string.answer_167),
                    new answerclass(R.drawable.isxaq, R.string.question168_A, R.string.question168_B, R.string.question168_C, R.string.question168_D, R.string.answer_168),
                    new answerclass(R.drawable.ismail, R.string.question_169A, R.string.question_169B, R.string.question_169C, R.string.question_169D, R.string.answer_169),
                    new answerclass(R.drawable.lut, R.string.question170_A, R.string.question170_B, R.string.question170_C, R.string.question170_D, R.string.answer_170),
                    new answerclass(R.drawable.yusuf, R.string.question171_A, R.string.question171_B, R.string.question171_C, R.string.question171_D, R.string.answer_171),
                    new answerclass(R.drawable.israil, R.string.question_172A, R.string.question_172B, R.string.question_172C, R.string.question_172D, R.string.answer_172),
                    new answerclass(R.drawable.yaqub, R.string.question_173A, R.string.question_173B, R.string.question_173C, R.string.question_173D, R.string.answer_173),
                    new answerclass(R.drawable.saalih, R.string.question_174A, R.string.question_174B, R.string.question_174C, R.string.question_174D, R.string.answer_174),
                    new answerclass(R.drawable.shuaib, R.string.question_175A,  R.string.question_175B, R.string.question_175C, R.string.question_175D, R.string.answer_175),
                    new answerclass(R.drawable.hud, R.string.question_176A, R.string.question_176B, R.string.question_176C,  R.string.question_176D, R.string.answer_176),
                    new answerclass(R.drawable.isa, R.string.question177_A, R.string.question177_B, R.string.question177_C, R.string.question177_D, R.string.answer_177),
                    new answerclass(R.drawable.musa, R.string.question178_A, R.string.question178_B, R.string.question178_C, R.string.question178_D, R.string.answer_178),
                    new answerclass(R.drawable.ujur, R.string.question_179A, R.string.question_179B, R.string.question_179C, R.string.question_179D, R.string.answer_179),
                    new answerclass(R.drawable.ajr, R.string.question180_A, R.string.question180_B, R.string.question180_C, R.string.question180_D, R.string.answer_180),


            };

    final int PROGRESS_BAR = (int) Math.ceil(100 / questionBank.length);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test9);

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
                    Intent intent = new Intent(TestActivity9.this, LessonsActivity.class);
                    startActivity(intent);
                    TestActivity9.this.finish();

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
