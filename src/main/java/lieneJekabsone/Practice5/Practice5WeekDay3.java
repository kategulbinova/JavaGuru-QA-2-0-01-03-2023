package lieneJekabsone.Practice5;

public class Practice5WeekDay3 {
    public static void main(String[] args) {
            int dayNr = 7;
            String dayName;

            switch (dayNr) {
                case 6:
                    dayName = "Saturday";
                    break;
                case 7:
                    dayName = "Sunday";
                    break;
                default:
                    dayName = "Looking forward to the weekend!";
                    break;
            }
            System.out.println("Today is " + dayName);
        }
    }
