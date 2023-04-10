package YanaItani;

public class arraysMethodsHometask {
    public static void main(String[] args) {
        int[] numbers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        numbers[0] = 1;
        numbers[1] = 1;


        for (int i = 2; i < numbers.length; i++) {

            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }


        for (int j = 0; j < numbers.length; j++) {
            System.out.println(numbers[j]);


        }

        String[] names = {"a", "b", "Sun", "Spring", "Flowers"};
        names[0] = "a";
        names[1] = "b";
        for (int i = 2; i < names.length; i++) {

            names[i] = names[i - 1] + ", " + names[i - 2];
        }


        for (int j = 0; j < names.length; j++) {
            System.out.println(names[j]);
        }
    }
}


