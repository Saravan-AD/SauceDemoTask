package com.automation.pages;

import com.automation.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    WebDriver driver;
    protected WebDriverWait wait;

    public BasePage() {
//        System.out.println(DriverManager.getDriver());
        driver = DriverManager.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
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

    public void waitUntilVisible(WebElement ele) {
        wait.until(ExpectedConditions.visibilityOf(ele));
    }
}