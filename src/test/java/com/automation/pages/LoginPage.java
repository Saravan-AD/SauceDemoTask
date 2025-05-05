package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "user-name")
    WebElement usernameInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id = "login-button")
    WebElement loginBtn;

    @FindBy(xpath = "//h3[@data-test='error']")
    WebElement errorMsg;

    public boolean isLoginPageDisplayed(){
        return isDisplayed(loginBtn);
    }

    public void openWebsite(String url){
        driver.get(ConfigReader.getConfigValue(url));
    }
    public void doLogin(String username, String password){
        usernameInput.sendKeys(ConfigReader.getConfigValue(username));
        passwordInput.sendKeys(ConfigReader.getConfigValue(password));
    }

    public void clickLogin(){
        loginBtn.click();
    }

    public boolean isErrorMsgDisplayed(){
        return isDisplayed(errorMsg);
    }
}
