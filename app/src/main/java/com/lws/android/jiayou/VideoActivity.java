package com.lws.android.jiayou;

import android.widget.Button;
import android.widget.TextView;

public class VideoActivity extends BaseActivity {

    private String stage;
    TextView stageTextView;
    Button videoButton;

    @Override
    protected void init() {
        setContentView(R.layout.activity_video);
        stage = getIntent().getStringExtra(Constants.EXTRA_STAGE);

        videoButton = findViewById(R.id.btn_video);
        // TODO : 클릭 시 동영상 연결

        stageTextView = findViewById(R.id.tv_stage);
        stageTextView.setText(stage);
    }
}
