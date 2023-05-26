package gleb.lesson10locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorOccuredMassageDraugiem {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.draugiem.lv/?login=0");

        WebElement loginField = driver.findElement(By.id("email"));
        loginField.sendKeys("ZeniaKrasav4ik@gmail.com");

        WebElement passwodField = driver.findElement(By.id("password"));
        passwodField.sendKeys("opaopaopapa");

        WebElement ienaktButton=driver.findElement(By.xpath("//button[@name='login']"));
        ienaktButton.click();

        WebElement errorOccuredMassage =driver.findElement(By.xpath("//div[@class='infoMsg errorIcon radius3']"));
        if(errorOccuredMassage.isDisplayed()){
            System.out.println(errorOccuredMassage.getText());
        }else
            System.out.println("error massage not displayed");

        driver.quit();




    }
}
