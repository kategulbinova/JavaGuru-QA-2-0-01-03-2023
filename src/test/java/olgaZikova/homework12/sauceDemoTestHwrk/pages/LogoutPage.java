package olgaZikova.homework12.sauceDemoTestHwrk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private String burgerMenuIconID = "react-burger-menu-btn";
    private String logoutBtnID = "logout_sidebar_link";


    public LogoutPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void makeLogout () {
        WebElement burgerMenuIcon = driver.findElement(By.id(burgerMenuIconID));
        WebElement logoutBtn = driver.findElement(By.id(logoutBtnID));
        burgerMenuIcon.click();
        wait.until(ExpectedConditions.elementToBeClickable(logoutBtn));
        logoutBtn.click();
    }

    public boolean isLogout () {
        String currentUrl = driver.getCurrentUrl() ;

        if (currentUrl.contains("inventory")) return false;
        else return true;

    }
}
