package gleb.Homework.Homework7.Person;

public class MainProgram {
    public static void main (String[]args){
        Person person1=new Person("Glebs",1998);
        Person person2=new Person("Daniel");
        person1.setSurname("Lusnickis");
        person2.setSurname("Bully");
        person1.HiringStatus();
        person2.HiringStatus();

        System.out.println("First Person  ");
        System.out.println("     Name : "+person1.getName()+" .");
        System.out.println(" Lastname : "+person1.getSurname()+".");
        System.out.println("    He is : "+person1.getAge()+" Years old.");
        System.out.println("            true");
        System.out.println("                                     ");

        System.out.println("Second Person ");
        System.out.println("     Name : "+person2.getName()+".");
        System.out.println(" Lastname : "+person2.getSurname()+".");
        System.out.println("    He is : "+person2.getAge()+" Years old.");
        System.out.println("            "+person2.HiringStatus());
        System.out.println("                                     ");

        System.out.println("+1");
        person1.makeOlder();
        person2.makeOlder();


        System.out.println("First Person  ");
        System.out.println("     Name : "+person1.getName()+" .");
        System.out.println(" Lastname : "+person1.getSurname()+".");
        System.out.println("    He is : "+person1.getAge()+" Years old.");
        System.out.println("            true");


        System.out.println("Second Person ");
        System.out.println("     Name : "+person2.getName()+".");
        System.out.println(" Lastname : "+person2.getSurname()+".");
        System.out.println("    He is : "+person2.getAge()+" Years old.");
        System.out.println("            "+person2.HiringStatus());

    }
}
