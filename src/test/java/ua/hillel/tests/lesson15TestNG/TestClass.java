package ua.hillel.tests.lesson15TestNG;

import org.testng.annotations.Test;

@Test

public class TestClass {
    @Test(enabled = true)
    public void test1() {
        System.out.println("test1");
    }
    public void test2() {}
    public void test3() {}

    private void helper(){}   //вже не є тестом, бо private
}
