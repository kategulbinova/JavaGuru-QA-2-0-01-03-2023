package NikitaS;

public class PRacticeSwitchWeekends {
    public static void main(String[] args) {
        int a = 1;
        String dayName;
        switch (a) {
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default: dayName = "It is not yet weekend"; break;

        }
        System.out.println(dayName);
    }
}
