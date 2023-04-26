package teacher.testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver dr = new ChromeDriver();

        dr.get("https://www.draugiem.lv");

        dr.quit();
    }
}
