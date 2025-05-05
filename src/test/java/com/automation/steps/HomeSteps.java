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
}
