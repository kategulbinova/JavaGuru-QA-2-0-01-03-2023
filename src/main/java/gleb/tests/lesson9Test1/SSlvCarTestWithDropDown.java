package gleb.tests.lesson9Test1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SSlvCarTestWithDropDown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.ss.com/lv/");

        WebElement carsSelect = driver.findElement(By.id("mtd_97"));
        carsSelect.click();

        WebElement setMinPrice =driver.findElement(By.id("f_o_8_min"));
        setMinPrice.sendKeys("6000");

        WebElement setMaxPrice =driver.findElement(By.id("f_o_8_max"));
        setMaxPrice.sendKeys("10000");

        Select minYearDropD= new Select(driver.findElement(By.id("f_o_18_min")));
        minYearDropD.selectByVisibleText("2001");

        Select maxEngine=new Select(driver.findElement(By.id("f_o_15_max")));
        maxEngine.selectByValue("3.0");

        Select  setColor=new Select(driver.findElement(By.id("f_o_17")));
        setColor.selectByValue("6318");

        WebElement mekletButton=driver.findElement(By.className("s12"));
        mekletButton.click();

        driver.quit();

    }
}
