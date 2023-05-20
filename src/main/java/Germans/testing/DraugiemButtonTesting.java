package germans.testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class DraugiemButtonTesting {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        org.openqa.selenium.WebDriver driver = new ChromeDriver();

        driver.get("https://www.draugiem.lv");

        WebElement epastsField = driver.findElement(By.id("email"));
        epastsField.sendKeys("taa@taa.taa");

        WebElement paroleField = driver.findElement(By.id("password"));
        paroleField.sendKeys("qwerty12345");

        WebElement ienaktButton = driver.findElement(By.xpath("//button[@name='login']"));
        ienaktButton.click();

        WebElement wrongCredentialsErrorMsg = driver.findElement(By.xpath("//div[@class='infoMsg errorIcon radius3']"));

        if (wrongCredentialsErrorMsg.isDisplayed()) {
            System.out.println(wrongCredentialsErrorMsg.getText());
        } else System.out.println("Error message not displayed");

        driver.quit();
    }
}

