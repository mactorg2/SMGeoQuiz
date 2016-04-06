package com.example.sean.smgeoquiz;

/**
 * Created by Sean on 4/5/2016.
 */
public class TrueFalse {
    private int mQuestion;

    private boolean mTrueQuestion;


    public TrueFalse(int question, boolean trueQuestion) {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }

}
