package com.example.guozaiss.prototype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WordDocument wordDocument=new WordDocument();

        WordDocument clone = wordDocument.clone();
        System.out.print(wordDocument);
        System.out.print(clone);
    }
}
