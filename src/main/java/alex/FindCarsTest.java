package alex;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindCarsTest {
    public static void main (String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver dr = new ChromeDriver();
        dr.get("https://www.ss.com/ru/transport/cars/filter/");
        WebElement WhiteCar = dr.findElement(By.id("white"));
    }
}
