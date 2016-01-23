package com.example.guozaiss.prototype;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by guozaiss on 16/1/20.
 * 文档类型，具体原型类
 * 深克隆
 */
public class WordDocument2 implements Cloneable{
    //文本
    private String mText;
    //图片名列表
    private ArrayList<String> mImage = new ArrayList<>();

    public WordDocument2() {
        Log.e("AAAA", "---WordDocument构造方法---");
    }

    @Override
    protected WordDocument2 clone(){
        try {
            WordDocument2 clone = (WordDocument2) super.clone();
            clone.mText=this.mText;
            clone.mImage= (ArrayList<String>) this.mImage.clone();
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
