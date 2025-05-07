package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class CartPage extends BasePage{

    @FindBy(id = "checkout")
    WebElement checkOutBtn;

    @FindBy(className = "inventory_item_name")
    List<WebElement> itemName;

//    @FindBy(xpath = "//button[contains(@id,'remove')]")
//    List<WebElement> removeFromCartBtnList;

    @FindBy(id = "continue-shopping")
    WebElement continueShoppingBtn;

    String removeFromCartBtnListXpath="//div[text()='%s']/../following-sibling::div//button";

    public boolean isCartPageDisplayed(){
        return isDisplayed(checkOutBtn);
    }

    public boolean isProductAddedToCart(int prod){
        //return ConfigReader.getConfigValue("product"+prod+".name").equals(itemName.get(prod-1).getText());
        return itemName.stream()
                .map(WebElement::getText)
                .toList().contains(ConfigReader.getConfigValue("product"+prod+".name"));
    }

    public void clickRemoveBtn(int prod) {
        WebElement removeFromCartBtnList=driver.findElement(By.xpath(String.format(removeFromCartBtnListXpath,ConfigReader.getConfigValue("product"+prod+".name"))));
        removeFromCartBtnList.click();
    }

    public void clickCheckout() {
        checkOutBtn.click();
    }

    public void clickContinueShopping() {
        continueShoppingBtn.click();
    }
}
