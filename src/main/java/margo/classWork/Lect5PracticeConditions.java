package margo.classWork;

public class Lect5PracticeConditions {
    public static void main(String[] args) {
        //*** below is code practice: IF in ELSE ***
        /*int thirdWeekDay = 3;

        if (thirdWeekDay == 2) {
            System.out.println("Nope, today is not Tuesday");
        } else {
            if (thirdWeekDay == 3) {
                System.out.println("Indeed, today is " + thirdWeekDay + "rd day of the week which is Wednesday");
            } else {
                if (thirdWeekDay == 7) {
                    System.out.println("Nope, today is not Sunday");
                }
            }
        }*/

        //*** below is code practice: only IFs ***
        /*int weekDay = 3;

        if (weekDay == 2) {
            System.out.println("Tuesday");
        }
        if (weekDay == 3) {
            System.out.println("Wednesday");
        }
        if (weekDay == 7) {
            System.out.println("Sunday");
        }*/

        //*** below is practice:switch & case ***
        /*int weekDayNr = 3;

        switch (weekDayNr) {
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 7: System.out.println("Sunday"); break;
        }*/

        //*** below is practice: switch & case plus string ***
        /*int weekDayNr = 2;
        String weekDayName;

        switch (weekDayNr) {
            case 2: weekDayName = "Tuesday"; break;
            case 3: weekDayName = "Wednesday"; break;
            case 7: weekDayName = "Sunday"; break;
            default: weekDayName = "unknown day"; break;
        }
        System.out.println("Today indeed is " + weekDayName);*/

        //*** below is practice: Sat&Sun printing out ***
        int dayNr = 6;
        String weekDays;

        switch (dayNr) {
            case 1, 2, 3, 4, 5: weekDays = "Looking forward to the weekend!"; break;
            case 6: weekDays = "Saturday"; break;
            case 7: weekDays = "Sunday"; break;
            default: weekDays = "not work day not weekend day, it's unknown day"; break;
        }
        System.out.println("And it's " + weekDays + "!!!");




    }
}
