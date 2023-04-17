package olgaZikova.lesson7.practiсeBankAccount;

public class ProgramBankAccount {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        System.out.println("Current balance is " + myAccount.currentBalance);
        myAccount.deposit();
        myAccount.withdraw();
        myAccount.checkBalance();
    }
}
