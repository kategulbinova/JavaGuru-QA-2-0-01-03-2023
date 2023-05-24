package marijaplumite2.classworks.janisroze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilsPage {
    private WebDriver driver;

    private String profilsItemId = "//div[@class='block block-account']";

    public ProfilsPage(WebDriver driver){
        this.driver=driver;
    }
    public boolean isOpen(){
        WebElement profilsItem = driver.findElement(By.xpath(profilsItemId));
        if (profilsItem.isDisplayed()) return true;
        else return false;
    }
}
