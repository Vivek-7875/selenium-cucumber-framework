package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    WebDriver driver;


    By productsTitle = By.className("title");
    By addToCartBackpack = By.id("add-to-cart-sauce-labs-backpack");
    By cartButton = By.className("shopping_cart_link");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getProductsTitle() {
        return driver.findElement(productsTitle).getText();
    }

    public void addBackpackToCart() {
        driver.findElement(addToCartBackpack).click();
    }

    public void clickCart() {
        driver.findElement(cartButton).click();
    }
}
