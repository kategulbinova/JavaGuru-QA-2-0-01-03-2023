package teacher.booleanexample;

public class ArrayExample {

    public static void main(String[] args) {
        int[] marks = {1, 10, 4, 5, 6, 3};

        // marks.length

        // 1. marks sum
        int sum = calculateSum(marks);
        System.out.println("Sum = " + sum);

        // 2. sum / mark count
        int averageMark = sum / marks.length;
        System.out.println("Average mark = " + averageMark);

        //double averageMarkDouble = (double) sum / marks.length;
        double averageMarkDouble = calculateAverage(sum, marks.length);

/*
        calculateAverage(10, 1);
        calculateAverage(15, 2 + 4);
        calculateAverage(20, 3);
*/

        System.out.println("Average mark = " + averageMarkDouble);
    }

    public static double calculateAverage(int sum, int markCount) {
        return (double) sum / markCount;
    }

    public static int calculateSum(int[] marks) {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        return sum;
    }

}
