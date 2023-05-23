package teacher.sauceDemo.pages;

import org.openqa.selenium.WebDriver;

public class ViewProductPage {
    WebDriver driver;

    String burgerMenuIconId = "react-burger-menu-btn";
    String backToProductsLinkId = "back-to-products";
    String shoppinCartIconId = "shopping_cart_container";
    String pageTitleXpath = "div[class='app_logo']";
    String itemImageXpath = "div[class='inventory_details_img_container']";
    String itemTitleXpath = "div[class='inventory_details_name large_size']";
    String itemDescriptionXpath = "div[class='inventory_details_desc large_size']";
    String itemPriceXpath = "div[class='inventory_details_price']";
    String itemAddToCartButtonId = "add-to-cart-sauce-labs-bike-light";
    String itemRemoveFromCartButtonId = "remove-sauce-labs-bike-light";
    String numberOfItemsInTheCartXpath = "span[class='shopping_cart_badge']";

    public void logout() {}
    public void goToCart() {}
    public void goToInventory() {}
    public void addItemToCart(){}
    public void removeItemFromCart() {}
    public Boolean itemTitleAsExpected(String expectedTitle) {return true;}
    public Boolean itemDescriptionAsExpected(String expectedDescription) {return true;}
    public Boolean itemPriceAsExpected(Double expectedPrice) {return true; }
    public Double getItemPrice() {return 0.0; }
    public String getItemTitle() {return "";}
    public Boolean isAddedToCart() { return false; }


}
