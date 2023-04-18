package nikolajaksenov;

public class Age {

    public static void main(String[] args) {
        int wifeAge;
        wifeAge = 35;
        int myAge;
        myAge = 40;
        int diffYears;
        diffYears = myAge - wifeAge;

        System.out.println("Wife is younger for " + diffYears++ + " years");
        System.out.println("Wife is younger for " + diffYears++ + " years");
        System.out.println("Wife is younger for " + diffYears++ + " years");
        System.out.println();

        int x = 5;
        int y = 10;
        int z = 7;
        int w = 6;

        int resultOne = ((x - z) + y * y);
        int resultTwo = (w / y + (x * z));

        System.out.println("Result for (x - z) + y * y) is " + resultOne );
        if (y == 0) {
            System.out.println("Can not devide on 0");
        } else
            System.out.println("Result for w / y + (x * z) is " + resultTwo );

        x = 2;
        y = 0;
        z = 4;
        w = -2;

        System.out.println("Result for (x - z) + y * y) is " + resultOne);
        if (y == 0) {
            System.out.println("Can not devide on 0");
        } else
        System.out.println("Result for w / y + (x * z) is " + resultTwo);

    }
}
