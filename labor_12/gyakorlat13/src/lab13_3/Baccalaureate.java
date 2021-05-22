package lab13_3;

import javax.swing.plaf.basic.ComboPopup;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import static lab13_3.Tantargy.*;

public class Baccalaureate   {
    //treemap hattereben egy bin kereso fa van

    private Map<Integer, Student> students = new TreeMap<>();

    public Baccalaureate(String file) {
        Scanner input = null;
        try {
            input = new Scanner(new File(file));
            ///olvasunk amig van a fajlban olvasnivalo
            while (input.hasNextLine()) {
                //egy sor beolvasasa
                String line = input.nextLine();
                String[] items = line.split(" ");
                int id = Integer.parseInt(items[0].trim());
                String fName = items[1].trim();
                String lName = items[2].trim();
                //student letrehozasa
                Student newStudent = new Student(id, fName, lName);
                students.put(id, newStudent);

            }

            readSpecificMarks("magyar.txt", Magyar);
            readSpecificMarks("roman.txt", Roman);
            readSpecificMarks("matek.txt", Matek);

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                input.close();
            }
        }

    }

    private void readSpecificMarks(String fileName, Tantargy tantargy) {
        try (Scanner input = new Scanner(new File(fileName))) {
            ///olvasunk amig van a fajlban olvasnivalo
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] items = line.split(" ");
                int id = Integer.parseInt(items[0].trim());
                double mark = Double.parseDouble(items[1].trim());
                //milyen tentargyrol van szo
                //matek->matek jegy update
                //magyar->magyar jegy update..
                //meg kellene keresni azt a diakot, akinek ez az idja
                if (students.containsKey(id)) {
                    Student s = students.get(id);

                    switch (tantargy) {
                        case Magyar -> s.setHungarianMark(mark);
                        case Matek -> s.setMathsMark(mark);
                        case Roman -> s.setRomanianMark(mark);
                    }
                }
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }


    public void printAllStudents() {
        for (Map.Entry<Integer, Student> s : students.entrySet()) {
            System.out.println(s.getKey() + " ---> " + s.getValue());
        }

    }

    public void printPassedStudents() {
        int at = 0;
        for (Map.Entry<Integer, Student> s : students.entrySet()) {
            if (s.getValue().isPassed()) {

                System.out.println(s.getKey() + " +++++ " + s.getValue());
                at++;
            }

        }
        System.out.println("Atment diakok szama: "+ at);
    }


    public void printFailedStudents() {

        for (Map.Entry<Integer, Student> s : students.entrySet()) {
            if (!s.getValue().isPassed()) {
                ///abc soorendbe kellene, de nem megy
                System.out.println(s.getKey() + " ----- " + s.getValue());
            }
        }

    }

}



