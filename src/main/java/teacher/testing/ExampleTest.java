package teacher.testing;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleTest {
   // @Test
   public static void main(String[] args) throws InterruptedException {

       WebDriverManager.chromedriver().setup();
       org.openqa.selenium.WebDriver driver = new ChromeDriver();
       driver.quit();

    }
}
