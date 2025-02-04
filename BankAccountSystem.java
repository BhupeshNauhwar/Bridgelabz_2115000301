class BankAccount {
    private  static String bankName="SBI";
    private static int totalAccounts=0;

    private final int accountNumber;
    private String accountHolderName;

    public BankAccount(int accountNumber, String accountHolderName){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        totalAccounts++;
    }
    public static int getTotalAccount(){
        return totalAccounts;
    }
    public void Display(){
        
        System.out.println("Bank Name:"+bankName);
        System.out.println("Account Holder Name:"+accountHolderName);
        System.out.println("Account Number:"+accountNumber+"\n");
    }
    
}

public class BankAccountSystem{
    public static void main(String[] args) {
        BankAccount account1=new BankAccount(2345, "Sheild");
        BankAccount account2=new BankAccount(2346, "John Cena");
        BankAccount account3=new BankAccount(2347, "CM Punk");

        System.out.println("Total Accounts: "+BankAccount.getTotalAccount());

        if (account1 instanceof BankAccount) {
            account1.Display();
        }
       
        if (account2 instanceof BankAccount) {
            account2.Display();
        }
        if (account3 instanceof BankAccount) {
            account3.Display();
        }
    }
}