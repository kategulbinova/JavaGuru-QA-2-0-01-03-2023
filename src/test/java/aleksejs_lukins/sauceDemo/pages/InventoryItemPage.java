package aleksejs_lukins.sauceDemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryItemPage {
    private WebDriver driver; // null

    private String  backToProductsXpath = "//*[@id='back-to-products']";

    public InventoryItemPage(WebDriver driver) {
        this.driver = driver;
    }

    public void backToProductsClick () {
        WebElement backToProducts = driver.findElement(By.xpath(backToProductsXpath));

        // clicking back to other products
        backToProducts.click();
    }

}
