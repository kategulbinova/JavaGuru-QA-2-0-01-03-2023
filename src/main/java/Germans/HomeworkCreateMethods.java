package Germans;

public class HomeworkCreateMethods {
    static void printArray(int[] arr) {
        for (int i = 0 ; i<arr.length; i++ ){
            System.out.println(arr[i] + "; ");
        }

    }
    static void increaseEachElementsByFive (int[] arr){
        for (int i = 0 ; i<arr.length; i++ ) {
           arr[i] = arr[i] +5 ;
        }
    }
    public static void main (String[] args) {
        int[] numbers = {2, 4, 6, 7, 934, 556895, -12283, 0};
        System.out.println("Numbers");
        printArray(numbers);
        System.out.println("Numbers + 5");
        increaseEachElementsByFive(numbers);
        printArray(numbers);
    }
}


