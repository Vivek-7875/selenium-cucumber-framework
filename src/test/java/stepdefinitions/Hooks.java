package stepdefinitions;

import Context.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    TestContext context;

    public Hooks(TestContext context) {
        this.context = context;
    }

    @Before
    public void setup() {
        System.out.println(
                "Scenario Thread: " + Thread.currentThread().getName());
        context.driver.get("https://www.saucedemo.com/");
    }

    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {

            byte[] screenshot =
                    ((TakesScreenshot) context.driver)
                            .getScreenshotAs(OutputType.BYTES);

            scenario.attach(
                    screenshot,
                    "image/png",
                    "Failure Screenshot"
            );
        }

        context.driver.quit();
    }
//    public void tearDown() {
//        context.driver.quit();
//    }
}
