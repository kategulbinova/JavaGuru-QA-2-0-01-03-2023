package teacher.testing.aliExpressTestingPOM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private final WebDriver driver;

    @FindBy(id = "search-key")
    private WebElement searchField;
    @FindBy(className="search-button")
    private WebElement searchButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void searchForText(String searchText) {
        searchField.sendKeys(searchText);
        searchButton.click();
    }

    public void searchDefault() {
        searchButton.click();
    }

    public String getSearchFieldText() {
        return searchField.getAttribute("placeholder");
    }
}
