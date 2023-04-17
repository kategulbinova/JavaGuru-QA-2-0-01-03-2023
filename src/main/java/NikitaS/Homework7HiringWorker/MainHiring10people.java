package NikitaS.Homework7HiringWorker;

public class MainHiring10people {

    public static void hirePeople(Person[] a) {
        for (int i = 0; i < a.length; i++ ) {
            if (a[i].age >= 18 && a[i].age <= 65) {
                a[i].hire();
                System.out.println(a[i].name + " " + "is " + a[i].age + " years old which is acceptable and gets hired");
            } else {
                a[i].fire();
                System.out.println(a[i].name + " " + "is " + a[i].age + " years old which is unacceptable and does not get hired");
            }
        }
    }
    public static void celebrateNewYear(Person[] a) {
        System.out.println();
        System.out.println("Happy New Year folks! Now you are all one year older!");
        for (int i = 0; i < a.length; i++ ) {
            a[i].makeOlder();
            System.out.println();
            System.out.println(a[i].name + " is now " + a[i].age + " year(s) old!" );
            if (a[i].isHired && a[i].age<=65) {
                System.out.println(a[i].name + " is already hired and still of acceptable age to continue");
            } else if (a[i].isHired && a[i].age>65) {
                System.out.println(a[i].name + " is now of unacceptable age and is now fired");
                a[i].fire();
            } else if (!a[i].isHired && (a[i].age <18 || a[i].age > 65) ) {
                System.out.println(a[i].name + " is still of unacceptable age to get hired");
            } else {
                System.out.println(a[i].name + " is now of acceptable age and gets hired");
                a[i].hire();
            }
        }
    }

    public static void main(String[] args) {
      String[] name = {"Robert", "Max", "William", "Jack", "Peter", "Bruce", "Patricia", "Susann", "Anna", "Elizabeth"};
      int[] birthYear = {1989, 1958, 0, 1970, 2005, 0, 2015, 1995, 1980, 2006};
      Person[] candidate = {null, null, null, null, null, null, null, null, null, null};
      for (int i = 0; i<name.length; i++) {
          candidate[i] = new Person(name[i], birthYear[i]);
        }
      hirePeople(candidate);
      celebrateNewYear(candidate);
    }
}
