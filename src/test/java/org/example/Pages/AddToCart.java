package org.example.Pages;

import org.example.DriverManager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class AddToCart extends DriverManager {
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[2]/div[1]/a/img")
    WebElement nopCommerceHomePageBtn;

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/a")
    WebElement computerBtn;

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[1]/a")
    WebElement desktopBtn;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/a/img")
    WebElement lenovoDesktop;

    @FindBy(xpath = "//button[text()=\"Add to cart\"]")
    WebElement addToCartBtn;

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[2]/a")
    WebElement electrinicsBtn;

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[2]/ul/li[2]/a")
    WebElement cellAndPhoneBtn;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[1]/a/img")
    WebElement HTCMobile;

    public void lenovoDesktopAddToCart(){
        Actions actions=new Actions(driver);
        actions.moveToElement(computerBtn).click(desktopBtn).build().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        lenovoDesktop.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        addToCartBtn.click();

        nopCommerceHomePageBtn.click();

        actions.moveToElement(electrinicsBtn).click(cellAndPhoneBtn).build().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        HTCMobile.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        addToCartBtn.click();
        nopCommerceHomePageBtn.click();

    }
}
