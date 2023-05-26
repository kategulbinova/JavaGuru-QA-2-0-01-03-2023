package gleb.lesson10locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trainig {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.draugiem.lv/?login=0");

        WebElement ienaktButton=driver.findElement(By.xpath("//button[@name='login']"));

        String buttonTitle =ienaktButton.getText();

        System.out.println("Button title is: "+ buttonTitle);

        driver.quit();
    }
}
