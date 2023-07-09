package romansmakna.homework10.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {
    private WebDriver driver;
    private String burgerMenuIconID = "react-burger-menu-btn";

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isOpenPage() {
        WebElement burgerMenuIcon = driver.findElement(By.id(burgerMenuIconID));

        if (burgerMenuIcon.isDisplayed()) return true;
        else return false;



    }
}


