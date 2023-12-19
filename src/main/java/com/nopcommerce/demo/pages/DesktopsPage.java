package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement getDesktopsText;
    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorFromDropDown;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramFromDropDown;

    @CacheLookup
    @FindBy(xpath = "//label[text() = '320 GB']")
    WebElement hdd320Gb;

    @CacheLookup
    @FindBy(xpath = "//label[text() = '400 GB [+$100.00]']")
    WebElement hdd400Gb;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
    WebElement osVistaHome;

    @CacheLookup
    @FindBy(xpath = "//label[text() = 'Vista Premium [+$60.00]']")
    WebElement osVistaPremium;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement softwareMicrosoftOffice;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_11']")
    WebElement softwareAcrobatReader;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement softwareTotalCommander;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement productAddMessageText;


    /******************************** All Elements' Action Methods on DesktopsPage *************************************/


    public void clickOnProductName() {
        clickOnElement(productName);
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    public String getProductAddMessage() {
        return getTextFromElement(productAddMessageText);
    }

    public void selectProcessor(String processor2) {
        selectByVisibleTextFromDropDown(processorFromDropDown, processor2);
    }

    public void selectRAM(String ram2) {
        selectByValueFromDropDown(ramFromDropDown, ram2);
    }

    public void clickOn320GB() {
        clickOnElement(hdd320Gb);
    }

    public void clickOn400GB() {
        clickOnElement(hdd400Gb);
    }

    public void clickOnVistaHome() {
        clickOnElement(osVistaHome);
    }

    public void clickOnVistaPremium() {
        clickOnElement(osVistaPremium);
    }

    public void clickOnMicrosoftOffice() {
        clickOnElement(softwareMicrosoftOffice);
    }

    public void clickOnAcrobatReader() {
        clickOnElement(softwareAcrobatReader);
    }

    public void clickOnTotalCommander() {
        clickOnElement(softwareTotalCommander);
    }


    public String getTextOfDesktops() {
        return getTextFromElement(getDesktopsText);
    }
}
