package ua.hillel.tests.lesson15TestNG.beforeAfterTests;

//global before actions: before suit and before test

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BeforeActions {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("====Before Suite====");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("====Before Test====");
    }
}
