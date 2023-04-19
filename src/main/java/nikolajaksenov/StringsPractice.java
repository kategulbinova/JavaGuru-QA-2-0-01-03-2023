package nikolajaksenov;

public class StringsPractice {
    public static void main(String[] args) {

        String firstName = "Annabell";
        String lastName = "Ivanova";
        String gender = "Female";
        String maritalStatus = "Not married";
        String correctPrefix;


        if (gender == "Male") {
            correctPrefix = "Mr";
        } else if (maritalStatus == "Married")        {
            correctPrefix = "Mrs";
        } else {
            correctPrefix = "Miss";
        }

        System.out.println(gender.concat(": " + correctPrefix + " " + firstName + " " + lastName));
        System.out.println(gender.concat(", ").concat(maritalStatus.toLowerCase().concat(", ").concat(correctPrefix).concat(" ").concat(firstName).concat(" ").concat(lastName)));

           /*String firstName = "Annabell";
        String lastName = "Ivanova";
        String genderMale = "Male";
        String genderFemale = "Female";
        String firstNameMale = "Johann";
        String lastNameMale = "Petrov";
        String prefixMale = "Mr";
        String prefixFemale = "Mrs";
        String maritalStatusMarried = "married";
        String maritalStatusNotMarried = "not Married";
        String correctPrefix;


        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(" " + lastName));

        System.out.println(lastName + ", " + firstName);
        System.out.println(lastName.concat(", " + firstName));

        System.out.println(genderMale.concat(": " + prefixMale + " " + firstNameMale + " " + lastNameMale));
        System.out.println(genderFemale.concat(", " + maritalStatusMarried + ", " + prefixFemale + " " + firstName + " " + lastName));*/

    }

}
