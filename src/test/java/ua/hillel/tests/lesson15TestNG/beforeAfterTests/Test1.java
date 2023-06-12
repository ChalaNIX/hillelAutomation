package ua.hillel.tests.lesson15TestNG.beforeAfterTests;

import org.testng.annotations.*;

public class Test1 {
    @BeforeClass
    public void beforeClass() {
        System.out.println("==== Before Class test1 ====");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("==== After Class test1 ====");

    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("==== Before Method ====");

    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("==== After Method ====");

    }
    @Test
    public void test1() {
        System.out.println("==== Test 1 =====");
    }
    public void test2() {
        System.out.println("==== Test 2 =====");
    }
}
