/**
 * A banking system demo showing:
 * - Class documentation
 * - Method documentation
 * - Inheritance
 * - Encapsulation
 * 
 * @author Java Tutor
 * @version 1.0
 */
public class BankingSystem {

    /**
     * Abstract Account class representing a bank account
     */
    abstract static class Account {
        protected String accountNumber;
        protected double balance;

        /**
         * Creates a new account
         * @param accountNumber unique account identifier
         * @param initialBalance starting balance
         */
        public Account(String accountNumber, double initialBalance) {
            this.accountNumber = accountNumber;
            this.balance = initialBalance;
        }

        /**
         * Deposits money into account
         * @param amount positive amount to deposit
         * @throws IllegalArgumentException if amount is negative
         */
        public void deposit(double amount) {
            if (amount <= 0) {
                throw new IllegalArgumentException("Deposit amount must be positive");
            }
            balance += amount;
        }

        /**
         * Abstract method for withdrawing money
         * @param amount amount to withdraw
         * @return true if withdrawal was successful
         */
        public abstract boolean withdraw(double amount);

        /**
         * Gets current balance
         * @return account balance
         */
        public double getBalance() {
            return balance;
        }
    }

    /**
     * Savings account with interest calculation
     */
    static class SavingsAccount extends Account {
        private double interestRate;

        /**
         * Creates a savings account
         * @param accountNumber unique identifier
         * @param initialBalance starting balance
         * @param interestRate annual interest rate (e.g., 0.05 for 5%)
         */
        public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
            super(accountNumber, initialBalance);
            this.interestRate = interestRate;
        }

        /**
         * Withdraws money with no fee
         * @param amount amount to withdraw
         * @return true if withdrawal was successful
         */
        @Override
        public boolean withdraw(double amount) {
            if (amount <= 0 || amount > balance) {
                return false;
            }
            balance -= amount;
            return true;
        }

        /**
         * Calculates monthly interest
         * @return interest amount
         */
        public double calculateInterest() {
            return balance * (interestRate / 12);
        }
    }

    /**
     * Main method to demonstrate the banking system
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        // Create a savings account
        SavingsAccount account = new SavingsAccount("SAV-12345", 1000.0, 0.05);
        
        // Perform transactions
        account.deposit(500.0);
        account.withdraw(200.0);
        
        // Display results
        System.out.println("Account Number: " + account.accountNumber);
        System.out.println("Current Balance: $" + account.getBalance());
        System.out.println("Monthly Interest: $" + account.calculateInterest());
    }
}