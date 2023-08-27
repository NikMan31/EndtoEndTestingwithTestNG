package org.example.Pages;

import org.example.DriverManager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DriverManager {

    @FindBy(id = "Email")
    WebElement emailFieldOnLoginPage;

    @FindBy(id = "Password")
    WebElement passwordFieldOnLoginPage;

    @FindBy(className = "login-button")
    WebElement loginbutton;

    @FindBy(className = "ico-account")
    WebElement successfulLoginVerification;

    public void loginPageFields(){
        emailFieldOnLoginPage.sendKeys("adminpatel3@gmail.com");
        passwordFieldOnLoginPage.sendKeys("Admin@123");
        loginbutton.click();
        successfulLoginVerification.isDisplayed();
    }

}
