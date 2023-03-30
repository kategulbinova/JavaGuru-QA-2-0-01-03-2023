package marijaplumite;

public class HomeworkStars {
    public static void main(String[] args) {
        for (int m = 0; m < 8; m++) {
            for (int p = 0; p < 15; p++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int count = 10;
        for (int i = 0; i < count; i++) {
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
