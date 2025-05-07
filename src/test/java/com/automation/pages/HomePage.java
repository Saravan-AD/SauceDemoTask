package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HomePage extends BasePage{

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement shoppingCartLink;

    @FindBy(id = "react-burger-menu-btn")
    WebElement hamburger;

    @FindBy(id = "logout_sidebar_link")
    WebElement logout;

    @FindBy(xpath = "//button[contains(@id,'add-to-cart')]")
    List<WebElement> addToCartBtnList;

    @FindBy(className = "shopping_cart_badge")
    WebElement quantity;

    @FindBy(xpath = "//button[contains(@id,'remove')]")
    List<WebElement> removeFromCartBtnList;

    @FindBy(className = "inventory_item_name")
    List<WebElement> itemName;

    @FindBy(className = "product_sort_container")
    WebElement sortOpt;

    @FindBy(className="inventory_item_price")
    List<WebElement> itemPrice;

    public boolean isUserOnHomePage(){
        return isDisplayed(shoppingCartLink);
    }

    public void clickHamburger(){
        hamburger.click();
    }

    public void clickLogout(){
        logout.click();
    }

    public int verifyCartIconQty() {
        System.out.println(quantity.getText());
        return Integer.parseInt(quantity.getText());
    }

    public void clickAddToCart(int prod) {
        ConfigReader.setConfigValue("product"+prod+".name",itemName.get(prod-1).getText());
        addToCartBtnList.get(prod-1).click();
    }

    public void clickRemoveBtn(int prod) {
        removeFromCartBtnList.get(prod-1).click();
    }

    public boolean cartIconHasNoQty() {
        return isDisplayed(quantity);
    }

    public boolean isAddToCartBtnVisible(int prod) {
        return isDisplayed(addToCartBtnList.get(prod-1));
    }

    public void clickCart() {
        shoppingCartLink.click();
    }

    public void sortByPriceAscending() {
        Select select=new Select(sortOpt);
        select.selectByValue("lohi");
    }

    public boolean verifyAscendingSort() {
        List<Double> price=itemPrice.stream()
                .map(WebElement::getText)              // "$7.99"
                .map(s -> s.replace("$", ""))          // "7.99"
                .map(Double::parseDouble).toList();

        System.out.println(price);

        List<Double> sorted = new ArrayList<>(price);
        // 2) sort the copy
        Collections.sort(sorted);
        return price.equals(sorted);
    }

    public void sortByNameDescending() {
        Select select=new Select(sortOpt);
        select.selectByValue("za");
    }

    public boolean verifyDescendingSortOfName() {
        List<String> product=itemName.stream()
                .map(WebElement::getText).toList();

        List<String> sorted=new ArrayList<>(product);
        Collections.sort(sorted,Collections.reverseOrder());

        System.out.println(product);
        System.out.println(sorted);
        return product.equals(sorted);
    }

    public void clickProduct(String prod) {

    }
}
