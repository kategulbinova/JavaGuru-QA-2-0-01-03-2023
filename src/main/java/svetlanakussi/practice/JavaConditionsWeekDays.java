package svetlanakussi.practice;

public class JavaConditionsWeekDays {
    public static void main(String[] args) {

        int dayNr = 11;
        String dayName;
        switch ( dayNr) {

            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default: dayName = "looking forward to the weekend"; break;
        }
        System.out.println("Today is " + dayName);
    }
}

