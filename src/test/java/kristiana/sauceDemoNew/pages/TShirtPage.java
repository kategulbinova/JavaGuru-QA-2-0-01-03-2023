package kristiana.sauceDemoNew.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TShirtPage {    private WebDriver driver;

    private String tShirtButtonID = "item_1_title_link";
    private String backToProductsButtonID = "back-to-products";

    public TShirtPage (WebDriver driver) {
        this.driver = driver;
    }

    public void checkLinkToTShirtPage () {
        WebElement tShirtButton = driver.findElement(By.id(tShirtButtonID));
        tShirtButton.click();
    }

    public boolean isOpenTshirtPage () {
        WebElement backToProductsButton = driver.findElement(By.id(backToProductsButtonID));

        if (backToProductsButton.isDisplayed()) return true;
        else return false;
    }
}
