package com.lws.android.jiayou;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class MakeQuiz extends AppCompatActivity {

    HashSet<WordQuiz> wordQuizzes;
    String stage, part;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_makequiz);

        Intent intent = getIntent();
        stage = intent.getStringExtra(Constants.EXTRA_STAGE);
        part = intent.getStringExtra(Constants.EXTRA_PART);

        new Thread(new Runnable() {
            @Override
            public void run() {
                HashSet<Word> words = new HashSet<>(DataLoader.loadWords(stage,part));
                wordQuizzes = generateWordQuizzes(words);

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(MakeQuiz.this, MatchingActivity.class);
                        intent.putExtra("wordQuizzes", wordQuizzes);
                        intent.putExtra(Constants.EXTRA_STAGE, stage);
                        intent.putExtra(Constants.EXTRA_PART, part);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        }).start();


    }

    private HashSet<WordQuiz> generateWordQuizzes(HashSet<Word> words) {
        HashSet<WordQuiz> wordQuizzes = new HashSet<>();
        ArrayList<Word> a = new ArrayList<>(words);
        Random random = new Random();
        Word question;
        HashMap<String, Word> m = new HashMap<>();

        while (wordQuizzes.size() < 10) {
            question = a.get(random.nextInt(a.size()));
            m.clear();
            m.put(question.getMeaning(), question);
            while (m.size() < 4) {
                Word w = a.get(random.nextInt(a.size()));
                m.put(w.getMeaning(), w);
            }
            m.put(question.getMeaning(), question);
            ArrayList<Word> choicesWord = new ArrayList<>(m.values());
            Collections.shuffle(choicesWord);
            if (random.nextBoolean()) {
                ArrayList<String> choices = new ArrayList<>();
                for (Word word : choicesWord) {
                    choices.add(word.getMeaning());
                }
                wordQuizzes.add(new WordQuiz(question.getCharacter(), question.getMeaning(), question.getPronunciation(), choices));
            } else {
                ArrayList<String> choices = new ArrayList<>();
                for (Word word : choicesWord) {
                    choices.add(word.getCharacter());
                }
                wordQuizzes.add(new WordQuiz(question.getMeaning(), question.getCharacter(), "", choices));
            }
        }
        return wordQuizzes;
    }
}
