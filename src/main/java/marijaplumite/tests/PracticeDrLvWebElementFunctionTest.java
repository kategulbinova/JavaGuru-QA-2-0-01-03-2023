package marijaplumite.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDrLvWebElementFunctionTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://draugiem.lv");

        WebElement ienaktButton = driver.findElement(By.xpath("//button[@name='login']"));

        String buttonTitle = ienaktButton.getText();
        System.out.println("Button title is : " + buttonTitle);

        WebElement atceretiesManiCheckBox = driver.findElement(By.id("Forms_remember_me"));

        String checkBoxTitle = atceretiesManiCheckBox.getText();
        System.out.println("Checkbox text : " + checkBoxTitle);

        WebElement epastsField = driver.findElement(By.id("email"));

        epastsField.sendKeys("dfh@mail.lv");

        WebElement paroleField = driver.findElement(By.id("password"));

        paroleField.sendKeys("218552");
        ienaktButton.click();

        WebElement nepareiziDatiErrorMsg = driver.findElement(By.xpath("//div[@class='infoMsg errorIcon radius3']"));

        if (nepareiziDatiErrorMsg.isDisplayed()) {
            System.out.println(nepareiziDatiErrorMsg.getText());
        } else {
            System.out.println("Error message not displayed");

            driver.quit();

        }
    }
}