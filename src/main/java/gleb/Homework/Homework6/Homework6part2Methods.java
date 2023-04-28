package gleb.Homework.Homework6;

public class Homework6part2Methods {
    public static void myArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("      Old Arrays: "+array[i]);
        }
    }
    public static void myArrayNew ( int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Increased Arrays: "+array[i]);
        }
    }
        public static void incr ( int[] array,int b){
            for (int i = 0; i < array.length; i++) {
                array[i] += 5;
            }
        }
        public static void main (String[]args){
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            myArray(numbers);
            incr(numbers,5);
            myArrayNew(numbers);
        }
    }