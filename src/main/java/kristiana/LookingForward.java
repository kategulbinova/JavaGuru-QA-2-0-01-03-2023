package kristiana;

public class LookingForward {
    public static void main(String[] args) {
        int dayNr = 30;
        String dayName;

        switch (dayNr) {

            case 1:
                dayName = "Saturday";
                break;
            case 2:
                dayName = "Sunday";
                break;
            default:
                dayName = "Looking forward to the Weekend";
                break;

        }
        System.out.println(dayName);
    }
}



