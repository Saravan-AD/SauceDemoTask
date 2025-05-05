package com.automation.steps;

import com.automation.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {

    LoginPage loginPage=new LoginPage();

    @Given("user open website")
    public void userOpenWebsite() {
        loginPage.openWebsite("application.url");
    }

    @When("user enters username {string} and password {string}")
    public void userEntersUsernameAndPassword(String username, String password) {
        loginPage.doLogin(username,password);
    }

    @And("clicks login button")
    public void clicksLoginButton() {
        loginPage.clickLogin();
    }

    @Then("verify error message is displayed")
    public void verifyErrorMessageIsDisplayed() {
        Assert.assertTrue(loginPage.isErrorMsgDisplayed());
    }

    @Then("verify user is on login page")
    public void verifyUserIsOnLoginPage() {
        Assert.assertTrue(loginPage.isLoginPageDisplayed());
    }
}
