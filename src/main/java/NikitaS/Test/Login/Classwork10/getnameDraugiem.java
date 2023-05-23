package NikitaS.Test.Login.Classwork10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;
public class getnameDraugiem {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver dr = new ChromeDriver();

        dr.get("https://www.draugiem.lv");

        WebElement ienaktButton = dr.findElement(By.xpath("//button[@name='login']"));

        String buttonTitle = ienaktButton.getText();
        System.out.println("Button title is " + buttonTitle);

        WebElement atcerManaiCheckBox = dr.findElement(By.id("Forms_remember_me"));

        String checkBoxText = atcerManaiCheckBox.getText();
        System.out.println("Checkbox title is " + checkBoxText);


        dr.quit();
    }
}
