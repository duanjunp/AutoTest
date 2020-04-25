package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {

    @BeforeSuite
    public void beforSuite(){
        System.out.println("befor suite运行啦");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after Suite运行啦");
    }
}
