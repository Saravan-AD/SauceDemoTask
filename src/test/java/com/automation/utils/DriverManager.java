package com.automation.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class DriverManager {
    static WebDriver driver;
    public static void createDriver(){
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--incognito");

        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//        driver.get(ConfigReader.getConfigValue("application.url"));
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static byte[] takeScreenshotAsInputStream(){
        TakesScreenshot ts = (TakesScreenshot) driver;
        return ts.getScreenshotAs(OutputType.BYTES);
    }
}