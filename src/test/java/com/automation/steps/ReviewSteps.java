package com.automation.steps;

import com.automation.pages.ReviewPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ReviewSteps {

    ReviewPage reviewPage=new ReviewPage();

    @Then("verify review page is displayed")
    public void verifyReviewPageIsDisplayed() {
        Assert.assertTrue(reviewPage.isReviewPageDisplayed());
    }

    @When("user clicks finish button")
    public void userClicksFinishButton() {
        reviewPage.clickFinishButton();
    }

    @Then("verify the confirmation message is displayed")
    public void verifyTheConfirmationMessageIsDisplayed() {
        Assert.assertTrue(reviewPage.isConfirmationDisplayed());
    }
}
