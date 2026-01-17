class AccountBalance {
    double MinimumBalance; // Variable to store the minimum balance

    // Parameterized constructor to initialize MinimumBalance
    AccountBalance(double MinimumBalance) {
        this.MinimumBalance = MinimumBalance;
    }

    // Method to check the balance
    void CheckBalance() {
        try {
            if (MinimumBalance < 500) {
                // Throw LessBalanceException if balance is less than 500
                throw new LessBalanceException("Not enough balance");
            } else {
                // Print the balance if it is sufficient
                System.out.println("Minimum Balance: " + MinimumBalance);
            }
        } catch (LessBalanceException e) {
            // Handle the exception
            System.out.println(e.getMessage());
        }
    }
} 