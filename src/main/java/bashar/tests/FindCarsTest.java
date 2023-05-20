package bashar.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class FindCarsTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ss.com/lv");

        sleep(1000);


        WebElement carsLink = driver.findElement(By.id("mtd_97"));
        carsLink.click();

        sleep(1000);


        WebElement minPrice = driver.findElement(By.id("f_o_8_min"));
        minPrice.sendKeys("6000");

        sleep(1000);


        WebElement maxPrice = driver.findElement(By.id("f_o_8_max"));
        maxPrice.sendKeys("10000");

        sleep(1000);


        WebElement minYearDropDownMenu = driver.findElement(By.xpath("//*[@id=\"f_o_18_min\"]/option[24]"));
        minYearDropDownMenu.click();

        sleep(1000);


        WebElement maxEngineVolumeDropDownMenu = driver.findElement(By.xpath("//*[@id=\"f_o_15_min\"]/option[30]"));
        maxEngineVolumeDropDownMenu.click();

        sleep(1000);


        WebElement colorDropDownMenu = driver.findElement(By.xpath("//*[@id=\"f_o_17\"]/option[2]"));
        colorDropDownMenu.click();

        sleep(2000);


        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"filter_tbl\"]/tbody/tr/td[2]/input"));
        searchButton.click();


        sleep(5000);

        driver.quit();
    }
}
