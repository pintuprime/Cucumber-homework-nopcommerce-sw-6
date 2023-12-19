package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Objects;


public class ComputerSteps {
    @When("Click on Computer tab")
    public void clickOnComputerTab() {
        new HomePage().clickOnComputers();
    }

    @Then("Verify Computer text")
    public void verifyComputerText() {
        String expectedText = "Computers";
        String actualText = new ComputerPage().computerText();
        Assert.assertEquals(actualText, expectedText, "Error in computer text");
    }

    @And("Click on Desktops link")
    public void clickOnDesktopsLink() {
        new ComputerPage().clickOnDeskTopLink();
    }

    @Then("Verify Desktops text")
    public void verifyDesktopsText() {
        String expectedText = "Desktops";
        String actualText = new DesktopsPage().getTextOfDesktops();
        Assert.assertEquals(actualText, expectedText, "Error in desktop text");
    }

    @And("I Click on product name Build your own computer")
    public void iClickOnProductNameBuildYourOwnComputer() {
        new DesktopsPage().clickOnProductName();
    }

    @And("I Select processor {string}")
    public void iSelectProcessor(String processor) {
        new DesktopsPage().selectProcessor(processor);
    }

    @And("I Select RAM {string}")
    public void iSelectRAM(String ram) {
        new DesktopsPage().selectRAM(ram);
    }

    @And("I Select HDD {string}")
    public void iSelectHDD(String hdd) {
        if (Objects.equals(hdd, "320 GB")){
            new DesktopsPage().clickOn320GB();
        }else if(Objects.equals(hdd, "400 GB [+$100.00]")) {
            new DesktopsPage().clickOn400GB();
        }else {
            System.out.println("select wrong Features ");
        }
    }

    @And("I Select OS {string}")
    public void iSelectOS(String os) {
        if (Objects.equals(os, "Vista Home [+$50.00]")){
            new DesktopsPage().clickOnVistaHome();
        }else if(Objects.equals(os, "Vista Premium [+$60.00]")) {
            new DesktopsPage().clickOnVistaPremium();
        }else {
            System.out.println("select wrong Features ");
        }

    }

    @And("I Select Software {string}")
    public void iSelectSoftware(String software) {
        if (software == "Microsoft Office [+$50.00]"){
            new DesktopsPage().clickOnMicrosoftOffice();
        }else if(software == "Acrobat Reader [+$10.00]") {
            new DesktopsPage().clickOnAcrobatReader();
        } else if(software == "Total Commander [+$5.00]") {
            new DesktopsPage().clickOnTotalCommander();
        }else {
            System.out.println("select wrong Features ");
        }
    }

    @And("I Click on ADD TO CART Button")
    public void iClickOnADDTOCARTButton() {
        new DesktopsPage().clickOnAddToCart();
    }

    @Then("Verify message The product has been added to your shopping cart")
    public void verifyMessageTheProductHasBeenAddedToYourShoppingCart() {
        String expectedText = "The product has been added to your shopping cart";
        String actualText = new DesktopsPage().getProductAddMessage();
        Assert.assertEquals(actualText,expectedText);
    }


}
