package yanaItani.sauseDemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private String checkoutId = "checkout";
    private String firstNameID = "first-name";
    private String lastNameID = "last-name";
    private String zipID = "postal-code";
    private String continueID = "continue";
    private String finishID = "finish";

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkOut() {
        WebElement checkout = driver.findElement(By.id(checkoutId));
        checkout.click();
        WebElement firstName = driver.findElement(By.id(firstNameID));
        firstName.sendKeys("Yana");
        WebElement lastName = driver.findElement(By.id(lastNameID));
        lastName.sendKeys("Itani");
        WebElement zip = driver.findElement(By.id(zipID));
        zip.sendKeys("12345");
        WebElement continuee = driver.findElement(By.id(continueID));
        continuee.click();
        WebElement finish = driver.findElement(By.id(finishID));
        finish.click();
    }


        public Boolean checkoutSuccess() {
            WebElement checkoutcompleteText = driver.findElement(By.id("checkout_complete_container"));

            if(checkoutcompleteText.isDisplayed() ) return true;

            else return false;

    }



}
