package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends BasePage{

    @FindBy(id = "back-to-products")
    WebElement backBtn;

    String itemXpath="//div[text()='%s']";

    public boolean isProductDetailPageDisplayed(String prod) {
        return isDisplayed(driver.findElement(By.xpath(String.format(itemXpath, ConfigReader.getConfigValue(prod)))));
    }

    public void clickBackToProd() {
        backBtn.click();
    }
}
