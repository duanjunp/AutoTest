package com.course.testng;

import org.testng.annotations.*;


public class BasicAnnotation {

    @Test
    public void testCase1(){
        System.out.println("这是测试用例111111");
    }

    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public void beforMethod(){
        System.out.println("beformethod 这是在测试方法之前的运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMetod这是在测试方法之后运行的");
    }

    @BeforeClass
    public void beforClass(){
        System.out.println("beforClass这是在类运行之前运行的");

    }

    @AfterClass
    public void AfterClass(){
        System.out.println("afterClass这是在类运行之后运行的");
    }
//befor与after 中的suite 是包裹class与method
    @BeforeSuite
    public void beforSuite(){
        System.out.println("beforSuite测试套件 是在类运行之前");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuote测试套件是在类运行之后");

    }
}
