package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement shoppingCartLink;

    @FindBy(id = "react-burger-menu-btn")
    WebElement hamburger;

    @FindBy(id = "logout_sidebar_link")
    WebElement logout;

    public boolean isUserOnHomePage(){
        return isDisplayed(shoppingCartLink);
    }

    public void clickHamburger(){
        hamburger.click();
    }

    public void clickLogout(){
        logout.click();
    }
}
