package natuksa.HomeworkHiringPerson;

public class PersonHire10People {
    static void hireOrFire(Person[] pretender) {
        for (int i = 0; i < pretender.length; i++) {
            if (pretender[i].age < 18 || pretender[i].age > 65) {
                pretender[i].fire();
                System.out.println("Sorry, " +pretender[i].name+ ", but we can not hire you, because you are " +pretender[i].age+ " years old.");
            }
            else {
                pretender[i].hire();
                System.out.println("Dear, " +pretender[i].name+ ", you are hired. You are " +pretender[i].age+ " years old, and you meet our requirements.");
            }
        }
    }
    static void celebrateNewYear(Person[] pretender) {
        for (int i = 0; i < pretender.length; i++) {
            pretender[i].age++; //pretender[i].makeOlder();
            // made this without method makeOlder(), cause my makeOlder() method has surnames in it, but this homework is without surnames
        }
            hireOrFire(pretender);
    }
    public static void main (String[] args) {
        String[] name = {"James" ,"Claire", "Said", "Charlie", "Jack", "Shannon", "Desmond", "Hurley", "Locke", "Sun"};
        int[] birthYear = {0, 1995, 2004, 0, 2001, 2012, 1987, 2007, 2000, 1990};
        Person[] pretender = new Person[10];
        for (int i = 0; i < pretender.length; i++) {
            pretender[i] = new Person(name[i], birthYear[i]);
        }
        hireOrFire(pretender);
        celebrateNewYear(pretender);
    }
}
