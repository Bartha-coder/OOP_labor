package gyak;

public class BankAccount {
    public static final String PREFIX = "OTP";
    public static final int ACCOUNT_NUMBER_LENGTH = 10;
    private static int numAccounts = 0;
    private final String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {

        this.accountNumber = accountNumber;
    }
    private static String createAccountNumber(){
        return PREFIX;
    }

    public BankAccount() {
        ++numAccounts;
        this.accountNumber = createAccountNumber();
    }

    public BankAccount(String accountNumber, double Egyenleg) {
        this.accountNumber = accountNumber;
        this.balance = Egyenleg;

    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public  void setNumAccounts(int numAccounts) {
        BankAccount.numAccounts = numAccounts;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public double deposit(double value) {
        if(value > 0) {
            this.balance += value;
        }
        return balance;
    }

    public boolean withdraw(double value) {
        if(value > 0 && value <= this.balance) {
            this.balance -= value;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.accountNumber + " balance: " + this.balance;
    }
}
