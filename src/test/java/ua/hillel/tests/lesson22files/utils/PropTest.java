package ua.hillel.tests.lesson22files.utils;

import org.testng.annotations.Test;

import java.io.IOException;

public class PropTest {
    @Test
    public void propTest() throws IOException {
        System.out.println(TestProperties.getProperty("url"));
    }
}
