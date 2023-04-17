package marijaplumite.classworks;

public class ArraysPracticeDifferentInteger {
    public static void main(String[] args) {
        int[] numbers = {-40, 33, -20, 99, 16, 10, -20, 30, 40, -55,};
        for (int number : numbers) { // same as " for (int i= 0; i < numbers.length; i++)"
            System.out.println(number + ";"); // same as " System.out.println(numbers[i]);
        }
        for (int i= 0; i < numbers.length; i++) {
            numbers[i]=numbers[i]+5;
    }
        for (int number : numbers) {
            System.out.println("Increased by 5: " + number + "; ");
        }
        System.out.println("===================");


        int[] factorials = new int[11];
        for (int i =1; i<= factorials.length -1 ; i++) {
            int fact = 1;
            for (int a = 1; a <=i; a++) {
                fact = fact * a;
            }
            factorials[i] = fact;
            System.out.print(" !"+factorials[i]);
        }
    }
}
