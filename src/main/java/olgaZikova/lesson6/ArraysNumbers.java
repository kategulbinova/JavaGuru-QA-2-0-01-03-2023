package olgaZikova.lesson6;

public class ArraysNumbers {
    public static void main(String[] args) {
        int [] numbers = {1, 33, 17, 40, 2, 67, 100, 78, 12, 55};
        for (int i: numbers) {
            System.out.print(i + "; ");
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = numbers [i] +5;
            }
        for (int i: numbers) {
            System.out.print(i + "; ");
        }
        }
        }
