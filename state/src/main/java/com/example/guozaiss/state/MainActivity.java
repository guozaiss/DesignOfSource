package com.example.guozaiss.state;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoginContext loginContext=LoginContext.getInstance();
        loginContext.setUserState(new LoginedState());
        loginContext.forward(this);
    }
}
