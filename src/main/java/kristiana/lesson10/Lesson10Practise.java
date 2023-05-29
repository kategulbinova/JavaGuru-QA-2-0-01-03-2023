package kristiana.lesson10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson10Practise {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        org.openqa.selenium.WebDriver driver = new ChromeDriver();

        driver.get("https://www.draugiem.lv");

        WebElement loginField = driver.findElement(By.id("email"));
        loginField.sendKeys("kdkdkdk@kdkdk.lv");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("hahaha");

        WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
        loginButton.click();

        WebElement wrongMsgInfo = driver.findElement(By.xpath("//div[@class='infoMsg errorIcon radius3']"));

        if (wrongMsgInfo.isDisplayed()) {
            System.out.println(wrongMsgInfo.getText());
        } else System.out.println("Error message not displayed");


        driver.quit();

    }
}
