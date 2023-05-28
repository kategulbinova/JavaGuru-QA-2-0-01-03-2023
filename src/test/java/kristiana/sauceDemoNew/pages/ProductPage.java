package kristiana.sauceDemoNew.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {    private WebDriver driver;

    private String tShirtButtonID = "item_1_title_link";
    private String backToProductsLinkID = "back-to-products";

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkLinkToTProductPage () {
        WebElement tShirtButton = driver.findElement(By.id(tShirtButtonID));
        tShirtButton.click();
    }

    public boolean isOpenProductPage () {
        WebElement backToProductsLink = driver.findElement(By.id(backToProductsLinkID));

        if (backToProductsLink.isDisplayed()) return true;
        else return false;
    }
}
