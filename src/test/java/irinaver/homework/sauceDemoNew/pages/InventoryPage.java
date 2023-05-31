package irinaver.homework.sauceDemoNew.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static irinaver.homework.sauceDemoNew.utils.DriverProvider.getCurrentDriver;

public class InventoryPage {

    private String burgerMenuIconId = "react-burger-menu-btn";
    private String productSortContainerXPath = "//*[@id='header_container']/div[2]/div/span/select";
    private String productSortContainerOptionXPath = "//*[@id='header_container']/div[2]/div/span/select/option[2]";
    private  String backPackAddBtnId = "add-to-cart-sauce-labs-backpack";
    private String removeBackPackFromCartId = "remove-sauce-labs-backpack";
    private String addJacketToCartId = "add-to-cart-sauce-labs-fleece-jacket";
    private String addOnesieToCartId = "add-to-cart-sauce-labs-onesie";
    private String shoppingCartId = "shopping_cart_container";

    public Boolean isOpen(){
        WebElement burgerMenuIcon = getCurrentDriver().findElement(By.id(burgerMenuIconId));
        if(burgerMenuIcon.isDisplayed()) return true;
        else return false;
    }
    public void shoppingCartOpen(){
        WebElement shoppingCart = getCurrentDriver().findElement(By.id(shoppingCartId));
        shoppingCart.click();
    }
    public void sortItemsContainer(){
        WebElement productSortContainer = getCurrentDriver().findElement(By.xpath(productSortContainerXPath));
        productSortContainer.click();
    }
    public void sortingItems(){
        WebElement productSortContainerOption = getCurrentDriver().findElement(By.xpath(productSortContainerOptionXPath));
        productSortContainerOption.click();
    }
    public Boolean isSortedItemDisplayed(){
        WebElement productSortContainerOption =getCurrentDriver().findElement(By.xpath(productSortContainerOptionXPath));
        if(productSortContainerOption.isDisplayed()) return true;
        else return false;
    }
    public void addBackPackToCart(){
        WebElement backPackAddBtn = getCurrentDriver().findElement(By.id(backPackAddBtnId));
        backPackAddBtn.click();
    }
    public void removeBackPackFromCart (){
        WebElement removeBackPackFromCart = getCurrentDriver().findElement(By.id(removeBackPackFromCartId));
        removeBackPackFromCart.click();
    }
    public void addJacketToCart (){
        WebElement addJacketToCart = getCurrentDriver().findElement(By.id(addJacketToCartId));
        addJacketToCart.click();
    }
    public void addOnesieToCart (){
        WebElement addOnesieToCart = getCurrentDriver().findElement(By.id(addOnesieToCartId));
        addOnesieToCart.click();
    }
}
