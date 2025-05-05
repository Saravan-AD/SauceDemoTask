package com.automation.pages;

import com.automation.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class BasePage {

    WebDriver driver;

    public BasePage() {
//        System.out.println(DriverManager.getDriver());
        driver = DriverManager.getDriver();
        PageFactory.initElements(driver, this);
    }

    public boolean isDisplayed(WebElement elt){
        try {
            setImplicitWait(10);
            return elt.isDisplayed();
        } catch (Exception e) {
            return false;
        }
        finally {
            setImplicitWait(60);
        }
    }

    public void setImplicitWait(int sec){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
    }
}