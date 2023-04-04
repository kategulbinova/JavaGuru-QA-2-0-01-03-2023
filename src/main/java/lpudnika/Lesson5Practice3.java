package lpudnika;

public class Lesson5Practice3 {

    public static void main(String[] args) {

        int day = 5;
        String dayName;

        switch (day) {
            case 1: dayName = "Monday";
                break;
            case 2: dayName = "Tuesday";
                break;
            case 3: dayName = "Wednesday";
                break;
            case 4: dayName = "Thursday";
               break;
            case 5: dayName = "Friday";
                break;
            case 6: dayName = "Sunday";
                break;
            case 7: dayName = "Saturday";
                break;
            default: dayName = "what?? :D";
        }
        System.out.println("Today is " + dayName);
    }
}
