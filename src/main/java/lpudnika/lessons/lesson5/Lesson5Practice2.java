package lpudnika.lessons.lesson5;

public class Lesson5Practice2 {

    public static void main(String[] args) {

        int day = 5;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
               System.out.println("Thursday");
               break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Please, enter day value between 1 and 7!");
        }
    }
}
