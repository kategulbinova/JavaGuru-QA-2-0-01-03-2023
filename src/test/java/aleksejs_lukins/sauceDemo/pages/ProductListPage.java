package aleksejs_lukins.sauceDemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductListPage {
    private WebDriver driver; // null

    private String bikeLightXpath = "//*[@id='item_0_title_link']/div";
    private String  backToProductsXpath = "//*[@id='back-to-products']";
    private String sortingOptionsXpath = "//*[@id='header_container']/div[2]/div/span/select";

    public ProductListPage(WebDriver driver) {
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

    // assertion to see if we see product sorting option on all product list
    public boolean isAllProductPageOpened() {
        WebElement sortingOptions = driver.findElement(By.xpath(sortingOptionsXpath));
        if ( sortingOptions.isDisplayed() )  return true;
        else return false;
    }
}
