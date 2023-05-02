package alex;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAlex {
        public static void main(String[] args){
            WebDriverManager.chromedriver().setup();
            WebDriver dr = new ChromeDriver();
            dr.get("https://www.saucedemo.com/");

            int valid = 1;
            int invalid = 2;
            if (invalid == 1 ) {
                System.out.println("Only printed if true");
            } else if (invalid != 2) {System.out.println("Second if statement is true");

            }


        }
    }

