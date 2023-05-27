package nikita.sauceDemoHomework12NoBasePageTests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutInfoPage {
    private WebDriver driver; // null


    private String burgerMenuIconId = "react-burger-menu-btn";

    private String continueShoppingBtnId = "continue-shopping";
    private String logoutBtnId = "logout_sidebar_link";

    private String continueBtnId = "continue";

    public CheckoutInfoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ContinueBtnClick() {
        WebElement continueBtn = driver.findElement(By.id(continueBtnId));
        continueBtn.click();

    }

    public void logoutFromThisPage() {
        WebElement burgerMenuIcon = driver.findElement(By.id(burgerMenuIconId));
        burgerMenuIcon.click();
        WebDriverWait waitMenu = new WebDriverWait(driver, Duration.ofSeconds(2));
        waitMenu.until(ExpectedConditions.visibilityOfElementLocated(By.id(logoutBtnId)));
        WebElement logoutBtn = driver.findElement(By.id(logoutBtnId));
        logoutBtn.click();
    }


    public Boolean isOpenByURL() {

        if (driver.getCurrentUrl().contains("checkout-step-one")) return true;
        else return false;
    }

}

