package olga_zikova.lesson5;

public class If_Else_Switch {
    public static void main(String[] args) {
        int weekDay = 11;

        //Practice 1 - IF
        /*if (weekDay == 1) {
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
        }

         */

        //Practice 2 - Switch
    /*
    switch (weekDay) {
        case 1:
            System.out.println("Monday"); break;
        case 2:
            System.out.println("Tuesday");break;
        case 3:
            System.out.println("Wednesday");break;
        case 4:
            System.out.println("Thursday");break;
        case 5:
            System.out.println("Friday");break;
        case 6:
            System.out.println("Saturday");break;
        case 7:
            System.out.println("Sunday"); break;

    }

     */
        // Practice 3 - better code using string
        /*String dayName;
        switch (weekDay) {

            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday";break;
            case 3: dayName = "Wednesday";break;
            case 4: dayName = "Thursday";break;
            case 5: dayName ="Friday";break;
            case 6: dayName ="Saturday";break;
            case 7: dayName = "Sunday"; break;
            default: dayName = "error"; break;
        }
        System.out.println("Today is " + dayName);
*/
        //Practice 4 - unite repeating
        String dayName;
        switch (weekDay) {
            case 1,2,3,4,5: dayName = "Looking forward to the weekend";break;
            case 6: dayName ="Saturday";break;
            case 7: dayName = "Sunday"; break;
            default: dayName = "error";
        }
        System.out.println("Today is " + dayName);
    }


    }