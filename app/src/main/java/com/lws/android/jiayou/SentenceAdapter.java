package com.lws.android.jiayou;

import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SentenceAdapter extends BaseAdapter {
    private ArrayList<Sentence> sentences;

    public SentenceAdapter(ArrayList<Sentence> sentences) {
        this.sentences = sentences;
    }

    @Override
    public int getCount() {
        return sentences.size();
    }

    @Override
    public Object getItem(int position) {
        return sentences.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sentence, parent, false);

        TextView characterTextView = convertView.findViewById(R.id.tv_character);
        TextView pronunciationTextView = convertView.findViewById(R.id.tv_pronunciation);
        TextView meaningTextView = convertView.findViewById(R.id.tv_meaning);
        ImageButton ttsButton = convertView.findViewById(R.id.btn_tts);

        final Sentence sentence = sentences.get(position);

        characterTextView.setText(sentence.getCharacter());
        pronunciationTextView.setText(sentence.getPronunciation());
        meaningTextView.setText(sentence.getMeaning());

        ttsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String utteranceId = this.hashCode() + "";
                int status = GlobalApplication.getInstance().getTts().speak(sentence.getCharacter(), TextToSpeech.QUEUE_FLUSH, null, utteranceId);
                if (status != TextToSpeech.SUCCESS) {
                    Toast.makeText(GlobalApplication.getInstance().getApplicationContext(), "TTS 오류", Toast.LENGTH_LONG).show();
                }
            }
        });

        return convertView;
    }
}
