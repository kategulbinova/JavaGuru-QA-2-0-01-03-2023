package marijaplumite2.classworks.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AboutPage {
    private WebDriver driver;

    private WebDriverWait wait;
    private String aboutButtonId = "about_sidebar_link";



    public AboutPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }
    public void aboutLinkCheck() {
        WebElement aboutButton = driver.findElement(By.id(aboutButtonId));

        wait.until(ExpectedConditions.elementToBeClickable(aboutButton));
        aboutButton.click();

    }

    public boolean isOpen(){
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("saucelabs")) return true;
        else return false;
    }
}
