package AlekseiKrevnev.Homeworks.Constructors;



public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean isHired;

    public Person(String name, int birthYear) {
        this.name = name;
        this.age = calculateAge(birthYear);
    }

    private int calculateAge(int birthYear) {
        return java.time.LocalDate.now().getYear() - birthYear;
    }

    public void hire() {
        isHired = true;
    }

    public void fire() {
        isHired = false;
    }

    public void makeOlder() {
        age++;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
