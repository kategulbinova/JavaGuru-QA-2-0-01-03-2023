package teacher.sauceDemoNew.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static teacher.sauceDemoNew.utils.DriverProvider.getCurrentDriver;
import static teacher.sauceDemoNew.utils.DriverProvider.closeDriver;
public class BaseTest {
    @BeforeMethod
    public void setUp() {
        getCurrentDriver().get("https://www.saucedemo.com");
    }


    @AfterMethod
    public void tearDown() {
        closeDriver();
    }
}
