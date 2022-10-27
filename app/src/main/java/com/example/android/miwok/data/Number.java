package com.example.android.miwok.data;

public class Number {
    private String miwokTranslation;
    private String defaultTranslation;

    public Number(String miwokWord, String englishTranslation) {
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
