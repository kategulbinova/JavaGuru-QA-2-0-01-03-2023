package olgaZikova;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PrintTextAnnotationTest {
    @AfterTest
    public void printAfter () {
        System.out.println("After");
    }
    @BeforeTest
    public void printBefore () {
        System.out.println("Before");

    }
    @Test
    public void testItSelf () {
        System.out.println("Test it self");

    }
}
