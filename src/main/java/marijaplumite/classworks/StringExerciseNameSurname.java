package marijaplumite.classworks;

public class StringExerciseNameSurname {
    public static void main(String[] args) {
        String firstName = "Marija";
        String lastName = "Plumite";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat ( " " + lastName));
        System.out.println(lastName + ", " + firstName);
        System.out.println(lastName.concat ( ", " + firstName));
    }
    }