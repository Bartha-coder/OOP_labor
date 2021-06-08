public class BankAccount_lab8 {
    protected static final String PREFIX = "OTP";
    protected static final int ACCOUNT_NUMBER_LENGTH = 10;
    protected static int numAccounts = 0;
    protected final String accountNumber;
    protected double balance;

    private BankAccount_lab8(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    protected BankAccount_lab8(String accountNumber, double Egyenleg) {
        this.accountNumber = accountNumber;
        this.balance = Egyenleg;

    }

    private static String createAccountNumber() {
        return PREFIX;
    }

    public BankAccount_lab8() {
        ++numAccounts;
        this.accountNumber = createAccountNumber();
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double deposit(double value) {
        if (value > 0) {
            this.balance += value;
        }
        return balance;
    }

    public boolean withdraw(double value) {
        if (value > 0 && value <= this.balance) {
            this.balance -= value;
            return true;
        }
        return false;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setNumAccounts(int numAccounts) {
        BankAccount_lab8.numAccounts = numAccounts;
    }

    @Override
    public String toString() {
        return this.accountNumber + " balance: " + this.balance;
    }
}