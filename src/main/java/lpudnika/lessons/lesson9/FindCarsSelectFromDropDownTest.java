package lpudnika.lessons.lesson9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class FindCarsSelectFromDropDownTest {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ss.com/lv");

        WebElement vieglieAutoLink = driver.findElement(By.id("mtd_97"));

        vieglieAutoLink.click();

        WebElement cenaNoField = driver.findElement(By.id("f_o_8_min"));

        cenaNoField.sendKeys("600");

        WebElement cenaLidzField = driver.findElement(By.id("f_o_8_max"));

        cenaLidzField.sendKeys("1000");

        Select gadsNoDropDown = new Select(driver.findElement(By.id("f_o_18_min")));

        gadsNoDropDown.selectByValue("2001");

        Select tilpumsLidzDropDown = new Select(driver.findElement(By.id("f_o_15_max")));

        tilpumsLidzDropDown.selectByValue("3.0");

        Select krasaDropDown = new Select(driver.findElement(By.id("f_o_17")));

        krasaDropDown.selectByIndex(1);

        sleep(5000);

        WebElement mekletButton = driver.findElement(By.className("s12"));
        mekletButton.click();

        sleep(5000);

        driver.quit();
    }
}
