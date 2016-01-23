package com.example.guozaiss.stragety;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        CalculateStrategy strategy=new BusStrategy();
//        strategy.calculatePrice(50);
        Tranficalculator tranficalculator=new Tranficalculator();
        tranficalculator.setStrategy(new BusStrategy());
        tranficalculator.calculatePrice(50);
    }
}
