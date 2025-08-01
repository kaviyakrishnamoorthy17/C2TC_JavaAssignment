package assignment3;

class Bank {
    private static int totalAccounts = 0;

    // Increments the totalAccounts when a new account is created
    public static void incrementAccountCount() {
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}