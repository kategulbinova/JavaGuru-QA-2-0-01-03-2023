package irinav.classwork.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DraugiemButtonTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.draugiem.lv");

        WebElement ienaktButton = driver.findElement(By.xpath("//button[@name ='login']"));
        String buttonTitle = ienaktButton.getText();

        System.out.println("Button title is: " + buttonTitle);

        WebElement rememberMeCheckBox = driver.findElement(By.id("Forms_remember_me"));
        String checkBox = rememberMeCheckBox.getText();

        System.out.println("Remember me checkbox is: " + checkBox);

        driver.quit();
    }
}
