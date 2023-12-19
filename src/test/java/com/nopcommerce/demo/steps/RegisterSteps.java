package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @When("Click on Register Link")
    public void clickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("Verify Register text")
    public void verifyRegisterText() {
        String expectedText = "Register";
        String actualText = new RegisterPage().getRegisterTitle();
        Assert.assertEquals(actualText, expectedText, "Error in register title");
    }


    @And("Click on REGISTER button")
    public void clickOnREGISTERButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @And("Verify the error message First name is required.")
    public void verifyTheErrorMessageFirstNameIsRequired() {
        String expectedText = "First name is required.";
        String actualText = new RegisterPage().getFirstNameText();
        Assert.assertEquals(actualText, expectedText, "Error in first name text");
    }

    @And("Verify the error message Last name is required.")
    public void verifyTheErrorMessageLastNameIsRequired() {
        String expectedText = "Last name is required.";
        String actualText = new RegisterPage().getLastNameText();
        Assert.assertEquals(actualText, expectedText, "Error in last name text");
    }

    @And("Verify the error message Email is required.")
    public void verifyTheErrorMessageEmailIsRequired() {
        String expectedText = "Email is required.";
        String actualText = new RegisterPage().getEmailText();
        Assert.assertEquals(actualText, expectedText, "Error in email text");
    }

    @And("Verify the error message Password is required.")
    public void verifyTheErrorMessagePasswordIsRequired() {
        String expectedText = "Password is required.";
        String actualText = new RegisterPage().getPasswordText();
        Assert.assertEquals(actualText, expectedText, "Error in password text");
    }

    @Then("Verify the error message confirm Password is required.")
    public void verifyTheErrorMessageConfirmPasswordIsRequired() {
        String expectedText = "Password is required.";
        String actualText = new RegisterPage().getConfirmPasswordText();
        Assert.assertEquals(actualText, expectedText, "Error in confirm password text");
    }

    @And("I Select gender Female")
    public void iSelectGenderFemale() {
        new RegisterPage().clickOnRadioButtonFemale();
    }

    @And("I Enter firstname {string}")
    public void iEnterFirstname(String name) {
        new RegisterPage().enterFirstName(name);
    }

    @And("I Enter lastname {string}")
    public void iEnterLastname(String lastname1) {
        new RegisterPage().enterLastName(lastname1);
    }


    @And("I Enter email {string}")
    public void iEnterEmail(String email) {
        new RegisterPage().enterEmail(email);
    }

    @And("I Enter password {string}")
    public void iEnterPassword(String password) {
        new RegisterPage().enterPassword(password);
    }

    @And("I Enter Confirm Password {string}")
    public void iEnterConfirmPassword(String confirmPW) {
        new RegisterPage().enterConfirmPassword(confirmPW);
    }

   @And("I Click on {string} button")
   public void iClickOnButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @And("I Select day")
    public void iSelectDay() {
        new RegisterPage().enterDayOfBirth("1");
    }

    @And("I Select month")
    public void iSelectMonth() {
        new RegisterPage().enterMonthOfBirth("2");
    }

    @And("I Select year")
    public void iSelectYear() {
        new RegisterPage().enterYearOfBirth("2000");
    }

    @Then("Verify message Your registration completed")
    public void verifyMessageYourRegistrationCompleted() {
        String expectedText = "Your registration completed";
        String actualText = new RegisterPage().getRegisterText();
        Assert.assertEquals(actualText,expectedText,"Error in registration completion text");
    }
}
