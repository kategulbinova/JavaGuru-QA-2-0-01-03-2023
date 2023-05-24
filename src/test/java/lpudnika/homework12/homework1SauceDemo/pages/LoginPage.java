package lpudnika.homework12.homework1SauceDemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    //save driver and element locators as object fields of type String
    private WebDriver driver;
    private String loginFieldId = "user-name";
    private String passwordFieldId = "password";
    private String loginButtonId = "login-button";

    //initialize WebDriver in constructor
    public LoginPage(WebDriver driver){

        this.driver=driver;
    }

    public void login(String login, String password){
        //Initialize elements inside methods
        WebElement loginField = driver.findElement(By.id(loginFieldId));
        WebElement passwordField = driver.findElement(By.id(passwordFieldId));
        WebElement loginButton = driver.findElement(By.id(loginButtonId));

        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        loginButton.click();
    }
}
