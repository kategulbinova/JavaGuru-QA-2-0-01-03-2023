package gleb.Lesson7.Objects.PersonAge;

public class MainClass {
    public static void main(String[] args) {
        Person glebs = new Person();
        glebs.age= 24;
        glebs.name="Glebs Lusnickis";
        glebs.nationality="Latvian";
        glebs.isMale=true;
        glebs.isMarried=false;
        glebs.getOlder();
        System.out.println(glebs.name+" age is "+glebs.age);
    }
}
