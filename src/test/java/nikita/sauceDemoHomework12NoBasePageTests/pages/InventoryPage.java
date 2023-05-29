package nikita.sauceDemoHomework12NoBasePageTests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InventoryPage {
    private WebDriver driver; // null

    private String burgerMenuIconId = "react-burger-menu-btn";

    private String cartIconXpath = "//a[@class='shopping_cart_link']";

    public String addToCartAllBtnsXpath = "//button[@class='btn btn_primary btn_small btn_inventory']";

    public String allPricesElementsXpath = "//div[@class='inventory_item_price']";

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    double itemPrice;


    public void cartPageOpen() {
        WebElement cartIcon = driver.findElement(By.xpath(cartIconXpath));
        cartIcon.click();
    }



    public Boolean isOpen() {
        WebElement burgerMenuIcon = driver.findElement(By.id(burgerMenuIconId));

        if ( burgerMenuIcon.isDisplayed() )  return true;
        else return false;
    }

    public Boolean isOpenByURL() {

        if ( driver.getCurrentUrl().contains("inventory") )  return true;
        else return false;
    }

    public void addAllItemsToCart() {
        List<WebElement> addToCartAllBtns = driver.findElements(By.xpath(addToCartAllBtnsXpath));
        for (WebElement link : addToCartAllBtns) {
            link.click();
        }
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
