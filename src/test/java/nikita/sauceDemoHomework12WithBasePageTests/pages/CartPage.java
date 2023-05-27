package nikita.sauceDemoHomework12WithBasePageTests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {
    //private WebDriver driver; // null

    private String checkoutPageId = "checkout";

    private String continueShoppingBtnId = "continue-shopping";


    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void continueShopping () {
        WebElement continueShoppingBtn = driver.findElement(By.id(continueShoppingBtnId));
        continueShoppingBtn.click();
    }

    public void checkoutPageMove () {
        WebElement checkoutPageBtn = driver.findElement(By.id(checkoutPageId));
        checkoutPageBtn.click();
    }

}
