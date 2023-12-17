package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.CheckoutPage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckoutSteps {
    private final WebDriver driver = Hooks.driver;
    CheckoutPage checkoutPage = new CheckoutPage(driver);
    @Then("User already on your information checkout page")
    public void verifyLabelInformationCheckout(){
        Assert.assertTrue(checkoutPage.verifyLabelInformationCheckout());
    }
    @And("User input {string} as first name and {string} as last name and {string} as postal code")
    public void credential(String firstName, String lastName, String postalCode) {
        checkoutPage.inputFieldFirstName(firstName);
        checkoutPage.inputFieldLastName(lastName);
        checkoutPage.inputFieldPostalCode(postalCode);
        checkoutPage.clickButtonContinue();
    }
}

