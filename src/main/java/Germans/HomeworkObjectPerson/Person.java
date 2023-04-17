package germans.HomeworkObjectPerson;

public class Person {
        String name;
        String surname;
        int age;
        boolean statusIsHired;

        public Person(String name, int yearOfBirth) {
                this.name = name;
                this.age = 2023 - yearOfBirth;

        }

        public Person(String name) {
                this.name = name;
                this.age = 0;
        }

        public String getSurname() {
                return surname;
        }

        public void setSurname(String surname) {
                this.surname = surname;
        }

        public void hire() {
                this.statusIsHired = true;
                if (this.age > 18)
                        System.out.println("This person is hired");
        }

        public void fire() {
                this.statusIsHired = false;
                if (this.age < 18)
                        System.out.println("This person is fired");
        }

        public void getOlder() {
                this.age++;
        }
}

