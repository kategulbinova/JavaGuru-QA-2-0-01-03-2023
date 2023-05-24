package marijaplumite2.classworks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumTest {

    @Test
    public void testAddition(){
        int a = 2;
        int b = 3;
        int result = a + b;
        Assert.assertEquals(result,6 );
    }
}
