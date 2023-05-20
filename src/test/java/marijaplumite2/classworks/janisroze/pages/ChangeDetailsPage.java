package marijaplumite2.classworks.janisroze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChangeDetailsPage {
    private WebDriver driver;

    private WebDriverWait wait;

    private String changeProfileInfoBtnId = "//a[text()='Mainit profila iestatijumus']";

    private String lastNameFieldId = "lastname";

    private String lastNameBeforeId = "//div[@class='col-1']//div[@class='box-content']";

    private String lastNameAfterId = "//div[@class='col-1']//div[@class='box-content']";
    private String saglabatButtonId = "button update-info-submit";




    public ChangeDetailsPage(WebDriver driver, WebDriverWait wait){
        this.driver=driver;
        this.wait = wait;
    }

    public void changeProfileInfo(){
        WebElement lastNameBefore = driver.findElement(By.xpath(lastNameBeforeId));
        String lastNameBeforeChange = lastNameBefore.getText();
        WebElement mainitProfilaIestatBtn = driver.findElement(By.xpath(changeProfileInfoBtnId));
        mainitProfilaIestatBtn.click();
    }
    public boolean isOpen(){
     String currentUrl = driver.getCurrentUrl();
       if (currentUrl.contains("account/edit/")) return true;
       else return false;
    }

}
