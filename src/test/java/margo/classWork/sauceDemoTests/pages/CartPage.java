package margo.classWork.sauceDemoTests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    private WebDriver driver;
    private String checkoutBtnId = "checkout";
    private String yourCartTitle = "//span[contains(@class,'title')]";
    private String expectedYourCartTitle = "Your Cart";
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public Boolean isCheckoutBtnPresent() {
        WebElement checkoutBtn = driver.findElement(By.id(checkoutBtnId));
        if (checkoutBtn.isDisplayed()) return true;
        else return false;
    }
    public void checkoutBtnClick() {
        WebElement checkoutBtn = driver.findElement(By.id(checkoutBtnId));
        checkoutBtn.click();
    }
    public Boolean isYourCartPresent() {
        String yourCart = driver.findElement(By.xpath(yourCartTitle)).getText();
        if(expectedYourCartTitle.equalsIgnoreCase(yourCart)) return true;
        else return false;
    }
}
