package com.lws.android.jiayou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //테스트 커밋

    public void onStageButtonClick(View view) {
        switch (view.getId()) {
            case R.id.btn_stage_01:
                startStageActivity(Constants.STAGE_1);
                break;
            case R.id.btn_stage_02:
                startStageActivity(Constants.STAGE_2);
                break;
            case R.id.btn_stage_03:
                startStageActivity(Constants.STAGE_3);
                break;
            case R.id.btn_stage_04:
                startStageActivity(Constants.STAGE_4);
                break;
            case R.id.btn_stage_05:
                startStageActivity(Constants.STAGE_5);
                break;
            case R.id.btn_stage_06:
                startStageActivity(Constants.STAGE_6);
                break;
            case R.id.btn_stage_07:
                startStageActivity(Constants.STAGE_7);
                break;
            case R.id.btn_stage_08:
                startStageActivity(Constants.STAGE_8);
                break;
            case R.id.btn_stage_09:
                startStageActivity(Constants.STAGE_9);
                break;
            case R.id.btn_stage_10:
                startStageActivity(Constants.STAGE_10);
                break;
            case R.id.btn_stage_11:
                startStageActivity(Constants.STAGE_11);
                break;
            case R.id.btn_stage_12:
                startStageActivity(Constants.STAGE_12);
                break;
        }
    }

    private void startStageActivity(String stage) {
        Intent intent = new Intent(this, StageActivity.class);
        intent.putExtra(Constants.EXTRA_STAGE, stage);
        startActivity(intent);
    }
}
