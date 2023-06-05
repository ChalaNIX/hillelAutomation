package ua.hillel.tests;

import org.testng.annotations.Test;

public class FirstTest {
    @Test
    public static void firstTest() {
        System.out.println("I'm first test!");
        System.out.println("Running test on " + System.getProperty("url"));
    }
}
