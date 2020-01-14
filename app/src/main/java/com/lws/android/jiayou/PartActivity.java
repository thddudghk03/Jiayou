package com.lws.android.jiayou;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class PartActivity extends BaseActivity {
    String stage, part;
    TextView stageTextView, partTextView;
    ListView sentencesListView, wordsListView;
    Button blankButton, arrangeButton;

    protected void init() {
        setContentView(R.layout.activity_part);

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
        startQuizActivity(MatchingActivity.class);
    }

    public void onBlankButtonClick(View view) {
        startQuizActivity(MakeBlankQuiz.class);
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
