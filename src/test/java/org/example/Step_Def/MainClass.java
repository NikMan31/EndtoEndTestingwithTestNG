package org.example.Step_Def;

import io.cucumber.java.en.Given;
import org.example.DriverManager.DriverManager;
import org.example.Pages.*;

import java.io.IOException;

public class MainClass extends DriverManager {


    HomePage homePage=new HomePage();
    RegistrationPage registrationPage=new RegistrationPage();
    LoginPage loginPage=new LoginPage();
    AddToCart addToCart=new AddToCart();

    ShoopingCartPage shoopingCartPage=new ShoopingCartPage();
    CheckOutPage checkOutPage=new CheckOutPage();

    @Given("I am homePage")
    public void is_for_execution() throws InterruptedException, IOException {
        homePage.welcomeTextAtHomePage();
        //homePage.registerBtnOnHomePage();
        homePage.loginBtnOnHomePage();

        //registrationPage.AllFieldsAtRegistrationPage();

        loginPage.loginPageFields();

        addToCart.lenovoDesktopAddToCart();

        homePage.shoppingCartBtn();

        shoopingCartPage.shopingCart();
        checkOutPage.checkOutDetails();
    }
}
