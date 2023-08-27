package org.example.Pages;

import org.example.DriverManager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends DriverManager {

    WebDriver driver;
    public RegistrationPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @FindBy(id = "LastName")
    WebElement lastNameField;

    @FindBy(id = "Email")
    WebElement emailField;

    @FindBy(id = "Password")
    WebElement passwordField;

    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @FindBy(id = "register-button")
    WebElement registerBtn;

    @FindBy(xpath = "//div[text()=\"Your registration completed\"]")
    WebElement successfulRegisterText;

    public void AllFieldsAtRegistrationPage(){
        firstNameField.sendKeys("admin");
        lastNameField.sendKeys("Patel");
        emailField.sendKeys("adminpatel3@gmail.com");
        passwordField.sendKeys("Admin@123");
        confirmPasswordField.sendKeys("Admin@123");
        registerBtn.click();
        successfulRegisterText.isDisplayed();
    }


}
