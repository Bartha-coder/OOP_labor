package lab9_3;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


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
