package org.example.DriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestListener;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class DriverManager implements ITestListener {

    public static WebDriver driver;
    String browser = "chrome";
    String baseURL = "https://demo.nopcommerce.com/";

    public DriverManager() {
        PageFactory.initElements(driver, this);
    }

    ChromeOptions options=new ChromeOptions();

    public void runOnLocalBrowser() throws IllegalAccessException {
        //options.addArguments("headless");
        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(options);
                driver.manage().window().setSize(new Dimension(1440, 900)); //Here I am defining is commen universal size becuase headless mode ma size starting phase ma nani hoy to element invisible mode ma na hoy to by using this universal size all the elemenets would be in visible state.
                driver.get(baseURL);
                driver.manage().window().maximize();
                break;
            case "safari":
                driver = new SafariDriver();
                driver.get(baseURL);
                driver.manage().window().maximize();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                driver.get(baseURL);
                driver.manage().window().maximize();
                break;
            default:
                throw new IllegalAccessException("Unexpected browser");
        }
    }

    public void ScreenShotonFailure() throws IOException {
        Date date=new Date();

        //So here I am replacing space and colon with -
        String screenshotFileName=date.toString().replace(" ", "-").replace(":", "-");
        System.out.println(screenshotFileName);

        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(".//screenshot//"+screenshotFileName+".png"));
    }



}
