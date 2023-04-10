package valerija;

public class WeekDays {
        public static void main(String[] args) {
            int weekDay = 11;
            String dayName;

            switch (weekDay) {
                case 6:
                    dayName = "Saturday";
                    break;
                case 7:
                    dayName = "Sunday";
                    break;
                default: dayName = "Better days are coming. They are called: Saturday and Sunday";break;
            }
            System.out.println(dayName);
        }
}
