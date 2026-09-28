package Context;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestContext {

    public WebDriver driver;

    public TestContext() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
}
