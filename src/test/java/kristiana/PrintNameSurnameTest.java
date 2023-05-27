package kristiana;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PrintNameSurnameTest {
    @Test
    @Parameters({"fName","lName"})
    public void printNameSurname (String firstname, String lastname) {
        String resultingString = "the firstname is " + firstname + ", and the lastname is: " + lastname;
        System.out.println(resultingString);

        Assert.assertTrue(resultingString.contains(firstname) && resultingString.contains(lastname)) ;
    }
}
