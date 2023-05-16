package nikita;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static java.lang.Thread.sleep;
public class Homework11JanisRozeTestLogIn {
    @Test
    public void JanisRozeTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        org.openqa.selenium.WebDriver driver = new ChromeDriver();

        driver.get("https://www.janisroze.lv/");

        String username = "asdx@asdx.com";
        String password = "Java_test1%";


        Actions actions = new Actions(driver);
        WebElement userProfileIcon = driver.findElement(By.xpath("//a[@class='link']//span[@class='icon ic ic-user']"));
        actions.moveToElement(userProfileIcon).build().perform();


        WebDriverWait waitLoginBtn = new WebDriverWait(driver, Duration.ofSeconds(2));
        waitLoginBtn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Ielogoties']")));
        WebElement loginPageBtn = driver.findElement(By.xpath("//a[@title='Ielogoties']"));
        loginPageBtn.click();

        WebDriverWait waitLoginField = new WebDriverWait(driver, Duration.ofSeconds(10));
        waitLoginField.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='login[username]']")));
        WebElement loginField = driver.findElement(By.xpath("//input[@name='login[username]']"));
        loginField.sendKeys(username);

        WebElement passwordField = driver.findElement(By.xpath("//input[@name='login[password]']"));
        passwordField.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.id("send2"));
        loginBtn.click();

        WebElement footerCopyrightText = driver.findElement(By.xpath("//div[@class='footer-copyright']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", footerCopyrightText);

        //sleep(5000); //uncomment sleep to see that scrolling down to copyright text in footer works properly


        driver.quit();

    }
}
