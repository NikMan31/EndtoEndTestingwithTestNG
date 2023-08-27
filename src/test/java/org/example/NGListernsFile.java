package org.example;

import org.example.DriverManager.DriverManager;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class NGListernsFile extends DriverManager implements ITestListener {

    DriverManager driverManager=new DriverManager();

    public void onTestStart(ITestResult result){
        try {
            driverManager.runOnLocalBrowser();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
    public void onTestFailure(ITestResult result){
        try {
            driverManager.ScreenShotonFailure();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void onTestSuccess(ITestResult result){
        driverManager.ReportGeneration();
    }




}
