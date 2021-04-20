package lab8.elolenyek;

public class Allat extends Eloleny {

    private AllatTipus tipus;
    private int labakSzama;

    public Allat(String elohely, String megnevezes, int egyedekSzama, AllatTipus tipus, int labakSzama) {
        super(elohely, megnevezes, egyedekSzama);
        this.tipus = tipus;
        this.labakSzama = labakSzama;
    }

    public AllatTipus getTipus() {
        return tipus;
    }

    public int getLabakSzama() {
        return labakSzama;
    }

    @Override
    public void helyvaltoztatas() {

        System.out.println("A(z) " +this.megnevezes + " gyorsan szalad");
    }

    @Override
    public String toString() {
        return "ALLAT tipus:" + tipus + ","  + "LabakSzama:" + labakSzama + ","  + super.toString();
    }
}
