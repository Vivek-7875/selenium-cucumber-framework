package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

        WebDriver driver;

        By cartItem = By.className("inventory_item_name");

        public CartPage(WebDriver driver) {
            this.driver = driver;
        }

        public String getCartItemName() {
            return driver.findElement(cartItem).getText();
        }
    By checkoutButton = By.id("checkout");

    public void clickCheckout() {
        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(
                ExpectedConditions.elementToBeClickable(checkoutButton)
        ).click();
    }
}
