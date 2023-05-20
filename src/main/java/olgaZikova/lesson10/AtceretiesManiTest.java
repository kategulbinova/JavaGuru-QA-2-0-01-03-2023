package olgaZikova.lesson10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AtceretiesManiTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver dr = new ChromeDriver();

        dr.get("https://www.draugiem.lv/");

        WebElement atceretiesManiCheckbox = dr.findElement(By.id("Forms_remember_me"));
        String buttonTitle = atceretiesManiCheckbox.getText();

        System.out.println("Button title is:" + atceretiesManiCheckbox.getText());

        dr.quit();
    }
}
