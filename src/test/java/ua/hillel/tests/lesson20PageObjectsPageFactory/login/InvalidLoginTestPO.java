package ua.hillel.tests.lesson20PageObjectsPageFactory.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.automation.java.pages.LoginPage;
import ua.hillel.automation.java.pages.MainPage;

public class InvalidLoginTestPO extends BaseTest{

    @Test
    public void invalidLoginTestPO(){
        driver.get("https://the-internet.herokuapp.com/");

        MainPage mainPage = new MainPage(driver);
        //invalid creds
        LoginPage loginPage = mainPage.openAuthPage()
                .setUserName("InvalidUsername")
                .setPassword("SuperSecretPassword!")
                .loginWithInvalidCreds();

        Assert.assertTrue(loginPage.getErrorText().contains("Your username is invalid!"));
    }
}
