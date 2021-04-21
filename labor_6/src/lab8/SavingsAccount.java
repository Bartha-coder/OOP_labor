package lab8;

//takarekszamla

public class SavingsAccount extends BankAccount{

    private double interestRate;

    public SavingsAccount(String accountNumber, double Egyenleg, double interestRate) {
        super(accountNumber, Egyenleg);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

   /* public void addInterestRate(double interestRate) {

        this.interestRate.add(interestRate);
    }*/

    @Override
    public String toString() {
        return "SavingsAccount:" + "\n" + "interestRate=" + this.interestRate ;
    }
}
