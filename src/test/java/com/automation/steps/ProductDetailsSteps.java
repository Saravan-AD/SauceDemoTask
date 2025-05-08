package com.automation.steps;

import com.automation.pages.ProductDetailsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ProductDetailsSteps {

    ProductDetailsPage productDetailsPage=new ProductDetailsPage();

    @Then("verify if the {string} details page is displayed")
    public void verifyIfTheDetailsPageIsDisplayed(String prod) {
        Assert.assertTrue(productDetailsPage.isProductDetailPageDisplayed(prod));
    }

    @And("clicks back to products button")
    public void clicksBackToProductsButton() {
        productDetailsPage.clickBackToProd();
    }
}
