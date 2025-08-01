package assignment3;

public class BankingSystem {
    public static void main(String[] args) {
        // Creating accounts
        SavingsAccount savings = new SavingsAccount("SAV123");
        CheckingAccount checking = new CheckingAccount("CHK456");

        // Transactions
        Transaction txn = new Transaction();
        txn.performTransaction(savings, "deposit", 5000);
        txn.performTransaction(checking, "deposit", 3000);
        txn.performTransaction(savings, "withdraw", 2000);
        txn.performTransaction(checking, "withdraw", 3500);

        // Account info
        System.out.println("\nFinal Account Details:");
        savings.displayAccountInfo();
        checking.displayAccountInfo();

        // Total accounts created
        System.out.println("\nTotal Bank Accounts Created: " + Bank.getTotalAccounts());
    }
}