package nikita.sauceDemoHomework12WithBasePageTests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    //private WebDriver driver; // null

    private String loginFieldId = "user-name";
    private String passwordFieldId = "password";
    private String  loginButtonId = "login-button";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String login, String password) {
        // Initialize all necessary elements
        WebElement loginField = driver.findElement(By.id(loginFieldId));
        WebElement passwordField = driver.findElement(By.id(passwordFieldId));
        WebElement loginButton = driver.findElement(By.id(loginButtonId));

        // Perform login
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    public Boolean isOpen() {
        WebElement loginButton = driver.findElement(By.id(loginButtonId));
        if ( loginButton.isDisplayed() )  return true;
        else return false;
    }



}
