package glebs.classworks.sauceDemo.packagesAndTests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourCartPage {
    private WebDriver driver;
    private String removeButtonTestId="remove-sauce-labs-fleece-jacket";
    private String checkoutButtonId="checkout";

    public YourCartPage(WebDriver driver){
        this.driver=driver;
    }
    public boolean isActuallyOpen(){
        WebElement removeButtonTest=driver.findElement(By.id(removeButtonTestId));
        if(removeButtonTest.isDisplayed()) return true;
        else return false;
    }
    public void checkoutButton(){
        WebElement checkoutButton=driver.findElement(By.id(checkoutButtonId));
        checkoutButton.click();
    }
}
