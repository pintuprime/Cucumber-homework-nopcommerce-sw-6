package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("I am on home page")
    public void iAmOnHomePage() {
    }

    @When("Click on login link")
    public void clickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("verify that Welcome Please Sign In  message display")
    public void verifyThatWelcomePleaseSignInMessageDisplay() {
        String expectedText = "Welcome, Please Sign In!";
        String actualText = new LoginPage().getWelcomeText();
        Assert.assertEquals(actualText, expectedText, "Error in Welcome please sign in message");
    }

    @And("Enter EmailId {string}")
    public void enterEmailId(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("Enter Password {string}")
    public void enterPassword(String password) {
        new LoginPage().enterPassword(password);
    }


    @And("Click on Login Button")
    public void clickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("Verify that the Error message")
    public void verifyThatTheErrorMessage() {
        String expectedText = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualText = new LoginPage().getErrorMessage();
        Assert.assertEquals(actualText, expectedText, "Error");
    }

    @Then("Verify that LogOut link is display")
    public void verifyThatLogOutLinkIsDisplay() {
        String expectedText = "Log out";
        String actualText = new LoginPage().getLogOutText();
        Assert.assertEquals(actualText, expectedText, "Error in logout text");
    }

    @And("Click on LogOut Link")
    public void clickOnLogOutLink() {
        new LoginPage().clickOnLogOut();
    }

    @Then("Verify that LogIn Link Display")
    public void verifyThatLogInLinkDisplay() {
        String expectedText = "Log in";
        String actualText = new LoginPage().getLogINText();
        Assert.assertEquals(actualText, expectedText, "Error in login text");
    }
}
