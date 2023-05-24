package lpudnika.classWork.lesson12;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumTest {

    @Test
    public void testAddition(){
        int a = 6;
        int b = 5;
        int result = a + b;
        Assert.assertEquals(result,6 );
    }
}
