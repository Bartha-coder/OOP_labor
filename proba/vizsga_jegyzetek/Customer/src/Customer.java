
/*
import java.util.ArrayList;
import java.util.Iterator;
public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts;
    private final int id;
    private static int numCustomers = 0;

    public Customer(String lastName, String firstName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = new ArrayList();
        ++numCustomers;
        this.id = numCustomers;
    }

    public void addAccount(BankAccount account) {
        this.accounts.add(account);
    }

    public BankAccount getAccount(String accountNumber) {
        for(int i = 0; i < this.accounts.size(); ++i) {
            if (accountNumber.equals(((BankAccount)this.accounts.get(i)).getAccountNumber())) {
                return (BankAccount)this.accounts.get(i);
            }
        }

        return null;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void closeAccount(String accountNumber) {
        Iterator var2 = this.accounts.iterator();

        while(var2.hasNext()) {
            BankAccount a = (BankAccount)var2.next();
            if (a.getAccountNumber().equals(accountNumber)) {
                this.accounts.remove(a);
                break;
            }
        }

    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(this.lastName + " " + this.firstName + "(ID: " + this.id + ")  + accounts:\n");
        Iterator var2 = this.accounts.iterator();

        while(var2.hasNext()) {
            BankAccount a = (BankAccount)var2.next();
            result.append("\t" + a.toString() + "\n");
        }

        return result.toString();
    }
}*/