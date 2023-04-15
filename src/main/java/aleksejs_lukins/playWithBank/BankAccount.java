package aleksejs_lukins.playWithBank;

public class BankAccount {
    int currentBalance = 0;

    void deposit(int amount) {
        this.currentBalance = this.currentBalance + amount;
        System.out.println("You have deposited " + amount + " euros");
    }
    void withdraw(int amount) {
        this.currentBalance = this.currentBalance - amount;
        System.out.println("You have withdrawn " + amount + " euros");
    }
    void checkBalance() {
        System.out.println("Your current balance is " + this.currentBalance + " euros");
    }

}
