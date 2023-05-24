package aleksejs_lukins.PracticeLesson8VehiclePark.YanaItani.seleniumtest;

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
        dr.get("https://www.ss.com/lv/");
        WebElement suniKuceni = dr.findElement(By.id("mtd_300"));
        suniKuceni.click();
        WebElement vecums = dr.findElement(By.id("f_o_1276_min"));
        vecums.click();
        vecums.sendKeys("1");
        WebElement vecums1 = dr.findElement(By.id("f_o_1276_max"));
        vecums1.click();
        vecums1.sendKeys("1");
        WebElement mekletButton = dr.findElement(By.className("s12"));
        mekletButton.click();


        sleep(5000);

        dr.quit();
    }
}
