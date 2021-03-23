package lab3_1;

public class Customer {

    private BankAccount account;
    private String firstname;
    private String lastname;


    public Customer(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public BankAccount getAccount() {
        return account;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void  closeAccount()
    {
        this.account=null;
    }

    @Override
    public String toString() {
        return "Customer{" + "account=" + account + ", firstname='" + firstname + '\'' + ", lastname='" + lastname + '\'' + '}';
    }


}



