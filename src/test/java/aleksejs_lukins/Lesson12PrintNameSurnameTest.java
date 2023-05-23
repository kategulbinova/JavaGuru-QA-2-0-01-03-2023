package aleksejs_lukins;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Lesson12PrintNameSurnameTest {

    @Test
    @Parameters({"fName", "lName"})
    public void printNameSurname(String firstName, String lastName) {
        String resultingString = "First name is: " + firstName + ", last name is: " + lastName;
        System.out.println(resultingString);

        Assert.assertTrue(resultingString.contains(firstName) && resultingString.contains(lastName));
    }

}
