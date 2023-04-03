package aleksejs_lukins;

public class Lesson5PracticeWithLoops {
    public static void main(String[] args) {
        int day = 2;
        String dayName;

        switch ( day ) {
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default: dayName = "the day when I am waiting for the weekend";
        }
        System.out.println("Today is " + dayName);

    }
}