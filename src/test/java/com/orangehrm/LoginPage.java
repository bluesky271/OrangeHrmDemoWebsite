package com.orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.junit.Assert;

public class LoginPage {

    WebDriver driver;
    String baseUrl = "https://enterprise-demo.orangehrmlive.com/symfony/web/index.php/auth/login";

    String adminUsername = "sysadmin";
    String adminPassword = "sysadmin";
    WebElement username;
    WebElement password;
    WebElement loginButton;
    WebElement sysAdminHomePage;


    @BeforeTest
    public void navigateToLoginPage() {
        driver = new FirefoxDriver();
        driver.get(baseUrl);
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }

    @Test
    public void enterAdminUsernamePassword() {
        username = driver.findElement(By.xpath(".//*[@id='txtUsername']"));
        username.sendKeys(adminUsername);
        password = driver.findElement(By.xpath(".//*[@id='txtPassword']"));
        password.sendKeys(adminPassword);
        loginButton = driver.findElement(By.xpath(".//*[@id='btnLogin']"));
        loginButton.click();

        sysAdminHomePage = driver.findElement(By.xpath(".//*[@id='search-results']/div[1]/h1"));
        Assert.assertTrue(sysAdminHomePage.getText().contains("Leave Types"));
    }



}