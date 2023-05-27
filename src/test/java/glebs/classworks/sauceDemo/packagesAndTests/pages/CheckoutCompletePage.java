package glebs.classworks.sauceDemo.packagesAndTests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutCompletePage {
    private WebDriver driver;
    private String backHomeButtonId="back-to-products";
    public CheckoutCompletePage(WebDriver driver){
        this.driver=driver;
    }
    public Boolean isFinished(){
        WebElement backHomeButton=driver.findElement(By.id(backHomeButtonId));

        if(backHomeButton.isDisplayed()) return true;
        else return false;
    }
}
