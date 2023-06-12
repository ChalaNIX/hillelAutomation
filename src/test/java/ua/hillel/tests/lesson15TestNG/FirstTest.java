package ua.hillel.tests.lesson15TestNG;

import org.testng.annotations.Test;

public class FirstTest {
    //анотація відносить метод до тестів в testNG
    //не потрібно запускати точку входу в програму - psvm
    @Test(groups = {"regression","smoke","p1"},
            enabled = true
)
    public static void firstTest() {
        System.out.println("I'm first test!");
        System.out.println("Running test on " + System.getProperty("url"));
    }

}
