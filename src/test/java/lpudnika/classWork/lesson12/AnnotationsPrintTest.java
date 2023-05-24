package lpudnika.classWork.lesson12;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsPrintTest {
    @BeforeTest
    public void printBefore(){
        System.out.println("This is before annotation");
    }
    @Test
    public void testItSelf(){
        System.out.println("This is the test itself");
    }
    @AfterTest
    public void printAfter(){
        System.out.println("This is after annotation");
    }
}
