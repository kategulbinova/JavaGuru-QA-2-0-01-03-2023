package lpudnika.Lessons;

public class Lesson5StringConcatenationLvl2 {

    public static void main(String[] args) {

        String firstName = "Linda";
        String lastName = "Pudnika-Okincica";
        String maritalStatus = "Married";
        String gender = "Female";

        System.out.println("Marital Status: ".concat(maritalStatus));
        System.out.println("Gender: ".concat(gender));
        System.out.println("Name: ".concat(firstName));
        System.out.println("Surname: ".concat(lastName));
        System.out.println("------------------------------------------");
        System.out.println("Full name: ".concat(firstName).concat(" ").concat(lastName));
    }
}
