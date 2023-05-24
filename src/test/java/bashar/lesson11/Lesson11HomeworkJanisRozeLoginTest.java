package bashar.lesson11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.time.Duration;

public class Lesson11HomeworkJanisRozeLoginTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeTest

    public void setUp() {

        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        driver.get("https://www.janisroze.lv/");

    }


    @Test

    public void loginTest(){

        WebElement lietotajaProfilsIcon = driver.findElement(By.xpath("//ul[@class='account-dropdown long']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(lietotajaProfilsIcon).build().perform();


        WebElement ielogotiesOption = driver.findElement(By.xpath("//a[contains(text(), 'Ielogoties')]"));
        wait.until(ExpectedConditions.elementToBeClickable(ielogotiesOption));
        ielogotiesOption.click();

        WebElement epastaAdreseField = driver.findElement(By.id("email"));
        epastaAdreseField.sendKeys("bashar.bashar1993@gmail.com");

        WebElement paroleField = driver.findElement(By.id("pass"));
        paroleField.sendKeys("feKrun-pesgaw-2cimsu");

        WebElement ielogotiesButton = driver.findElement(By.id("send2"));
        ielogotiesButton.click();

    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
