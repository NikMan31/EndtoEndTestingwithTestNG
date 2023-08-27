package org.example.Step_Def;

import com.aventstack.extentreports.ExtentReports;
import io.cucumber.java.en.Given;
import org.example.DriverManager.DriverManager;
import org.example.Pages.*;

import java.io.IOException;

public class MainClass extends DriverManager {


    ExtentReports extentReport=new ExtentReports();
    HomePage homePage=new HomePage();
    RegistrationPage registrationPage=new RegistrationPage();
    LoginPage loginPage=new LoginPage();
    AddToCart addToCart=new AddToCart();

    ShoopingCartPage shoopingCartPage=new ShoopingCartPage();
    CheckOutPage checkOutPage=new CheckOutPage();

    @Given("I am homePage")
    public void is_for_execution() throws InterruptedException, IOException {

        extentReport.createTest("End to End Testing Scenario");

        homePage.welcomeTextAtHomePage();
        //homePage.registerBtnOnHomePage();
        homePage.loginBtnOnHomePage();

        //registrationPage.AllFieldsAtRegistrationPage();

        loginPage.loginPageFields();

        addToCart.lenovoDesktopAddToCart();

        homePage.shoppingCartBtn();

        shoopingCartPage.shopingCart();
        checkOutPage.checkOutDetails();

        extentReport.flush();

    }
}
