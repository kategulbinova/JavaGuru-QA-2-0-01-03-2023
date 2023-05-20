package gleb.EarlyClassworks;

public class BetterCode {
    public static void main(String[] args) {
        int dayNr = 1;
        String dayName;

        switch ( dayNr ) {
            case 6: dayName = "Sunday";  break;
            case 7: dayName = "Saturday"; break;
            default: dayName = "Looking forward to the weekend!"; break;

        }
        System.out.println(dayName);
    }
}