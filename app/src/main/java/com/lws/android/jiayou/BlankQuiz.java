package com.lws.android.jiayou;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class BlankQuiz implements Serializable {
    private String question;
    private String answer;
    private String pronunciation;
    private String meaning;
    private ArrayList<String> choices;

    public BlankQuiz(String question, String pronunciation, String meaning, String answer, ArrayList<String> choices) {
        this.question = question;
        this.pronunciation = pronunciation;
        this.meaning = meaning;
        this.answer = answer;
        this.choices = choices;
    }

    public String getQuestion() {
        return question;
    }

    public String getPronunciation() {
        return pronunciation;
    }

    public String getMeaning() {
        return meaning;
    }

    public String getAnswer() {
        return answer;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlankQuiz blankQuiz = (BlankQuiz) o;
        return Objects.equals(question, blankQuiz.question) &&
                Objects.equals(answer, blankQuiz.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, answer);
    }
}
