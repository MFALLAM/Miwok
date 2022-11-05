package com.example.android.miwok.data;

public class Phrase {

    /**
     *
     */
    private String miwokTranslation;

    /**
     *
     */
    private String defaultTranslation;

    /**
     * Image resource ID for the word
     */
    private int imgResourceId = NO_IMAGE_PROVIDED;

    /**
     * Represents the image state, whether exists or not
     * using -1 value to assure that the state of the image to be out of the range
     * of all the possible valid resources ID
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    private int audioSourceId;

    public Phrase(String miwokTranslation, String defaultTranslation, int imageResourceId, int audioSource) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.imgResourceId = imageResourceId;
        this.audioSourceId = audioSource;
    }

    /**
     *
     * @return
     */
    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    /**
     *
     * @return
     */
    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getMiwiokImage() {
        return imgResourceId;
    }

    /**
     * Returns whether or not there is an image for this object
     *
     * @return boolean
     */
    public boolean hasImage() {
        return imgResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     *
     * @return
     */
    public int getAudioSourceId() {
        return audioSourceId;
    }
}
