package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductsPage {
    WebDriver driver;


    By productsTitle = By.className("title");
    By addToCartBackpack = By.id("add-to-cart-sauce-labs-backpack");
    By cartButton = By.className("shopping_cart_link");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getProductsTitle() {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(productsTitle)
        ).getText();
    }

    public void addBackpackToCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.className("title")
        ));
        driver.findElement(addToCartBackpack).click();
    }

    public void clickCart() {
        driver.findElement(cartButton).click();
    }
}
