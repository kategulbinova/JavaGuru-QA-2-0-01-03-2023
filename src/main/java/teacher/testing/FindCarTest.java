package teacher.testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class FindCarTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup(); // Prepare browser
        WebDriver dr = new ChromeDriver();

        dr.get("http://www.ss.lv");

        WebElement vieglieAutoLink = dr.findElement(By.id("mtd_97"));
        vieglieAutoLink.click();

        WebElement cenaNoField = dr.findElement(By.id("f_o_8_min"));
        cenaNoField.sendKeys("6000");

        WebElement cenaLidzField = dr.findElement(By.id("f_o_8_max"));
        cenaLidzField.sendKeys("10000");

        Select gadsNoDropDown = new Select(dr.findElement(By.id("f_o_18_min")));
        gadsNoDropDown.selectByValue("2001");

        Select jaudaMaxDropDown = new Select(dr.findElement(By.id("f_o_15_max")));
        jaudaMaxDropDown.selectByValue("3.0");

        Select krasaDropDown = new Select(dr.findElement(By.id("f_o_17")));
        krasaDropDown.selectByVisibleText("Balta");

        WebElement mekletButton = dr.findElement(By.className("s12"));
        mekletButton.click();

        sleep(5000);

        dr.quit();

    }
}
