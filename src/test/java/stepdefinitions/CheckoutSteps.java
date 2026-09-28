package stepdefinitions;

import Context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pages.CartPage;
import pages.CheckoutPage;

public class CheckoutSteps {

    TestContext context;
    CartPage cartPage;
    CheckoutPage checkoutPage;

    public CheckoutSteps(TestContext context) {
        this.context = context;

        cartPage = new CartPage(context.driver);
        checkoutPage = new CheckoutPage(context.driver);
    }

    @And("User clicks on checkout")
    public void user_clicks_on_checkout() {
        cartPage.clickCheckout();
    }

    @And("User enters checkout information")
    public void user_enters_checkout_information() {

        checkoutPage.enterFirstName("Vivek");
        checkoutPage.enterLastName("Test");
        checkoutPage.enterPostalCode("600001");

        checkoutPage.clickContinue();
    }

    @Then("User should be on checkout overview page")
    public void user_should_be_on_checkout_overview_page() {

        String currentUrl = context.driver.getCurrentUrl();

        Assertions.assertTrue(
                currentUrl.contains("checkout-step-two"),
                "User is not on checkout overview page"
        );
    }
}