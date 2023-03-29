package natuksa;
import java.util.Scanner;
public class lesson4 {
    public static void main(String[] args) {
//        int weekday = 9;
//
//        if (weekday == 1) {
//            System.out.println("Monday");
//        }
//        if (weekday == 2) {
//            System.out.println("Tuesday");
//        }
//        if (weekday == 3) {
//            System.out.println("Wednesday");
//        }
//        if (weekday == 4) {
//            System.out.println("Thursday");
//        }
//        if (weekday == 5) {
//            System.out.println("Friday");
//        }
//        if (weekday == 6) {
//            System.out.println("Saturday");
//        }
//        if (weekday == 7) {
//            System.out.println("Sunday");
//        }
//        if  (weekday > 7) {
//            System.out.println("No such week day!");
//        }
        Scanner scannerweek = new Scanner(System.in);
        System.out.println("Enter week day");
        int weekDay = scannerweek.nextInt();
        String dayName;
            switch (weekDay) {
//                case 1: dayName = "Monday"; break;
//                case 2: dayName = "Tuesday"; break;
//                case 3: dayName = "Wednesday"; break;
//                case 4: dayName = "Thursday"; break;
//                case 5: dayName = "Friday"; break;
                case 6: dayName = "Today is Saturday"; break;
                case 7: dayName = "Today is Sunday"; break;
                default: dayName = "Looking forward for a weekend."; break;
            }
        System.out.println(dayName);



    }
}
