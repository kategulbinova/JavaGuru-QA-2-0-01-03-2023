package gleb.lesson10locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindCheckBoxDraugiem {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.draugiem.lv/?login=0");

        WebElement atcereetiesmaniCheckbox = driver.findElement(By.xpath("//div[@class='formItem formItemCheckbox']"));
        String checkBox =atcereetiesmaniCheckbox.getText();
        System.out.println("Name is; "+checkBox);

        driver.quit();

    }
}
