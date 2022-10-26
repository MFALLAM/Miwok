package com.example.android.miwok.data;

public class Color {
    /**
     * Holds miwok translation
     * @access String private
     */
    private String miwokTranslation;

    /**
     * Holds English translation
     * @access String private
     */
    private String miwokDefault;

    public Color(String miwokTranslation, String miwokDefault) {
        this.miwokTranslation = miwokTranslation;
        this.miwokDefault = miwokDefault;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getMiwokDefault() {
        return miwokDefault;
    }
}
