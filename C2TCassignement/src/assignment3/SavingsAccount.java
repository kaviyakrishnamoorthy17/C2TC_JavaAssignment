package assignment3;

class SavingsAccount extends Account {
    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited to Savings Account.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn from Savings Account.");
        } else {
            System.out.println("Insufficient balance in Savings Account.");
        }
    }

    public double getBalance() {
        return balance;
    }
}