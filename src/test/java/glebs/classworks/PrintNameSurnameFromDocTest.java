package glebs.classworks;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PrintNameSurnameFromDocTest {
    @Test
    @Parameters({"fName","lName"})
    public void printNameSurname(String firstName,String lastName){
        System.out.println("The first name is; "+firstName+" and last name is; ");
    }

}
