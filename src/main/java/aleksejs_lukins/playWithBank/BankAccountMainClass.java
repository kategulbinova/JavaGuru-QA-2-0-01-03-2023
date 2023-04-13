package aleksejs_lukins.playWithBank;

import aleksejs_lukins.playWithBook.Practice7Book;

public class BankAccountMainClass {

    public static void main(String[] args) {
        BankAccount firstAccount = new BankAccount();
        firstAccount.checkBalance();
        firstAccount.deposit(100);
        firstAccount.checkBalance();
        firstAccount.withdraw(50);
        firstAccount.checkBalance();
    }

}