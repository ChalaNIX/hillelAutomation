package ua.hillel.tests.lesson15TestNG.data;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DataProviderTest {
    @Test(dataProvider = "userProvider")
    public void userRoleTest(String userName,String password, String role){
        System.out.printf("name: %s - password: %s - role: %s%n", userName,password,role);
        System.out.println("Starting test for " + role);
        if(role.equals("admin")) {
            throw new RuntimeException("Test failed"); //імітація помилки
        }
        System.out.println("Test for " + role + " passed");

        //Assert
        //тут можуть бути різні типи
        Assert.assertEquals("password1234","1234", "Assertion message");
        Assert.assertFalse(true,"Message");

        //SoftAssert
        SoftAssert softUserAssert = new SoftAssert();
        softUserAssert.assertEquals(userName,"Jon");
        softUserAssert.assertTrue(role.isBlank());
        //запуск наших SoftAssert

        System.out.println("Test goes on 1");
        softUserAssert.assertAll();


        System.out.println("Test goes on 2");

    }
    //метод повертає набір тестових данних, тому повертаємий тип - масив масивів об'єктів
    //зовнішній масив(перший) - тестові данні, і в середині - різні об'єкти
    @DataProvider(name = "userProvider")
    public Object[][] userProvider(){
        String[][] users = {
                {"userName", "userPass", "user"},
                {"adminName", "adminPass", "admin"},
                {"guestName", "guestPass", "guest"},
        };
        return users;
    }
}
