package aleksejs_lukins.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class Lesson9SeleniumExploreCarsTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ss.lv/");

        WebElement clickOnCars = driver.findElement(By.id("mtd_97"));
        clickOnCars.click();

        WebElement priceFrom = driver.findElement(By.id("f_o_8_min"));
        priceFrom.sendKeys("6000");

        WebElement priceTo = driver.findElement(By.id("f_o_8_max"));
        priceTo.sendKeys("10000");

        Select startingYearDropdown = new Select(driver.findElement(By.id("f_o_18_min")));
        startingYearDropdown.selectByValue("2001");

        WebElement chooseStartYear = driver.findElement(By.cssSelector("#f_o_18_min > option:nth-child(24)"));
        chooseStartYear.click();

        WebElement maxEngineDropdown = driver.findElement(By.id("f_o_15_max"));
        maxEngineDropdown.click();

        WebElement chooseMaxEngine = driver.findElement(By.cssSelector("#f_o_15_max > option:nth-child(30)"));
        chooseMaxEngine.click();

        WebElement chooseColorDropdown = driver.findElement(By.id("f_o_17"));
        chooseColorDropdown.click();

        Select color = new Select(driver.findElement(By.id("f_o_17")));
        color.selectByIndex(1);
//        color.selectByVisibleText("Balta");


        WebElement submit = driver.findElement(By.cssSelector("#filter_tbl > tbody > tr > td:nth-child(2) > input"));
        submit.click();

        sleep(5000);
        driver.quit();

    }

}
