package lab9_2;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Company {

    private String name;
    private ArrayList<Employee> employees;

    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //felvesz egy uj alkalmazottat
    // egy alkalmazottat adunk at parameterkent
    public void hire(Employee employee){
        employees.add(employee);
    }

    //megkapja parameterkent hogy hova szeretnenk kiirni(vagy standard kimenet vagy allomany)
    //kiirja az osszes alkalmazottat
    public void hireAll(String csvFile){ }

    public void fire (int ID){ }

    //printstream -- a kimenet lehet barmi(akar standard kimenet, akar fajlba)
    public void printAll(PrintStream ps){
        ps.println("\n All employees:");
        for(int i = 0; i < employees.size(); i++){
            ps.println(employees.get(i));
        }
    }

    //csak a managerek kiiratasa
    //hova szeretnenk irni

    public void printManagers(PrintStream ps){
        ps.println("\nMANAGERS");
        for(int i = 0; i < employees.size(); i++) {
            //az i.employee Manager-e?
            if (employees.get(i) instanceof Manager) {
                ps.println(employees.get(i));
            }
        }
    }

    //rendezi a listat az alap soorendben !!! COMRARABLE miatt -> compareTo metodus kell
    // meg hozza es a fejlecben implements Comparable<Employee>
    public void basicSort(){
        Collections.sort(employees);
    }


    //
    public void sortByComparator(Comparator<Employee> comparator){
        Collections.sort(employees, comparator);

    }


}


