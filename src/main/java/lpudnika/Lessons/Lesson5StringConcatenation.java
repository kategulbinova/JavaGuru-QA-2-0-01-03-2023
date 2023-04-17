package lpudnika.Lessons;

public class Lesson5StringConcatenation {

    public static void main(String[] args) {

        String firstName = "Linda";
        String lastName1 = "Pudnika";
        String lastName2 = "Okincica";

        System.out.println(firstName + " " + lastName1 + " " + lastName2);
        System.out.println(firstName.concat(" ").concat(lastName1).concat(" ").concat (lastName2));
        System.out.println(lastName1 + "-" + lastName2 + ", " + firstName);
        System.out.println(lastName1.concat("-").concat(lastName2).concat(", ").concat(firstName));
    }
}
