package gyak;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Termek termek = new Termek(1, "alma", 5);
        System.out.println(termek);
        termek.setArres(10);
        System.out.println(termek);
        System.out.println();

        Termek termek2 = new Termek(2, "korte", 7);
        System.out.println(termek2);
        termek2.setArres(8.5);
        System.out.println(termek2);
        System.out.println();

        readFilePrintItsLineNumbered("termekek.txt");
        System.out.println();
        readFilePrintItsLineNumbered("raktar.txt");
    }

    public static void readFilePrintItsLineNumbered(String fileName) {
        // Open the file
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (scanner != null) {
            int row = 1;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
                row++;
            }
            scanner.close();
        }
    }

}