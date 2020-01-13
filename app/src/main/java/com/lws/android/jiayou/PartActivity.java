package com.lws.android.jiayou;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PartActivity extends AppCompatActivity {
    String stage, part;
    TextView stageTextView, partTextView;
    ListView sentencesListView, wordsListView;
    Button blankButton, arrangeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part);

        init();
    }

    private void init() {
        Intent intent = getIntent();
        stage = intent.getStringExtra(Constants.EXTRA_STAGE);
        part = intent.getStringExtra(Constants.EXTRA_PART);

        stageTextView = findViewById(R.id.tv_stage);
        partTextView = findViewById(R.id.tv_part);
        stageTextView.setText(stage);
        partTextView.setText(part);

        sentencesListView = findViewById(R.id.lv_sentences);
        wordsListView = findViewById(R.id.lv_words);

        sentencesListView.setAdapter(new SentenceAdapter(DataLoader.loadSentences(stage, part)));
        wordsListView.setAdapter(new WordAdapter(this, DataLoader.loadWords(stage, part)));

        blankButton = findViewById(R.id.btn_blank);
        arrangeButton = findViewById(R.id.btn_arrange);
    }

    @Override
    protected void onResume() {
        super.onResume();
        // TODO : 버튼 활성/비활성 상태 변경
    }

    public void onMatchingButtonClick(View view) {
        startQuizActivity(MakeQuiz.class);
    }

    public void onBlankButtonClick(View view) {
        startQuizActivity(BlankActivity.class);
    }

    public void onArrangeButtonClick(View view) {
        startQuizActivity(ArrangeActivity.class);
    }

    private void startQuizActivity(Class<?> cls) {
        Intent intent = new Intent(this, cls);
        intent.putExtra(Constants.EXTRA_STAGE, stage);
        intent.putExtra(Constants.EXTRA_PART, part);
        startActivity(intent);
    }
}
