package margo.classWork.sauceDemoTests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    private String usernameFieldId = "user-name";
    private String passwordFieldId = "password";
    private String loginButtonId = "login-button";

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void login(String username, String password) {
        //Initialized elements
        WebElement usernameField = driver.findElement(By.id(usernameFieldId));
        WebElement passwordField = driver.findElement(By.id(passwordFieldId));
        WebElement loginButton = driver.findElement(By.id(loginButtonId));

        //Perform log in
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }

}
