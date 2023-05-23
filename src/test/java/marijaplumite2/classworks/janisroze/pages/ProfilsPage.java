package marijaplumite2.classworks.janisroze.pages;

import org.openqa.selenium.WebDriver;

public class ProfilsPage {
    private WebDriver driver;

    public ProfilsPage(WebDriver driver){
        this.driver=driver;
    }
    public boolean isOpen(){
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("customer/account")) return true;
        else return false;
    }
}
