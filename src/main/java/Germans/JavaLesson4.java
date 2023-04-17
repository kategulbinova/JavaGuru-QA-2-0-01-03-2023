package germans;

public class JavaLesson4 {
    public static void main(String[] args) {
        int weekday = 6;
        String dayName;


        switch ( weekday) {

            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default: dayName = "Looking for the weekend"; break;


        }
        System.out.println("Today is " + dayName );

        }

    }

