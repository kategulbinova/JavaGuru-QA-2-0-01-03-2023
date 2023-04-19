package gleb.Homework.Homework7;

public class Person {
    private String name;
    private String surname;
    private int age;
    private int birthYear;
    private boolean isHired = true;//hired=true, fired=false;

    public Person(String name, int dateOfBirth) {
        //If you pass the name and a birth year and, it will remember the person’s name and age
        this.name = name;
        this.surname = "";
        this.birthYear = dateOfBirth;
        this.age = 2023 - dateOfBirth;

    }//ready

    public Person(String name) {
        this.name = name;
        this.surname = "";
        this.age = 0;
        this.birthYear = 2023 - 0;
    }//ready

    public void hire() {
        //hire() – amend the field isHired so that the person appears to be hired.
        this.isHired = true;
    }//ready

    public void fire(int age) {
        //fire() – amend the field isHired so that the person appears to be not hired.
        this.isHired = false;
    }//ready

    public void makeOlder() {
        this.age++;
    }//ready

    public String getSurname() {
        //getSurname() – return Surname of the person.
        return surname;
    }//ready

    public void setSurname(String surname) {
        //setSurname() – set Surname of the person.
        this.surname = surname;
    }//ready
    public String getName(){
        return name;
    }//ready
    public int getAge(){
        return age;
    }//ready
     public boolean isHired() {
            return isHired;
        }
        public boolean HiringStatus() {
        if (age >= 18 && age <= 17) {
            this.isHired = true;
        } else {
            this.isHired = false;
        }
            return false;
        }//ready
}



/*6. Create a new class that will actually launch (includes public static void main…)       DONE
Create new person – only use the name (optional, only if you have corresponding constructior)   DONE
Create another person – use both the name and the birth year    DONE
Set surnames for both (like yours, for example)  DONE
If the age is > 18 then hire them  DONE
Celebrate birthdays for both
Print out results as you go*/