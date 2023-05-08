package svetlanakussi.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DraugiemCheckboxPrintOut {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.draugiem.lv/");
        WebElement atceretiesButton = driver.findElement(By.id("Forms_remember_me"));
        String checkBoxText = atceretiesButton.getText();

        System.out.println("Check text is : " + checkBoxText);

        driver.quit();
    }
}
