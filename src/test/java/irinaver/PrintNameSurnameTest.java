package irinaver;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PrintNameSurnameTest {
    @Test
    @Parameters({"fName","lName"})
    public void printNameSurname(String firstName, String lastName){
        String resultString = "The first name is: " + firstName + " and the last name is: " + lastName;
        System.out.println(resultString);

        Assert.assertTrue(resultString.contains(firstName) && resultString.contains(lastName));
   }
}
