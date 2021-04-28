package lab9_2;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;

public class Company {

    private String name;
    private ArrayList<Employee> employees;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hire(Employee employee){

    }

    public void hireAll(String csvFile){

    }

    public void fire (int ID){

    }

    public void printAll(PrintStream csvFile){

    }

    public void printManagers(PrintStream csvFile){

    }

    public void sortByComparator(Comparator<Employee> comp){

    }

}


