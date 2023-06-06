package margo.classWork.sauceDemoTests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
    private WebDriver driver;
    private String bikeLightImg = "//img[@alt='Sauce Labs Bike Light']";
    private String addToCartBtnId = "add-to-cart-sauce-labs-bike-light";
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void chooseBikeLight() {
        //Initialized element
        WebElement bikeLightItem = driver.findElement(By.xpath(bikeLightImg));

        //Choose specific item from all products
        bikeLightItem.click();
    }
    public void addingToCart() {
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

}
