package romans.makna;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginExample {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the URL in the browser
        driver.get("https://www.saucedemo.com/");

        // Locate the username and password input fields using their IDs
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));

        // Enter a valid username and password
        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");

        // Click the "Login" button
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        // Check if the user has successfully logged in by checking the current URL
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("inventory.html")) {
            // If the login is successful, print a confirmation message
            System.out.println("Login successful!");
        } else {
            // If the login fails, print an error message indicating the reason for the failure
            System.out.println("Login failed. Invalid credentials or error occurred.");
        }

        // Close the browser
        driver.quit();
    }
}
