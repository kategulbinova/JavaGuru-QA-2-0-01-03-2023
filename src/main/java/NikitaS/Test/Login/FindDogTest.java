package NikitaS.Test.Login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class FindDogTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver dr = new ChromeDriver();

        dr.get("https://www.ss.lv/lv/");

        WebElement suniKuceni = dr.findElement(By.id("mtd_300"));
        suniKuceni.click();

        WebElement ageFrom = dr.findElement(By.id("f_o_1276_min"));
        ageFrom.sendKeys("1");

        WebElement ageTo = dr.findElement(By.id("f_o_1276_max"));
        ageTo.sendKeys("1");

        WebElement meklet = dr.findElement(By.className("s12"));
        meklet.click();

        sleep(5000);

        dr.quit();
    }
}
