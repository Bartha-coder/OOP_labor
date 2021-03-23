package lab3_1;

public class Main {

    public static void main (String [] args )
    {
        Customer customer1 = new Customer("John", "BLACK");
        BankAccount bankAccount=new BankAccount("OTP0001");
        System.out.println(customer1.toString());
        System.out.println();
        bankAccount.deposit(1000);
        System.out.println(bankAccount);
        System.out.println();
        Customer customer2 = new Customer("Mary", "WHITE");
        BankAccount bankAccount2=new BankAccount("OTP0002");
        System.out.println(customer2.toString());
        System.out.println();
        bankAccount2.deposit(1400);
        System.out.println(bankAccount2);
        System.out.println();
        bankAccount2.withdraw(400);
        System.out.println(bankAccount2);
        System.out.println();
        customer2.closeAccount();
        System.out.println(customer2);
        customer2.setAccount(customer1.getAccount());
        customer2.setLastname(customer1.getLastname());
        System.out.println(customer2);
        bankAccount.deposit(2478);
        System.out.println(bankAccount);
        System.out.println();
        bankAccount.withdraw(999);
        System.out.println(bankAccount);
        System.out.println();


    }


}
