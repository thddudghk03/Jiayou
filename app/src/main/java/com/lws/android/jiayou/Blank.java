package com.lws.android.jiayou;

import java.util.Objects;

public class Blank {
    private String character;
    private String pronunciation;
    private String meaning;
    private String blank_Answer;

    public Blank(String character, String pronunciation, String meaning, String blank_Answer) {
        this.character = character;
        this.pronunciation = pronunciation;
        this.meaning = meaning;
        this.blank_Answer = blank_Answer;
    }

    public String getCharacter() {
        return character;
    }

    public String getPronunciation() {
        return pronunciation;
    }

    public String getMeaning() {
        return meaning;
    }

    public String getBlank_Answer() {
        return blank_Answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Blank blank = (Blank) o;
        return Objects.equals(character, blank.character) &&
                Objects.equals(pronunciation, blank.pronunciation) &&
                Objects.equals(meaning, blank.meaning) &&
                Objects.equals(blank_Answer, blank.blank_Answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(character, pronunciation, meaning, blank_Answer);
    }
}
