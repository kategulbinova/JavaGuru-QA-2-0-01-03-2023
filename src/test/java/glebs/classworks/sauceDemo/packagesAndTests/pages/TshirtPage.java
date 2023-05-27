package glebs.classworks.sauceDemo.packagesAndTests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class TshirtPage {
    private WebDriver driver;

    private String addToCartButton="add-to-cart-sauce-labs-bolt-t-shirt";
    private String removeFromCartButton="remove-sauce-labs-bolt-t-shirt";

    public TshirtPage(WebDriver driver){
        this.driver=driver;
    }
    public void addToCartTshirt(){
        WebElement addToCart=driver.findElement(By.id(addToCartButton));
        addToCart.click();
    }
    public boolean isPressed(){
        WebElement removeButton=driver.findElement(By.id(removeFromCartButton));
        if(removeButton.isDisplayed())return true;
        else return false;
    }
}
