package gleb.Homework.SauceDemoLoginTestHomework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class SauceDemoTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        WebElement loginField =driver.findElement(By.id("user-name"));
        loginField.sendKeys("standard_user1");

        WebElement passwordField= driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginButton= driver.findElement(By.id("login-button"));
        loginButton.click();

        if (driver.getCurrentUrl().contains("inventory")){
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("You successfully logged in!!! ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }else{
                System.out.println("Something went wrong :(");
                System.out.println("Login and Password does not match.");
                System.out.println();
                System.out.println("There is some basic steps how to fix this issue :");
                System.out.println(" 1)Please check if Login is written correctly ");
                System.out.println(" 2)Please check if Password is written correctly");
        }
        //sleep(5000);
        driver.quit();



    }
}
