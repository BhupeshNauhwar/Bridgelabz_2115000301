import java.util.*;

class BankingSystem {
    private HashMap<String, Double> accounts;
    private TreeMap<Double, String> sortedAccounts;
    private Queue<String> withdrawalQueue;

    public BankingSystem() {
        accounts = new HashMap<>();
        sortedAccounts = new TreeMap<>();
        withdrawalQueue = new LinkedList<>();
    }

    public void createAccount(String accountNumber, double initialBalance) {
        accounts.put(accountNumber, initialBalance);
        sortedAccounts.put(initialBalance, accountNumber);
        System.out.println("Account " + accountNumber + " created with balance $" + initialBalance);
    }

    public void deposit(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            double newBalance = accounts.get(accountNumber) + amount;
            sortedAccounts.remove(accounts.get(accountNumber));
            accounts.put(accountNumber, newBalance);
            sortedAccounts.put(newBalance, accountNumber);
            System.out.println("Deposited $" + amount + " to " + accountNumber + ". New balance: $" + newBalance);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void requestWithdrawal(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.add(accountNumber);
            System.out.println("Withdrawal request added for account " + accountNumber);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void processWithdrawals() {
        System.out.println("\nProcessing Withdrawals:");
        while (!withdrawalQueue.isEmpty()) {
            String account = withdrawalQueue.poll();
            System.out.println("Processing withdrawal for account " + account);
        }
    }

    public void displaySortedAccounts() {
        System.out.println("\nAccounts Sorted by Balance:");
        for (Map.Entry<Double, String> entry : sortedAccounts.entrySet()) {
            System.out.println("Account " + entry.getValue() + " -> Balance: $" + entry.getKey());
        }
    }
}

public class BankingSystemDemo {
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();
        bank.createAccount("A1001", 5000);
        bank.createAccount("A1002", 3000);
        bank.createAccount("A1003", 7000);

        bank.deposit("A1002", 2000);
        bank.requestWithdrawal("A1001");
        bank.requestWithdrawal("A1003");

        bank.displaySortedAccounts();
        bank.processWithdrawals();
    }
}
