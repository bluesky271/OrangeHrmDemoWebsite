package com.orangehrm;


import steps.LoginPageStep;
import org.testng.annotations.Test;

public class LoginPage extends LoginPageStep {

    @Test(priority = 0)
    public void loginAsSystemAdmin() {
        enterLogInDetails("sysadmin", "sysadmin");
        selectLoginButton();
        assertSuccessLogIn();
    }

    @Test(priority = 1)
    public void loginAsUser() {
        enterLogInDetails("Admin", "admin");
        selectLoginButton();
        assertSuccessLogIn();
    }

    @Test(priority = 2)
    public void loginAsEssUser() {
        enterLogInDetails("linda.anderson", "linda.anderson");
        selectLoginButton();
        assertSuccessLogIn();
    }

    @Test(priority = 3)
    public void loginAsFirstLevelSupervisor() {
        enterLogInDetails("anthony.nolan", "anthony.nolan");
        selectLoginButton();
        assertSuccessLogIn();
    }

    @Test(priority = 4)
    public void loginAsSecondLevelSupervisor() {
        enterLogInDetails("peter.mac", "peter.mac");
        selectLoginButton();
        assertSuccessLogIn();
    }

    @Test(priority = 5)
    public void loginAsRegionalAdmin() {
        enterLogInDetails("nathan.elliot", "nathan.elliot");
        selectLoginButton();
        assertSuccessLogIn();
    }

}
