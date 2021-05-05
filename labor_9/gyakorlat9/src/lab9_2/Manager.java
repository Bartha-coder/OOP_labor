package lab9_2;

import lab9_1.Mydate;

public class Manager extends Employee{

    private String department;

    public Manager(String firstName, String lastName, double salary, Mydate birthDate, String department) {
        super(firstName, lastName, salary, birthDate);//ososztaly konstruktora hivodik meg-elso lepes ez
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager  " + "department=" + this.department + super.toString();
    }
}
