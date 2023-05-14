package margo.classWork.lect7ObjectsPerson;

public class MainProgram {
    public static void main(String[] args) {
        Person margo = new Person();
        margo.name = "Margarita";
        margo.currentAge = 32;
        margo.endSchoolAge = 19;
        System.out.println(margo.isEmployed);
        margo.calculateYearsAfterSchoolGraduation();
        System.out.println(margo.name + " has finished school " + margo.yearsAfterGraduation + " years ago.");
        margo.lastYearAge();
        System.out.println("Last year " + margo.name + " was " + margo.currentAge);


    }
}
