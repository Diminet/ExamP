package org.example.test.TestNG.LoghinTest;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.example.test.pom.Login;

import java.util.concurrent.TimeUnit;


public class Tests {
    WebDriver driver;

    //String baseUrl = "https://simpalsid.com/user/register";
    String baseUrl = " https://simpalsid.com/user/login";

    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\ion\\Desktop\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get(baseUrl);

    }
    @Test
    public void LoginTest(){
        WebElement loginElement= driver.findElement(By.xpath("//div[@class=\"login__title\"]"));
        Assert.assertTrue(loginElement.isDisplayed());
        WebElement usernameInput = driver.findElement(By.xpath("//input[@name='login']"));
        usernameInput.sendKeys("ajax0070909");
        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='password']"));
        passwordInput.sendKeys("qwe123!@#");
        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        button.click();
        //Logout
        String baseUrl1 = " https://simpalsid.com/user/login";
        driver.get(baseUrl1);
        WebElement loginElement1= driver.findElement(By.xpath("//div[@class=\"login__title\"]"));
        Assert.assertTrue(loginElement1.isDisplayed());
        WebElement loginElement2= driver.findElement(By.xpath("//a[text()='Выйти из аккаунта']"));
        loginElement2.click();
    }

//    @Test
//    public void VerifyLoginTest(){
//         String existingUser = "username"; // se introduce username pentru verificare
//        String userPass = RandomStringUtils.randomAlphanumeric(6);
//        WebDriver driver = new FirefoxDriver();
//
//        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//        driver.get(baseUrl);
//        WebElement loginElement= driver.findElement(By.xpath("//div[@class=\"login__title\"]"));
//
//        Assert.assertTrue(loginElement.isDisplayed());
//        WebElement usernameInput = driver.findElement(By.xpath("//input[@name='login']"));
//        usernameInput.sendKeys(existingUser);
//        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='password']"));
//        passwordInput.sendKeys(userPass); // in userPass se introduce parola
//
//        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
//        button.click();
//    }
//    @Test
//    public void InregistrareTest(){driver.get(baseUrl);
//        String newUserName = "username" + RandomStringUtils.randomAlphabetic(2);
//        String loginEMailText = "mail+"+ RandomStringUtils.randomNumeric(3) + "@gmil.com";
//        String userPass = RandomStringUtils.randomAlphanumeric(6);
//        WebElement loginElement = driver.findElement(By.xpath("//div[@class=\"login__title\"]"));
//        Assert.assertTrue(loginElement.isDisplayed());
//        WebElement loginEMail = driver.findElement(By.xpath("//div/input[@name=\"email\"]"));
//        loginEMail.sendKeys(loginEMailText);
//        WebElement usernameInput = driver.findElement(By.xpath("//input[@name='login']"));
//        usernameInput.sendKeys(newUserName);
//        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='password']"));
//        passwordInput.sendKeys(userPass);
//        WebElement rulesCheckbox = driver.findElement(By.xpath("//input[@id='agree-rules']"));
//        rulesCheckbox.isSelected();
//        rulesCheckbox.click();
//        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
//        button.click();}
    // Page Object Model POM

    @AfterMethod
    public void afterMethods(){
//        driver.close();
//        driver.quit();
    }
}