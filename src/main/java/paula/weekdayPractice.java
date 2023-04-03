package paula;

public class weekdayPractice {
    public static void main(String[] args) {

        /*int weekDay = 9;

        if (weekDay == 1) {
            System.out.println("Monday");
        }
        if (weekDay == 2) {
            System.out.println("Tuesday");
        }
        if (weekDay == 3) {
            System.out.println("Wednesday");
        }
        if (weekDay == 4) {
            System.out.println("Thursday");
        }
        if (weekDay == 5) {
            System.out.println("Friday");
        }
        if (weekDay == 6) {
            System.out.println("Saturday");
        }
        if (weekDay == 7) {
            System.out.println("Sunday");
        }*/
        /*int dayNr = 4;
        switch (dayNr) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday");break;
            case 3: System.out.println("Wednesday");break;
            case 4: System.out.println("Thursday");break;
            case 5: System.out.println("Friday");break;
            case 6: System.out.println("Saturday");break;
            case 7: System.out.println("Sunday");break;
        }*/
        int dayNr = 10;
        String dayName;
        switch (dayNr){
            /*case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday";break;
            case 3: dayName = "Wednesday";break;
            case 4: dayName = "Thursday";break;
            case 5: dayName = "Friday";break;
            case 6: dayName = "Saturday";break;
            case 7: dayName = "Sunday";break;
            default: dayName = "unknown day"; break;*/

            case 6: dayName = "Saturday";break;
            case 7: dayName = "Sunday";break;
            default: dayName = "Looking forward for the weekend"; break;
        }
        System.out.println(dayName);
    }
}

