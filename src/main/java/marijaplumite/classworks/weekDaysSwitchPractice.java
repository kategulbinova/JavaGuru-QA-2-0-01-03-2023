package marijaplumite.classworks;

public class weekDaysSwitchPractice {
    public static void main(String[] args) {
        int weekday = 5;
        String dayName;
        switch (weekday) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayName = "Looking forward to the weekend";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Unknown";
                break;
        }
        System.out.println(dayName);
    }
}