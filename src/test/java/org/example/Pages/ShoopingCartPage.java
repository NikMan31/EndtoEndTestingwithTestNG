package org.example.Pages;

import org.example.DriverManager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoopingCartPage extends DriverManager {

    @FindBy(id = "termsofservice")
    WebElement termAndConditionBtn;

    @FindBy(id = "checkout")
    WebElement checkOutButton;

    public void shopingCart(){
        termAndConditionBtn.click();
        checkOutButton.click();
    }
}
