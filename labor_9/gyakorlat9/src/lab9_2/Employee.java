package lab9_2;


import lab9_1.Mydate;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{

    private final  int ID ;
    private String firstName;
    private String lastName;
    private double salary;
    private Mydate birthDate;
    private static int counter = 0;


    public Employee(String firstName, String lastName, double salary, Mydate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.birthDate = birthDate;
        counter ++;
        this.ID = counter;
    }

    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public Mydate getBirthDate() {
        return birthDate;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee  " + "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", birthDate=" + birthDate ;
    }

    @Override
    public int compareTo(Employee o){
        if(this.lastName.compareTo(o.lastName) > 0 ){
            return 1;
        }
        else {
            return -1;
        }
    }



}
