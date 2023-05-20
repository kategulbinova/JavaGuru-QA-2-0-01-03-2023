package NikitaS.Test.Login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver dr = new ChromeDriver();

        dr.get("https://draugiem.lv");

        WebElement loginField = dr.findElement(By.id("email"));
        loginField.sendKeys("Kate1234567");

        WebElement pwdField = dr.findElement(By.id("password"));
        pwdField.sendKeys("Pwd12345");

        WebElement ienaktButton = dr.findElement(By.id("loginSubmit"));
        ienaktButton.click();





        sleep(5000);

        dr.quit();
    }
}
