package marijaplumite2.classworks.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewProductPage {
    private WebDriver driver;

    private String prodItemId = "item_4_img_link";

    private String backToProdBtnId = "back-to-products";

    public ViewProductPage(WebDriver driver){
        this.driver = driver;
    }
    public void selectProd(){
        WebElement prodItem = driver.findElement(By.id(prodItemId));
        prodItem.click();
    }
    public boolean isOpen(){
        WebElement backToProdBtn = driver.findElement(By.id(backToProdBtnId));

        if ( backToProdBtn.isDisplayed() ) return true;
        else return false;
    }
}
