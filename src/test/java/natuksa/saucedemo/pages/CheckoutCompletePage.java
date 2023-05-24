package natuksa.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutCompletePage {
    private WebDriver driver;
    private String checkoutCompleteContainerId = "checkout_complete_container";
    private String backToInventoryPageId = "back-to-products";

    public CheckoutCompletePage(WebDriver driver) {this.driver = driver;}

    public void goToInventoryPage() {
        WebElement backToInventoryPage = driver.findElement(By.id(backToInventoryPageId));

        backToInventoryPage.click();
    }

    public Boolean isOrderComplete() {
        WebElement checkoutCompleteContainer = driver.findElement(By.id(checkoutCompleteContainerId));
        if (checkoutCompleteContainer.isDisplayed() )  return true;
        else return false;
    }
}
