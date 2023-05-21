package irinaver.homework.sauceDemoNew.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutStepPage {
    private WebDriver driver;
    private String CheckOutButtonId = "checkout";
    private String firstNameFieldId = "first-name";
    private String lastNameFieldId = "last-name";
    private String postCodeFieldId = "postal-code";
    private String continueButtonId = "continue";
    private String finishButtonId = "finish";
    private String backHomeButtonId = "back-to-products";
    private String burgerMenuIconId = "react-burger-menu-btn";
    private String cancelButtonId =  "cancel";

    public CheckOutStepPage(WebDriver driver){
        this.driver = driver;

    }
    public void checkOutInfo(String firstName, String lastName, String postCode){

        WebElement myName = driver.findElement(By.id(firstNameFieldId));
        WebElement myLastName = driver.findElement(By.id(lastNameFieldId));
        WebElement myCode = driver.findElement(By.id(postCodeFieldId));

        myName.sendKeys(firstName);
        myLastName.sendKeys(lastName);
        myCode.sendKeys(postCode);

    }
    public void continuePurchase(){
        WebElement continueButton = driver.findElement(By.id(continueButtonId));
        continueButton.click();
    }
    public Boolean isFinishButtonAvailable(){
        WebElement finishButton = driver.findElement(By.id(finishButtonId));
        if(finishButton.isDisplayed()) return true;
        else return false;
    }
    public void finishPurchase(){
        WebElement finishButton = driver.findElement(By.id(finishButtonId));
        finishButton.click();
    }
    public void cancelOption(){
        WebElement cancelButton = driver.findElement(By.id(cancelButtonId));
        cancelButton.click();
    }
    public Boolean isBackHomeButtonDisplayed(){
        WebElement backHomeButton = driver.findElement(By.id(backHomeButtonId));
        if (backHomeButton.isDisplayed()) return true;
        else return false;
    }
    public void backHome(){
        WebElement backHomeButton = driver.findElement(By.id(backHomeButtonId));
        backHomeButton.click();
    }
    public Boolean isInventoryPageOpen(){
        WebElement burgerMenuIcon =driver.findElement(By.id(burgerMenuIconId));
        if (burgerMenuIcon.isDisplayed()) return true;
        else return false;
    }
 }
