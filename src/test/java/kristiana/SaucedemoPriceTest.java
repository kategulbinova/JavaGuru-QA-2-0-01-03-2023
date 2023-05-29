package kristiana;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class SaucedemoPriceTest {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeTest
    public void setUp () {

        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        driver.get("http://www.saucedemo.com");
    }

    @Test
    public void checkPriceIsTheSame () {

        WebElement loginField = driver.findElement(By.id("user-name"));
        loginField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
       // WebElement backPackPriceBeforeAdd = driver.findElement(By.xpath("//div[@class='add-to-cart-sauce-labs-backpack']"));
       // String oldPrice = backPackPriceBeforeAdd.getText();
        addToCartButton.click();

        WebElement shoppingCartIcon = driver.findElement(By.id("shopping_cart_container"));
        shoppingCartIcon.click();
        //WebElement backpackPriceAfterAdd = driver.findElement(By.xpath("//div[@class='add-to-cart-sauce-labs-backpack']"));
        //String newPrice = backpackPriceAfterAdd.getText();

        //Assert.assertEquals(oldPrice, newPrice);

        WebElement removeBackpackButton = driver.findElement(By.id("remove-sauce-labs-backpack"));
        removeBackpackButton.click();


    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
