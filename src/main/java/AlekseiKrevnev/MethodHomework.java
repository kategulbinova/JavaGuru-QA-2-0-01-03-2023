package AlekseiKrevnev;

public class MethodHomework {
    static void printArray  (int [] array){
        for (int i=0; i< array.length; i++){
            System.out.print(array[i]+"-> ");
        }
    }
    static void increaseByFive(int [] array){
        for (int i=0; i< array.length; i++){
            array[i]=array[i]+5;
        }
        System.out.println();

    }
    public static void main(String[] args){
        int [] numbers={0,1,2,3,4,5,6,7,8,9};
        printArray(numbers);
        increaseByFive(numbers);
        printArray(numbers);

    }

}