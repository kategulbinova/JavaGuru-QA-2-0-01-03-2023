package marijaplumite.classworks;

public class WeekDaysSwitch {
    public static void main(String[] args) {
        int weekday = 9;
        String dayName;
        switch (weekday) {
            case 1:
                dayName = "Monday"; break;
            case 2:
                dayName ="Tuesday"; break;
            case 3:
                dayName = "Wednesday"; break;
            case 4:
                dayName = "Thursday"; break;
            case 5:
                dayName = "Friday"; break;
            case 6:
                dayName = "Saturday"; break;
            case 7:
                dayName = "Sunday"; break;
            default : dayName = "unknown day"; break;
        }
        System.out.println("Today is " + dayName);
    }
}