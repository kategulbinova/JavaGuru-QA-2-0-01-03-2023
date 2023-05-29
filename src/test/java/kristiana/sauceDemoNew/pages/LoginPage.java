package kristiana.sauceDemoNew.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    private String loginFieldID = "user-name";
    private String passwordFieldID = "password";
    private String loginButtonID = "login-button";

    public LoginPage(WebDriver driver){
        this.driver = driver;

    }

    public void login(String login, String password) {
        // initialize all necessary elements
        WebElement loginField = driver.findElement(By.id(loginFieldID));
        WebElement passwordField = driver.findElement(By.id(passwordFieldID));
        WebElement loginButton = driver.findElement(By.id(loginButtonID));

        //Perform login
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        loginButton.click();
    }


}
