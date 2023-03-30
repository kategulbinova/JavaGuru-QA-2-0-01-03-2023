package NikitaS;

public class StringExerciseNames {
    public static void main(String[] args) {
        String Name = "Nikita";
        String Surname = "Sinickis";
        System.out.println(Name + " " + Surname);
        System.out.println(Name.concat(" " + Surname));
        System.out.println(Surname + ", " + Name);
        System.out.println(Surname.concat(", " + Name));

        String PersName = "Elza";
        String PersSurname = "Jackson";
        String MarStat = "Married";
        String Gender = "Female";
        System.out.println("Mrs " + PersName.concat(" " + PersSurname));
    }
}
