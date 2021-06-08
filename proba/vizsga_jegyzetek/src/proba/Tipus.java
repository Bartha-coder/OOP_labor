package proba;

import java.util.ArrayList;
import java.util.Collections;

public class Tipus extends Film{

    public String stilus;
    private ArrayList<Film> filmek;

    public Tipus(String Cim, String Rendezo, double Hossz, String stilus) {
        super(Cim, Rendezo, Hossz);
        this.stilus = stilus;
    }

    public String getStilus() {
        return stilus;
    }

    public void setStilus(String stilus) {
        this.stilus = stilus;
    }

    @Override
    public String toString(){
        return super.toString() + "stilus: " + this.stilus  ;
    }

    public void basicSort(){
        Collections.sort(filmek);
    }
}
