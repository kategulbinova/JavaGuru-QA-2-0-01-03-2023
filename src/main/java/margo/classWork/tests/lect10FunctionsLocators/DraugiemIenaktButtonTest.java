package margo.classWork.tests.lect10FunctionsLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DraugiemIenaktButtonTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.draugiem.lv");

        /*WebElement ienaktButton = driver.findElement(By.xpath("//button[@name='login']"));
        String buttonName = ienaktButton.getText();
        System.out.println(buttonName + " is the name of this button.");

        //Finding button's name using CSS Path and without additional variable
        WebElement ienaktButton2 = driver.findElement(By.cssSelector("button[type='submit']"));
        System.out.println("The name of this button is " + ienaktButton2.getText());

        //Find checkbox with a text "Atcereties mani"
        WebElement atceretiesManiCheckBox = driver.findElement(By.id("Forms_remember_me"));
        System.out.println(atceretiesManiCheckBox.getText());
         */

        //Log in with wrong credentials and getting error
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("someemail@email.email");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("somepassword");

        WebElement ienaktButton = driver.findElement(By.id("loginSubmit"));
        ienaktButton.click();

        WebElement loginErrorMessage = driver.findElement(By.xpath("//div[@class='infoMsg errorIcon radius3']"));
        if (loginErrorMessage.isDisplayed()) {
            System.out.println("True: " + loginErrorMessage.getText());
        }
        else {
            System.out.println("False, error message is not displayed");
        }

        driver.quit();
    }
}
