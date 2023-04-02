package bashar.lesson5;

public class IfElseWeekDays {
    public static void main(String[] args) {


        //Lesson 5 >  IF condition > Practice

       /* int weekDay = 7;

        if (weekDay == 1) {
            System.out.println("Today is Monday");
        }
        if (weekDay == 2) {
            System.out.println("Today is Tuesday");
        }
        if (weekDay == 3) {
            System.out.println("Today is Wednesday");
        }
        if (weekDay == 4) {
            System.out.println("Today is Thursday");
        }
        if (weekDay == 5) {
            System.out.println("Today is Friday");
        }
        if (weekDay == 6) {
            System.out.println("Today is Saturday");

        }
        if (weekDay == 7) {
            System.out.println("Today is Sunday");

        }*/




        //_______________________




        //Lesson 5 > Switch > Practice

        int dayNr = 1;
        String dayName;

        switch (dayNr) {
            case 1: dayName = "Saturday"; break;
            case 2: dayName = "Sunday"; break;
/*
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
*/
            default: dayName = "Looking forward for the weekend"; break;
        }
        System.out.println(dayName);

    }
}
