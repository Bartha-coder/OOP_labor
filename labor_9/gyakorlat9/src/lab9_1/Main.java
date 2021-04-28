package lab9_1;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

    Random rand = new Random();
    int year = 2021;
    int month, day;
    ArrayList<Mydate> dateList = new ArrayList<>();
    Mydate[] dateArray = new Mydate[10];

    //10 helyes datum generalasa

        for(int i=0; i < 10;){
            month = rand.nextInt(12) + 1;
            day = rand.nextInt(31) + 1;
            if(DateUtil.isValidDate(year, month, day)){
                //megfelelo datum
                Mydate datum = new Mydate(year, month, day);
                dateList.add(datum);///hozzaadunk az arraylisthez
                dateArray[i] = datum; ///tomb, mint egy sima tomb lefoglalom az i-d elemet
                i++;
            }
        }


        ///lista rendezes arraylist
        Collections.sort(dateList);


        ///tomb rendezes  array
        Arrays.sort(dateArray);


        ///vegimegyunk a listan es kiirjuk az elemeket
        System.out.println("\n\nLISTA RENDEZES ELOTT");
        for(Mydate a:dateList){
            System.out.println(a);
        }
        ///vegimegyunk a tombon es kiirjuk az elemeket
        System.out.println("\n\nTOMB RENDEZES ELOTT");
        for(Mydate a:dateArray){
            System.out.println(a);
        }
    }
}
