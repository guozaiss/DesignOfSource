package com.example.guozaiss.chainofresponsibility;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AbstractHandler handle1=new Handle1();
        AbstractHandler handle2=new Handle2();
        AbstractHandler handle3=new Handle3();
        handle1.nexthandler=handle2;
        handle2.nexthandler=handle3;

        AbstractRequest request = new Request2(new Object());
        handle1.handleRequest(request);
    }
}
