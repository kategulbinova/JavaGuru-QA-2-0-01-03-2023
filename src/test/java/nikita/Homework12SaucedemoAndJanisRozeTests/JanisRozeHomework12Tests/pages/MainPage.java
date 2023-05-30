package nikita.Homework12SaucedemoAndJanisRozeTests.JanisRozeHomework12Tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    private WebDriver driver; // null

    private String userProfileIconXpath = "//a[@class='link']//span[@class='icon ic ic-user']";

    private String loginPageBtnXpath = "//a[@title='Ielogoties']";


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }


    public void goToLoginPage () {
        // Initialize all necessary elements
        Actions actions = new Actions(driver);
        WebElement userProfileIcon = driver.findElement(By.xpath(userProfileIconXpath));
        actions.moveToElement(userProfileIcon).build().perform();

        //Click on Login page link on the pop-up menu
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loginPageBtnXpath)));
        WebElement loginPageBtn = driver.findElement(By.xpath(loginPageBtnXpath));
        loginPageBtn.click();

    }

}
