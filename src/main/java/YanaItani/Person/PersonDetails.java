package YanaItani.Person;

public class PersonDetails {
    String name;
    String surname;
    int age;
    boolean isHired;
    PersonDetails(String nameA, int birthYear) {
        name = nameA;
        age = 2023 - birthYear;
    }
    PersonDetails (String nameB){
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
    static void hiringStatus (PersonDetails[] chocolates) {
        for (int i = 0; i < chocolates.length; i++) {
            PersonDetails person = chocolates[i];
            if (person.age >= 18 && person.age <=65) {
                person.isHired = true;
            }
            else {
    person.isHired = false;
            }

        }


    }


    static void celebrateNewYear (PersonDetails[] chocolates){
        for (int i = 0; i < chocolates.length; i++) {
            PersonDetails person = chocolates[i];
            person.makeOlder();

        }
        hiringStatus(chocolates);
    }

}
