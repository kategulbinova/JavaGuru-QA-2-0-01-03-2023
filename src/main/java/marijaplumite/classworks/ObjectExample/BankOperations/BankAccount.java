package marijaplumite.classworks.ObjectExample.BankOperations;

public class BankAccount {
    int balance;
    public void deposit(int amountToDeposit){
        int newBalance = balance + amountToDeposit;
        balance = newBalance;
     System.out.println("You have deposited "+ amountToDeposit +  " euros ");
    }
    public int withradw(int amountToWithdraw){
        int afterWithdraw = balance - amountToWithdraw;
        balance = afterWithdraw;
        System.out.println("You have withdrawn " + amountToWithdraw + " euros ");
        return afterWithdraw;
    }

    public void checkBalance() {
        System.out.println("Your balance is " + balance);
    }
}
