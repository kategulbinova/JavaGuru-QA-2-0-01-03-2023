package margo.classWork.sauceDemoTests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    private WebDriver driver;
    private String addToCartBtnId = "add-to-cart-sauce-labs-bike-light";
    private String shoppingCartId = "shopping_cart_container";
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }
    public void addingToCart() {
        //Initialized elements
        WebElement addToCartBtn = driver.findElement(By.id(addToCartBtnId));
        WebElement shoppingCart = driver.findElement(By.id(shoppingCartId));

        //Perform adding product to cart
        addToCartBtn.click();
        shoppingCart.click();
    }
    public Boolean isPresent() {
        WebElement checkoutBtn = driver.findElement(By.id("checkout"));
        if (checkoutBtn.isDisplayed()) return true;
        else return false;
    }
}
