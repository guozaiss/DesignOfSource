package com.example.guozaiss.builder;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        Builder builder1=new MacbookBuilder();
        Computer computer = builder1.builderDisplay("英特尔").builderBoard("hehe").builderOS("mac").create();
        Log.e("AAAA", computer.toString());
    }
}
