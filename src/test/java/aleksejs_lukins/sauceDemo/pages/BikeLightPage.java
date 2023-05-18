package aleksejs_lukins.sauceDemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BikeLightPage {
    private WebDriver driver; // null

    private String bikeLightXpath = "//*[@id='item_0_title_link']/div";
    private String  backToProductsXpath = "//*[@id=\"back-to-products\"]";
    private String backpackXpath = "//*[@id='item_4_title_link']/div";

    public BikeLightPage(WebDriver driver) {
        this.driver = driver;
    }

    public void bikeLightClick () {
        // Initialize all necessary elements
        WebElement bikeLight = driver.findElement(By.xpath(bikeLightXpath));

        // clicking to bike light
        bikeLight.click();

    }

    public void backToProductsClick () {
        WebElement backToProducts = driver.findElement(By.xpath(backToProductsXpath));
        // clicking back to other products
        backToProducts.click();

    }

    // assertion to see if we see other product in store
    public boolean isOpen() {
        WebElement burgerMenuIcon = driver.findElement(By.xpath(backpackXpath));

        if ( burgerMenuIcon.isDisplayed() )  return true;
        else return false;
    }
}
