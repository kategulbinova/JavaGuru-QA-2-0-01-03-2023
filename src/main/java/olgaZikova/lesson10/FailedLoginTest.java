package olgaZikova.lesson10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FailedLoginTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver dr = new ChromeDriver();

        dr.get("https://www.draugiem.lv/");

        WebElement emailField = dr.findElement(By.id("email"));
        emailField.sendKeys("a@a.lv");

        WebElement passwordField = dr.findElement(By.id("password"));
        passwordField.sendKeys("a");

        WebElement ienaktButton = dr.findElement(By.xpath("//button[@name='login']"));
        ienaktButton.click();

        WebElement incorrectNotifiction = dr.findElement(By.xpath("//div[@class='infoMsg errorIcon radius3']"));
        String buttonTitle = incorrectNotifiction.getText();

        System.out.println("Button title is:" + incorrectNotifiction.getText());

        dr.quit();
    }
    }

