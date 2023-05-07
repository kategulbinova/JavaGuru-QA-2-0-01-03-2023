package margo.homeWorks;

public class Lect6IncreaseNrBy5 {
    static int[] originalNrs = {45, 87, 23, 2, -15, 67, 1005, -1235, -1076652, 0};

    static void printArrayOriginalNrs() {
        for (int originalNr : originalNrs) {
            System.out.print(originalNr + " ");
        }
    }
     static void calculateAndPrintIncreasedByFive() {
         int[] increasedByFive = originalNrs.clone();
         for (int i = 0; i < increasedByFive.length; i++) {
             increasedByFive[i] = increasedByFive[i] + 5;
             System.out.print(increasedByFive[i] + " ");
        }
    }
    public static void main(String[] args) {
        System.out.println("These are original numbers:");
        printArrayOriginalNrs();
        System.out.println();
        System.out.println("Below are original numbers increased by 5:");
        calculateAndPrintIncreasedByFive();



    }
}
