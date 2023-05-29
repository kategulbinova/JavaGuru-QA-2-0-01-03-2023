package nikita.sauceDemoHomework12WithBasePageTests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutInfoPage extends BasePage {
    //private WebDriver driver; // null

    private String continueBtnId = "continue";

    public CheckoutInfoPage(WebDriver driver) {
        super(driver);
    }

    public void ContinueBtnClick() {
        WebElement continueBtn = driver.findElement(By.id(continueBtnId));
        continueBtn.click();

    }

    public Boolean isOpenByURL() {

        if (driver.getCurrentUrl().contains("checkout-step-one")) return true;
        else return false;
    }

}

