package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver webDriver;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement fieldUserName;
    @FindBy(id = "password")
    private WebElement fieldPassword;
    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement buttonLogin;
    @FindBy(xpath = "//h3")
    private WebElement errorMassage;

    public boolean verifyFieldUserName(){
        return fieldUserName.isDisplayed();
    }
    public void inputFieldUserName(String userName){
        fieldUserName.sendKeys(userName);
    }
    public void inputFieldPassword(String password){
        fieldPassword.sendKeys(password);
    }
    public void clickButtonLogin(){
        buttonLogin.click();
    }
    public String getErrorMassage(){
        return errorMassage.getText();
    }
}
