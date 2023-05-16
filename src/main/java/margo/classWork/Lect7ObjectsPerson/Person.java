package margo.classWork.lect7ObjectsPerson;

public class Person {
    String name;
    int currentAge;
    int endSchoolAge;
    int yearsAfterGraduation;
    boolean isEmployed;
    Person() {
        this.isEmployed = true;
    }
    public void lastYearAge() {
        this.currentAge--;
    }
    public void calculateYearsAfterSchoolGraduation() {
        this.yearsAfterGraduation = this.currentAge - this.endSchoolAge;
    }
}
