package natuksa.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutStepOnePage {
    private WebDriver driver;
    private String firstNameFieldId = "first-name";
    private String lastNameFieldId = "last-name";
    private String postalCodeFieldId = "postal-code";
    private String continueButtonId = "continue";

    public CheckoutStepOnePage(WebDriver driver) {this.driver = driver;}

    public void fillDataAndContinue(String firstName, String lastName, String postalCode) {
        WebElement firstNameField = driver.findElement(By.id(firstNameFieldId));
        WebElement lastNameField = driver.findElement(By.id(lastNameFieldId));
        WebElement postalCodeField = driver.findElement(By.id(postalCodeFieldId));
        WebElement continueButton = driver.findElement(By.id(continueButtonId));

        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        postalCodeField.sendKeys(postalCode);
        continueButton.click();
    }
}
