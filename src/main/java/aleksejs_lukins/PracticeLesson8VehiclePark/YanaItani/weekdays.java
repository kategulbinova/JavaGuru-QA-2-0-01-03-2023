package aleksejs_lukins.PracticeLesson8VehiclePark.YanaItani;

public class weekdays {
    public static void main(String[] args) {
        int monday = 1;
        int tuesday = 2;
        int wednesday = 3;
        int thursday = 4;
        int friday = 5;
        int saturday = 6;
        int sunday = 7;
        int today = saturday;
        if (today == monday) {
            System.out.println("It is Monday" + today);
        }
            else if (today == tuesday) {
            System.out.println("Today is not Monday");
        } else if (today == wednesday) {
            System.out.println("Today is Wednesday");
        }


            if (today > 5) {
            System.out.println("Today is a weekend");
        } else if (today < 6) {
            System.out.println("Today is a working day");
        }


    }
}
