package yanaItani.sauseDemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
    private WebDriver driver;

    public String usernameId = "user-name";

    public String passwordId = "password";

    public String logInButtonId = "login-button";

    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String login, String passwordString) {
        WebElement username = driver.findElement(By.id(usernameId));
        WebElement password = driver.findElement(By.id(passwordId));
        WebElement loginButton = driver.findElement(By.id(logInButtonId));


        username.sendKeys(login);
        password.sendKeys(passwordString);
        loginButton.click();



    }
    public Boolean loginIsOpen() {
        WebElement logInButton = driver.findElement(By.id("login-button"));

        if(logInButton.isDisplayed() ) return true;

        else return false;
    }
}
