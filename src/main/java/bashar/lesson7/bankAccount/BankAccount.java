package bashar.lesson7.bankAccount;

public class BankAccount {

    /*
    * Create a class &laquo;BankAccount&raquo; (object description) where you have 3 following methods:
    1. deposit(); prints text &ldquo;You have deposited 1000 euros&rdquo;
    2. withdraw(); prints text &ldquo;You have withdrawn 1000 euros&rdquo;
    3. checkBalance(); prints text &ldquo;Your current balance is 1 000 000 euros&rdquo;
    &bull; From main method create a new object of this class and call each method.
    *
    *
    * To your previous class (object description) add the following code:
    1. Field that will hold current balance;
    2. Method that will deposit(int amount); - add money to current balance and print text &ndash; &ldquo;You have deposited {amount} euros&rdquo;
    3. Method that will withdraw(int amount); - subtract money from your current balance and print text: &ldquo;You have withdrawn {amount} euros&rdquo;
    4. Method checkBalance(); - print text: &ldquo;Your current balance is {amount} euros&rdquo;.
    5. Improve your program so that it does not allow to withdraw more than is available in the account
      (you can use return type boolean for the method so that it returns true or false &ndash; withdrawn or not).
  */

    int currentBalance = 10;




    /*public void deposit() {
        System.out.println("Deposited 1000 euros.");
    }*/

    public void deposit2(int amount) {
        this.currentBalance += amount;
        System.out.println("You deposited " + amount +" euros. Now your new current balance is " + currentBalance);
    }

    /*public void withdraw() {
        System.out.println("Withdrew 1000 euros.");
    }*/

     public void withdraw2(int amount) {
         this.currentBalance -= amount;

         if (this.currentBalance < amount) {
            System.out.println("Cannot withdraw more than is available in the account");
        } else {
            System.out.println("You withdrew " + amount + ". Your new current balance after withdrawal is " + this.currentBalance);
        }
     }

    /*public void checkBalance() {

        System.out.println("One Million euros.");
    }*/

    public void checkBalance2() {
        System.out.println("Your balance is " + this.currentBalance +" euros.");
    }
}
