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
                        words.add(new Word("您", "nín", "당신", R.raw.nin));
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

    public static ArrayList<Blank> loadBlanks(String stage, String part) {
        ArrayList<Blank> blanks = new ArrayList<>();
        switch (stage) {
            case Constants.STAGE_1:
                switch (part) {
                    case Constants.PART_1:
                        blanks.add(new Blank("您 (__) 什么 饮料？","Nín hē shénme yǐnliào?","당신은 무슨 음료를 마시겠습니까?","喝"));
                        blanks.add(new Blank("您 喝 什么 (__)？","Nín hē shénme yǐnliào?","당신은 무슨 음료를 마시겠습니까?","饮料"));
                        blanks.add(new Blank("我  喝  (__)。","Wǒ hē chéngzhī.","저는 오렌지주스를 마시겠습니다. ","橙汁"));
                        blanks.add(new Blank("有  橙汁， 苹果汁  (__) 芒果汁。","Yǒu chéngzhī, píngguǒzhī hé mángguǒzhī.","오렌지주스, 사과주스와 망고주스가 있습니다.","和"));
                        blanks.add(new Blank("我 喝 (__)。","Wǒ hē píngguǒzhī.","저는 사과주스를 마시겠습니다.","苹果汁"));
                        blanks.add(new Blank("我  喝  (__)。","Wǒ hē kělè .","저는 콜라를 마시겠습니다.","可乐"));
                        blanks.add(new Blank("我  喝  (__)。","Wǒ hē fān qié zhī  . ","저는 토마토주스를 마시겠습니다.","番茄汁"));
                        blanks.add(new Blank("我  喝 (__) 。","Wǒ hē pí jiǔ  .","저는 맥주를 마시겠습니다.","啤酒"));
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
        return blanks;
    }
}
