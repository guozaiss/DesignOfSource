package com.example.guozaiss.explain;

import android.app.Application;
import android.test.ApplicationTestCase;
import android.util.Log;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
        Calculator calculator = new Calculator("142 + 21 + 10");
        Log.e("AAAA", calculator.calculator() + "");
    }
}