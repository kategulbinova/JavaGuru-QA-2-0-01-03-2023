package aleksejs_lukins.PracticeLesson8VehiclePark.YanaItani;

public class arraysMethods {

//    static void Greeting(String FirstName, String LastName) {
//        System.out.println("Hello " + FirstName + ", " + LastName );
//    }

    static String GreetingText(String FirstName, String LastName) {
        String text = "Hello " + FirstName + ", " + LastName;
        return text;
    }
    public static void main(String[] args) {
        int[] numbers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        String name = "Kassem";
        String nameA = "Yana";

//        Greeting(name);
//        Greeting(nameA);
//        Greeting();

        String k = GreetingText("Kassem", "Itani");
        System.out.println(k+".");
    }
}
