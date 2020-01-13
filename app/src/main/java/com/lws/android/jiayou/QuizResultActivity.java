package com.lws.android.jiayou;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.WindowManager;
import android.widget.TextView;

public class QuizResultActivity extends Activity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_quiz_result);

        text = findViewById(R.id.text);
        String s = getIntent().getStringExtra("result");
        text.setText(s);

        new Thread(new Runnable() {
            @Override
            public void run() {
                SystemClock.sleep(500);
                finish();
            }
        }).start();
    }
}
