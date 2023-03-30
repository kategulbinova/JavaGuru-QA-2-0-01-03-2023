package natuksa;

public class stringMethods {
    public static void main(String[] args) {
        String firstName = "John ";
        String lastName = "Snow ";
        String gender = "Male";
        boolean marital = false;
        String prefix = "";
        if (gender == "Male") {
            prefix = "Mr ";
        }
        if (gender == "Female") {
            if (marital == true) {
                prefix = "Mrs ";
            }
            if (marital == false) {
                prefix = "Miss ";
            }
        }

        String fullName = prefix.concat(firstName.concat(lastName));
        System.out.println("First name: " +firstName);
        System.out.println("Last Name: " +lastName);
        System.out.println("Gender: " +gender);
        System.out.println("Marital status: " +marital);
        System.out.println();
        System.out.println(fullName);

    }
}
