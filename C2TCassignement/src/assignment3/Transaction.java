package assignment3;

class Transaction {
    private final double transactionFee = 10.0; // final variable

    public final void performTransaction(Account account, String type, double amount) {
        System.out.println("\nPerforming Transaction...");

        switch (type.toLowerCase()) {
            case "deposit":
                account.deposit(amount);
                account.withdraw(transactionFee); // Fee deduction
                System.out.println("Transaction Fee ₹" + transactionFee + " deducted.");
                break;
            case "withdraw":
                if (account.getBalance() >= (amount + transactionFee)) {
                    account.withdraw(amount + transactionFee);
                    System.out.println("₹" + amount + " withdrawn + ₹" + transactionFee + " fee.");
                } else {
                    System.out.println("Insufficient balance including transaction fee.");
                }
                break;
            default:
                System.out.println("Invalid transaction type.");
        }

        System.out.println("Updated Balance: ₹" + account.getBalance());
    }
}