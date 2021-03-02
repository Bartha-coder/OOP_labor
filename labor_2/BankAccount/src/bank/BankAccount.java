package bank;

public class BankAccount {

    ///Attributes - tulajdonsagok
    //egysegbezaras, encapsulation
    private double balance;
    private String accountNumber;


    ///Methods - metodusok, viselkedes

    //Constructor
    //inicializalas, lefoglalas
    //default
    public BankAccount() {
        this.balance = 0;
    }

    public BankAccount(double balance, String szamlaSzam) {
        this.balance = balance;
        this.accountNumber = szamlaSzam;

    }

    //Getters
    public double getBalance() {
        return this.balance;
    }

    //Setters

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        ///felepitjuk a kimenetet
        //Account number: ......, balance: ......
        return "Account number: " + this.accountNumber + ", balance: " + this.balance + " Ron$";
    }
}


   /* public void betesz( double balance ){
        accountNumber+= balance;
    }

    public boolean kivesz( double balance ){
        if( balance  <= accountNumber ){
            accountNumber -= balance;
            return true;
        }
        return false;
    }

    public double getaccountNumber(){
        return accountNumber;
    }
}
*/




