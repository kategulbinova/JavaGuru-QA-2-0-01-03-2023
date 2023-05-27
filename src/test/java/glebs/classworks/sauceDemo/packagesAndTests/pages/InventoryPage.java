package glebs.classworks.sauceDemo.packagesAndTests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {
    private WebDriver driver;

    private String brugerMenuIconId="react-burger-menu-btn";
    private String tshirtImageId="item_1_title_link";

    private String addToCartButtonId="add-to-cart-sauce-labs-fleece-jacket";

    private String cartButtonId="shopping_cart_container";

    public InventoryPage(WebDriver driver){
        this.driver=driver;
    }
    public Boolean isOpen(){
        WebElement burgerMenuIcon=driver.findElement(By.id(brugerMenuIconId));

        if(burgerMenuIcon.isDisplayed()) return true;
        else return false;
    }
    public void shirtClickCheck() {
        WebElement sirtImage = driver.findElement(By.id(tshirtImageId));
        sirtImage.click();
    }
    public void fleeceJacketAddToCartButton(){
        WebElement addToCartButton=driver.findElement(By.id(addToCartButtonId));
        addToCartButton.click();
    }
    public void yourCartButton(){
        WebElement cartButton=driver.findElement(By.id(cartButtonId));
        cartButton.click();
    }
}
