package svetlanaKussi.homeWork.sauceDemoTestHW12.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {
    public WebDriver driver;
    public String addToCartButtonID = "add-to-cart-sauce-labs-backpack";
    public String removeFromCartButtonID = "remove-sauce-labs-backpack";
    public String productInventoryID = "inventory_container";


    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }


    public void testButtons(){
        WebElement addToCartButton = driver.findElement(By.id(addToCartButtonID));
        WebElement removeFromCartButton = driver.findElement(By.id(removeFromCartButtonID));

        addToCartButton.click();
        removeFromCartButton.click();

    }
    public void addToCart(){
        WebElement addToCartButton = driver.findElement(By.id(addToCartButtonID));
        addToCartButton.click();


    }
    public void removeFromCart(){
        WebElement removeFromCartButton = driver.findElement(By.id(removeFromCartButtonID));
        removeFromCartButton.click();
    }

    public Boolean isOpen() {
        WebElement burgerMenuIcon = driver.findElement(By.id(productInventoryID));
        if ( burgerMenuIcon.isDisplayed() ) return true;
        else return false;
    }

}
