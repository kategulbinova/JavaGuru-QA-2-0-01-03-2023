package nikita.Homework12SaucedemoAndJanisRozeTests.JanisRozeHomework12Tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver; // null


    private String loginFieldXpath = "//input[@name='login[username]']";

    private String passwordFieldXpath = "//input[@name='login[password]']";

    private String loginBtnId = "send2";

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public void login(String username, String password) {

        //Enter username
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loginFieldXpath)));
        WebElement loginField = driver.findElement(By.xpath(loginFieldXpath));
        loginField.sendKeys(username);

        //Enter password
        WebElement passwordField = driver.findElement(By.xpath(passwordFieldXpath));
        passwordField.sendKeys(password);

        //Click login button
        WebElement loginBtn = driver.findElement(By.id(loginBtnId));
        driver.manage().window().maximize();
        loginBtn.click();
        // Perform login

    }

}
