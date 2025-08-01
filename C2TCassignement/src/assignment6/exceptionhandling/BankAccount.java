package assignment6.exceptionhandling;

public class BankAccount {
	 private int accountNumber;
	    private double balance;

	    
	    public BankAccount(int accountNumber, double initialBalance) {
	        this.accountNumber = accountNumber;
	        this.balance = initialBalance;
	    }

	    
	    public void deposit(double amount) throws InvalidAmountException {
	        if (amount <= 0) {
	            throw new InvalidAmountException("Amount must be positive.");
	        }
	        balance += amount;
	        System.out.println("Successfully deposited: ₹" + amount);
	    }

	    
	    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
	        if (amount <= 0) {
	            throw new InvalidAmountException("Amount must be positive.");
	        }
	        if (amount > balance) {
	            throw new InsufficientFundsException("Insufficient balance.");
	        }
	        balance -= amount;
	        System.out.println("Successfully withdrawn: ₹" + amount);
	    }

	   
	    public void displayBalance() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Current Balance: ₹" + balance);
	    }
	}