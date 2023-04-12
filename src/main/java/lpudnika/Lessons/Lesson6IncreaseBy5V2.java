package lpudnika.Lessons;

public class Lesson6IncreaseBy5V2 {
    public static void main(String[] args) {
        int[] numbers = {45, 87, 23, 2, -15, 67, 1005, -1235, -1076652, 0};
        for (int i : numbers) {
            System.out.println(i);
        }
        for (int i : numbers) {
            i = i + 5;
            System.out.println(i);
        }
    }
}
