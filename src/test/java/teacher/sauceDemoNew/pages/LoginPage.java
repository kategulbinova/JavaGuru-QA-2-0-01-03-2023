package teacher.sauceDemoNew.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static teacher.sauceDemoNew.utils.DriverProvider.getCurrentDriver;

public class LoginPage {
    private String loginFieldId = "user-name";
    private String passwordFieldId = "password";
    private String  loginButtonId = "login-button";


    public void login(String login, String password) {
        // Initialize all necessary elements
        WebElement loginField = getCurrentDriver().findElement(By.id(loginFieldId));
        WebElement passwordField = getCurrentDriver().findElement(By.id(passwordFieldId));
        WebElement loginButton = getCurrentDriver().findElement(By.id(loginButtonId));

        // Perform login
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        loginButton.click();
    }

}
