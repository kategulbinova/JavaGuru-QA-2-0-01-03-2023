package irinaver.homework.sauceDemoNew.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverProvider {
    private static WebDriver driver;
    public static WebDriver getCurrentDriver(){
        if(driver == null){
            init();
        }
        return driver;
    }
    private static void init(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
}
