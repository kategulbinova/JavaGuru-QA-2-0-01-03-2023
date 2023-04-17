package lpudnika.lessons.lesson5;

public class Lesson5Practice4 {

    public static void main(String[] args) {

        int day = 5;

        switch (day) {
            case 1, 2, 3, 4, 5:
                System.out.println("Waiting for the weekend!");
                break;
            case 6:
                System.out.println("Sunday!");
                break;
            case 7:
                System.out.println("Saturday!");
                break;
            default:
                System.out.println("what?? :D");
        }
    }
}
