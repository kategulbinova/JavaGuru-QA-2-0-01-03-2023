package svetlanakussi.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static java.lang.Thread.sleep;

public class PrintListOfCarsTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ss.lv/");
        WebElement vieglieAuto = driver.findElement(By.id("mtd_97"));
        vieglieAuto.click();

        List<WebElement> vieglieAutoLinks = driver.findElements(By.xpath("//a[@id]"));

        System.out.println("Options :");
        for (WebElement element : vieglieAutoLinks){
            System.out.println(element.getText());
        }
        sleep(5000);

        driver.quit();


    }

}
