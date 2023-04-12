package marijaplumite;

public class Homework6MethodAddFive {
    static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void addFive(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]=array[i]+5;
        }
    }
        public static void main (String[]args){
            int[] numbers = {-40, 33, -20, 99, 16, 10, -20, 30, 40, -55,};

            printArray(numbers);
            addFive(numbers);
            System.out.println("Increased by 5: ");
            printArray(numbers);
        }
    }

