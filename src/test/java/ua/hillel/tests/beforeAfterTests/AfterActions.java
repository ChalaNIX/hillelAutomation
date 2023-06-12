package ua.hillel.tests.beforeAfterTests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

//global before actions: before suit and before test
public class AfterActions {
    @AfterSuite
    public void afterSuit(){

        System.out.println("====After Suite====");
    }
    @AfterTest
    public void afterTest(){

        System.out.println("====After Test====");
    }
}
