package lpudnika.homework12.homework1SauceDemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpenSauceLabsBackpackProductPage {

    //save driver and element locators as object fields of type String
    private WebDriver driver;

    //defining ID of the Sauce Labs Backpack
    private String sauceLabsBackpackId = "item_4_title_link";

    //defining ID of the button "Back to products"
    private String backToProductsButtonId = "back-to-products";

    //initialize WebDriver in constructor
    public OpenSauceLabsBackpackProductPage(WebDriver driver){
        this.driver = driver;
    }

    //Open the product
    public void openProduct() {
        WebElement sauceLabsBackpack = driver.findElement(By.id(sauceLabsBackpackId));
        sauceLabsBackpack.click();
    }

    //Check whether product page is opened
    public boolean isOpen(){
        WebElement backToProductsButton = driver.findElement(By.id(backToProductsButtonId));
        if ( backToProductsButton.isDisplayed() ) return true;
        else return false;
    }
}
