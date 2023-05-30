package nikita.Homework12SaucedemoAndJanisRozeTests.sauceDemoHomework12WithBasePageTests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    WebDriver driver; // null

     String burgerMenuIconId = "react-burger-menu-btn";

     String logoutBtnId = "logout_sidebar_link";

     String cartIconXpath = "//a[@class='shopping_cart_link']";

     String allPricesElementsXpath = "//div[@class='inventory_item_price']";

    double itemPrice;

    double ItemsInCartTotalPrice;

    public BasePage(WebDriver driver) {
        this.driver=driver;
    }

    /*public BasePage(WebDriver driver) {
        this.driver = driver;
    }*/

    public void cartPageOpen() {
        WebElement cartIcon = driver.findElement(By.xpath(cartIconXpath));
        cartIcon.click();
    }

    public Boolean isOpen() {
        WebElement burgerMenuIcon = driver.findElement(By.id(burgerMenuIconId));

        if ( burgerMenuIcon.isDisplayed() )  return true;
        else return false;
    }

    public double totalSumOfListedItems () {
        List<WebElement> listedPrices = driver.findElements(By.xpath(allPricesElementsXpath));
        ItemsInCartTotalPrice = 0;
        for (WebElement link : listedPrices) {
            itemPrice = Double.parseDouble(link.getText().substring(1));
            ItemsInCartTotalPrice = ItemsInCartTotalPrice + itemPrice;
        }
        return ItemsInCartTotalPrice;
    }

    public void logoutFromThisPage() {
        WebElement burgerMenuIcon = driver.findElement(By.id(burgerMenuIconId));
        burgerMenuIcon.click();
        WebDriverWait waitMenu = new WebDriverWait(driver, Duration.ofSeconds(2));
        waitMenu.until(ExpectedConditions.visibilityOfElementLocated(By.id(logoutBtnId)));
        WebElement logoutBtn = driver.findElement(By.id(logoutBtnId));
        logoutBtn.click();
    }



}



