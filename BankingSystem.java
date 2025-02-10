import java.util.*;

abstract class BankAccount{
	private int accountNumber;
	private String holderName;
	private double  balance;

	public BankAccount(int accountNumber, String holderName, double  balance){
		this.accountNumber=accountNumber;
		this.holderName=holderName;
		this.balance= balance;
	}

	public int getAccountNumber(){
		return accountNumber;

	}

	public String getAccountHolderName(){
		return holderName;
	} 

	public double getBalance(){
		return balance;
	}

	public double deposit(double amount){
        return balance+=amount;
    }
	public double withdraw(double amount){
        return balance-=amount;
    }
	
    public abstract double calculateIntrest();
}

interface Loanble{
	void applyforLoan(double amount);
	double calculateLoanEligibility();
}

class  SavingsAccount extends BankAccount implements Loanble{
	private double intrest=2.5f;
    private double loanElgibility;
	

	public SavingsAccount(int accountNumber, String holderName, double  balance){
		super(accountNumber, holderName, balance);
        this.loanElgibility=balance*2;
	}
	public double calculateIntrest(){
        return getBalance()*intrest;
    }
    public void applyforLoan(double amount){
        if (amount<=loanElgibility) {
            System.out.println("Loan Approved:"+amount);
        }
        else{
            System.out.println("Not eligible");
        }
    }
    public double calculateLoanEligibility(){
        return loanElgibility;
    }
}

class  CurrentAccount extends BankAccount implements Loanble{
	private double intrest=3f;
    private double loanElgibility;
	

	public CurrentAccount(int accountNumber, String holderName, double  balance){
		super(accountNumber, holderName, balance);
        this.loanElgibility=balance*1.5;
	}
	public double calculateIntrest(){
        return getBalance()*intrest;
    }
    public void applyforLoan(double amount){
        if (amount<=loanElgibility) {
            System.out.println("Loan Approved:"+amount);
        }
        else{
            System.out.println("Not eligible");
        }
    }
    public double calculateLoanEligibility(){
        return loanElgibility;
    }
}


public class BankingSystem{
	public static void main(String args[]){
        List<BankAccount> accounts=new ArrayList<>();
        accounts.add(new SavingsAccount(23456, "Rohit", 2345645));
        accounts.add(new CurrentAccount(34567, "Rahul", 345678));

        for (BankAccount bankAccount : accounts) {
            System.out.println("Account Holder:"+bankAccount.getAccountHolderName());
            System.out.println("Account Number:"+bankAccount.getAccountNumber());
            System.out.println("Balance:"+bankAccount.getBalance());
            System.out.println("Interest:"+bankAccount.calculateIntrest());
       
            if (bankAccount instanceof Loanble) {
                Loanble l=(Loanble)bankAccount;
                System.out.println("Loan Elgibility:"+l.calculateLoanEligibility());
                l.applyforLoan(30000);
                System.out.println();
            }
        }
	}
}

