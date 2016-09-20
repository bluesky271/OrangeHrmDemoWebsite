package com.orangehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class Homepage {
    WebDriver driver;
    String baseUrl = "https://enterprise-demo.orangehrmlive.com/symfony/web/index.php/auth/login";

    public Homepage(WebDriver driver) {
        this.driver = driver;
        System.out.println("Homepage object has been created");
    }
}
