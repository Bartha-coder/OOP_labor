package proba;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Film film1 = new Film("Barmi","Katalaki Aladar",119);
        Film film2 = new Film("Akarmi","XZY",112);
        Film film3 = new Film("FGHJKL","RTYUIKL",167);
       // System.out.println(film1);

        ArrayList<Film> filmek = new ArrayList<>();
        filmek.add(film1);
        filmek.add(film2);
        filmek.add(film3);

      /*  for(Film e :filmek){
            System.out.println(e);
        }
        */
        for(int i=0;i<filmek.size();++i){
            System.out.println(filmek.get(i));
        }

        Film tipus1 = new Tipus("aaaa","bbb",14,"horror");

        System.out.println(tipus1);


     //   filmek.basicSort();

    }
}
