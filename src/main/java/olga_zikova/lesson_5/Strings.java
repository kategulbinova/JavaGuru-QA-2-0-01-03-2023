package olga_zikova.lesson_5;

public class Strings {
    public static void main(String[] args) {

        // Practice 1
        /*String name = "Olga";
        int stringLength;
        stringLength = name.length();
        System.out.println(name);
        System.out.println(stringLength); */

        String firstName = "Olga";
        String lastName = "Zikova";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(" ").concat(lastName));
        System.out.println(lastName + ", " + firstName);
        System.out.println(lastName.concat(", "+firstName));

        String prefix1 = "Mr";
        String firstName1 = "Max";
        String surname1 = "Plein";
        String maritalStatus1 = "married";
        String gender1 = "male";

        String prefix2 = "Mrs";
        String firstName2 = "Anna";
        String surname2 = "Black";
        String maritalStatus2 = "not married";
        String gender2 = "female";

       // If (gender1 = "male") {
         //   System.out.println(gender1.concat(":").concat(prefix1).concat(". ").concat(firstName1));
        }
    }

