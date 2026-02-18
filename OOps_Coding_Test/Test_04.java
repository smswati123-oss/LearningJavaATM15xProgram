package OOps_Coding_Test;

public class Test_04 {
    //Create a BankAccount class with private balance field.
    // Implement deposit(), withdraw(), and getBalance() methods with proper validation.
    // Private field to store the account balance
    private double balance;

    /**
     * Constructor to initialize the account with an initial balance.
     *
     * @param initialBalance The starting balance, must be non-negative.
     */
    public Test_04(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Invalid initial balance. Setting balance to 0.");
            this.balance = 0;
        }
    }

    /**
     * Deposits a specified amount into the account.
     *
     * @param amount The amount to deposit, must be positive.
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount. Amount must be positive.");
        }
    }

    /**
     * Withdraws a specified amount from the account if sufficient funds are available.
     *
     * @param amount The amount to withdraw, must be positive and not exceed the balance.
     */
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }

    /**
     * Returns the current balance of the account.
     *
     * @return The current balance.
     */
    public double getBalance() {
        return balance;
    }

    // Main method to demonstrate the class functionality
    public static void main(String[] args) {
        // 1. Create a BankAccount with an initial balance of 1000
        Test_04 account = new Test_04(1000.0);
        System.out.println("Initial Balance: " + account.getBalance());

        // 2. Deposit 500
        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        // 3. Withdraw 200
        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());
    }
}

