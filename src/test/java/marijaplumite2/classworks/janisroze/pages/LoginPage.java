package marijaplumite2.classworks.janisroze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;

    private WebDriverWait wait;

    private String lietotajaProfilsItemId = "//ul[@class='account-dropdown long']";

    private String ielogotiesItemId = "//a[contains(text(), 'Ielogoties')]";

    private String epastsFieldId = "email";

    private String paroleFieldId = "pass";

    private String ielogotiesButtonId = "send2";

    public LoginPage(WebDriver driver, WebDriverWait wait){
        this.driver=driver;
        this.wait = wait;
    }
     public void login(String email, String password) {

        WebElement lietotajaProfilsItem = driver.findElement(By.xpath(lietotajaProfilsItemId));

        Actions actions = new Actions(driver);
        actions.moveToElement(lietotajaProfilsItem).build().perform();


        WebElement ielogotiesItem = driver.findElement(By.xpath(ielogotiesItemId));
        wait.until(ExpectedConditions.elementToBeClickable(ielogotiesItem));
        ielogotiesItem.click();

        WebElement epastsField = driver.findElement(By.id(epastsFieldId));
        epastsField.sendKeys(email);

        WebElement paroleField = driver.findElement(By.id(paroleFieldId));
        paroleField.sendKeys(password);

        WebElement ielogotiesButton = driver.findElement(By.id(ielogotiesButtonId));
        ielogotiesButton.click();


    }
}
