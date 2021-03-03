package rectangle;

public class Main {

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(12.3, 7.6);
        System.out.println(rect1.getWidth() + " " + rect1.getLength());
        System.out.println("Terulet: " + rect1.area());
        System.out.println("Kerulet: " + rect1.perimeter());

        Rectangle rect2 = new Rectangle(10, 5);

        Rectangle rect3 = new Rectangle(14.4, 12);

        Rectangle rect4 = new Rectangle(17.9, 7.9);


        Rectangle[] teglalapok = new Rectangle[10];
        //calloc malloc hasonlo
        // int [] array = new int [12];
        //teglalapok[0]=rect2;
        int i;
        for (i = 0; i < 10; i++) {

            double hossz = Math.random() * 100; //Math.random() =>0....1*((max-min) + min)
            double szel = Math.random() * 100;
            teglalapok[i] = new Rectangle(hossz, szel);

        }

        for (Rectangle rect : teglalapok) {
            System.out.printf("%.2f x %.2f\n", rect.getWidth(), rect.getLength());
           // System.out.println(rect);
            System.out.printf("Area: %.2f perimeter: %.2f\n",rect.getWidth(), rect.getLength());
        }


    }
}
