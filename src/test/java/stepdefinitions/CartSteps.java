package stepdefinitions;

import Context.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.CartPage;
import pages.ProductsPage;

public class CartSteps {

    TestContext context;
    ProductsPage productsPage;
    CartPage cartPage;

    public CartSteps(TestContext context) {
        this.context = context;

        productsPage = new ProductsPage(context.driver);
        cartPage = new CartPage(context.driver);
    }

    @When("User adds backpack to cart")
    public void user_adds_backpack_to_cart() {
        productsPage.addBackpackToCart();
    }

    @When("User opens the cart")
    public void user_opens_the_cart() {
        productsPage.clickCart();
    }

    @Then("Backpack should be displayed in the cart")
    public void backpack_should_be_displayed_in_cart() {

        String itemName = cartPage.getCartItemName();

        Assertions.assertEquals(
                "Sauce Labs Backpack",
                itemName,
                "Backpack is not displayed in the cart"
        );

        System.out.println("Backpack successfully added to cart");
    }
}