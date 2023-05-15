package natuksa.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson11Draugiem {
    public static void main (String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.draugiem.lv");

        WebElement loginField = driver.findElement(By.id("email"));
        loginField.sendKeys("gfasdasd@sada.lv");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("sdhayda");

        WebElement loginButton = driver.findElement(By.id("loginSubmit"));
        loginButton.click();

        WebElement loginErrorMessage = driver.findElement(By.xpath("//div[@class='infoMsg errorIcon radius3']"));
        if (loginErrorMessage.isDisplayed()) {
            System.out.println(loginErrorMessage.getText());
        }
        else {
            System.out.println("Not displayed");
        }

        driver.quit();
    }
}
