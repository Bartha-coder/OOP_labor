

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
/*
public class Storage {
    //lista a termekekkel
    //arraylist deklaralasqa es lefoglalasa egyben( = new...)
    private ArrayList<Product> products = new ArrayList<>();
    //feltolti a listat termekekkel
    //beolvasas a konstruktorban
    public Storage(String fileName)throws IOException {
        File file = new File ("data.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
    //ha biztos hogy novekvo a sorrend akkor binaris kereses
    //id alapjan
    //egy adott idval rendelkezo elem updatelese
    //megkeresi azt a bizonyos id es hozzaadja a newamountot
    public void Update(int identifier){
        int  find = Collections.binarySearch(products,875695,Collections.reverseOrder());
        System.out.println("A keresett ID:"+find);
    }
    //kiirni hany sikeres update tortent es mennyi idobe telt el
}
*/


public class Storage {

    //treemap hattereben egy bin kereso fa van

    private Map<Integer, Product> products = new TreeMap<>();

    //fileolvasas
    public Storage(String fileName){

        Scanner input = null;
        try {
            input = new Scanner(new File(fileName));

            ///olvasunk amig van a fajlban olvasnivalo

            while (input.hasNextLine()) {
                //egy sor beolvasasa
                String line = input.nextLine();
                String[] items = line.split(" ");
                int identifier = Integer.parseInt(items[0].trim());
                String name = items[1].trim();
                int amount = Integer.parseInt(items[2].trim());
                int price = Integer.parseInt(items[3].trim());
                //student letrehozasa
                Product newProduct = new Product(identifier, name, amount,price);
                products.put(identifier, newProduct);

            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                input.close();
            }
        }

    }


    public void update(String fileName) {
        try (Scanner input = new Scanner(new File(fileName))) {
            /**
             *  olvasunk amig van a fajban valami
             */

            while (input.hasNextLine()) {
                String line = input.nextLine();

                String[] items = line.split(" ");
                int identifier = Integer.parseInt(items[0].trim());
                int amount = Integer.parseInt(items[1].trim());
                //a megfelelo id noveli
                if(products.containsKey(identifier)){
                    Product p = products.get(identifier);
                    p.updateAmount(amount);
                }

            }


        }

        catch
        (FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }
    public void printAllProduct() {
        for (Map.Entry<Integer, Product> s : products.entrySet()) {
            System.out.println(s.getKey() + " ---> " + s.getValue());
        }

    }

}