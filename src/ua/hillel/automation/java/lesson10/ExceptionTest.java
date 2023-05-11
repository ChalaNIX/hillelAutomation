package ua.hillel.automation.java.lesson10;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
    public void exceptionTest() throws Exception { //спосіб обійти помилку синтаксису не додаючи обробку exception
        new ExceptionPage().getValueFromConfig();
    }
}
