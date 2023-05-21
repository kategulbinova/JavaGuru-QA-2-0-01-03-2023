package natuksa.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutStepTwoPage {
    private WebDriver driver;
    private String finishButtonId = "finish";

    public CheckoutStepTwoPage(WebDriver driver) {this.driver = driver;}

    public void finishOrder() {
        WebElement finishButton = driver.findElement(By.id(finishButtonId));

        finishButton.click();
    }
}
