package bashar.lesson7.bankAccount;

public class Program {
    public static void main(String[] args) {
        BankAccount notEmpty = new BankAccount();

       /* notEmpty.deposit();
        notEmpty.withdraw();
        notEmpty.checkBalance();
*/

        notEmpty.deposit2(100);
        notEmpty.withdraw2(50);
        notEmpty.checkBalance2();
    }
}
