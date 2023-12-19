package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement enterEmail;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement enterPassword;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement  welcomeText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(css = ".ico-logout")
    WebElement logoutLink;

    @CacheLookup
    @FindBy(css = ".ico-logout")
    WebElement logOutTextVerify;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginText;

    public void enterEmailId(String email){
        sendTextToElement(enterEmail,email);

    }
    public void enterPassword(String password){
        sendTextToElement(enterPassword,password);

    }
    public void clickOnLoginButton() {
        clickOnElement(loginButton);

    }
    public String getWelcomeText(){
        String message = getTextFromElement(welcomeText);
        return message;
    }
    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }

    public String getLogOutText(){
        return getTextFromElement(logOutTextVerify);
    }
    public void clickOnLogOut(){
        clickOnElement(logoutLink);
    }

    public String getLogINText(){
        return getTextFromElement(loginText);
    }
}
