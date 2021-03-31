package parcialis2;

import java.util.ArrayList;

public class Mozi {

    public String nev;
    public String helyszin;
    public boolean nyitvatartas;
    private ArrayList<Mozi> filmek;

    public Mozi(String nev, String helyszin, boolean nyitvatartas) {
        this.nev = nev;
        this.helyszin = helyszin;
        this.nyitvatartas =nyitvatartas;
    }

    public String getNev() {
        return nev;
    }

    public String getHelyszin() {
        return helyszin;
    }

    public boolean isNyitvatartas() {
        return nyitvatartas;
    }

    public void setNyitvatartas(boolean nyitvatartas) {
        this.nyitvatartas = nyitvatartas;
        if(nyitvatartas == 1){nyitvatartas = 0;
        else{nyitvatartas=1;}
    }





}
