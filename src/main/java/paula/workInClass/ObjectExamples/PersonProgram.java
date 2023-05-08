package paula.workInClass.ObjectExamples;

public class PersonProgram {
    public static void main(String[] args) {
        new Person();
        Person paula = new Person();
        paula.age = 29;
        paula.name = "Paula Cvikova";
        paula.isMale = false;
        paula.getOlder();
        System.out.println(paula.name + "'s age is " + paula.age);
    }
}