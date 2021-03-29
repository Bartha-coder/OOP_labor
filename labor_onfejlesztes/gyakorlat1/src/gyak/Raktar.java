package gyak;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Raktar {

    public static void main(String[] args) {
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
