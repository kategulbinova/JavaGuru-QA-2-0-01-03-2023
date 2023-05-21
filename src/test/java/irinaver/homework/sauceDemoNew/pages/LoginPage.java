package irinaver.homework.sauceDemoNew.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
   private WebDriver driver;
   private String loginFieldId = "user-name";
   public String passwordFieldId = "password";
   private String loginButtonId = "login-button";
    private String burgerMenuIconId = "react-burger-menu-btn";

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void login (String login, String password){
        WebElement loginField = driver.findElement(By.id(loginFieldId));
        WebElement passwordField = driver.findElement(By.id(passwordFieldId));
        WebElement loginButton = driver.findElement(By.id(loginFieldId));

        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        loginButton.submit();
    }
    public void logout(){
        WebElement burgerMenuIconButton = driver.findElement(By.id(burgerMenuIconId));
        burgerMenuIconButton.click();
    }


}

