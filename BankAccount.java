package surajapplication;

//Custom Exception class
class InsufficientFundsException extends Exception {
 private double shortfall;

 public InsufficientFundsException(double shortfall) {
     super("Sorry, insufficient balance, you need more " + shortfall + " Rs. to perform this transaction.");
     this.shortfall = shortfall;
 }

 public double getShortfall() {
     return shortfall;
 }
}

public class BankAccount {
 private double balance;

 // Constructor
 public BankAccount(double initialBalance) {
     this.balance = initialBalance;
 }

 // Method to withdraw amount
 public void withdraw(double amount) throws InsufficientFundsException {
     if (amount > balance) {
         double shortfall = amount - balance;
         throw new InsufficientFundsException(shortfall);
     } else {
         balance -= amount;
         System.out.println("Withdrawal successful. New balance: " + balance);
     }
 }

 // Method to get current balance
 public double getBalance() {
     return balance;
 }

 public static void main(String[] args) {
     BankAccount account = new BankAccount(2000); // Initial balance

     java.util.Scanner scanner = new java.util.Scanner(System.in);
     System.out.print("Enter withdraw amount: ");
     double withdrawAmount = scanner.nextDouble();

     try {
         account.withdraw(withdrawAmount);
     } catch (InsufficientFundsException e) {
         System.out.println(e.getMessage());
     }

 }
}

