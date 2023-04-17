package marijaplumite.classworks;

public class StringExerciseOptional {
        public static void main(String[] args) {
            String name = "Mary";
            String surname = "Olsen";
            boolean female = true; // true for female, false for male
            boolean married = false; // true for married, false for not married
            String fullName = "Full name : ";

            if (female) {
                if (married) {
                    fullName = fullName.concat("Mrs ").concat(name).concat(" ").concat(surname);
                } else {
                    fullName = fullName.concat("Miss ").concat(name).concat(" ").concat(surname);
                }
            } else {
                fullName = fullName.concat("Mr ").concat(name).concat(" ").concat(surname);
            }
            System.out.println("Name: " + name);
            System.out.println("Surname: " + surname);
            System.out.println("-------------------------------------");
            System.out.println(fullName);
    }
}
