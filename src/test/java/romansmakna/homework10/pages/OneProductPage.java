package romansmakna.homework10.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OneProductPage {
    private WebDriver driver;

    private String backpackTitleBtnID = "item_4_title_link";
    private String backToProductBtnID = "back-to-products";

    public OneProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkLinkToProductPage () {
        WebElement backpackTitleBtn = driver.findElement(By.id(backpackTitleBtnID));
        backpackTitleBtn.click();

    }

    public boolean isOpenProductPage () {
        WebElement backToProductBtn = driver.findElement(By.id(backToProductBtnID));

        if (backToProductBtn.isDisplayed()) return true;
        else return false;
    }
}
