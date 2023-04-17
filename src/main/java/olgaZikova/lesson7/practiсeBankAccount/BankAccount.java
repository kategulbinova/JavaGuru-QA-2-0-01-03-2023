package olgaZikova.lesson7.practiсeBankAccount;

public class BankAccount {
    
    double currentBalance = 1000;
    double depositSum = 100;
    double withdrawSum = 200;
    double checkBalanceSum = currentBalance + depositSum - withdrawSum;

    public void deposit() {
        this.depositSum = depositSum;
        System.out.println("You have deposited " + depositSum + " euros");
    }
    public void withdraw () {
        this.withdrawSum = withdrawSum;
        System.out.println("You have withdrawn " + withdrawSum + " euros");
    }
    public void checkBalance () {
        this.checkBalanceSum = checkBalanceSum;
        System.out.println("Your new current balance is " + checkBalanceSum + " euros");
    }

}
