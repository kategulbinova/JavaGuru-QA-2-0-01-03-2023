package svetlanakussi.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DraugiemLoginButtonPrintOut {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.draugiem.lv/");

        WebElement ienaktButton = driver.findElement(By.xpath("//button[@name='login']"));
        String loginButton = ienaktButton.getText();

        System.out.println("Button text is : " + loginButton);
        driver.quit();
    }
}
