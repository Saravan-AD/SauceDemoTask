package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps {

    HomePage homePage=new HomePage();

    @Then("verify user is on inventory page")
    public void verifyUserIsOnInventoryPage() {
        Assert.assertTrue(homePage.isUserOnHomePage());
    }

    @When("user click on hamburger menu")
    public void userClickOnHamburgerMenu() {
        homePage.clickHamburger();
    }

    @And("clicks Logout button")
    public void clicksLogoutButton() {
        homePage.clickLogout();
    }

    @Then("verify cart icon shows quantity {int}")
    public void verifyCartIconShowsQuantity(int qty) {
        Assert.assertEquals(homePage.verifyCartIconQty(),qty);
    }

    @When("user clicks add to cart of product {int}")
    public void userClicksAddToCartOfProduct(int prod) {
        homePage.clickAddToCart(prod);
    }

    @When("user clicks remove button of product {int}")
    public void userClicksRemoveButtonOfProduct(int prod) {
        homePage.clickRemoveBtn(prod);
    }

    @Then("verify cart icon shows no quantity")
    public void verifyCartIconShowsNoQuantity() {
        Assert.assertFalse(homePage.cartIconHasNoQty());
    }

    @And("verify add to cart button of product {int} is displayed")
    public void verifyAddToCartButtonOfProductIsDisplayed(int prod) {
        Assert.assertTrue(homePage.isAddToCartBtnVisible(prod));
    }

    @And("user clicks cart icon")
    public void userClicksCartIcon() {
        homePage.clickCart();
    }

    @When("user select price\\(low to high) sort")
    public void userSelectPriceLowToHighSort() {
        homePage.sortByPriceAscending();
    }

    @Then("verify the products are sorted in ascending order by price")
    public void verifyTheProductsAreSortedInAscendingOrderByPrice() {
        Assert.assertTrue(homePage.verifyAscendingSort());
    }

    @When("user select name\\(Z to A) sort")
    public void userSelectNameZToASort() {
        homePage.sortByNameDescending();
    }

    @Then("verify the products are sorted in descending order by name")
    public void verifyTheProductsAreSortedInDescendingOrderByName() {
        Assert.assertTrue(homePage.verifyDescendingSortOfName());
    }

    @When("user clicks on the product {string}")
    public void userClicksOnTheProduct(String prod) {
        homePage.clickProduct(prod);
    }

    @Then("verify the hamburger menu is opened")
    public void verifyTheHamburgerMenuIsOpened() {
        Assert.assertTrue(homePage.isHamBurgerMenuOpened());
    }

    @And("user click on reset app button")
    public void userClickOnResetAppButton() {
        homePage.clickResetBtn();
    }
}
