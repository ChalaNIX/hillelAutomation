package ua.hillel.automation.java.lesson10Exceptions;

public class ExceptionTest {
    public void exceptionTest() throws Exception { //спосіб обійти помилку синтаксису не додаючи обробку exception
        new ExceptionPage().getValueFromConfig();
    }
}
