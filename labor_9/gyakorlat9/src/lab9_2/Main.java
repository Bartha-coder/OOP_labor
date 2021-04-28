package lab9_2;

import java.io.File;
import java.util.Scanner;

public class Main {

    private final static String COMMA_DELIMITER = " ,";

        public static void main(String[] args) throws Exception {

            Scanner sc = new Scanner(new File("C:/Users/Dell/Desktop/Egyetem/Tantargyak/Java/GITHUB/OOP_labor/labor_9/gyakorlat9/src/lab9_2/employees.csv"));
            sc.useDelimiter(COMMA_DELIMITER);   //sets the delimiter pattern
            while (sc.hasNext())  //returns a boolean value
            {
                System.out.print(sc.next());  //find and returns the next complete token from this scanner
            }
            sc.close();  //closes the scanner
        }

}


