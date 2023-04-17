package germans;

public class StringCars {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 6, 7, 87, 56, 78, 234, 546, 6768};
        for (int i : numbers) {
                System.out.println(i);
            }
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] + 5;
        }
        for (int i : numbers) {
                System.out.println(i);
            }
        }
    }



