package ua.hillel.tests;

import org.testng.annotations.Test;

public class SecondTest {
    @Test(groups = {"regression","smoke","p1"},
    dependsOnMethods = {"innerTest"/*,"ua.hillel.tests.FirstTest.firstTest"*/},
    priority = 10)
    public static void secondTest() {
        System.out.println("I'm second test!");
        System.out.println("Running test on " + System.getProperty("url"));
    }
    @Test(priority = 20)
    public void innerTest() {

    }

    @Test(priority = 30)
    public void thirdTest() {

    }
}
