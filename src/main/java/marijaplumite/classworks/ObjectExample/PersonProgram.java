package marijaplumite.classworks.ObjectExample;

public class PersonProgram {
    public static void main(String[] args) {
        Person maria = new Person();
        maria.age = 27;
        maria.name = "Marija Plumite";
        maria.isMale = false;
        maria.getOlder();
        System.out.println(maria.name + "`s age is " + maria.age);
    }
}
