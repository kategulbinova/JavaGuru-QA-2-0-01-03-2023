package marijaplumite2.classworks.janisroze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ChangeDetailsPage {
    private WebDriver driver;


    private String changeProfileInfoBtnId = "//a[text()='Mainit profila iestatijumus']";




    public ChangeDetailsPage(WebDriver driver){
        this.driver=driver;

    }

    public void changeProfileInfo(){
        WebElement mainitProfilaIestatBtn = driver.findElement(By.xpath(changeProfileInfoBtnId));
        mainitProfilaIestatBtn.click();
    }
    public boolean isOpen(){
     String currentUrl = driver.getCurrentUrl();
       if (currentUrl.contains("account/edit/")) return true;
       else return false;
    }

}
