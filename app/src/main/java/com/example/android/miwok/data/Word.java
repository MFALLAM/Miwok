package com.example.android.miwok.data;

public class Word {
    private String miwokTranslation;
    private String defaultTranslation;

    public Word(String miwokWord, String englishTranslation) {
        this.miwokTranslation = miwokWord;
        this.defaultTranslation = englishTranslation;
    }

    public String getMiwokWord() {
        return miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }
}
