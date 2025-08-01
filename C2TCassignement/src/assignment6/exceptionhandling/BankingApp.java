package assignment6.exceptionhandling;

//Custom exception for insufficient funds
class InsufficientFundsException extends Exception {
 public InsufficientFundsException(String message) {
     super(message);
 }
}

//Custom exception for invalid deposit or withdrawal amounts
class InvalidAmountException extends Exception {
 public InvalidAmountException(String message) {
     super(message);
 }
}

//BankAccount class with accountNumber and balance
class BankAccount {
 private int accountNumber;
 private double balance;

 // Parameterized constructor
 public BankAccount(int accountNumber, double initialBalance) {
     this.accountNumber = accountNumber;
     this.balance = initialBalance;
 }

 // Method to deposit amount
 public void deposit(double amount) throws InvalidAmountException {
     if (amount <= 0) {
         throw new InvalidAmountException("Deposit amount must be greater than 0.");
     }
     balance += amount;
     System.out.println("Successfully deposited: ₹" + amount);
 }

 // Method to withdraw amount
 public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
     if (amount <= 0) {
         throw new InvalidAmountException("Withdrawal amount must be greater than 0.");
     }
     if (amount > balance) {
         throw new InsufficientFundsException("Insufficient balance.");
     }
     balance -= amount;
     System.out.println("Successfully withdrawn: ₹" + amount);
 }

 // Method to display balance
 public void displayBalance() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Available Balance: ₹" + balance);
 }
}

//Main class to demonstrate exception handling
public class BankingApp {
 public static void main(String[] args) {
     // Create a bank account with account number and initial balance
     BankAccount myAccount = new BankAccount(202501, 3000.0);

     try {
         // Attempt a valid deposit
         myAccount.deposit(2000);

         // Attempt a valid withdrawal
         myAccount.withdraw(1000);

         // Attempt a withdrawal that exceeds balance (will throw exception)
         myAccount.withdraw(10000);
     } catch (InvalidAmountException e) {
         System.out.println("InvalidAmountException: " + e.getMessage());
     } catch (InsufficientFundsException e) {
         System.out.println("InsufficientFundsException: " + e.getMessage());
     } finally {
         System.out.println("Transaction process completed.");
     }

     // Display final account balance
     myAccount.displayBalance();
 }
}
