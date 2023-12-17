package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    public static WebDriver webDriver;
    public CheckoutPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//span[@class='title']")
    private WebElement labelInformationCheckout;
    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement fieldFirstName;
    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement fieldLastName;
    @FindBy(id = "postal-code")
    private WebElement fieldPostalCode;
    @FindBy(xpath = "//input[@id='continue']")
    private WebElement buttonContinue;

    public boolean verifyLabelInformationCheckout(){

        return labelInformationCheckout.isDisplayed();
    }
    public void inputFieldFirstName(String firstName){
        fieldFirstName.sendKeys(firstName);
    }
    public void inputFieldLastName(String lastName){
        fieldLastName.sendKeys(lastName);
    }
    public void inputFieldPostalCode(String postalCode){
        fieldPostalCode.sendKeys(postalCode);
    }
    public void clickButtonContinue(){
        buttonContinue.click();
    }
}
