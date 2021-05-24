package lab13_2;

public class Product implements Comparable<Product> {

    private final int identifier;
    private final String name;
    private int amount;
    private int price;


    public Product(int identifier, String name, int amount, int price) {
        this.identifier = identifier;
        this.name = name;
        this.amount = amount;
        this.price = price;

    }

    public int getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }

    public void updateAmount(int newAmount) {
        if (newAmount > 0) {
            this.amount += newAmount;
        } else {
            System.out.println("Nem megfelelo az ertek!");
        }
    }


    @Override
    public String toString() {
        return "Product:  " +
                "identifier:" + identifier +
                ", name:" + name + '\'' +
                ", amount:" + amount +
                ", price:" + price;
    }


    //termeszetes rendezettseg/natural ordering
    //alapbol ezt veszi figyelembe
    //megmondjuk hogy ket productot/termeket az id alapjan hogy hasonlitunk ossze
    //id alapjan novekvo sorrend
    @Override
    public int compareTo(Product o) {
        return this.identifier - o.identifier;

    }


}
