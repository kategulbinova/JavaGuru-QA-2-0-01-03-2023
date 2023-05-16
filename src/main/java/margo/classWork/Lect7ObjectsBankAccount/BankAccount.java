package margo.classWork.Lect7ObjectsBankAccount;

public class BankAccount {
    String customerName;
    String customerSurname;
    boolean loyalProgramMember;
    BankAccount () {
        this.loyalProgramMember = true;
    }
    int currentBalance;

    public void deposit(int amount) {
        this.currentBalance += amount;
        System.out.println("You have deposited " + amount + " euro");
    }
    public void withdraw(int amount) {
        this.currentBalance -= amount;
        System.out.println("You have withdrawn " + amount + " euro");
    }
    public void checkBalance() {
        System.out.println("Your balance after latest transactions is " + this.currentBalance + " euro");
    }
}
