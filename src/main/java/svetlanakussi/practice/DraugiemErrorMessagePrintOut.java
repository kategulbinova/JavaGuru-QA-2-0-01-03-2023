package svetlanakussi.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DraugiemErrorMessagePrintOut {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.draugiem.lv/");

        WebElement usernameField = driver.findElement(By.id("email"));
        usernameField.sendKeys("standard_user@gmail.com");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce1");

        WebElement loginButton = driver.findElement(By.id("loginSubmit"));
        loginButton.click();

        WebElement nepareizaParole = driver.findElement(By.xpath("//div[@class = 'infoMsg errorIcon radius3']"));

        if (nepareizaParole.isDisplayed()) {
            System.out.println(nepareizaParole.getText());
        }else System.out.println("Error message not displayed");

        driver.quit();

    }
}
