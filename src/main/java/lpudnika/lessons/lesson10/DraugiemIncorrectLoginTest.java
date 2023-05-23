package lpudnika.lessons.lesson10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class DraugiemIncorrectLoginTest {

    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.draugiem.lv");

        WebElement loginField = driver.findElement(By.id("email"));

        loginField.sendKeys("test@email.com");

        WebElement passwordField = driver.findElement(By.id("password"));

        passwordField.sendKeys("zaq1xsw2");

        sleep(5000);

        WebElement ienaktButton = driver.findElement(By.id("loginSubmit"));
        ienaktButton.click();

        sleep(5000);

        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='infoMsg errorIcon radius3']"));

        String errorsMessage = errorMessage.getText();

        System.out.println("Error message is: " + errorsMessage);

        if (errorMessage.isDisplayed()) {
            System.out.println(errorsMessage);
        } else {
            System.out.println("Login successful.");
        }

        driver.quit();
    }
}
