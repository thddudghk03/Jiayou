package com.lws.android.jiayou;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class VideoActivity extends AppCompatActivity {

    private String stage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_video);

        stage = getIntent().getStringExtra(Constants.EXTRA_STAGE);

        Button video = (Button) findViewById(R.id.TV);
        //동영상 유튜브 연결 할 예정

        TextView video_text = (TextView) findViewById(R.id.video_text1);
        video_text.setText("Stage " + stage + " 안내방송을 시작합니다.");


        Button next_btn = (Button) findViewById(R.id.next_btn);
        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //버튼 클릭 액션
                Intent intent = new Intent(getApplicationContext(), StageActivity.class);
                intent.putExtra(Constants.EXTRA_STAGE, stage);
                startActivity(intent);
            }
        });
    }
}
