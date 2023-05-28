package margo.classWork.sauceDemoTests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
    private WebDriver driver;
    private String bikeLightImg = "//img[@alt='Sauce Labs Bike Light']";
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void chooseBikeLight() {
        //Initialized element
        WebElement bikeLightItem = driver.findElement(By.xpath(bikeLightImg));

        //Choose specific item from all products
        bikeLightItem.click();
    }
    public Boolean isPresent() {
        WebElement backToProducts = driver.findElement(By.xpath("//button[@class='btn btn_secondary back btn_large inventory_details_back_button']"));
        if (backToProducts.isDisplayed()) return true;
        else return false;
    }
}
