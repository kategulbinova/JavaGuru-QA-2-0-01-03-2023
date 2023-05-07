package irinav.homework.loginTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static java.lang.Thread.sleep;

public class FindElementsAliExpressBlouse {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String blouse;
        //getting the website
        driver.get("https://www.aliexpress.com");

        //adjusting the screen
        driver.manage().window().setSize(new Dimension(1536, 816));

        //searching for goods
        WebElement searchField = driver.findElement(By.id("search-key"));
        searchField.sendKeys("blouse");

        //pressing search button
        WebElement blouseSearch = driver.findElement(By.className("search-button"));
        blouseSearch.click();

        //list of links
        List<WebElement> foundBlouseLinks = driver.findElements
                (By.xpath("//a[@class='manhattan--container--1lP57Ag cards--gallery--2o6yJVt']"));
        System.out.println("Size of my first list is: " + foundBlouseLinks.size());

        System.out.println();

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Size of my second list is  "+links.size());

       //this part of the code works all right, but as it prints out an enormous amount of the text I've slashed it.
       // int i= links.size();
       // for (WebElement link : links) {
       //     System.out.println(link.getText());
       // }

       System.out.println();

       //finding CSS property using getCSSValue
       String fontSize = driver.findElement(By.className("breadcrumb--title--2AjaUyc")).getCssValue("font-size");
       System.out.println("Font size is:  " + fontSize);

       System.out.println();

       //finding the size of the element
       WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"form-searchbar\"]/div[1]/input"));
       Dimension image = searchButton.getSize();

       System.out.println("The size of the button is: " + searchButton.getSize());
       System.out.println("The height of the search button is : " + image.getHeight() + "px.");
       System.out.println("The width of the search button is : " + image.getWidth() + "px.");

       System.out.println();

       //returning a boolean value indicating whether the search button is enabled;
       boolean isEnabled;

       boolean pressButton = driver.findElement(By.className("search-button")).isEnabled();
       if(searchButton.isEnabled()){
            System.out.println("The search button is enabled.");
       } else {
            System.out.println("The search button is not enabled. ");
       }

       System.out.println();

       //getting the tag name, attribute and location of the search field box
       WebElement searchKeyBox = driver.findElement(By.xpath("//div[@class='search-key-box']"));
       System.out.println("The tag name of the search field is : " + searchKeyBox.getTagName() + ".");
       System.out.println("The value of the search field is: " + searchKeyBox.getAttribute("class") + ".");

       Point location = searchKeyBox.getLocation();
       System.out.println("The location of the search field is : " + searchKeyBox.getLocation() + ".");
       System.out.println("The x location of the search field is: " + location.getX() + ".");
       System.out.println("The y location of the search field is: " + location.getY() + ".");

       driver.quit();
     }
   }



