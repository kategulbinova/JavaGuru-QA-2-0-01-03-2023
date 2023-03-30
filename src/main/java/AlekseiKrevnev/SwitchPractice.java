package AlekseiKrevnev;

public class SwitchPractice {
    public static void main(String[] args) {

        int dayNr = 4;
        String dayName;
        switch ( dayNr ) {

            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default: dayName = "Looking forward to the weekend"; break;
        }
        System.out.println("Today is " + dayName);
    }
}

