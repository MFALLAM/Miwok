package com.example.android.miwok.data;

public class Family {

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

    /**
     * Holds the audio resource id
     */
    private int audioResourceId;

    public Family(String miwokTranslation, String defaultTranslation, int image, int audioResource) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.imgResourceId = image;
        this.audioResourceId = audioResource;
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
     *
     * @return
     */
    public int getImgResourceId() {
        return imgResourceId;
    }

    public boolean hasImage() {
        return imgResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     *
     * @return
     */
    public int getAudioResourceId() {
        return audioResourceId;
    }
}
