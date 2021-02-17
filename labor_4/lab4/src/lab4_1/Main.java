package lab4_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        readFilePrintItsLineNumbered("lab4_1_input.txt");

        Person person1 = new Person("Robert ", "BARTHA", 1999);
        Person person2 = new Person("Aladar ", "KATALAKI", 1788);
        Person person3 = new Person("Jolika ", "SIKO", 1876);

        ArrayList<Person> goodFriends = new ArrayList<>();
        goodFriends.add(person3);
        goodFriends.add(person2);
        goodFriends.add(person1);

       /* for(Person a : goodFriends ){
            System.out.println(a);
        }
*/
        for (int i = 0; i < goodFriends.size(); ++i) {
            System.out.println(goodFriends.get(i));
        }

        ArrayList<Person> persons = readFromCSVFile("lab4_1_input.csv");

        for (Person a : persons) {
            System.out.println(a);
        }
    }

    public static void readFilePrintItsLineNumbered(String fileName) {
        // Open the file
        Scanner scanner = null;
        // File file = new File(fileName);
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        if (scanner != null) {
            //kezdhetem a beolvasast
            int row = 1;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(row + " " + line);
                row++;
            }
            scanner.close();
        }

        //System.out.println("Fajlmegnyitas utani kiiratas");


    }

    public static ArrayList<Person> readFromCSVFile(String fileName) {
        // Open the file
        Scanner scanner = null;
        // File file = new File(fileName);
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // Read data from file
        ArrayList<Person> persons = new ArrayList<>();
        if (scanner != null) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                // trim: eliminates leading and trailing spaces
                String firstName = items[0].trim();
                String lastName = items[1].trim();
                // Convert String → int: Integer.parseInt( String)
                int birtYear = Integer.parseInt(items[2].trim());
                persons.add(new Person(firstName, lastName, birtYear));
            }
        }
        return persons;
    }
}



