package com.lws.android.jiayou;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Stack;

public class MatchingActivity extends AppCompatActivity implements View.OnClickListener{
    Stack<WordQuiz> wordQuizzes = new Stack<>();
    TextView lifeTextView, questionTextView, pronunciationTextView, remainingTextView;
    Button button1, button2, button3, button4;

    String stage, part;

    int life = 5;
    String question;
    String answer;
    String pronunciation;

    String choice1;
    String choice2;
    String choice3;
    String choice4;

    State state;

    enum State {
        Solving, Finished
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_matching);

        Intent intent = getIntent();
        stage = intent.getStringExtra(Constants.EXTRA_STAGE);
        part = intent.getStringExtra(Constants.EXTRA_PART);

        lifeTextView = findViewById(R.id.text_life);
        questionTextView = findViewById(R.id.text_question);
        pronunciationTextView = findViewById(R.id.text_pronunciation);
        remainingTextView = findViewById(R.id.text_remaining);

        button1 = findViewById(R.id.button_choice_1);
        button2 = findViewById(R.id.button_choice_2);
        button3 = findViewById(R.id.button_choice_3);
        button4 = findViewById(R.id.button_choice_4);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);

        Serializable serializable = getIntent().getSerializableExtra("wordQuizzes");
        if (serializable instanceof HashSet<?>) {
            for (Object obj : (HashSet<?>) serializable) {
                if (obj instanceof WordQuiz) {
                    wordQuizzes.push((WordQuiz) obj);
                }
            }
        }

        initialize();


    }

    private void initialize() {
        life = 5;
        state = State.Solving;
        setFields();
        display();
    }

    private void setFields() {
        if (state == State.Solving) {
            WordQuiz wordQuiz = wordQuizzes.pop();

            question = wordQuiz.getQuestion();
            answer = wordQuiz.getAnswer();
            pronunciation = wordQuiz.getPronunciation();

            choice1 = wordQuiz.getChoices().get(0);
            choice2 = wordQuiz.getChoices().get(1);
            choice3 = wordQuiz.getChoices().get(2);
            choice4 = wordQuiz.getChoices().get(3);
        }
    }

    private void display() {
        if (state == State.Solving) {
            String s = "♥ × " + life;
            lifeTextView.setText(s);
            questionTextView.setText(question);
            pronunciationTextView.setText(pronunciation);
            s = "남은 퀴즈 : " + wordQuizzes.size();
            remainingTextView.setText(s);

            button1.setText(choice1);
            button2.setText(choice2);
            button3.setText(choice3);
            button4.setText(choice4);
        }
    }

    public void onClick(View v) {
        if (state == State.Solving) {
            String choice;
            switch (v.getId()) {
                case R.id.button_choice_1:
                    choice = choice1;
                    break;
                case R.id.button_choice_2:
                    choice = choice2;
                    break;
                case R.id.button_choice_3:
                    choice = choice3;
                    break;
                case R.id.button_choice_4:
                    choice = choice4;
                    break;
                default:
                    return;
            }
            Intent intent = new Intent(this, QuizResultActivity.class);
            if (!choice.equals(answer)) {
                life--;
                intent.putExtra("result", "오답...");
            } else {
                intent.putExtra("result","정답!");
            }
            startActivity(intent);
            if (life > 0 && wordQuizzes.size() > 0) {
                setFields();
                display();
            } else {
                display();
                state = State.Finished;
                new Thread(new Runnable() {
                    @Override

                    public void run() {
                        SystemClock.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Intent intent;

                                //라이프에 따른 다음 꺼 풀어주기

                                if (life == 0){
                                    intent = new Intent(getApplicationContext(), PartActivity.class);
                                    intent.putExtra(Constants.EXTRA_STAGE, stage);
                                    intent.putExtra(Constants.EXTRA_PART, part);
                                    startActivity(intent);

                                }else {
                                    intent = new Intent(getApplicationContext(),PartActivity.class);
                                    intent.putExtra(Constants.EXTRA_STAGE, stage);
                                    intent.putExtra(Constants.EXTRA_PART, part);
                                    startActivity(intent);
                                }


                                finish();
                            }
                        });
                    }
                }).start();
            }
        }
    }
}
