package parcialis;

public class Film {
    private final int id;
    public String filmcim;
    public String kategoria;
    public double szereplokszama;
    public double filmhossza;
    private boolean valose;
    private static int filmszam=0;

    public Film(String filmcim, String kategoria, double  szereplokszama, boolean valose) {
        this.filmcim = filmcim;
        this.kategoria = kategoria;
        this.szereplokszama = szereplokszama;
        this.valose = valose;
        filmszam++;
        this.id = filmszam;

    }


    public int getId() {
        return id;
    }

    public String getFilmcim() {
        return filmcim;
    }

    public String getKategoria() {
        return kategoria;
    }

    public double getSzereplokszama() {
        return szereplokszama;
    }

    public double getFilmhossza() {
        return filmhossza;
    }

    public boolean isValose() {
        return valose;
    }

    public double fillRandom(double   a,double   b ) {
        szereplokszama = a+ Math.random() * (b - a + 1);
        return szereplokszama;
    }


    @Override
    public String toString() {
        return "Film: " + "id:" +this.id + ", filmcim:'" + this.filmcim + '\'' + ", kategoria:'" + this.kategoria + '\'' + ", szereplokszama:" + this.szereplokszama + ", filmhossza:" + this.filmhossza + ", valose:" + this.valose ;
    }
}
