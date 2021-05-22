package lab13_3;

import javax.swing.*;

public class Student {

    private final int id;
    private String firstName;
    private String lastName;
    private double hungarianMark;
    private double romanianMark;
    private double mathsMark;


    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setHungarianMark(double hungarianMark) {
        this.hungarianMark = hungarianMark;
    }

    public void setRomanianMark(double romanianMark) {
        this.romanianMark = romanianMark;
    }

    public void setMathsMark(double mathsMark) {
        this.mathsMark = mathsMark;
    }


    public boolean isPassed() {
        double average = 0;
        if (hungarianMark >=5 && mathsMark >=5 && romanianMark >= 5) {
            average = (hungarianMark + mathsMark + romanianMark) /3;
            return true;
        }
        else {
            return false; }
    }


    @Override
    public String toString() {
        return firstName + " " +lastName + " " +hungarianMark + " " +romanianMark + " " +mathsMark;
    }


}


