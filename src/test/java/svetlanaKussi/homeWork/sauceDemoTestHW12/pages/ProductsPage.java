package svetlanaKussi.homeWork.sauceDemoTestHW12.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {
    public WebDriver driver;
    public String addToCartButtonID = "add-to-cart-sauce-labs-backpack";
    public String removeFromCartButtonID = "remove-sauce-labs-backpack";


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

}
