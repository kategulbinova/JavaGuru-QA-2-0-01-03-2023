package irinaver.homework.sauceDemoNew.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static irinaver.homework.sauceDemoNew.utils.DriverProvider.getCurrentDriver;

public class LoginPage {

   private String loginFieldId = "user-name";
   public String passwordFieldId = "password";
   private String loginButtonId = "login-button";
    private String burgerMenuIconId = "react-burger-menu-btn";


    public void login (String login, String password){
        WebElement loginField = getCurrentDriver().findElement(By.id(loginFieldId));
        WebElement passwordField = getCurrentDriver().findElement(By.id(passwordFieldId));
        WebElement loginButton = getCurrentDriver().findElement(By.id(loginButtonId));

        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        loginButton.submit();
    }
    public void logout(){
        WebElement burgerMenuIconButton = getCurrentDriver().findElement(By.id(burgerMenuIconId));
        burgerMenuIconButton.click();
    }


}

