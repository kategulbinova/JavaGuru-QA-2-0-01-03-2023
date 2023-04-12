package marijaplumite.classworks.ObjectExample;

public class Person {
    String name;
    int age;
    boolean isMale = false;

    public Person() {
        System.out.println("Profile is created : ");
    }

    public void getOlder() {
        this.age++;
    }
}
