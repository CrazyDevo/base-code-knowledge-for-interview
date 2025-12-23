package com.cydeo.tests;

import com.cydeo.base.Driver;
import com.cydeo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

    LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get("https://practice.cydeo.com/login");
        loginPage = new LoginPage();
    }

    @Test
    public void validLoginTest() {

        loginPage.login("tomsmith", "SuperSecretPassword");

        Assert.assertTrue(
                loginPage.successMessage.isDisplayed(),
                "Success message is NOT displayed!"
        );

        Assert.assertTrue(
                loginPage.successMessage.getText().contains("You logged into a secure area"),
                "Login was NOT successful!"
        );
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }
}
