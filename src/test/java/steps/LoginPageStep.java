package steps;


import com.orangehrm.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class LoginPageStep extends BasePage {

    public void enterLogInDetails(String username, String password) {
        driver.findElement(By.id("txtUsername")).sendKeys(username);
        driver.findElement(By.id("txtPassword")).sendKeys(password);
    }

    public void selectLoginButton() {
        driver.findElement(By.id("btnLogin")).click();
        WebElement welcomeBox = driver.findElement(By.id("welcome"));
        waitForElements(welcomeBox, driver);
    }

    public void assertSuccessLogIn() {
        WebElement welcomeBox = driver.findElement(By.id("welcome"));
        Assert.assertTrue(welcomeBox.isDisplayed(), "You're not logged in");

    }
}
