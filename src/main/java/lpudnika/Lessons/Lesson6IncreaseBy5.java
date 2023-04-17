package lpudnika.Lessons;

public class Lesson6IncreaseBy5 {
    public static void main(String[] args) {
        Integer[] number = {45, 87, 23, 2, -15, 67, 1005, -1235, -1076652, 0};
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
        for (int i = 0; i < number.length; i++) {
            number[i] = number[i] + 5;
            System.out.println(number[i]);
        }
    }
}
