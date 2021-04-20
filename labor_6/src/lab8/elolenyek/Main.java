package lab8.elolenyek;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Eloleny allat1 = new Allat("Erdo", "Farkas", 15000, AllatTipus.EMLOS, 4);

        Eloleny fuvecske = new Noveny("erdo-mezo", "fuvecske", 999999, "fuvix", true);

        Eloleny allat2 = new Allat("Mezo", "antilop", 1000, AllatTipus.EMLOS, 4);

        Eloleny allat3 = new Allat("ERDO", "Roka", 69420, AllatTipus.EMLOS, 4);

        Eloleny noveny = new Noveny("Mezoband", "Napraforgo", 1000, "Mag", true);

        Eloleny noveny5 = new Noveny("hegy", "fenyo", 153488, "toboz", true);

        Allat allat4 = new Allat("Delkelet", "sziberiaiTigris", 430, AllatTipus.EMLOS, 4);

        Allat allat5 = new Allat("Erdo", "Nyuszi", 3, AllatTipus.EMLOS, 12);

        ArrayList<Eloleny> rezervatum = new ArrayList<>();
        rezervatum.add(allat1);
        rezervatum.add(fuvecske);
        rezervatum.add(allat2);
        rezervatum.add(allat3);
        rezervatum.add(noveny);
        rezervatum.add(noveny5);
        rezervatum.add(allat4);
        rezervatum.add(allat5);

        for (Eloleny e : rezervatum) {
            e.helyvaltoztatas();
            System.out.println(e);
        }

    }
}