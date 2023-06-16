package paula.workInClass.testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DraugiemButtonTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        org.openqa.selenium.WebDriver driver = new ChromeDriver();

        driver.get("https://www.draugiem.lv");

        WebElement atceretiesManiCheckBox = driver.findElement(By.id("Forms_remember_me"));
        String checkBoxText = atceretiesManiCheckBox.getText();
        System.out.println("Checkbox title is " + checkBoxText);

        /*

         */

        driver.quit();
    }
}
