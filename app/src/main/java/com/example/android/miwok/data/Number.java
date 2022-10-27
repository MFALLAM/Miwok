package com.example.android.miwok.data;

import android.graphics.drawable.Drawable;

public class Number {

    /**
     * Default translation for the word
     */
    private String miwokTranslation;

    /**
     * Default translation for the word
     */
    private String defaultTranslation;

    /**
     * Image resource ID for the word
     */
    private int miwiokImage;

    /**
     * Create a new Number object.
     *
     * @param englishTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokWord          is the word in the Miwok language
     * @param imageResourceId    is the drawable resource ID for the image associated with the word
     */
    public Number(String miwokWord, String englishTranslation, int imageResourceId) {
        this.miwokTranslation = miwokWord;
        this.defaultTranslation = englishTranslation;
        this.miwiokImage = imageResourceId;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokWord() {
        return miwokTranslation;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getMiwiokImage() {
        return miwiokImage;
    }
}
