package aleksejs_lukins.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Lesson10WOrkWithDraugiemError {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.draugiem.lv");

        WebElement loginField = driver.findElement(By.id("email"));
        loginField.sendKeys("csdcds@sec.se");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("essrvrsvsrv");

        WebElement enterButton = driver.findElement(By.xpath("//*[@id='loginSubmit']"));
        enterButton.click();

        WebElement errorMessage = driver.findElement(By.xpath("//*[@id='loginBox']/form/div[1]"));

        if (errorMessage.isDisplayed()) {
            System.out.println(errorMessage.getText());
        } else System.out.println("No error message");

        sleep(5000);
        driver.quit();
    }

}
