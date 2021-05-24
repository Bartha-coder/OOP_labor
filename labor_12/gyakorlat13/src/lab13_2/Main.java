package lab13_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 /*
public class Main {

    public static void main(String[] args) {


        ArrayList<Product> products = readFromCSVFile("data.txt");
        for (Product e : products) {
            System.out.println(e);

        }

        System.out.println();
        Collections.sort(products, Product::compareTo);
        for (Product e : products) {
            System.out.println(e);
        }


    }
    public static void readFilePrintItsLineNumbered (String fileName ){
        // Open the file
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if(scanner != null){
            // int row=1;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println ( line  );
                //row++;
            }
            scanner.close();
        }
    }

    public static ArrayList<Product> readFromCSVFile(String fileName) {
        // Open the file
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Read data from file
        ArrayList<Product> products = new ArrayList<>();
        if (scanner != null) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                //addig olvas " " amig szokoz
                String[] items = line.split(" ");
                int identifier= Integer.parseInt(items[0].trim());
                String name = items[1].trim();
                int amount = Integer.parseInt(items[2].trim());;
                int price = Integer.parseInt(items[3].trim());;
                products.add(new Product(identifier,name,amount,price));
            }

        }
        return products;
    }


    }
}
*/


public class Main {

    public static void main(String[] args) {

        Storage storages = new Storage("adatok.txt");
        storages.printAllProduct();

    }

}

