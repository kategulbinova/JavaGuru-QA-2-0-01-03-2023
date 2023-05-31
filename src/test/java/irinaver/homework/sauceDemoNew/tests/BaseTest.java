package irinaver.homework.sauceDemoNew.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static irinaver.homework.sauceDemoNew.utils.DriverProvider.getCurrentDriver;

public class BaseTest {

        @BeforeMethod
        public void setUp() {
          getCurrentDriver().get("http://www.saucedemo.com");
        }
        @AfterMethod
        public void tearDown() {
            getCurrentDriver().quit();
        }
    }

