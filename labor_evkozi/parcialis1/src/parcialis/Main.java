package parcialis;

public class Main {

    public static void main(String[] args) {
        Film film1 = new Film("Borat", "Komedia", 11, "false");
        System.out.println(film1);
        film1.fillRandom(1, 30);
        Film film2 = new Film("A halal jele", "Thriller", 10, "true");
        System.out.println(film2);

    }
}
