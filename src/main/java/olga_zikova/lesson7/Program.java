package olga_zikova.lesson7;

public class Program {
    public static void main(String[] args) {
        new Person ();
        Person olga = new Person ();
        olga.age = 44;
        olga.name = "Olga";
        olga.surname = "Zikova";
        olga.isMale = false;
        olga.getOlder();
        System.out.println(olga.name + " " + olga.surname + " age is " + olga.age);

    new Loan();
    Loan loan = new Loan();
    loan.contractNumber = "2345";
    loan.loanSum = 10000;
    loan.balance = 2000;
    loan.isRepaid = false;

        System.out.println("Contract number: " + loan.contractNumber + ": " + loan.loanSum + ". Is loan repaid: " + loan.isRepaid);
        System.out.println("Repaided sum: " + (loan.loanSum - loan.balance));
    }
}
