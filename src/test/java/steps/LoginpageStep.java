package steps;


import com.orangehrm.Basepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginpageStep extends Basepage {

    public void enterLogInDetails(String username, String password) {
        driver.findElement(By.id("txtUsername")).sendKeys(username);
        driver.findElement(By.id("txtPassword")).sendKeys(password);
    }

    public void selectLoginButton() {
        driver.findElement(By.id("btnLogin")).click();
        WebElement welcomeBox = driver.findElement(By.id("welcome"));
        waitForElements(welcomeBox, driver);
    }

}
