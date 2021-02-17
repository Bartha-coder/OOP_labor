package lab4_2;

import java.util.ArrayList;

public class Customer {

    private String firstname;
    private String lastname;

    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public Customer(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getNumAccounts() {
        return numAccounts;
    }

    //public void addAccount(BankAccount) {

    }

    public BankAccount getAccount(String accountNumber) {
        for (int i = 0; i < this.numAccounts; ++i) {
            if (accountNumber.equals(accounts[i].getAccountNumber())) {

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

    public void closeAccount(String accountNumber) {

        for (int i = 0; i < this.numAccounts; ++i) {
            if (accountNumber.equals(accounts[i].getAccountNumber())) {
                accounts[i] = null;
                for (int j = i; j < this.numAccounts - 1; ++j) {
                    accounts[j] = accounts[j + 1];
                }
                break;
            }
        }
    }

    @Override
    public String toString() {

        StringBuffer result = new StringBuffer();
        result.append(lastname + ' ' + firstname + " accounts:\n");
        for (int i = 0; i < numAccounts; ++i) {
            result.append("\t" + accounts[i].toString() + "\n");
        }
        return result.toString();
    }




}













