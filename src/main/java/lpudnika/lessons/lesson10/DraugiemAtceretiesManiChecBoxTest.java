package lpudnika.lessons.lesson10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class DraugiemAtceretiesManiChecBoxTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        org.openqa.selenium.WebDriver driver = new ChromeDriver();

        driver.get("https://www.draugiem.lv");

        WebElement atceretiesManiCheckBox = driver.findElement(By.id("Forms_remember_me"));

        String buttonTitle = atceretiesManiCheckBox.getText();

        System.out.println("Button title is: " + buttonTitle);

        sleep(5000);

        driver.quit();
    }
}
