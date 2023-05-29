package nikita;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SausedemoBasketAssertTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void basketAssert() {
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.click();

        WebElement addToCartSauceLabsBoltTShirt = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        addToCartSauceLabsBoltTShirt.click();

        //WebElement priceInListSauceLabsBoltTshirt = driver.findElement(By.xpath())

    }

        @AfterMethod
        public void tearDown() {
            driver.quit();
        }








}
