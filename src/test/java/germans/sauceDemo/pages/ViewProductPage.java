package germans.sauceDemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewProductPage {
    private WebDriver driver; // null

    private String FleeceJacketXpath = "//*[@id='item_5_title_link']/div";
    private String  backToProductsXpath = "//*[@id='back-to-products']";
    private String sortingOptionsXpath = "//*[@id='header_container']/div[2]/div/span/select";

    public ViewProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void FleeceJacketClick () {
        WebElement FleeceJacket = driver.findElement(By.xpath(FleeceJacketXpath));


        FleeceJacket.click();
    }

    public void backToProductsClick () {
        WebElement backToProducts = driver.findElement(By.xpath(backToProductsXpath));

        backToProducts.click();
    }

    public boolean isAllProductPageOpened() {
        WebElement sortingOptions = driver.findElement(By.xpath(sortingOptionsXpath));
        if ( sortingOptions.isDisplayed() )  return true;
        else return false;
    }
}

