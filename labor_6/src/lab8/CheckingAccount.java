package lab8;

//folyoszamla

public class CheckingAccount extends BankAccount{

    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double Egyenleg, double overdraftLimit) {
        super(accountNumber, Egyenleg);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public boolean withdraw(double value) {
        if(value > 0 && value <= this.overdraftLimit) {
            this.overdraftLimit -= value;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "CheckingAccount:"+ "\n" + "overdraftLimit=" + overdraftLimit;
    }
}
