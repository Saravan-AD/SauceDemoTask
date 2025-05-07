package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourInfoPage extends BasePage{

    @FindBy(id = "postal-code")
    WebElement zipCodeInput;

    @FindBy(id = "last-name")
    WebElement lastNameInput;

    @FindBy(id = "first-name")
    WebElement firstNameInput;

    @FindBy(id = "continue")
    WebElement continueBtn;

    @FindBy(xpath = "//h3[text()='Error: Postal Code is required']")
    WebElement postalCodeError;

    public boolean isYourInfoPageDisplayed() {
        return isDisplayed(zipCodeInput);
    }

    public void enterFirstName(String firstName) {
        firstNameInput.sendKeys(ConfigReader.getConfigValue(firstName));
    }

    public void enterLastName(String lastName) {
        lastNameInput.sendKeys(ConfigReader.getConfigValue(lastName));
    }

    public void enterZipCode(String zip) {
        zipCodeInput.sendKeys(ConfigReader.getConfigValue(zip));
    }

    public void clickContinue() {
        continueBtn.click();
    }

    public boolean isPostalCodeErrorShown() {
        return isDisplayed(postalCodeError);
    }
}
