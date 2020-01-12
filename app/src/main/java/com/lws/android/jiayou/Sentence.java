package com.lws.android.jiayou;

import java.util.Objects;

public class Sentence {
    private String character;
    private String pronunciation;
    private String meaning;

    public Sentence(String character, String pronunciation, String meaning) {
        this.character = character;
        this.pronunciation = pronunciation;
        this.meaning = meaning;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence = (Sentence) o;
        return character.equals(sentence.character) &&
                pronunciation.equals(sentence.pronunciation) &&
                meaning.equals(sentence.meaning);
    }

    @Override
    public int hashCode() {
        return Objects.hash(character, pronunciation, meaning);
    }
}
