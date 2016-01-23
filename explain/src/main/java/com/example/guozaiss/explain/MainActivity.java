package com.example.guozaiss.explain;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Calculator calculator = new Calculator("142 + 21 + 10 - 32");
        Log.e("AAAA", calculator.calculator() + "");
    }
}
