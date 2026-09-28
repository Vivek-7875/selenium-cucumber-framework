package stepdefinitions;

import Context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.LoginPage;
import pages.ProductsPage;
import testdata.TestData;

public class LoginSteps {

    TestContext context;
    LoginPage loginPage;
    ProductsPage productsPage;

    public LoginSteps(TestContext context) {
        this.context = context;

        loginPage = new LoginPage(context.driver);
        productsPage = new ProductsPage(context.driver);
    }

//    @When("User enters login credentials")
//    public void user_enters_login_credentials() {
//
//        loginPage.enterUsername(TestData.USERNAME);
//        loginPage.enterPassword(TestData.PASSWORD);
//    }
    @When("User enters {string} and {string}")
    public void user_enters_username_and_password(String username, String password) {

        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @And("User clicks on login button")
    public void user_clicks_on_login_button() {

        loginPage.clickLogin();
    }

    @Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {

        String title = productsPage.getProductsTitle();

        Assertions.assertEquals(
                "Products",
                title,
                "Login failed - Products page is not displayed"
        );

        System.out.println("Login successful - Products page is displayed");
    }
}