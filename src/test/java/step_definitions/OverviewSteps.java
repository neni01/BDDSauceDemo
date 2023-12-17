package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.StringUtils;
import org.example.pageObject.CheckoutPage;
import org.example.pageObject.OverviewPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class OverviewSteps {
    private final WebDriver driver = Hooks.driver;
    OverviewPage overviewPage = new OverviewPage(driver);

    @Then("User already on checkout overview page")
    public void verifyLabelOverview(){
        Assert.assertTrue(overviewPage.verifyLabelOverview());
    }
    @When("Verify the price of product {string} should be equal to the total price")
    public void verifyPrice(String product) {
        String actualText = overviewPage.getFinalPriceProduct();
        String expectedValue = overviewPage.getPriceProduct(product);
        String actualValue = actualText.substring(actualText.indexOf(expectedValue));

        Assert.assertEquals(expectedValue, actualValue);
    }
    @And("Verify the tax value should be equal to 8% of the total price")
    public void verifyTax() {
        String tax = overviewPage.getTax();
        String taxValue = StringUtils.getDigits(tax);
        double taxValueDouble = Double.parseDouble(taxValue) / 100.00;
        String expectedTaxValue = Double.toString(taxValueDouble);
        Assert.assertEquals(overviewPage.calculateTax(), expectedTaxValue);
    }
    @And("Verify total payment should be equal to total product price plus tax")
    public void verifyTotal() {
        String total = overviewPage.getTotal();
        String totalValue = StringUtils.getDigits(total);
        double totalValueDouble = Double.parseDouble(totalValue) / 100;
        String expectedTotalValue = Double.toString(totalValueDouble);
        Assert.assertEquals(overviewPage.calculateTotalCheckout(), expectedTotalValue);
    }
    @And("User click button finish")
    public void clickButtonFinish(){
        overviewPage.clickButtonFinish();
    }
    @And("Checkout complete")
    public void verifyLabelCheckoutComplete(){
        Assert.assertTrue(overviewPage.verifyLabelCheckoutComplete());
    }
}
