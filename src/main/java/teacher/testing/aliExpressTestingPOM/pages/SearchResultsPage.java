package teacher.testing.aliExpressTestingPOM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class SearchResultsPage {
    private final WebDriver driver;

    @FindBy(className = "comet-breadcrumb-link")
    private WebElement breadcrumbLink;

    @FindBy(xpath = "//a[@class='manhattan--container--1lP57Ag cards--gallery--2o6yJVt']")
    private List<WebElement> foundLinks;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public int getNumberOfLinksFound() {
        return this.foundLinks.size();
    }

    public void printFoundLinks() {
        for (WebElement link: foundLinks) {
            System.out.println(link.getAttribute("href"));
        }
    }

    public String getBreadcrumbText() {
        return breadcrumbLink.getText();
    }

}
