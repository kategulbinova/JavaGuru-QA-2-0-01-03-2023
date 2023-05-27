package nikita.sauceDemoHomework12NoBasePageTests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CartPage {
    private WebDriver driver; // null

    private String checkoutPageId = "checkout";
    private String burgerMenuIconId = "react-burger-menu-btn";

    double itemPrice;


    private String continueShoppingBtnId = "continue-shopping";

    public String allPricesElementsXpath = "//div[@class='inventory_item_price']";

    private String logoutBtnId = "logout_sidebar_link";

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void continueShopping () {
        WebElement continueShoppingBtn = driver.findElement(By.id(continueShoppingBtnId));
        continueShoppingBtn.click();
    }

    public void checkoutPageMove () {
        WebElement checkoutPageBtn = driver.findElement(By.id(checkoutPageId));
        checkoutPageBtn.click();
    }

    public void logoutFromThisPage() {
        WebElement burgerMenuIcon = driver.findElement(By.id(burgerMenuIconId));
        burgerMenuIcon.click();
        WebDriverWait waitMenu = new WebDriverWait(driver, Duration.ofSeconds(2));
        waitMenu.until(ExpectedConditions.visibilityOfElementLocated(By.id(logoutBtnId)));
        WebElement logoutBtn = driver.findElement(By.id(logoutBtnId));
        logoutBtn.click();
    }




    public double totalSumOfListedItems () {
        double ItemsInCartTotalPrice = 0;
        List<WebElement> listedPrices = driver.findElements(By.xpath(allPricesElementsXpath));
        for (WebElement link : listedPrices) {
            itemPrice = Double.parseDouble(link.getText().substring(1));
            ItemsInCartTotalPrice = ItemsInCartTotalPrice + itemPrice;
        }
        return ItemsInCartTotalPrice;
    }
}
