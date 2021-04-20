package lab8.elolenyek;

public class Noveny extends Eloleny {

    private String termes;
    private boolean fotoszintetizal;

    public Noveny(String elohely, String megnevezes, int egyedekSzama, String termes, boolean fotoszintetizal) {
        super(elohely, megnevezes, egyedekSzama);   //meghivodik az  osztaly konstruktora, ez az elso dolog!!!!!
        this.termes = termes;
        this.fotoszintetizal = fotoszintetizal;
    }

    public String getTermes() {
        return termes;
    }

    public boolean isFotoszintetizal() {
        return fotoszintetizal;
    }

    @Override
    public void helyvaltoztatas() {

        System.out.println("A(z) " + this.megnevezes + " szepen lassan novekszik");
    }

    @Override
    public String toString() {

        return "NOVENY tipus:" + "Termes: " + this.termes + "," + super.toString();
    }
}
