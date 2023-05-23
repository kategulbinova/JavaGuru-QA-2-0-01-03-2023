package olgaZikova.lesson11;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.buffer.ByteBufUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class MoveToLoginTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.janisroze.lv/");


        WebElement userIcon = driver.findElement(By.id("header-account"));

        sleep (2000);

        Actions actions = new Actions (driver);

        sleep(2000);
        actions.moveToElement(userIcon).build().perform();

        sleep(2000);

        driver.quit();
    }
}
