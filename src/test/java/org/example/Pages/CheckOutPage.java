package org.example.Pages;

import org.example.DriverManager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage extends DriverManager {

    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement billingCountry;

    @FindBy(id = "BillingNewAddress_City")
    WebElement billingCity;

    @FindBy(id = "BillingNewAddress_Address1")
    WebElement billingAddress;

    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement billingZipCode;

    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement billingPhoneNumber;

    @FindBy(xpath = "//*[@id=\"billing-buttons-container\"]/button[4]")
    WebElement countinueBtn1;


    @FindBy(xpath = "//*[@id=\"shipping-method-buttons-container\"]/button")
    WebElement countineBtn2;

    @FindBy(xpath = "//*[@id=\"payment-method-buttons-container\"]/button")
    WebElement countineBtn3;

    @FindBy(xpath = "//*[@id=\"payment-info-buttons-container\"]/button")
    WebElement countineBtn4;

    @FindBy(xpath = "//*[@id=\"confirm-order-buttons-container\"]/button")
    WebElement confirmBtn;

    @FindBy(xpath = "//strong[text()=\"Your order has been successfully processed!\"]")
    WebElement placedOrderText;


    public void checkOutDetails(){
        if(billingCountry.isDisplayed()){
            Select select=new Select(billingCountry);
            select.selectByValue("233");
            billingCity.sendKeys("London");
            billingAddress.sendKeys("Harrow");
            billingZipCode.sendKeys("HA32FR");
            billingPhoneNumber.sendKeys("+44 07407951635");
            countinueBtn1.click();
        }
        else {
            countinueBtn1.click();
        }

        countineBtn2.click();
        countineBtn3.click();
        countineBtn4.click();
        confirmBtn.click();
        placedOrderText.isDisplayed();

    }
}
