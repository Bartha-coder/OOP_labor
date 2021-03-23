package lab3_2;

import lab3_1.BankAccount;

public class Main {

    public static void main (String [] args ) {
    }

    /*Customer customer = new Customer("Bartha ","Robert");
    System.out.println(customer);
        for(int i = 0; i < 5; ++i) {
        BankAccount bankAccount=new BankAccount("OTP0000" + i);
        customer.setAccount(bankAccount);
        System.out.println(customer.getAccount(bankAccount.getNumAccounts()));
    }
    System.out.println(customer);
        customer.closeAccount("OTP00000");
        System.out.println(customer);*/

    Customer customer = new Customer("Bartha ","Robert");
    BankAccount bankAccount = new BankAccount("OTP00001");
    BankAccount bankAccount1 = new BankAccount("OTP00002");
    BankAccount bankAccount2 = new BankAccount("OTP00003");
    BankAccount bankAccount3 = new BankAccount("OTP00004");
    BankAccount bankAccount4 = new BankAccount("OTP00005");

    Customer customer2 = new Customer("Katalaki ","Aladar");
    BankAccount bankAccount5 = new BankAccount("OTP00008");
    BankAccount bankAccount6 = new BankAccount("OTP00009");
    BankAccount bankAccount7 = new BankAccount("OTP00010");
    BankAccount bankAccount8 = new BankAccount("OTP00011");
    BankAccount bankAccount9 = new BankAccount("OTP00012");
    BankAccount bankAccount10= new BankAccount("OTP00013");
    BankAccount bankAccount11= new BankAccount("OTP00014");
    BankAccount bankAccount12= new BankAccount("OTP00015");
    BankAccount bankAccount13= new BankAccount("OTP00016");

    System.out.println(customer.toString());System.out.println();

    System.out.println(customer2.toString());System.out.println();

    customer.closeAccount();System.out.println(customer);

    customer2.closeAccount();System.out.println(customer2);








}


// BankAccaunt bankAccaunt=new BankAccaunt("OTP00011");
// //Costumer costumer1=new Costumer("David","BALAZS");
// BankAccaunt bankAccaunt1=new BankAccaunt("OTP00022");
// BankAccaunt bankAccaunt2=new BankAccaunt("OTP00033");
// BankAccaunt bankAccaunt3=new BankAccaunt("OTP00034");
// BankAccaunt bankAccaunt4=new BankAccaunt("OTP00035");
// BankAccaunt bankAccaunt5=new BankAccaunt("OTP00036");
// BankAccaunt bankAccaunt6=new BankAccaunt("OTP00037");
// BankAccaunt bankAccaunt7=new BankAccaunt("OTP00038");
// BankAccaunt bankAccaunt8=new BankAccaunt("OTP00039");
// ● Print the customers.
       /* System.out.println(costumer.toString());
        System.out.println(bankAccaunt);
       // System.out.println(costumer1.toString());
        System.out.println(bankAccaunt1);
       // ● Deposit in each account a random amount of money.
        bankAccaunt.beTetek(Math.random()*1000);
        bankAccaunt1.beTetek(Math.random()*100);
        bankAccaunt2.beTetek(Math.random()*100);
        bankAccaunt3.beTetek(Math.random()*100);
        bankAccaunt4.beTetek(Math.random()*100);
        bankAccaunt5.beTetek(Math.random()*100);
        bankAccaunt6.beTetek(Math.random()*100);
        bankAccaunt7.beTetek(Math.random()*100);
        System.out.println(bankAccaunt1);
       // ● Close the first account of the first customer.
        costumer.closAccount(bankAccaunt.getSzamlaszam());
       // ● Close the last account of the second customer.
        costumer.closAccount(bankAccaunt1.getSzamlaszam());
       // ● Print the customers.
        System.out.println(costumer);
        System.out.println();
        System.out.println(costumer);