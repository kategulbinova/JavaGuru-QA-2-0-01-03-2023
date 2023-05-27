package margo.classWork;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Lect12PrintNameSurnameTest {
    @Test
    @Parameters({"name", "surname"})
    public void printNameSurname(String firstName, String lastName) {
        String resultingString = "His name is " + firstName + " and his last name is " + lastName;
        System.out.println(resultingString);
        Assert.assertTrue(resultingString.contains(firstName) && resultingString.contains(lastName));
    }
}
