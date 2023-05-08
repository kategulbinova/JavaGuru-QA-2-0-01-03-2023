package irinav.homework.loginTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class AliExpressSearchForGoodsTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String searchString = "blouse";
        //getting the website
        driver.get("https://www.aliexpress.com");

        //adjusting the screen
        driver.manage().window().setSize(new Dimension(1536, 816));

        //searching for goods
        WebElement searchField = driver.findElement(By.id("search-key"));
        searchField.sendKeys(searchString);
        searchField.submit();

        //pressing search button
       // WebElement searchButton= driver.findElement(By.className("search-button"));
       // searchButton.click();

        //list of links
        List<WebElement> foundItemsLinks = driver.findElements
               (By.xpath("//a[@class='manhattan--container--1lP57Ag cards--gallery--2o6yJVt']"));
        System.out.println("Size of my first list is: " + foundItemsLinks.size());

        System.out.println();

       //finding CSS property using getCSSValue
        String fontSize = driver.findElement(By.className("breadcrumb--title--2AjaUyc")).getCssValue("font-size");
        System.out.println("Font size is:  " + fontSize);

        System.out.println();

       //finding the size of the element
        WebElement getButtonSize = driver.findElement(By.xpath("//*[@id=\"form-searchbar\"]/div[1]/input"));
        Dimension image = getButtonSize.getSize();

       System.out.println("The size of the button is: " + getButtonSize.getSize());
       System.out.println("The height of the search button is : " + image.getHeight() + "px.");
       System.out.println("The width of the search button is : " + image.getWidth() + "px.");

       System.out.println();

       //  getting the tag name, attribute and location of the search field box

       WebElement searchKeyBox = driver.findElement(By.xpath("//div[@class='search-key-box']"));
       System.out.println("The tag name of the search field is : " + searchKeyBox.getTagName() + ".");
       System.out.println("The value of the search field is: " + searchKeyBox.getAttribute("class") + ".");

       System.out.println();

       Point location = searchKeyBox.getLocation();
       System.out.println("The location of the search field is : " + searchKeyBox.getLocation() + ".");
       System.out.println("The x location of the search field is: " + location.getX() + ".");
       System.out.println("The y location of the search field is: " + location.getY() + ".");

       System.out.println();

        List<String> listOfFoundLinks = new ArrayList<String>();
        for (WebElement findings : foundItemsLinks) {
           String myLinks = findings.getAttribute("href");

       listOfFoundLinks.add(myLinks);
       System.out.println(listOfFoundLinks);
       }
        driver.quit();
   }
 }



