package margo.classWork.sauceDemoTests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutYrInfoPage {
    private WebDriver driver;
    private String checkoutBtnId = "checkout";
    private String firstNameFieldId = "first-name";
    private String lastNameFieldId = "last-name";
    private String continueBtnId = "continue";
    private String expectedLastNameErrorTxt = "Error: Last Name is required";
    private String cancelBtnId = "cancel";
    public CheckoutYrInfoPage(WebDriver driver) {
        this.driver = driver;
    }
    public void checkoutBtnPress() {
        WebElement checkoutBtn = driver.findElement(By.id(checkoutBtnId));
        checkoutBtn.click();
    }
    public void checkoutProcess() {
        //Initialized elements
        WebElement firstNameField = driver.findElement(By.id(firstNameFieldId));
        WebElement lastNameField = driver.findElement(By.id(lastNameFieldId));
        WebElement continueBtn = driver.findElement(By.id(continueBtnId));

        //Perform checkout process
        firstNameField.sendKeys("Pepper");
        lastNameField.sendKeys("");
        continueBtn.click();
    }
    public void getErrorTextAndCancel() {
        String lastNameError = driver.findElement(By.xpath("//div/h3[@data-test='error']")).getText();
        if (expectedLastNameErrorTxt.equalsIgnoreCase(lastNameError)) {
            System.out.println("Cannot proceed to checkout. " + lastNameError);
            WebElement cancelBtn = driver.findElement(By.id(cancelBtnId));
            cancelBtn.click();
        }
    }
}
