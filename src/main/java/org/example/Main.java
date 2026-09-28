package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.*;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;
import java.util.List;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws IOException {
        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://shop.polymer-project.org/");
        driver.manage().window().maximize();
        WebElement app = driver.findElement(By.cssSelector("shop-app"));
        SearchContext appRoot = app.getShadowRoot();

        WebElement home = appRoot.findElement(By.cssSelector("shop-home"));
        SearchContext homeRoot = home.getShadowRoot();

        WebElement imageHost = homeRoot.findElement(By.cssSelector("shop-image"));
        SearchContext imageRoot = imageHost.getShadowRoot();

        WebElement img = imageRoot.findElement(By.id("img"));
        img.click();

        System.out.println(img.getAttribute("src"));
//        Set<Cookie> ck = driver.manage().getCookies();
//        Cookie cookie = new Cookie("testCookie", "hello123");
//        driver.manage().addCookie(cookie);
//        driver.manage().deleteCookieNamed("testCookie");
//        Cookie cookie1 = driver.manage().getCookieNamed("testCookie");
//
////        driver.manage().deleteAllCookies();
//        System.out.println(cookie1.getName() + " : " + cookie1.getValue());
//        System.out.println(cookie.getName());
//        System.out.println("Cookies count " +ck.size());
////        for (Cookie cookie:ck){
////            System.out.println(cookie.getName()+":"+cookie.getValue());
////        }
//        Cookie cookie = driver.manage().getCookieNamed("optimizelySegments");
//        System.out.println(cookie);
//        driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\vivek\\Downloads\\01\\New Text Document.txt");
//        driver.findElement(By.xpath(("//a[@role='button']"))).click();
//        File file = new File("C:\\Users\\vivek\\Downloads\\sampleFile.jpeg");
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//        wait.until(driver1->file.exists());
//        if (file.exists()){
//            System.out.println("File Downloaded Successfully");
//        }else System.out.println("File Not Found");
//        WebElement password = driver.findElement(By.name("my-password"));
//        WebElement txtArea = driver.findElement(RelativeLocator.with(By.tagName("textarea")).below(password));
//        password.sendKeys("Acs");
//        txtArea.sendKeys("Exact Location");
//        WebElement txtIput = driver.findElement(RelativeLocator.with(By.id("my-text-id")).above(password));
//        txtIput.sendKeys("Text Input");
//        driver.findElement(RelativeLocator.with(By.name("my-datalist")).toRightOf(password)).sendKeys("San Francisco");
//        WebElement input = driver.findElement(By.linkText("Form Authentication"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].style.border='3px solid red';", input);
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//        js.executeScript("window.scrollTo(0, 0)");
//        js.executeScript("arguments[0].scrollIntoView();",input);
//        js.executeScript("arguments[0].click();",input);
//        WebElement username = driver.findElement(By.id("username"));
//        js.executeScript("arguments[0].value='tomsmith';", username);

//        WebElement password = driver.findElement(By.id("password"));
//        js.executeScript("arguments[0].setAttribute('tomsmith','SuperSecretPassword!')", username,password);
//        WebElement input = driver.findElement(By.id("name"));
//        input.click();
//        driver.findElement(By.id("username")).sendKeys("tomsmith");
//        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
//        Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
//        WebElement login = wait.until(driver1 -> driver1.findElement(By.className("radius")));
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//        WebElement login = wait.until(
//                ExpectedConditions.elementToBeClickable(By.className("radius")));
//        WebElement login = driver.findElement(By.className("radius"));
//        wait.until(ExpectedConditions.elementToBeClickable(login));
//        login.click();
//        TakesScreenshot ss = (TakesScreenshot) driver;
//        File source = ss.getScreenshotAs(OutputType.FILE);
//        File destination = new File("Screenshot.png");
//        Files.copy(source.toPath(),destination.toPath());

//        Actions action = new Actions(driver);
//        action.sendKeys("Hello").perform();
//        action.keyDown(Keys.CONTROL)
//                .sendKeys("a")
//                .keyUp(Keys.CONTROL)
//                .perform();
//
//        action.keyDown(Keys.CONTROL)
//                .sendKeys("c")
//                .keyUp(Keys.CONTROL)
//                .perform();
//       WebElement mail = driver.findElement(By.id("email"));
//        action.click(mail)
//                .keyDown(Keys.CONTROL)
//                .sendKeys("v")
//                .keyUp(Keys.CONTROL)
//                .perform();
//        action.keyDown(Keys.CONTROL)
//                .sendKeys("a")
//                .keyUp(Keys.CONTROL)
//                .perform();
//        action.sendKeys("Hello").perform();
//        action.sendKeys(Keys.ENTER).perform();
//        WebElement source = driver.findElement(By.id("column-a"));
//       WebElement target = driver.findElement(By.id("column-b"));
//       action.dragAndDrop(source,target).perform();
//        action.clickAndHold(source).moveToElement(target).release().perform();
//        WebElement button = driver.findElement(By.cssSelector("button[ondblclick='myFunction1()']"));
//        action.doubleClick(button).perform();
//       List<WebElement> users =  driver.findElements(By.className("figure"));
//       action.contextClick(users.get(2)).perform();
//       WebElement usersr = driver.findElement(By.className("figure"));
//       action.contextClick(usersr).perform();
//       action.moveToElement(users.get(1)).perform();
//        System.out.println(users.get(1).getText());
//       WebElement table = driver.findElement(By.id("table1"));
//        System.out.println(table.getText());
//        System.out.println(table.getSize());
//        List<WebElement> row = driver.findElements(By.tagName("tr"));
////        System.out.println(row.size());
//        List<WebElement> t1rows = table.findElements(By.tagName("tr"));
//        WebElement doemail = null;
//        for (WebElement r : t1rows) {
//            if (r.getText().contains("Doe")) {
//                System.out.println(r.getText());
//                doemail=r;
//            }
//        }
//
//        List<WebElement>mail = doemail.findElements(By.tagName("td"));
//        System.out.println("Doe mail " +mail.get(2).getText());
//        WebElement edit = doemail.findElement(By.linkText("edit"));
//        edit.click();
//
//        System.out.println(t1rows.size());
//        List<WebElement>col=driver.findElements(By.tagName("th"));
//        System.out.println(col.size());
//       List<WebElement>t1col= table.findElements(By.tagName("th"));
//        System.out.println(t1col.size());
//        WebElement firstRow = row.get(0);
//        System.out.println(firstRow.getText());
//        List<WebElement> cells = firstRow.findElements(By.cssSelector("th,td"));
//        System.out.println("Total Columns: " + cells.size());
//        WebElement bach = t1rows.get(2);
//        System.out.println(bach.getText());
//        List<WebElement>bach01=bach.findElements(By.tagName("td"));
//        System.out.println(bach01.get(0).getText());


//        String parent = driver.getWindowHandle();
//        driver.findElement(By.id("newWindowsBtn")).click();
//
//        Set<String> windows = driver.getWindowHandles();
//
//        System.out.println("Total windows: " + windows.size());
//        for (String window : windows) {
//            driver.switchTo().window(window);
//
//            System.out.println("Window: " + window);
//            System.out.println("Title: " + driver.getTitle());
//        }
//        System.out.println("pt id" +pw);
//        driver.findElement(By.xpath("//a[@target='_blank']")).click();
//        Set<String> pw2 = driver.getWindowHandles();
////        System.out.println("pw2 "+pw2);
//        for (String window:pw2){
//            System.out.println(window);
//            if (!window.equals(pw)){
//                driver.switchTo().window(window);
//            }
//
//        }
//        System.out.println(driver.getTitle());
//        driver.close();
//        driver.switchTo().window(pw);
//        System.out.println(driver.getTitle());
//        WebElement frame = driver.findElement(By.id("framesWrapper"));
//        System.out.println(frame.getText());
//        WebElement iframe2 = driver.findElement(By.id("frame1"));
//        driver.switchTo().frame(iframe2);
//        WebElement heading = driver.findElement(By.id("sampleHeading"));
//        System.out.println(heading.getText());
//        driver.switchTo().defaultContent();
//        System.out.println(heading.getText());
//        WebElement text = driver.findElement(By.id("tinymce"));
//        System.out.println(text.getText());

//        WebElement jsalertcon = driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
//        jsalertcon.click();
//        Alert alert = driver.switchTo().alert();
//        System.out.println(alert.getText());
//        alert.sendKeys("Okay");
//        alert.accept();

//    WebElement yes = driver.findElement(By.cssSelector("input[id = 'yesRadio']"));
//    if (!yes.isSelected()) yes.click();
//    System.out.println("Yes " +yes.isSelected());
//    WebElement impress = driver.findElement(By.cssSelector("input[id = 'impressiveRadio']"));
//        if (!impress.isSelected()){
//            impress.click();
//        }
//        impress.click();
//        System.out.println("impress " +impress.isSelected());
//        System.out.println("yes " +yes.isSelected());
//       List<WebElement> radio= driver.findElements(By.cssSelector("input[type='radio']"));
//       for(WebElement rd:radio){
//           System.out.println(rd.getAttribute("id")+ " : " + rd.isSelected());
//       }
//        WebElement checkbox = driver.findElement(
//                By.cssSelector("input[type='checkbox']")
//        );

//        checkbox.click();
//        System.out.println(checkbox.isSelected());
//        driver.get("https://www.saucedemo.com/");
//        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//        driver.manage().window().maximize();
//        List<WebElement> checkboxes =
//                driver.findElements(By.cssSelector("input[type='checkbox']"));
//        for (WebElement checkbox : checkboxes) {
//            if (!checkbox.isSelected()) {
//                checkbox.click();
//
//            }
//            System.out.println(checkbox.isSelected());
//        }
//        List<WebElement> inputs =
//                driver.findElements(By.tagName("input"));
//        for (WebElement input:inputs){
////            System.out.println(input.getAttribute("id"));
//            System.out.println(input.getAttribute("placeholder"));
//        }
//        System.out.println(+inputs.size());
//        driver.findElement(By.cssSelector(".submit-button.btn_action")).click();
//        WebElement sort= driver.findElement(By.cssSelector(".product_sort_container"));
//        System.out.println(sort.getText());
//        System.out.println(sort.getSize());
//        Select sl = new Select(sort);
//        System.out.println(sl.getOptions().size());
//        sl.selectByValue("hilo");

//        sl.selectByVisibleText("Price (high to low)");
//        sl.selectByIndex(2);

//        driver.findElement(By.cssSelector("button[data-test$='backpack']")).click();
//        driver.findElement(By.cssSelector("button[data-test='add-to-cart-sauce-labs-backpack']")).click();
//        driver.findElement(By.cssSelector(("a[data-test*='shopping-cart']"))).click();
//        driver.findElement(By.xpath(("//input[@data-test='username' or @id='user-name']"))).sendKeys("standard_user");
//        WebElement username = driver.findElement(By.id("user-name"));
//        username.sendKeys("standard_user");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//        driver.findElement(By.id("login-button")).click();
//        driver.manage().window().maximize();
//        driver.findElement(By.xpath(("//button[contains(@class,'btn_primary') and @data-test='add-to-cart-sauce-labs-backpack']"))).click();
//        driver.findElement(By.xpath(("//button[@class='btn btn_primary btn_small btn_inventory ' and @data-test='add-to-cart-sauce-labs-backpack']"))).click();
//        driver.findElement(By.xpath(("//button[starts-with(@data-test,'add-to')]"))).click();
//        driver.findElement(By.xpath(("//button[@data-test='add-to-cart-sauce-labs-backpack']"))).click();
//        driver.findElement(By.xpath("//button[contains(@data-test,'remove-sauce')]")).click();
//        driver.findElement(By.xpath(("//button[text()='add-to-cart-sauce-labs-backpack']"))).click();
//        driver.findElement(By.xpath(("//button[text()='Add to cart']"))).click();
//        driver.findElement(By.xpath(("//button[contains(text(),'Remove')]"))).click();
//        driver.findElement(By.partialLinkText("add-to-cart-sauce-labs-backpack")).click();
//        System.out.println(username.getAttribute("value"));
//        System.out.println(username.getAttribute("id"));
//        System.out.println(username.isDisplayed());
//        System.out.println(username.isSelected());
//        WebElement btn = driver.findElement(By.id("login-button"));
//        System.out.println(btn.isDisplayed());
//        System.out.println(btn.isEnabled());

//        username.clear();
//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//        driver.findElement(By.id("login-button")).click();
//        driver.findElement(By.name("q")).sendKeys("Selenium");
//        driver.findElement(By.name("btnK")).click();
//        driver.quit();
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());
    }
}
