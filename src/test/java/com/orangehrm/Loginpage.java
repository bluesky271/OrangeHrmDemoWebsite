package com.orangehrm;


import steps.LoginpageStep;
import org.testng.annotations.Test;

public class Loginpage extends LoginpageStep {

    @Test(priority = 0)
    public void loginAsSystemAdmin() {
        enterLogInDetails("sysadmin", "sysadmin");
        selectLoginButton();
    }

    @Test(priority = 1)
    public void loginAsUser() {
        enterLogInDetails("Admin", "admin");
        selectLoginButton();
    }

    @Test(priority = 2)
    public void loginAsEssUser() {
        enterLogInDetails("linda.anderson", "linda.anderson");
        selectLoginButton();
    }

    @Test(priority = 3)
    public void loginAsFirstLevelSupervisor() {
        enterLogInDetails("anthony.nolan", "anthony.nolan");
        selectLoginButton();
    }

    @Test(priority = 4)
    public void loginAsSecondLevelSupervisor() {
        enterLogInDetails("peter.mac", "peter.mac");
        selectLoginButton();
    }

    @Test(priority = 5)
    public void loginAsRegionalAdmin() {
        enterLogInDetails("nathan.elliot", "nathan.elliot");
        selectLoginButton();
    }

}
