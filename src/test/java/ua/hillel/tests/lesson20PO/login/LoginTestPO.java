package ua.hillel.tests.lesson20PO.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.automation.java.pages.SecurePage;


//ми екстендимо клас з beforeClass і afterClass методами які запускаються автоматично
public class LoginTestPO extends BaseTest {
    @Test
    public void loginTestPO() {


        SecurePage securePage = openApp().openAuthPage()
                .setUserName("tomsmith")
                .setPassword("SuperSecretPassword!")
                .clickLoginButton();


        //mainPage.openAuthPage();

//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.setUserName("tomsmith");
//        loginPage.setPassword("SuperSecretPassword!");
//        loginPage.clickLoginButton();

        //SecurePage securePage = new SecurePage(driver);

        Assert.assertEquals(securePage.getTitle(),"Secure Area", "Wrong page title is displayed");
        securePage.logout();
    }
}
