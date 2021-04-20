package lab8.elolenyek;

public class Eloleny {

    protected String elohely;
    protected String megnevezes;
    protected int egyedekSzama;

    public Eloleny(String elohely, String megnevezes, int egyedekSzama) {
        this.elohely = elohely;
        this.megnevezes = megnevezes;
        this.egyedekSzama = egyedekSzama;
    }

    public String getElohely() {
        return elohely;
    }

    public String getMegnevezes() {
        return megnevezes;
    }

    public int getEgyedekSzama() {
        return egyedekSzama;
    }

    public void helyvaltoztatas(){

        System.out.println("TO DO");
    }

    @Override
    public String toString() {
        return   "Elohely:" + this.elohely+ "," + "Megnevezes:" + this.megnevezes + "," + "EgyedekSzama:" + this.egyedekSzama ;

    }
}
