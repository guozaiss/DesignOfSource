package com.example.guozaiss.factory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AudiCarFactory factory=new AudiCarFactory();

        AudiQ1 audiQ1 = factory.createAudiCar(AudiQ1.class);
        audiQ1.drive();
        audiQ1.selfNavigation();
    }
}

