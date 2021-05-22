package lab12_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //standard bemenet "System.in"
        Scanner console = new Scanner(System.in);
        System.out.println("Adj meg egy sort:");
        String line = console.nextLine();

        //split a valaszto karakter
        //veszek egy tombot string es akkor 0 1 2 3 az elemek
        String[] items = line.split(" ");

        System.out.println("A beolvasott sor:");
        System.out.println(line);

        //ha nem megfelelo a bemenet akkor kezeli ezt
        //catchel megfogja es kezeli a hibat
        double sum = 0;
        for(String i : items) {
            try {
                sum += Double.parseDouble(i);
            }
            catch(NumberFormatException exception ){
               // exception.printStackTrace();
                System.out.println(i + " Nem szam");
            }
        }

        System.out.println("Osszeg: " +sum);

    }
}
