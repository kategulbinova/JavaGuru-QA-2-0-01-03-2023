package svetlanakussi.practice;

public class ArraysTwoLesson6 {
    public static void main(String[] args) {
        int [] value = {3, 6, 9, 13, 17, -8, -11, -21, -111};
        for ( int i : value) {
            System.out.println(i);
        }
        for (int i = 0; i < value.length ; i++) {
            value[i] = value[i] + 5;
        }
        for (int i = 0; i < value.length ; i++) {
                System.out.println(value[i]);
            }
        }
    }


