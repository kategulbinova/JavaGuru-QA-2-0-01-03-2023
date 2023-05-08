package aleksejs_lukins.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Lesson10WorkWithSeleniumMethodsOnDraugiemLv {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.draugiem.lv");

//        WebElement ienaktButton = driver.findElement(By.xpath("//*[@id=\"loginSubmit\"]/span/div/button"));
//
//        String buttonTitle = ienaktButton.getText();
//
//        System.out.println(buttonTitle);

        WebElement rememberMeCheckbox = driver.findElement(By.id("Forms_remember_me"));

        String checkboxTitle = rememberMeCheckbox.getText();

        System.out.println(checkboxTitle);

        sleep(5000);
        driver.quit();
    }

}
