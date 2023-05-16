package margo.classWork.lect7ObjectsBankAccount;

public class BankProgram {
    public static void main(String[] args) {
        BankAccount existingClient = new BankAccount();
        existingClient.customerName = "Crystal";
        existingClient.customerSurname = "Clear";
        existingClient.currentBalance = 1789;
        System.out.println("Please confirm whether you are our Loyal Program member? " + existingClient.loyalProgramMember);
        System.out.println("Here's your current balance : " + existingClient.currentBalance + "EUR");
        System.out.println();
        existingClient.deposit(638);
        existingClient.withdraw(999);
        existingClient.checkBalance();
        System.out.println("The Bank is here at your service, Mr. Crystal Clear!");



    }
}
