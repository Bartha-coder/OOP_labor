package lab12_2;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){


        Scanner inputStream = null;
        PrintStream output = null;
        try {
            File file = new File("students.csv");
            output = new PrintStream("warning.csv");
            inputStream = new Scanner(file);

            // use the inputStream to read a file

            while(inputStream.hasNextLine()) {
                String line = inputStream.nextLine();
                //System.out.println(line);
                try {
                    //string tipus
                    //items maga a tomb
                    String[] items = line.split(",");
                    String neptunKod = items[0].trim();
                    String firstName = items[1].trim();
                    String lastName = items[2].trim();
                    int kreditekSzama = Integer.parseInt(items[3].trim());
                    int ev = Integer.parseInt(items[4].trim());
                    int honap = Integer.parseInt(items[5].trim());
                    int nap = Integer.parseInt(items[6].trim());
                    MyDate date = new MyDate(ev,honap,nap);
                }

                catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    System.out.println("INCOMPLETE LINE: " + line);
                    output.println("INCOMPLETE LINE: " + line);
                }
                catch (NumberFormatException numberFormatException) {
                    System.out.println("NUMBER FORMAT EXCEPTION: " + line);
                    output.println("NUMBER FORMAT EXCEPTION: " + line);
                }
                catch (DateUtil.InvalidDateException invalidDateException){
                    System.out.println(": " + line);
                    output.println("INVALID DATE: " + line);
                }


            }

        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        finally {
            if (inputStream != null) {
                inputStream.close();

            }
            if(output != null){
                output.close();
            }
        }


    }


}
