package teacher.sauceDemoNew.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static teacher.sauceDemoNew.utils.DriverProvider.getCurrentDriver;

public class InventoryPage {
    private String burgerMenuIconId = "react-burger-menu-btn";

    public Boolean isOpen() {
        WebElement burgerMenuIcon = getCurrentDriver().findElement(By.id(burgerMenuIconId));

        if ( burgerMenuIcon.isDisplayed() )  return true;
        else return false;
    }

}
