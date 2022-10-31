package com.example.android.miwok.data;

public class Family {

    private String miwokTranslation;

    private String defaultTranslation;

    private int imgResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Family(String miwokTranslation, String defaultTranslation, int image) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.imgResourceId = image;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public int getImgResourceId() {
        return imgResourceId;
    }

    public boolean hasImage() {
        return imgResourceId != NO_IMAGE_PROVIDED;
    }
}
