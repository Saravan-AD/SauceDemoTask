package com.automation.steps;

import com.automation.pages.YourInfoPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class YourInfoSteps {

    YourInfoPage yourInfoPage=new YourInfoPage();

    @Then("verify if your information page is displayed")
    public void verifyIfYourInformationPageIsDisplayed() {
        Assert.assertTrue(yourInfoPage.isYourInfoPageDisplayed());
    }

    @When("user enter first name as {string}")
    public void userEnterFirstNameAs(String firstName) {
        yourInfoPage.enterFirstName(firstName);
    }

    @And("user enters last name as {string}")
    public void userEntersLastNameAs(String lastName) {
        yourInfoPage.enterLastName(lastName);
    }

    @And("user enter zip code as {string}")
    public void userEnterZipCodeAs(String zip) {
        yourInfoPage.enterZipCode(zip);
    }

    @And("user clicks continue button")
    public void userClicksContinueButton() {
        yourInfoPage.clickContinue();
    }


    @Then("verify that it is not redirected to your information page")
    public void verifyThatItIsNotRedirectedToYourInformationPage() {
        Assert.assertFalse(yourInfoPage.isYourInfoPageDisplayed());
    }

    @Then("verify postal code error message is displayed")
    public void verifyPostalCodeErrorMessageIsDisplayed() {
        Assert.assertTrue(yourInfoPage.isPostalCodeErrorShown());
    }
}
