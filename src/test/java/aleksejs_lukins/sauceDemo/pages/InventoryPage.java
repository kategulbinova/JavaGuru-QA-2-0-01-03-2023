package aleksejs_lukins.sauceDemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InventoryPage {
    private WebDriver driver; // null

    private String burgerMenuIconId = "react-burger-menu-btn";
    private String  logoutButtonId = "logout_sidebar_link";
    private String cartButtonId = "shopping_cart_container";
    private String sortingOptionsXpath = "//*[@id='header_container']/div[2]/div/span/select";
    private String bikeLightXpath = "//*[@id='item_0_title_link']/div";

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public Boolean isOpen() {
        WebElement burgerMenuIcon = driver.findElement(By.id(burgerMenuIconId));

        if ( burgerMenuIcon.isDisplayed() )  return true;
        else return false;
    }

    public void logout() {
        // Initialize all necessary elements
        WebElement burgerButton = driver.findElement(By.id(burgerMenuIconId));
        WebElement logoutButton = driver.findElement(By.id(logoutButtonId));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // click burger menu
        burgerButton.click();

        // wait for burger menu to open
        WebElement logoutMenuItem = driver.findElement(By.id(logoutButtonId));
        wait.until(ExpectedConditions.elementToBeClickable(logoutMenuItem));

        // clicking logout
        logoutButton.click();
    }

    public void clickCartButton() {
        WebElement cartButton = driver.findElement(By.id(cartButtonId));
        cartButton.click();
    }

    // assertion to see if we see product sorting option on all product list
    public boolean isAllProductPageOpened() {
        WebElement sortingOptions = driver.findElement(By.xpath(sortingOptionsXpath));
        if ( sortingOptions.isDisplayed() )  return true;
        else return false;
    }

    public void bikeLightClick () {
        // Initialize all necessary elements
        WebElement bikeLight = driver.findElement(By.xpath(bikeLightXpath));

        // clicking to bike light
        bikeLight.click();
    }

}
