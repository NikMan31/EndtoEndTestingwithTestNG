package org.example.Pages;

import org.example.DriverManager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends DriverManager {

    WebDriver driver;

    @FindBy(xpath = "//h2[text()=\"Welcome to our store\"]")
    WebElement welcomeText;

    @FindBy(className = "ico-register")
    WebElement registerBtnOnHomePage;

    @FindBy(className = "ico-login")
    WebElement loginBtnOnHomePage;

    @FindBy(className = "cart-label")
    WebElement shoppingCartBtn;



    public void welcomeTextAtHomePage(){
        String actualWelcometext="Welcome to our store";
        String expectedWelcomeText=welcomeText.getText();
        Assert.assertEquals(expectedWelcomeText, actualWelcometext);
    }

    public void registerBtnOnHomePage(){
        registerBtnOnHomePage.click();
    }

    public void loginBtnOnHomePage(){
        loginBtnOnHomePage.click();
    }

    public void shoppingCartBtn(){
        shoppingCartBtn.click();
    }

}
