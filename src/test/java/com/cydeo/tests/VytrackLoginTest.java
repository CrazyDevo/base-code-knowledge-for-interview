package com.cydeo.tests;

import com.cydeo.base.Driver;
import com.cydeo.pages.VytrackLoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class VytrackLoginTest {

    VytrackLoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get("https://qa3.vytrack.com/user/login");
        loginPage = new VytrackLoginPage();
    }

    @Test
    public void validLoginTest() {
        loginPage.login("USER1", "UserUser123");

        String expectedUrl = "https://qa3.vytrack.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl, "Login failed!");
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }
}
