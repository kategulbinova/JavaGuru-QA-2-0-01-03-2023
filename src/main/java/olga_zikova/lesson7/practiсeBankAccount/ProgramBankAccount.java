package olga_zikova.lesson7.practiсeBankAccount;

public class ProgramBankAccount {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.deposit();
        myAccount.withdraw();
        myAccount.checkBalance();
    }
}
