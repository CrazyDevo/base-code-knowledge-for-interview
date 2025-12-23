package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(css = "#login > div:nth-of-type(1) input")
    public WebElement usernameInput;

    @FindBy(css = "#login > div:nth-of-type(2) input")
    public WebElement passwordInput;

    @FindBy(id = "wooden_spoon")
    public WebElement loginButton;

    @FindBy(css = ".flash.success")
    public WebElement successMessage;

    public void login(String username, String password) {
        usernameInput.clear();
        usernameInput.sendKeys(username);

        passwordInput.clear();
        passwordInput.sendKeys(password);

        loginButton.click();
    }
}
