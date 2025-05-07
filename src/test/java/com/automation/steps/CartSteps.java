package com.automation.steps;

import com.automation.pages.CartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CartSteps {

    CartPage cartPage=new CartPage();

    @Then("verify cart page is displayed")
    public void verifyCartPageIsDisplayed() {
        Assert.assertTrue(cartPage.isCartPageDisplayed());
    }

    @And("verify if product {int} is added to cart")
    public void verifyIfProductIsAddedToCart(int prod) {
        Assert.assertTrue(cartPage.isProductAddedToCart(prod));
    }

    @When("user clicks remove button of product {int} in cart page")
    public void userClicksRemoveButtonOfProductInCartPage(int prod) {
        cartPage.clickRemoveBtn(prod);
    }

    @Then("verify cart page does not have product {int}")
    public void verifyCartPageDoesNotHaveProduct(int prod) {
        Assert.assertFalse(cartPage.isProductAddedToCart(prod));
    }

    @And("user clicks checkout button")
    public void userClicksCheckoutButton() {
        cartPage.clickCheckout();
    }

    @When("user clicks continue shopping button")
    public void userClicksContinueShoppingButton() {
        cartPage.clickContinueShopping();
    }
}
