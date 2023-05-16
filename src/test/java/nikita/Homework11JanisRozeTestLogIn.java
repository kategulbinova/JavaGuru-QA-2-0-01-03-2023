package nikita;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import static java.lang.Thread.sleep;
public class Homework11JanisRozeTestLogIn {
    @Test
    public void JanisRozeTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        org.openqa.selenium.WebDriver driver = new ChromeDriver();

        driver.get("https://www.janisroze.lv/");

        Actions actions = new Actions(driver);
        WebElement lietotajaProfilsIcon = driver.findElement(By.xpath("//a[@class='link']//span[@class='icon ic ic-user']"));
        actions.moveToElement(lietotajaProfilsIcon).build().perform();

        WebElement ielogotiesBtn = driver.findElement(By.xpath("//a[@title='Ielogoties']"));
        WebDriverWait waitLogin = new WebDriverWait(driver, Duration.ofSeconds(2));
        waitLogin.until(ExpectedConditions.elementToBeClickable(ielogotiesBtn));
        ielogotiesBtn.click();




        sleep(5000);


        driver.quit();

    }
}
