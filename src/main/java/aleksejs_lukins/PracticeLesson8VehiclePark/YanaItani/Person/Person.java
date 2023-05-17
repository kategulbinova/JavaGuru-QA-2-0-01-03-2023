package aleksejs_lukins.PracticeLesson8VehiclePark.YanaItani.Person;

public class Person {
    String name;
    String surname;
    int age;
    boolean isHired;
    Person(String nameA, int birthYear) {
        name = nameA;
        age = 2023 - birthYear;
    }
    Person(String nameB){
        name = nameB;
        age = 0;

    }
    void hire (){
      isHired = true;
    }
    void fire (){
        isHired = false;
    }
    void makeOlder(){
        age++;
    }
    String getSurname(){
        return surname;
    }
    void setSurname(String unknownSurname){
        surname = unknownSurname;
    }

    void setHiringStatus() {
        if (age >= 18 && age <=65) {
            hire();
        } else {
            fire();
        }
    }


    static void celebrateNewYear (Person[] people){
        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            person.makeOlder();
            person.setHiringStatus();
        }
    }

}
