package gyak;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> BankAccount=new ArrayList<>();
        BankAccount.add("OTP000000");
        BankAccount.add("OTP000001");
        BankAccount.add("OTP000002");
        BankAccount.add("OTP000003");
        BankAccount.add("OTP000004");
        BankAccount.add("OTP000005");
        for(int i = 1; i <=150; ++i) {
            BankAccount bankAccount=new BankAccount("OTP000000" + i);
            System.out.println(bankAccount);
        }
        System.out.println();
        System.out.println(BankAccount);

    }
}