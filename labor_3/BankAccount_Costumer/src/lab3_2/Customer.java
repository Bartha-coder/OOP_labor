package lab3_2;

import lab3_1.BankAccount;

public class Customer {

    //private BankAccount account;
    //private String firstname;
   // private String lastname;
    private String firstname;
    private String lastname;

    // constant
    public static final int MAX_ACCOUNTS = 10;
    // number of accounts
    private int numAccounts;
    // an array for the accounts

    private BankAccount accounts[] = new BankAccount[ MAX_ACCOUNTS ];

    public Customer(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getNumAccounts() {
        return numAccounts;
    }

    public void setAccount(BankAccount account) {
        if (numAccounts < MAX_ACCOUNTS) {
            this.accounts[numAccounts] = account;
            numAccounts++;
        }
    }
    public BankAccount getAccount(String accountNumber) {
        for(int i=0;i<this.numAccounts;++i) {
            if(accountNumber.equals( accounts[i].getAccountNumber())){

                return accounts[i];
            }
        }

        return null;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public  void  closeAccount(String accountNumber){

        for (int i=0;i<this.numAccounts;++i){
            if(accountNumber.equals(accounts[i].getAccountNumber())){
                accounts[i]=null;
                for (int j=i;j<this.numAccounts-1;++j){
                    accounts[j]=accounts[j+1];
                }
                break;
            }
        }
    }


    @Override
    public String toString() {

        StringBuffer result = new StringBuffer();
        result.append(lastname + ' ' + firstname+ " accounts:\n");
        for(int i=0; i<numAccounts; ++i){
            result.append( "\t" + accounts[i].toString() +"\n");
        }
        return result.toString();
    }


}





