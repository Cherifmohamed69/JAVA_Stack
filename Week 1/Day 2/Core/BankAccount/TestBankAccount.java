import java.util.Random;

class Bank_Account {
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts = 0;
    private static double totalAmountStored = 0;
    private String accountNumber;

    public Bank_Account() {
        numberOfAccounts++;
        accountNumber = generateAccountNumber();
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void deposit(double amount, String accountType) {
        if (accountType.equalsIgnoreCase("checking")) {
            checkingBalance += amount;
        } else if (accountType.equalsIgnoreCase("savings")) {
            savingsBalance += amount;
        }
        totalAmountStored += amount;
    }

    public void withdraw(double amount, String accountType) {
        if (accountType.equalsIgnoreCase("checking")) {
            if (checkingBalance >= amount) {
                checkingBalance -= amount;
                totalAmountStored -= amount;
            } else {
                System.out.println("Insufficient funds in checking account.");
            }
        } else if (accountType.equalsIgnoreCase("savings")) {
            if (savingsBalance >= amount) {
                savingsBalance -= amount;
                totalAmountStored -= amount;
            } else {
                System.out.println("Insufficient funds in savings account.");
            }
        }
    }

    public void showTotalMoney() {
        System.out.println("Total money stored: $" + totalAmountStored);
    }

    private String generateAccountNumber() {
        Random random = new Random();
        long accountNumber = Math.abs(random.nextLong()) % 10000000000L;
        return String.format("%010d", accountNumber);
    }
}

public class TestBankAccount {
    public static void main(String[] args) {
        Bank_Account account1 = new Bank_Account();
        Bank_Account account2 = new Bank_Account();

        account1.deposit(1000, "checking");
        account1.deposit(2000, "savings");

        account2.deposit(500, "checking");

        account1.withdraw(500, "checking");
        account2.withdraw(1000, "savings");

        System.out.println("Account 1 Checking Balance: $" + account1.getCheckingBalance());
        System.out.println("Account 1 Savings Balance: $" + account1.getSavingsBalance());

        System.out.println("Account 2 Checking Balance: $" + account2.getCheckingBalance());
        System.out.println("Account 2 Savings Balance: $" + account2.getSavingsBalance());

        account1.showTotalMoney();
    }
}
