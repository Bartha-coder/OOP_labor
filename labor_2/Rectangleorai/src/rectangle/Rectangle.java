package rectangle;

public class Rectangle {

    //adatok,data ,attributes

    private double width;
    private double length;

    //constructor--inicializalas

    public Rectangle(double hoszusag, double szeleseg) {
        this.width = szeleseg;
        this.length = hoszusag;
    }

    //Getters
    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public double area() {
        return this.width * this.length;
    }

    public double perimeter() {
        return (this.width + this.length) * 2;
    }
    @Override
    public String toString()
    {
        return"Rectangle:" + this.length+ "  x  " + this.width;
        //return"Rectangle:" + Math.round (length*100.0)/100.0 + " x " + Math.round (this.width*100.0)/100.0;

    }
}
