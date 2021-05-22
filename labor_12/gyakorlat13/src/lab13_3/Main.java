package lab13_3;



public class Main {

    public static void main(String[] args) {

        Baccalaureate bac = new Baccalaureate("students.txt");
        System.out.println("**********************************");
        bac.printAllStudents();
        System.out.println("\n");
        bac.printPassedStudents();
        System.out.println("\n");
        bac.printFailedStudents();


    }

}
