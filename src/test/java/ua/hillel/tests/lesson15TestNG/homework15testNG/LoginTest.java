package ua.hillel.tests.lesson15TestNG.homework15testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
    @Test(groups = "login",
    dataProvider = "generateLogin")
    public void checkLogin(String userName, String password, String role) {
        Assert.assertEquals(userName,"Marta");
        Assert.assertEquals(password,"ujhGL23/f");
        Assert.assertEquals(role,"user");
    }

    //тест що залежить від групи "login" запускається тільки коли група виконана успішно
    @Test(dependsOnGroups = "login")
    public void checkGreeting() {
        System.out.println("Check greeting method");
        try {
            int a= 5/0;
        }catch (ArithmeticException e) {}
    }
    @DataProvider(name = "generateLogin")
    public Object [][] generateLogin() {
        String [][] users = {
                {"Marta","ujhGL23/f","user"},
                {"John","435hGL2","admin"},
                {"Alexa","hhGL23","guest"}
        };
        return users;
    }
}
