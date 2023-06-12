package ua.hillel.tests.beforeAfterTests;

import org.testng.annotations.*;

public class Test2 {
    @BeforeClass
    public void beforeClass() {

        System.out.println("==== Before Class test2 ====");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("==== After Class test2 ====");

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

        System.out.println("==== Test 3 =====");
    }
    public void test2() {

        System.out.println("==== Test 4 =====");
    }
}
