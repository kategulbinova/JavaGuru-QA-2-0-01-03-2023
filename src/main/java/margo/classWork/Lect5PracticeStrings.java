package margo.classWork;

public class Lect5PracticeStrings {
    public static void main(String[] args) {
        //*** below is code practice: general string info ***
        /*String testStringMI = "test strings";*/
        /*int stringLength;
        stringLength = testStringMI.length();
        System.out.println(stringLength);*/
        /*System.out.println(testStringMI.length());
        System.out.println(testStringMI.toLowerCase());
        System.out.println(testStringMI.toUpperCase());*/

        //*** below is code practice: + vs concat

        String firstName = "Margarita ";
        String lastName = "Ivanova ";
        System.out.println(firstName + lastName);
        System.out.println(lastName + firstName);
        System.out.println(firstName.concat(lastName));
        System.out.println(lastName.concat(firstName));
        System.out.println();

        String firstName2 = "Margarita";
        String lastName2 = "Ivanova";
        System.out.println(firstName2.concat(" ").concat(lastName2));
        System.out.println();

        String name = "Andrej";
        String surname = "Klauss";
        String maritalStatus = "Divorced";
        String gender = "male";
        String prefix = "Mr. ";
        /*System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Gender: " + gender);
        System.out.println("Marital status: " + maritalStatus);*/
        System.out.println("Full name: " +  prefix + name + " " + surname);
        System.out.println();

        String name1 = "Marija ";
        String surname1 = "Kasablanka";
        String maritalStatus1 = "Single";
        String gender1 = "female";
        String prefix1 = "Miss ";
        System.out.println("Full name: " + prefix1.concat(name1.concat(surname1)));


    }
}
