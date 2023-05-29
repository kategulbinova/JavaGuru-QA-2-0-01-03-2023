package kristiana.WorkWithPeople;

public class Program {
    public static void main (String[]args){
        new Person();
        Person kristiana = new Person();
        kristiana.age = 23;
        kristiana.name = "Kristiana Mjodova";
        kristiana.isMale = false;
        kristiana.getOlder();
        System.out.println(kristiana.name + "'s age is " + kristiana.age);
    }
}
