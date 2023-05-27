package nikita.sauceDemoHomework12WithBasePageTests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InventoryPage extends BasePage {
    //private WebDriver driver; // null

    private String addToCartAllBtnsXpath = "//button[@class='btn btn_primary btn_small btn_inventory']";


    public InventoryPage(WebDriver driver) {
        super(driver);
    }


    public Boolean isOpenByURL() {

        if ( driver.getCurrentUrl().contains("inventory") )  return true;
        else return false;
    }

    public void addAllItemsToCart() {
        List<WebElement> addToCartAllBtns = driver.findElements(By.xpath(addToCartAllBtnsXpath));
        for (WebElement link : addToCartAllBtns) {
            link.click();
        }
    }



}
