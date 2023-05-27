package nikita.JanisRozeHomework12Tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProfilePage {
    private WebDriver driver; // null

    private String userProfileIconXpath = "//a[@class='link']//span[@class='icon ic ic-user']";

    private String loginPageBtnXpath = "//a[@title='Ielogoties']";

    private String logoutBtnXpath = "//a[@title='Izlogoties']";

    private String profileInfoPageXpath = "//li/a[@href='https://www.janisroze.lv/lv/customer/account/edit/']";

    private String nameSurnameTextXpath = "//p[@class='hello']//strong";


    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    public Boolean isOpen() {
       WebElement profileInfoPageOpen = driver.findElement(By.xpath(profileInfoPageXpath));
       if (profileInfoPageOpen.isDisplayed()) return true;
       else return false;

    }

    public void logout() {
        Actions actions = new Actions(driver);
        WebElement userProfileIcon = driver.findElement(By.xpath(userProfileIconXpath));
        actions.moveToElement(userProfileIcon).build().perform();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(logoutBtnXpath)));
        WebElement logoutBtn = driver.findElement(By.xpath(logoutBtnXpath));
        logoutBtn.click();
    }

    public String getNameSurname() {
        WebElement nameSurnameText = driver.findElement(By.xpath(nameSurnameTextXpath));
        return nameSurnameText.getText();

    }

}
