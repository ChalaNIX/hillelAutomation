package ua.hillel.tests.locators17.homeworkwebelement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class login {
    @Test
    public void correctLogin() {
        WebDriverManager.chromiumdriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");

        //- написати 2 тести на коректний та некоректний логін. В першому випадку перевірити, що відображається повідомлення
        // "You logged into a secure area!", в другому випадку - що відображається повідомлення про неправильний логін/пароль

        //correct login
        WebElement userNameField = driver.findElement(By.cssSelector("input[name='username']"));
        WebElement passwordField = driver.findElement(By.cssSelector("input[name='password']"));
        WebElement submitButton = driver.findElement(By.cssSelector("button[type='submit']"));

        userNameField.clear();
        userNameField.sendKeys("tomsmith");
        passwordField.clear();
        passwordField.sendKeys("SuperSecretPassword!");
        submitButton.click();

        WebElement loginResultText = driver.findElement(By.cssSelector("div[class='flash success']"));

        Assert.assertTrue(loginResultText.getText().contains("You logged into a secure area!"));

        WebElement logoutButton = driver.findElement(By.cssSelector("a[href='/logout']"));
        logoutButton.click();

        driver.quit();
    }
    @Test
    public void incorrectLogin() {
        WebDriverManager.chromiumdriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");
        WebElement userNameField = driver.findElement(By.cssSelector("input[name='username']"));
        WebElement passwordField = driver.findElement(By.cssSelector("input[name='password']"));
        WebElement submitButton = driver.findElement(By.cssSelector("button[type='submit']"));

        userNameField.clear();
        userNameField.sendKeys("tom");
        passwordField.clear();
        passwordField.sendKeys("Password!");
        submitButton.click();
        WebElement loginNegativeResultText = driver.findElement(By.cssSelector("div[class='flash error']"));
        Assert.assertTrue(loginNegativeResultText.getText().contains("Your username is invalid!"));

        driver.quit();

    }
}
