package alex;

public class Weekdays {
    public static void main(String[] args) {
        int dayNr = 11;
        String dayName;
        switch (dayNr) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "There is no such day!";
                break;
        }
        System.out.println(dayName);
    }
}