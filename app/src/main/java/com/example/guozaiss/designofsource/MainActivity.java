package com.example.guozaiss.designofsource;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.guozaiss.designofsource.cache.DoubleCache;
import com.example.guozaiss.designofsource.strategy.SerialPolicy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageLoaderConfig config=new ImageLoaderConfig.Builder()
                .builderImageCache(new DoubleCache())
                .builderLoadFailedImageId(R.mipmap.ic_launcher)
                .builderLoadingImageId(R.mipmap.ic_launcher)
                .builderLoadPolicy(new SerialPolicy())
                .create();
        ImageLoader instance = ImageLoader.getInstance();

    }
}
