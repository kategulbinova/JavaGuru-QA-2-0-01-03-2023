package olgaZikova.lesson12.sauceDemoNew.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver; //driver is null

    private String loginFieldId = "user-name";
    private String passwordFieldId = "password";
    private String loginBtnId = "login-button";

    /*private WebElement loginField = driver.findElement(By.id("user-name"));
    private WebElement passwordField = driver.findElement(By.id("password"));
    private WebElement loginBtn = driver.findElement(By.id("login-button"));*/

    public LoginPage (WebDriver driver) {
        this.driver = driver;
    }
  /*  public WebDriver getDriver () {
        return driver;
    }

    public void setDriver () {
        this.driver = driver;
    }*/

    public void login (String login, String password) {
        WebElement loginField = driver.findElement(By.id (loginFieldId));
        WebElement passwordField = driver.findElement(By.id (passwordFieldId));
        WebElement loginBtn = driver.findElement(By.id (loginBtnId));
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        loginBtn.click();
    }
}
