package lab9_2;

import lab9_1.Mydate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    private final static String COMMA_DELIMITER = " ,";

        public static void main(String[] args) throws Exception {
/*
            Scanner sc = new Scanner(new File("C:/Users/Dell/Desktop/Egyetem/Tantargyak/Java/GITHUB/OOP_labor/labor_9/gyakorlat9/src/lab9_2/employees.csv"));
            sc.useDelimiter(COMMA_DELIMITER);   //sets the delimiter pattern
            while (sc.hasNext())  //returns a boolean value
            {
                System.out.print(sc.next());  //find and returns the next complete token from this scanner
            }
            sc.close();  //closes the scanner
*/
            Employee employee1 = new Employee("Robert",
                    "Bartha",
                    2000,
                    new Mydate(1999,10,12));

            Employee employee2 = new Employee("Balazs",
                    "Solyom",
                    2001,
                    new Mydate(2001,5,11));

            Employee manager1 = new Manager("Balazs",
                    "Becze",
                    10000,
                    new Mydate(2001,2,10),
                    "'WEB'");

            Company ceg = new Company("SAPIENTIA COMPANY");

            //ezekkel vesszuk fel az adatokat/embereket
            ceg.hire(employee1);
            ceg.hire(employee2);
            ceg.hire(manager1);


            ceg.printAll(System.out);
            ceg.printManagers(System.out);
            PrintStream allomany = null;
            try{
            allomany = new PrintStream("employeee.txt");
            ceg.printAll(allomany);
            } catch (FileNotFoundException e){
                e.printStackTrace();
            }

            ceg.basicSort();

            ceg.printAll(System.out);



            //csokkeno sorrend fizetes szerint

            Comparator<Employee> comp = new Comparator<Employee>() {
                @Override
                public int compare(Employee o1, Employee o2) {
                    if(o1.getSalary() > o2.getSalary()){
                        return -1;
                    }
                    if(o1.getSalary() < o2.getSalary()){
                        return 1;
                    }
                    return 0;
                }
            };


            ceg.sortByComparator(comp);

            ceg.printAll(System.out);


            //datum szerinti rendezes
            ceg.sortByComparator(new Comparator<Employee>() {
                @Override
                public int compare(Employee o1, Employee o2) {
                    return -o1.getBirthDate().compareTo(o2.getBirthDate());
                }
            });

            ceg.printAll(System.out);

        }

}


