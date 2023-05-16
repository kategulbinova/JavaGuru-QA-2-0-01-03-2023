package irinav.classwork.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import static java.lang.Thread.sleep;

public class LoginTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

       driver.get("http://www.draugiem.lv");

       WebElement  myEmail = driver.findElement(By.id("email"));
       myEmail.sendKeys("iren7465@gmail.com");

       WebElement myPassword = driver.findElement(By.id("password"));
       myPassword.sendKeys("qwrtt67899");

       WebElement ienaktButton = driver.findElement(By.xpath("/button[@name='login']"));
       ienaktButton.click();

        WebElement wrongCredentialsErrorMSg = driver.findElement(By.xpath("//div[@class='infoMsg errorIcon radius3']"));

        if(wrongCredentialsErrorMSg.isDisplayed()){
            System.out.println(wrongCredentialsErrorMSg.getText());
        } else System.out.println("Error message is not displayed");

        driver.quit();
    }
}
