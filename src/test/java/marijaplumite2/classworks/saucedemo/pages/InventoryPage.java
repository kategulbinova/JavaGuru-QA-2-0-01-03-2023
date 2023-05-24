package marijaplumite2.classworks.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {
    private WebDriver driver; //null

    private String burgerMenuIconId = "react-burger-menu-btn";

    private String prodItemId = "item_4_img_link";

    public InventoryPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean isOpen(){
        WebElement burgerMenuIcon = driver.findElement(By.id(burgerMenuIconId));

        if ( burgerMenuIcon.isDisplayed() ) return true;
        else return false;
    }

    public void selectProd(){
        WebElement prodItem = driver.findElement(By.id(prodItemId));
        prodItem.click();
    }

    public void burgerMenuButtonClick(){

        WebElement burgerMenuButton = driver.findElement(By.id(burgerMenuIconId));
        burgerMenuButton.click();
    }
}
