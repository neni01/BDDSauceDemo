package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CartPage {
    public static WebDriver webDriver;
    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//span[@class='title']")
    private WebElement labelYourCart;
    @FindBy(xpath = "//button[@id='remove-sauce-labs-bike-light']")
    private WebElement buttonRemove;
    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement buttonCheckout;

    public boolean verifyLabelYourCart(){

        return labelYourCart.isDisplayed();
    }

    public void clickButtonRemove(){
        buttonRemove.click();
    }
    public void clickButtonCheckout(){
        buttonCheckout.click();
    }
}
