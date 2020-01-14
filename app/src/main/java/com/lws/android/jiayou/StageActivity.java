package com.lws.android.jiayou;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StageActivity extends BaseActivity {
    private String stage;
    TextView stageTextView;
    Button part1Button, part2Button, examButton;

    protected void init() {
        setContentView(R.layout.activity_stage);

        stage = getIntent().getStringExtra(Constants.EXTRA_STAGE);

        stageTextView = findViewById(R.id.tv_stage);
        stageTextView.setText(stage);

        part1Button = findViewById(R.id.btn_part_1);
        part2Button = findViewById(R.id.btn_part_2);
        examButton = findViewById(R.id.btn_exam);
    }

    @Override
    protected void onResume() {
        super.onResume();
        // TODO : 버튼 활성/비활성 상태 변경
    }

    public void onVideoButtonClick(View view) {
        startVideoActivity();
    }

    public void onPartButtonClick(View view) {
        switch (view.getId()) {
            case R.id.btn_part_1:
                startPartActivity(getString(R.string.part_1));
                break;
            case R.id.btn_part_2:
                startPartActivity(getString(R.string.part_2));
                break;
        }
    }

    public void onExamButtonClick(View view) {
        startExamActivity();
    }

    private void startVideoActivity() {
        Intent intent = new Intent(this, VideoActivity.class);
        intent.putExtra(Constants.EXTRA_STAGE, stage);
        startActivity(intent);
    }

    private void startPartActivity(String part) {
        Intent intent = new Intent(this, PartActivity.class);
        intent.putExtra(Constants.EXTRA_STAGE, stage);
        intent.putExtra(Constants.EXTRA_PART, part);
        startActivity(intent);
    }

    private void startExamActivity() {
        Intent intent = new Intent(this, ExamActivity.class);
        intent.putExtra(Constants.EXTRA_STAGE, stage);
        startActivity(intent);
    }
}
