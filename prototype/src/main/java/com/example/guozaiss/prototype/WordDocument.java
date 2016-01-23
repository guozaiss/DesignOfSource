package com.example.guozaiss.prototype;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by guozaiss on 16/1/20.
 * 文档类型，具体原型类
 * 浅克隆
 */
public class WordDocument implements Cloneable{
    //文本
    private String mText;
    //图片名列表
    private ArrayList<String> mImage = new ArrayList<>();

    public WordDocument() {
        Log.e("AAAA", "---WordDocument构造方法---");
    }

    @Override
    protected WordDocument clone(){
        try {
            WordDocument clone = (WordDocument) super.clone();
            clone.mText=this.mText;
            clone.mImage=this.mImage;
            return clone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<String> getmImage() {
        return mImage;
    }

    public void setmImage(ArrayList<String> mImage) {
        this.mImage = mImage;
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    @Override
    public String toString() {
        return "WordDocument{" +
                "mImage=" + mImage +
                ", mText='" + mText + '\'' +
                '}';
    }
}
