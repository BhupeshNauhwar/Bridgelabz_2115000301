class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("12345", "John Doe", 1000.0);
        savingsAccount.displayAccountDetails();
        
        savingsAccount.setBalance(1500.0);
        System.out.println("Updated Balance: " + savingsAccount.getBalance());
    }
}
