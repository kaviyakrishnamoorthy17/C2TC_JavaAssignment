package assignment6.exceptionhandling;

public class Executor {
	public static void main(String[] args) {
        BankAccount account = new BankAccount(1001, 5000.0);

        try {
            account.deposit(2000);
            account.withdraw(1000);
            account.withdraw(7000);  
        } catch (InvalidAmountException e) {
            System.out.println("InvalidAmountException: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("InsufficientFundsException: " + e.getMessage());
        } finally {
            System.out.println("Transaction completed.\n");
            account.displayBalance();
        }
    }

}