package natuksa.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {
    private WebDriver driver;

    private String burgerMenuIconId = "react-burger-menu-btn";
    private String logoutMenuItemId = "logout_sidebar_link";

    private String addToCartBackpackId = "add-to-cart-sauce-labs-backpack";
    private String shoppingCartIconId = "shopping_cart_container";

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public Boolean isOpen() {
        WebElement burgerMenuIcon = driver.findElement(By.id(burgerMenuIconId));
        if ( burgerMenuIcon.isDisplayed() ) return true;
        else return false;
    }

    public void addToCartBackpack() {
        WebElement addToCartBackpack = driver.findElement(By.id(addToCartBackpackId));

        addToCartBackpack.click();
    }

    public void goToCart() {
        WebElement shoppingCartIcon = driver.findElement(By.id(shoppingCartIconId));

        shoppingCartIcon.click();

    }
}
