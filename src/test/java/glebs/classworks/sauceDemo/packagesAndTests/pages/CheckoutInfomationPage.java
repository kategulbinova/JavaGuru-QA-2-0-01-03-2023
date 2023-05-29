package glebs.classworks.sauceDemo.packagesAndTests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutInfomationPage {
    private WebDriver driver;
    private String firstNameId="first-name";
    private String lastNameId="last-name";
    private String postalCodeId="postal-code";
    private String continueButtonId="continue";
    public CheckoutInfomationPage(WebDriver driver){
        this.driver=driver;
    }

    public void sendDetails(String name,String lName,String zipCode){
        WebElement firstName=driver.findElement(By.id(firstNameId));
        WebElement lastName=driver.findElement(By.id(lastNameId));
        WebElement postalCode=driver.findElement(By.id(postalCodeId));
        WebElement continueButton=driver.findElement(By.id(continueButtonId));

        firstName.sendKeys(name);
        lastName.sendKeys(lName);
        postalCode.sendKeys(zipCode);
        continueButton.click();
    }
}
