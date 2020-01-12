package com.lws.android.jiayou;

import java.util.ArrayList;

public class DataLoader {

    public static ArrayList<Sentence> loadSentences(String stage, String part) {
        ArrayList<Sentence> sentences = new ArrayList<>();
        switch (stage) {
            case Constants.STAGE_1:
                switch (part) {
                    case Constants.PART_1:
                        sentences.add(new Sentence("您喝什么饮料？", "Nín hē shénme yǐnliào?", "무슨 음료를 마시겠습니까?"));
                        sentences.add(new Sentence("我喝橙汁。", "Wǒ hē chéngzhī.", "저는 오렌지주스를 마시겠습니다."));
                        break;
                    case Constants.PART_2:
                        break;
                }
                break;
            case Constants.STAGE_2:
                switch (part) {
                    case Constants.PART_1:
                        break;
                    case Constants.PART_2:
                        break;
                }
                break;
            case Constants.STAGE_3:
                switch (part) {
                    case Constants.PART_1:
                        break;
                    case Constants.PART_2:
                        break;
                }
                break;
            case Constants.STAGE_4:
                switch (part) {
                    case Constants.PART_1:
                        break;
                    case Constants.PART_2:
                        break;
                }
                break;
            case Constants.STAGE_5:
                switch (part) {
                    case Constants.PART_1:
                        break;
                    case Constants.PART_2:
                        break;
                }
                break;
            case Constants.STAGE_6:
                switch (part) {
                    case Constants.PART_1:
                        break;
                    case Constants.PART_2:
                        break;
                }
                break;
            case Constants.STAGE_7:
                switch (part) {
                    case Constants.PART_1:
                        break;
                    case Constants.PART_2:
                        break;
                }
                break;
            case Constants.STAGE_8:
                switch (part) {
                    case Constants.PART_1:
                        break;
                    case Constants.PART_2:
                        break;
                }
                break;
            case Constants.STAGE_9:
                switch (part) {
                    case Constants.PART_1:
                        break;
                    case Constants.PART_2:
                        break;
                }
                break;
            case Constants.STAGE_10:
                switch (part) {
                    case Constants.PART_1:
                        break;
                    case Constants.PART_2:
                        break;
                }
                break;
            case Constants.STAGE_11:
                switch (part) {
                    case Constants.PART_1:
                        break;
                    case Constants.PART_2:
                        break;
                }
                break;
            case Constants.STAGE_12:
                switch (part) {
                    case Constants.PART_1:
                        break;
                    case Constants.PART_2:
                        break;
                }
                break;
        }
        return sentences;
    }

    public static ArrayList<Word> loadWords(String stage, String part) {
        ArrayList<Word> words = new ArrayList<>();
        switch (stage) {
            case Constants.STAGE_1:
                switch (part) {
                    case Constants.PART_1:
                        words.add(new Word("您", "nín", "당신", 1));
                        words.add(new Word("喝", "hē", "마시다", 2));
                        words.add(new Word("什么", "shénme", "무엇", 3));
                        words.add(new Word("饮料", "yǐnliào", "음료", 4));
                        words.add(new Word("橙汁", "chéngzhī", "오렌지 주스", 5));
                        break;
                    case Constants.PART_2:
                        break;
                }
                break;
            case Constants.STAGE_2:
                switch (part) {
                    case Constants.PART_1:
                        break;
                    case Constants.PART_2:
                        break;
                }
                break;
            case Constants.STAGE_3:
                switch (part) {
                    case Constants.PART_1:
                        break;
                    case Constants.PART_2:
                        break;
                }
                break;
            case Constants.STAGE_4:
                switch (part) {
                    case Constants.PART_1:
                        break;
                    case Constants.PART_2:
                        break;
                }
                break;
            case Constants.STAGE_5:
                switch (part) {
                    case Constants.PART_1:
                        break;
                    case Constants.PART_2:
                        break;
                }
                break;
            case Constants.STAGE_6:
                switch (part) {
                    case Constants.PART_1:
                        break;
                    case Constants.PART_2:
                        break;
                }
                break;
            case Constants.STAGE_7:
                switch (part) {
                    case Constants.PART_1:
                        break;
                    case Constants.PART_2:
                        break;
                }
                break;
            case Constants.STAGE_8:
                switch (part) {
                    case Constants.PART_1:
                        break;
                    case Constants.PART_2:
                        break;
                }
                break;
            case Constants.STAGE_9:
                switch (part) {
                    case Constants.PART_1:
                        break;
                    case Constants.PART_2:
                        break;
                }
                break;
            case Constants.STAGE_10:
                switch (part) {
                    case Constants.PART_1:
                        break;
                    case Constants.PART_2:
                        break;
                }
                break;
            case Constants.STAGE_11:
                switch (part) {
                    case Constants.PART_1:
                        break;
                    case Constants.PART_2:
                        break;
                }
                break;
            case Constants.STAGE_12:
                switch (part) {
                    case Constants.PART_1:
                        break;
                    case Constants.PART_2:
                        break;
                }
                break;
        }
        return words;
    }
}
