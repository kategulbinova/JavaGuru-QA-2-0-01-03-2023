package svetlanaKussi.sauceDemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public WebDriver driver;
    public String loginFieldID = "user-name";
    public String passwordFieldID = "password";
    public String loginButtonID = "login-button";

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void login(String login, String password){
        WebElement loginField = driver.findElement(By.id(loginFieldID));
        WebElement passwordField = driver.findElement(By.id(passwordFieldID));
        WebElement loginButton = driver.findElement(By.id(loginButtonID));

        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        loginButton.click();

    }
}
