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

 public class TestActivity15 extends AppCompatActivity {
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
                    new answerclass(R.drawable.azvaaj, R.string.question281_A, R.string.question281_B, R.string.question281_C, R.string.question281_D, R.string.answer_281),
                    new answerclass(R.drawable.zurriyat, R.string.question_282A, R.string.question_282B, R.string.question_282C, R.string.question_282D, R.string.answer_282),
                    new answerclass(R.drawable.nisa, R.string.question_283A, R.string.question_283B, R.string.question_283C, R.string.question_283D, R.string.answer_283),
                    new answerclass(R.drawable.imraa , R.string.question_284A, R.string.question_284B, R.string.question_284C, R.string.question_284D, R.string.answer_284),
                    new answerclass(R.drawable.ibn, R.string.question_285A, R.string.question_285B, R.string.question_285C, R.string.question_285C, R.string.answer_285),
                    new answerclass(R.drawable.aulad, R.string.question_286A, R.string.question_286B, R.string.question_286C, R.string.question_286D, R.string.answer_286),
                    new answerclass(R.drawable.valad, R.string.question287_A, R.string.question287_B, R.string.question287_C, R.string.question287_D, R.string.answer_287),
                    new answerclass(R.drawable.banuun, R.string.question288_A, R.string.question288_B, R.string.question288_C, R.string.question288_D, R.string.answer_288),
                    new answerclass(R.drawable.abnaa, R.string.question_289A, R.string.question_289B, R.string.question_289C, R.string.question_289D, R.string.answer_289),
                    new answerclass(R.drawable.banin, R.string.question290_A, R.string.question290_B, R.string.question290_C, R.string.question290_D, R.string.answer_290),
                    new answerclass(R.drawable.ahii, R.string.question291_A, R.string.question291_B, R.string.question291_C, R.string.question291_D, R.string.answer_291),
                    new answerclass(R.drawable.vaalidayn, R.string.question_292A, R.string.question_292B, R.string.question_292C, R.string.question_292D, R.string.answer_292),
                    new answerclass(R.drawable.valiid, R.string.question_293A, R.string.question_293B, R.string.question_293C, R.string.question_293D, R.string.answer_293),
                    new answerclass(R.drawable.akha, R.string.question_294A, R.string.question_294B, R.string.question_294C, R.string.question_294D, R.string.answer_294),
                    new answerclass(R.drawable.ahuu, R.string.question_295A,  R.string.question_295B, R.string.question_295C, R.string.question_295D, R.string.answer_295),
                    new answerclass(R.drawable.akh, R.string.question_296A, R.string.question_296B, R.string.question_296C,  R.string.question_296D, R.string.answer_296),
                    new answerclass(R.drawable.naas, R.string.question297_A, R.string.question297_B, R.string.question297_C, R.string.question297_D, R.string.answer_297),
                    new answerclass(R.drawable.umam, R.string.question298_A, R.string.question298_B, R.string.question298_C, R.string.question298_D, R.string.answer_298),
                    new answerclass(R.drawable.umma, R.string.question_299A, R.string.question_299B, R.string.question_299C, R.string.question_299D, R.string.answer_299),
                    new answerclass(R.drawable.insaan, R.string.question300_A, R.string.question300_B, R.string.question300_C, R.string.question300_D, R.string.answer_300),


            };

    final int PROGRESS_BAR = (int) Math.ceil(100 / questionBank.length);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test15);

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
                    Intent intent = new Intent(TestActivity15.this, LessonsActivity.class);
                    startActivity(intent);
                    TestActivity15.this.finish();

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
