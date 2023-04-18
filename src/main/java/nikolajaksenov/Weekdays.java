package nikolajaksenov;

public class Weekdays {
    public static void main(String[] args) {
        int day = 0;


        if (day == 1) {
            System.out.println(day + " for Monday");
        }
        if (day == 2 ) {
            System.out.println(day + " for Tuesday");
        }
        if (day == 3 ) {
            System.out.println(day + " for Wednesday");
        }
        if (day == 4 ) {
            System.out.println(day + " for Thursday");
        }
        if (day == 5 ) {
            System.out.println(day + " for Friday");
        }
        if (day == 6 ) {
            System.out.println(day + " for Saturday");
        }
        if (day == 7 ) {
            System.out.println(day + " for Sunday");
        }
        if (day > 7) {
            System.out.println("Number is too big!");
        }
        if (day < 1) {
            System.out.println("Number is too small!");
        }

        System.out.println("Switch results:");
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
            case 6: dayName = "Saturday";
                break;
            case 7: dayName = "Sunday";
                break;
            default: dayName = "Used day number is not correct";
                break;
        }
        System.out.println(dayName + " for Today");

        System.out.println("Practice results:");
        String weekendDayName;
        switch (day) {
            case 1: weekendDayName = "Saturday";
                break;
            case 2: weekendDayName = "Sunday";
                break;
            default: weekendDayName = "Waiting for weekend days";
                break;
        }
        System.out.println(weekendDayName + " and we are Happy");



        /* day = 1;
        if (day == 1) {
            System.out.println(day + " for Monday");
        }
        day = ++day;
        if (day == 2 ) {
            System.out.println(day + " for Tuesday");
        }
        day = ++day;
        if (day == 3 ) {
            System.out.println(day + " for Wednesday");
        }
        day = ++day;
        if (day == 4 ) {
            System.out.println(day + " for Thursday");
        }
        day = ++day;
        if (day == 5 ) {
            System.out.println(day + " for Friday");
        }
        day = ++day;
        if (day == 6 ) {
            System.out.println(day + " for Saturday");
        }
        day = ++day;
        if (day == 7 ) {
            System.out.println(day + " for Sunday");
        }*/

    }

}

