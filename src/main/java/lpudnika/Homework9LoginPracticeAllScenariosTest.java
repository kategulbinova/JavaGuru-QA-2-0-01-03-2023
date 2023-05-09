package lpudnika;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Homework9LoginPracticeAllScenariosTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        //standard_user
        System.out.println("Standard User");

        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        sleep(2000);

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        if (driver.getCurrentUrl().contains("inventory.html")) {
            System.out.println("Login successful!");
            WebElement menuButton = driver.findElement(By.id("react-burger-menu-btn"));
            menuButton.click();

            sleep(2000);

            WebElement logoutButton = driver.findElement(By.id("logout_sidebar_link"));
            logoutButton.click();

            sleep(5000);

            if (driver.getCurrentUrl().contains("inventory.html")) {
                System.out.println("Logout unsuccessful!");
                driver.get("https://www.saucedemo.com/");
            } else {
                System.out.println("Logout successful.");
            }
        } else {
            System.out.println("Login failed: invalid username or password.");
        }

        sleep(2000);

        //incorrect username
        System.out.println("Incorrect username");

        usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_userr");

        passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        sleep(2000);

        loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        if (driver.getCurrentUrl().contains("inventory.html")) {
            System.out.println("Login successful!");
            WebElement menuButton = driver.findElement(By.id("react-burger-menu-btn"));
            menuButton.click();

            sleep(2000);

            WebElement logoutButton = driver.findElement(By.id("logout_sidebar_link"));
            logoutButton.click();

            sleep(5000);

            if (driver.getCurrentUrl().contains("inventory.html")) {
                System.out.println("Logout unsuccessful!");
                driver.get("https://www.saucedemo.com/");
            } else {
                System.out.println("Logout successful.");
            }
        } else {
            System.out.println("Login failed: invalid username or password.");
        }

        sleep(2000);

        //problem_user
        System.out.println("Problem User");

        usernameField = driver.findElement(By.id("user-name"));
        usernameField.clear();
        usernameField.sendKeys("problem_user");

        passwordField = driver.findElement(By.id("password"));
        passwordField.clear();
        passwordField.sendKeys("secret_sauce");

        sleep(2000);

        loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();


        if (driver.getCurrentUrl().contains("inventory.html")) {
            System.out.println("Login successful!");
            WebElement menuButton = driver.findElement(By.id("react-burger-menu-btn"));
            menuButton.click();

            sleep(2000);

            WebElement logoutButton = driver.findElement(By.id("logout_sidebar_link"));
            logoutButton.click();

            sleep(5000);

            if (driver.getCurrentUrl().contains("inventory.html")) {
                System.out.println("Logout unsuccessful!");
                driver.get("https://www.saucedemo.com/");
            } else {
                System.out.println("Logout successful.");
            }
        } else {
            System.out.println("Login failed: invalid username or password.");
        }

        //incorrect password
        System.out.println("Incorrect password");

        usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("problem_user");

        passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_saucesssss");

        sleep(2000);

        loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();


        if (driver.getCurrentUrl().contains("inventory.html")) {
            System.out.println("Login successful!");
            WebElement menuButton = driver.findElement(By.id("react-burger-menu-btn"));
            menuButton.click();

            sleep(2000);

            WebElement logoutButton = driver.findElement(By.id("logout_sidebar_link"));
            logoutButton.click();

            sleep(5000);

            if (driver.getCurrentUrl().contains("inventory.html")){
                System.out.println("Logout unsuccessful!");
                driver.get("https://www.saucedemo.com/");
            } else {
                System.out.println("Logout successful.");
            }
        } else {
            System.out.println("Login failed: invalid username or password.");
        }

        driver.quit();

        sleep(2000);
    }
}
