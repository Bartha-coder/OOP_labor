package gyak;

public class Termek {

    public int azonosito;
    public  String elnevezes;
    public double beszerzesiar;
    public double fogyasztoiar;

    public Termek(int azonosito, String elnevezes, double beszerzesiar) {
        this.azonosito = azonosito;
        this.elnevezes = elnevezes;
        this.beszerzesiar = beszerzesiar;
        this.fogyasztoiar = beszerzesiar;
    }

    public int getAzonosito() {
        return azonosito;
    }

    public String getElnevezes() {
        return elnevezes;
    }

    public double getBeszerzesiar() {
        return beszerzesiar;
    }

    public double getFogyasztoiar() {
        return fogyasztoiar;
    }

    public void  setArres(double ertek ){
        fogyasztoiar += (fogyasztoiar*ertek/100);
    }

    @Override
    public String toString() {
        return "Termek: " + "azonosito=" + this.azonosito + ", elnevezes='" + this.elnevezes + '\'' + ", beszerzesiar=" + this.beszerzesiar + ", fogyasztoiar=" + this.fogyasztoiar ;
    }
}
