package AlekseiKrevnev;
public class FibonacciSequenceHomework {
    static void printArray(int[] arr){
        for (int i =0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ; ");
        }
        System.out.println();
    }
    static void calculateFibonacciRow(int[] arr){
        arr[0]=1;
        arr[1]=1;
        for (int i=2; i<arr.length; i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
    }
    public static void main(String[] args) {
        int[] fibonacciRow={0,0,0,0,0,0,0,0,0};
        printArray(fibonacciRow);
        calculateFibonacciRow(fibonacciRow);
        printArray(fibonacciRow);
    }
}