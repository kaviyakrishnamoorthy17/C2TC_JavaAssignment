package assignment3;

class CheckingAccount extends Account {
    public CheckingAccount(String accountNumber) {
        super(accountNumber);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited to Checking Account.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn from Checking Account.");
        } else {
            System.out.println("Insufficient balance in Checking Account.");
        }
    }

    public double getBalance() {
        return balance;
    }
}