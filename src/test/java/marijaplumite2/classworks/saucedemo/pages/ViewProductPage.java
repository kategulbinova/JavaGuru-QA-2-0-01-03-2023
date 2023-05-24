package marijaplumite2.classworks.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewProductPage {
    private WebDriver driver;
        private String backToProdBtnId = "back-to-products";

    public ViewProductPage(WebDriver driver){
        this.driver = driver;
    }
    public boolean isOpen(){
        WebElement backToProdBtn = driver.findElement(By.id(backToProdBtnId));

        if ( backToProdBtn.isDisplayed() ) return true;
        else return false;
    }
}
