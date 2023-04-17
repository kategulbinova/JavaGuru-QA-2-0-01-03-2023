package lpudnika.lessons.lesson7.objectExample;

public class Programm {

    public static void main(String[] args) {
        Person linda = new Person();
        linda.age = 27;
        linda.name = "Linda Pudnika-Okincica";
        linda.isMale = false;
        linda.getOlder();
        System.out.println(linda.name + "'s age is " + linda.age);
    }
}
