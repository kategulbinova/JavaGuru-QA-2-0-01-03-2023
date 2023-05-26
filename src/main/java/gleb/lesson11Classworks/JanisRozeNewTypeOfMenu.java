package gleb.lesson11Classworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JanisRozeNewTypeOfMenu {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        Actions actions=new Actions(driver);


        driver.get("https://www.janisroze.lv/");

        WebElement dropDownLietotajs=driver.findElement(By.xpath("//ul[@class='account-dropdown long']"));
        actions.moveToElement(dropDownLietotajs).build().perform();



    }
}
