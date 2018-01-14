package com.radtarnowski.braintrainer;

import android.os.CountDownTimer;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button startButton;
    ArrayList<Integer> answers = new ArrayList<Integer>();
    TextView resultTextView;
    int locationOfCorrectAnswer;
    int score = 0;
    int numberOfQuestions = 0;
    TextView pointsTextView;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    TextView sumTextView;
    TextView timerTextView;
    Button playAgainButton;
    ConstraintLayout gameLayout;
    public void playAgain(final View view) {

        score = 0;
        numberOfQuestions = 0;

        timerTextView.setText("30s");
        pointsTextView.setText("0/0");
        resultTextView.setText("");
        playAgainButton.setVisibility(View.INVISIBLE);

        generateQuestion();

        new CountDownTimer(30100, 1000) {


            @Override
            public void onTick(long l) {

                timerTextView.setText(String.valueOf(l/1000) + "s");

            }

            @Override
            public void onFinish() {

                timerTextView.setText("0s");
                resultTextView.setText("Your score: " + score + "/" + numberOfQuestions);
                playAgainButton.setVisibility(View.VISIBLE);

            }
        }.start();

    }

    public void generateQuestion() {

        Random rand = new Random();

        int a = rand.nextInt(31);
        int b = rand.nextInt(21);
        sumTextView.setText(a + " + " + b);

        locationOfCorrectAnswer = rand.nextInt(4);
        int incorrectAnswer;
        answers.clear();

        for (int i=0;i<4;i++) {

            if(i==locationOfCorrectAnswer) {

                answers.add(a+b);
            } else {
                incorrectAnswer = rand.nextInt(51);

                while (incorrectAnswer == (a+b)) {
                    incorrectAnswer = rand.nextInt(51);
                }
                answers.add(incorrectAnswer);
            }

        }

        button1.setText(Integer.toString(answers.get(0)));
        button2.setText(Integer.toString(answers.get(1)));
        button3.setText(Integer.toString(answers.get(2)));
        button4.setText(Integer.toString(answers.get(3)));

    }
    public void start(View view) {

        startButton.setVisibility(View.INVISIBLE);
        gameLayout.setVisibility(View.VISIBLE);
        playAgain(findViewById(R.id.playAgainButton));
    }

    public void chooseAnswer(View view) {

        if(view.getTag().toString().equals(Integer.toString(locationOfCorrectAnswer))) {

            score++;
            resultTextView.setText("Correct!");

        } else {

            resultTextView.setText("Incorrect!");
        }

        numberOfQuestions++;
        pointsTextView.setText(score + "/" + numberOfQuestions);
        generateQuestion();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = (Button) findViewById(R.id.startButton);
        sumTextView = (TextView) findViewById(R.id.sumTextView);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        resultTextView = (TextView) findViewById(R.id.correctAnswerTextView);
        pointsTextView = (TextView) findViewById(R.id.pointsTextView);
        timerTextView = (TextView) findViewById(R.id.timerTextView);
        playAgainButton = (Button) findViewById(R.id.playAgainButton);
        gameLayout = (ConstraintLayout) findViewById(R.id.gameLayout);

        playAgain(findViewById(R.id.playAgainButton));

    }
}
