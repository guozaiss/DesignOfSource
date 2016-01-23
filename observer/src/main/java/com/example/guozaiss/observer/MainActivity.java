package com.example.guozaiss.observer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DevTechFronter devTechFronter= new DevTechFronter();
        Coder coder1 = new Coder("程序员1");
        Coder coder2 = new Coder("程序员2");
        Coder coder3 = new Coder("程序员3");
        devTechFronter.addObserver(coder1);
        devTechFronter.addObserver(coder2);
        devTechFronter.addObserver(coder3);

        devTechFronter.post("呼呼呼呼呼");
    }
}
