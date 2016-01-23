package com.example.guozaiss.prototype;

import android.app.Application;
import android.test.ApplicationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
        WordDocument wordDocument=new WordDocument();

        WordDocument clone = wordDocument.clone();
        System.out.print(wordDocument);
        System.out.print(clone);
    }
}