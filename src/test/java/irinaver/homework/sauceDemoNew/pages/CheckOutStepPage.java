package irinaver.homework.sauceDemoNew.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static irinaver.homework.sauceDemoNew.utils.DriverProvider.getCurrentDriver;
public class CheckOutStepPage {

    private String CheckOutButtonId = "checkout";
    private String firstNameFieldId = "first-name";
    private String lastNameFieldId = "last-name";
    private String postCodeFieldId = "postal-code";
    private String continueButtonId = "continue";
    private String finishButtonId = "finish";
    private String backHomeButtonId = "back-to-products";
    private String burgerMenuIconId = "react-burger-menu-btn";
    private String cancelButtonId =  "cancel";


    public void checkOutInfo(String firstName, String lastName, String postCode){

        WebElement myName = getCurrentDriver().findElement(By.id(firstNameFieldId));
        WebElement myLastName = getCurrentDriver().findElement(By.id(lastNameFieldId));
        WebElement myCode = getCurrentDriver().findElement(By.id(postCodeFieldId));

        myName.sendKeys(firstName);
        myLastName.sendKeys(lastName);
        myCode.sendKeys(postCode);
    }
    public void continuePurchase(){
        WebElement continueButton = getCurrentDriver().findElement(By.id(continueButtonId));
        continueButton.click();
    }
    public Boolean isFinishButtonAvailable(){
        WebElement finishButton = getCurrentDriver().findElement(By.id(finishButtonId));
        if(finishButton.isDisplayed()) return true;
        else return false;
    }
    public void finishPurchase(){
        WebElement finishButton = getCurrentDriver().findElement(By.id(finishButtonId));
        finishButton.click();
    }
    public void cancelOption(){
        WebElement cancelButton = getCurrentDriver().findElement(By.id(cancelButtonId));
        cancelButton.click();
    }
    public Boolean isBackHomeButtonDisplayed(){
        WebElement backHomeButton = getCurrentDriver().findElement(By.id(backHomeButtonId));
        if (backHomeButton.isDisplayed()) return true;
        else return false;
    }
    public void backHome(){
        WebElement backHomeButton = getCurrentDriver().findElement(By.id(backHomeButtonId));
        backHomeButton.click();
    }
    public Boolean isInventoryPageOpen(){
        WebElement burgerMenuIcon =getCurrentDriver().findElement(By.id(burgerMenuIconId));
        if (burgerMenuIcon.isDisplayed()) return true;
        else return false;
    }
 }
