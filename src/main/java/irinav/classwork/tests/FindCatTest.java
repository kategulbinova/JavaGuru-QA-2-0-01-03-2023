package irinav.classwork.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class FindCatTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://ss.lv");
        driver.manage().window().setSize(new Dimension(1536, 816));

        WebElement kaki = driver.findElement(By.id("mtd_301"));
        kaki.click();

        WebElement cenaNo = driver.findElement(By.id("f_o_8_min"));
        cenaNo.sendKeys("10");

        WebElement cenaLidz = driver.findElement(By.id("f_o_8_max"));
        cenaLidz.sendKeys("300");

        WebElement vecumsNoField = driver.findElement(By.id("f_o_1276_min"));
        vecumsNoField.sendKeys("0");

        WebElement vecumsLidzField = driver.findElement(By.id("f_o_1276_max"));
        vecumsLidzField.sendKeys("3");

        Select rajonsNoDropDown = new Select(driver.findElement(By.id("region_select")));
        rajonsNoDropDown.selectByValue("riga_f");

        WebElement mekletButton = driver.findElement(By.className("s12"));
        mekletButton.click();

        WebElement myCat = driver.findElement(By.className("am"));
        myCat.click();

        sleep(5000);
        driver.quit();
    }
}
