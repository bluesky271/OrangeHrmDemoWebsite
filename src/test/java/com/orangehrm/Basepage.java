package com.orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.testng.Assert;
import util.Support;

public class Basepage extends Support {

    public WebDriver driver = new FirefoxDriver();
    public String baseUrl = "https://enterprise-demo.orangehrmlive.com/symfony/web/index.php/auth/login";

    @BeforeSuite
    public void goToLoginPage() {

        driver.get(baseUrl);
    }

    @AfterSuite
    public void quitDriver() {

        driver.quit();
    }

}