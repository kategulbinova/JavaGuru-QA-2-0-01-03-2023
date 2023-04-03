package svetlanakussi.practice;

public class StringsPractice {

    public static void main(String[] args) {
        String name = "Svetlana";
        String surname = " Kussi";
        System.out.println( name + " " + surname);
        System.out.println( name.concat( surname));
        System.out.println( surname + ", " + name);
        System.out.println( surname.concat(", ").concat( name));
    }
}
