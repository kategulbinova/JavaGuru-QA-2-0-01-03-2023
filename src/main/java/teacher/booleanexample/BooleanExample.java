package teacher.booleanexample;

public class BooleanExample {


    public static void main(String[] args) {
        boolean yes = true;
        boolean no = false;

        yes = 9 < 100;  // <- true

        no = 9 > 100;  // >, <, >=, <=, ==, !=


        yes = 100 == 100;

        yes = 10 != 100;

        int shipCount = 10;
        boolean canGoToPort = shipCount < 10;
        if (canGoToPort) {
            System.out.println("Go to port!");
        }

        if (shipCount < 10) {
            System.out.println("Go to port!");
        } else {
            System.out.println("Go to port not ALLOWED!");
        }

        shipCount = shipCount < 10
                ? goToPort(shipCount)
                : goToPortNotAllowed(shipCount);



    }

    public static int goToPort(int shipCount) {
        System.out.println("Go to port!");
        return shipCount + 1;
    }

    public static int goToPortNotAllowed(int shipCount) {
        System.out.println("Go to port NOT ALLOWED!");
        return shipCount;
    }


}
