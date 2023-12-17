package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.CartPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CartSteps {
    private final WebDriver driver = Hooks.driver;
    CartPage cartPage = new CartPage(driver);

    @Then("User already on your cart page")
    public void verifyLabelYourCart(){
        Assert.assertTrue(cartPage.verifyLabelYourCart());
    }

    @When("User click button remove product")
    public void clickButtonRemove(){
        cartPage.clickButtonRemove();
    }
    @And("User click button checkout product")
    public void clickButtonCheckout(){
        cartPage.clickButtonCheckout();
    }
}