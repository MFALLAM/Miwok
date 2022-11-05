package com.example.android.miwok.data;

public class Color {

    /**
     * Holds miwok translation
     *
     * @access String private
     */
    private String miwokTranslation;

    /**
     * Holds English translation
     *
     * @access String private
     */
    private String miwokDefault;

    /**
     * Image resource ID for the word
     */
    private int imgResourceId = NO_IMAGE_PROVIDED;


    /**
     * Holds the audio resource id
     */
    private int audioResourceId;

    /**
     * Represents the image state, whether exists or not
     * using -1 value to assure that the state of the image to be out of the range
     * of all the possible valid resources ID
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Color(String miwokTranslation, String miwokDefault, int resourceColor, int audio) {
        this.miwokTranslation = miwokTranslation;
        this.miwokDefault = miwokDefault;
        imgResourceId = resourceColor;
        audioResourceId = audio;
    }

    /**
     * @return
     */
    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    /**
     * @return
     */
    public String getMiwokDefault() {
        return miwokDefault;
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
     * @return
     */
    public int getAudioResourceId() {
        return audioResourceId;
    }
}
