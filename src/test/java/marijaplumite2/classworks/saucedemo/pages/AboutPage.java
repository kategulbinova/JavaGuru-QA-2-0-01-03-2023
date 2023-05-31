package marijaplumite2.classworks.saucedemo.pages;

import org.openqa.selenium.WebDriver;

public class AboutPage {
    private WebDriver driver;


    public AboutPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean isOpen(){
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("saucelabs")) return true;
        else return false;
    }
}
