package glebs.classworks.sauceDemo.packagesAndTests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOverviewPage {
    private WebDriver driver;
    private String finishButtonId="finish";
    public CheckoutOverviewPage(WebDriver driver){
        this.driver=driver;
    }

    public void finishButton(){
        WebElement finishButton=driver.findElement(By.id(finishButtonId));
        finishButton.click();
    }
}
