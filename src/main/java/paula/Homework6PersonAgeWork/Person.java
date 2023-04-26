package paula.Homework6PersonAgeWork;

    public class Person {
        String name;
        String surname;
        int age;
        boolean isHired;

        public Person(String name, int birthYear) {
            this.name = name;
            this.age = 2023 - birthYear;
            this.surname = "";
            this.isHired = false;
        }

        public Person(String name) {
            this.name = name;
            age = 0;
        }

        public void hire() {
            this.isHired = true;
        }

        public void fire() {
            this.isHired = false;
        }

        public void makeOlder() {
            this.age++;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        public boolean getIsHired() {
            return this.isHired;
        }

    }