package svetlanaKussi;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AssertNameSurnameTest {
    @Test
    @Parameters({"firstName", "lastName"})
    public void printNameSurname(String firstName, String lastName){
        String resultingString = "The first name is:" + firstName + ", and last name is: " + lastName;
        System.out.println(resultingString);

        Assert.assertTrue(resultingString.contains(firstName) && resultingString.contains(lastName));
    }
}
