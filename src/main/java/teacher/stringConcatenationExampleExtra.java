package teacher;

public class stringConcatenationExampleExtra {
    public static void main(String[] args) {
        String name = "Jekaterina";
        String surname = "Gulbinova";
        boolean female = true; // true for female, false for male
        boolean married = false; // true for married, false for not married
        String fullName = "";

        if (female) {
            if (married) {
                fullName = fullName.concat("Mrs ").concat(name).concat(" ").concat(surname);
            } else {
                fullName = fullName.concat("Miss ").concat(name).concat(" ").concat(surname);
            }
        } else {
            fullName = fullName.concat("Mr ").concat(name).concat(" ").concat(surname);
        }

        System.out.println(fullName);
    }
}
