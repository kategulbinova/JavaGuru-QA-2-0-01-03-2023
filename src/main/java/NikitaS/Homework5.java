package NikitaS;

public class Homework5 {
    public static void main(String[] args) {
        int stars;
        int rows = 0;
        String line;
        while (rows < 8) {
            stars = 0;
            line = "";
            while (stars < 15) {
                line = line.concat("*");
                stars++;

            }
            System.out.println(line);
            rows++;
        }


    }
}
