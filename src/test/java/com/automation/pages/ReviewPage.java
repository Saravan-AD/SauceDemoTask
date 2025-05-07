package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewPage extends BasePage{

    @FindBy(id = "finish")
    WebElement finishBtn;

    @FindBy(css = ".complete-header")
    WebElement orderConfirmationMsg;

    @FindBy(id="back-to-products")
    WebElement backHome;

    public boolean isReviewPageDisplayed() {
        return finishBtn.isDisplayed();
    }

    public void clickFinishButton() {
        finishBtn.click();
    }

    public boolean isConfirmationDisplayed() {
        return isDisplayed(orderConfirmationMsg);
    }
}
