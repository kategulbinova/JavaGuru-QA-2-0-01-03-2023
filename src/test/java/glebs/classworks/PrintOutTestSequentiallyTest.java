package glebs.classworks;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PrintOutTestSequentiallyTest {
    @AfterTest
    public void printAfterTest(){
        System.out.println("This is after test!11!");
    }
    @BeforeTest
    public void printBefore (){
        System.out.println("This is before Main Test");
    }
    @Test
    public void testItself(){
        System.out.println("The MAin Test!!");
    }

}
