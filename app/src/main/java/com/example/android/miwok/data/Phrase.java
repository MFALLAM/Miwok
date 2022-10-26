package com.example.android.miwok.data;

public class Phrase {
    private String miwokTranslation;

    private String defaultTranslation;

    public Phrase(String miwokTranslation, String defaultTranslation) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }
}
