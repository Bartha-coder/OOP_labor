package lab4_2;

import lab4_1.Person;

import java.util.ArrayList;

import static lab4_1.Main.readFilePrintItsLineNumbered;

public class Main {

    public static void main(String[] args) {
        readFilePrintItsLineNumbered("lab4_2_input.txt");

        Person person1 = new Person("John ", "Black");
        Person person2 = new Person("Steve ", "Brown");
        Person person3 = new Person("Mary ", "White");

        ArrayList<Person> Customers = new ArrayList<>();
        Customers.add(person3);
        Customers.add(person2);
        Customers.add(person1);

        for(Person a : Customers ){
            System.out.println(a);
        }
}
