package teacher;

public class AddSurnameAndName {
    public static void main(String[] args) {
        String name = "Jekaterina";
        String surname = "Gulbinova";
        System.out.println(name + " " + surname);
        System.out.println(name.concat(" ").concat(surname));
    }
}
