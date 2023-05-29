package margo.classWork;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lect11SequentialTextPrintTest {
    @AfterTest
    public void printAfter() {
        System.out.println("this is AFTER annotation");
    }
    @BeforeTest
    public void printBefore() {
        System.out.println("this is BEFORE annotation");
    }
    @Test
        public void testItself() {
        System.out.println("this is TEST itself");
    }

}
