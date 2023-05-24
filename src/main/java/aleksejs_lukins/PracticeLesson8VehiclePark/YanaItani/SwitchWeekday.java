package aleksejs_lukins.PracticeLesson8VehiclePark.YanaItani;

public class SwitchWeekday {
    public static void main(String[] args) {


        int dayN = 11;

        String dayName;
        switch (dayN) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday";break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default: dayName = "unknown day"; break;
        }
        System.out.println("Today is " + dayName);
        int dayNn = 1;

        String dayNamee;
        switch (dayN) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday";break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default: dayName = "looking forward for the weekend"; break;
        }
        System.out.println("Today is " + dayName);


    }
}
