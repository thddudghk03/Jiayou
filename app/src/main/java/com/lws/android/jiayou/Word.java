package com.lws.android.jiayou;

import java.util.Objects;

public class Word {
    private String character;
    private String pronunciation;
    private String meaning;
    private int gifId;

    public Word(String character, String pronunciation, String meaning, int gifId) {
        this.character = character;
        this.pronunciation = pronunciation;
        this.meaning = meaning;
        this.gifId = gifId;
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

    public int getGifId() {
        return gifId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return gifId == word.gifId &&
                character.equals(word.character) &&
                pronunciation.equals(word.pronunciation) &&
                meaning.equals(word.meaning);
    }

    @Override
    public int hashCode() {
        return Objects.hash(character, pronunciation, meaning, gifId);
    }
}
