package bank;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(); //konstruktor hivas
        BankAccount bankAccount1 = new BankAccount(1000, "OTP00001"); //konstruktor hivas
        System.out.println(bankAccount);
        System.out.println(bankAccount1);
        System.out.println(bankAccount.getBalance());
        bankAccount.setAccountNumber("12345");

    }
}
