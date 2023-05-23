package olgaZikova.lesson10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DraugiemButtonTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver dr = new ChromeDriver();

        dr.get("https://www.draugiem.lv/");

        WebElement ienaktButton = dr.findElement(By.xpath("//button[@name='login']"));
        String buttonTitle = ienaktButton.getText();

        System.out.println("Button title is:" + ienaktButton.getText());

        dr.quit();
    }
}
