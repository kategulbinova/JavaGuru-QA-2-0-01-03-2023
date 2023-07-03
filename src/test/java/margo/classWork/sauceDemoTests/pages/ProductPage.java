package margo.classWork.sauceDemoTests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
    private WebDriver driver;
    private String addToCartBtnId = "add-to-cart-sauce-labs-bike-light";
    private String shoppingCartId = "shopping_cart_container";
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }
    public void addToCart() {
        //Initialized elements
        WebElement addToCartBtn = driver.findElement(By.id(addToCartBtnId));

        //Perform adding product to cart
        addToCartBtn.click();
    }
    public Boolean isRmvBtnPresent() {
        WebElement removeBtn = driver.findElement(By.id("remove-sauce-labs-bike-light"));
        if (removeBtn.isDisplayed()) return true;
        else return false;
    }
    public void goToCart() {
        //Initialized elements
        WebElement shoppingCart = driver.findElement(By.id(shoppingCartId));

        //Adding product to cart
        shoppingCart.click();
    }
}
