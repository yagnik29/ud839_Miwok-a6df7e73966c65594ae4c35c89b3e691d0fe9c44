package com.example.android.miwok;

/**
 * Created by yagnik on 28-Jul-16.
 * @link Word
 * It contains the default translation and miwok translation
 */
public class Word {

    /** Default translation */
    private String mDefaultTranslation;

    /** Miwok translation  */
    private String mMiwokTranslation;

    /** Image */
    private int mImageResourceId;




    public Word(String defaultTranslation , String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation , String miwokTranslation, int imageResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

}
