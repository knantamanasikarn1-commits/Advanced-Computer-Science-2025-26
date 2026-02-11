public class Rectangle extends Polygon {
    
    private double length;
    private double width;

    public Rectangle() {
        this(3, 4);
    }

    public Rectangle(double length, double width) {
        super(4);
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public String toString() {
        return super.toString() + "\n It is a rectangle with a length of " + length
            + " and a width of " + width + ". Its area is " + getArea() + ".";
    }

}
